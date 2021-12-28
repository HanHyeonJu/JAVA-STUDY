package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

public class MemberMgr {
	private DBConnectionMgr pool;

	public MemberMgr() {
		try {
			pool = DBConnectionMgr.getInstance();
			Connection con = pool.getConnection();
//			System.out.println("성공");
		} catch (Exception e) {
			System.err.println("실패");
			e.printStackTrace();
		}
	}// MemberMgr

	// 우편번호 검색, 제네릭 : Vector에서 저장하는 타입의 지정
	public Vector<ZipcodeBean> zipcodeRead(String area3) {
		// DB연동에 필요한 변수 선언
		// DB연동은 공식이 있다.
		// java.sql 패키지 클래스
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; // select 필요
		String sql = null;
		Vector<ZipcodeBean> vlist = new Vector<ZipcodeBean>();
		try {
			// DB연결 객체
			// 필요한 곳에 빌려주고 반납받는 기법 : 풀링기법
			con = pool.getConnection(); // 빌려옴(pool 기법)
			sql = "SELECT * FROM tblzipcode WHERE AREA3 LIKE ?"; // like '%강남대로%'
			// sql문을 매개변수로 pstmt 객체를 리턴
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "%" + area3 + "%"); // 1이 sql문에 ? 순서를 뜻함
			rs = pstmt.executeQuery(); // 실제 sql문 실행
			while (rs.next()) {
				ZipcodeBean bean = new ZipcodeBean();
				bean.setZipcode(rs.getString("zipcode"));
				bean.setArea1(rs.getString("area1"));
				bean.setArea2(rs.getString("area2"));
				bean.setArea3(rs.getString("area3").trim());
				vlist.addElement(bean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return vlist;
	}

	// 가입
	public boolean insert(MemberBean bean) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		boolean flag = false; // 컴퓨터 용어에서 flag는 제어권을 의미
		try {
			con = pool.getConnection(); // pool에서 Connection 빌려옴
			sql = "insert tblMember(name,phone,team,address)values(?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			// ? 세팅
			pstmt.setString(1, bean.getName()); // 첫번째 ?에 '홍길동'세팅
			pstmt.setString(2, bean.getPhone());
			pstmt.setString(3, bean.getTeam());
			pstmt.setString(4, bean.getAddress());
			// 실행
			int cnt = pstmt.executeUpdate(); // 리턴값은 적용된 레코드 갯수 -> 성공 : 1, 실패 :0
			if (cnt == 1)
				flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
	}
	
	//team list
	public Vector<String> listTeam(){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; // select 필요
		String sql = null;
		Vector<String> vlist = new Vector<String>();
		try {
			con = pool.getConnection();
			sql = "select distinct team from tblMember"; // like '%강남대로%'
			// sql문을 매개변수로 pstmt 객체를 리턴
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(); // 실제 sql문 실행
			while (rs.next()) {
				vlist.addElement(rs.getString(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return vlist;
	}

	public static void main(String[] args) {
		MemberMgr mgr = new MemberMgr();
		MemberBean bean = new MemberBean(0, "홍길동", "010-6666-9999", "부산시", "산적");
		System.out.println(mgr.insert(bean));
	}

	// 리스트
	public Vector<MemberBean> list() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; // select 필요
		String sql = null;
		Vector<MemberBean> vlist = new Vector<MemberBean>();
		try {
			con = pool.getConnection();
			sql = "SELECT * FROM tblMember";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(); // 실행
			while (rs.next()) {
				MemberBean bean = new MemberBean(rs.getInt("id"), rs.getString("name"), rs.getString("phone"),
						rs.getString("team"), rs.getString("address"));
				vlist.addElement(bean);
			}
		} catch (Exception e) {
			pool.freeConnection(con, pstmt, rs);
		}
		return vlist;
	}

	// 한 명의 레코드(회원정보)
	public MemberBean select(int id) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null; // select 필요
		String sql = null;
		MemberBean bean = new MemberBean();
		try {
			con = pool.getConnection();
			sql = "SELECT * FROM tblMember where id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id); // ex > id = 3;
			rs = pstmt.executeQuery(); // 실행
			if (rs.next()) {
				bean.setId(id);
				bean.setName(rs.getString("name"));
				bean.setPhone(rs.getString("phone"));
				bean.setTeam(rs.getString("team"));
				bean.setAddress(rs.getString("address").trim());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		return bean;
	}

	// 수정
	public boolean update(MemberBean bean) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		boolean flag = false; // 컴퓨터 용어에서 flag는 제어권을 의미
		try {
			con = pool.getConnection(); // pool에서 Connection 빌려옴
			sql = "update tblMember set name =?, phone = ?, team = ?, address = ? where id =?";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, bean.getName()); 
			pstmt.setString(2, bean.getPhone());
			pstmt.setString(3, bean.getTeam());
			pstmt.setString(4, bean.getAddress());
			pstmt.setInt(5, bean.getId());

			// 실행
			int cnt = pstmt.executeUpdate(); // 리턴값은 적용된 레코드 갯수 -> 성공 : 1, 실패 :0
			if (cnt == 1)
				flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
	}

	// 삭제
	public boolean delete(int id) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = null;
		boolean flag = false;
		try {
			con = pool.getConnection();
			sql = "delete from tblMember where id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);

			// 실행
			int cnt = pstmt.executeUpdate(); // 리턴값은 적용된 레코드 갯수 -> 성공 : 1, 실패 :0
			if (cnt == 1)
				flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt);
		}
		return flag;
	}
}
