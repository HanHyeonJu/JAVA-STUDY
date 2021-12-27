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
//			System.out.println("����");
		}catch(Exception e) {
			System.err.println("����");
			e.printStackTrace();
		}
	}// MemberMgr
	
	//�����ȣ �˻�, ���׸� : Vector���� �����ϴ� Ÿ���� ����
	public Vector<ZipcodeBean> zipcodeRead(String area3){
		//DB������ �ʿ��� ���� ����
		//DB������ ������ �ִ�.
		//java.sql ��Ű�� Ŭ����
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		Vector<ZipcodeBean> vlist = new Vector<ZipcodeBean>();
		try {
			//DB���� ��ü
			//�ʿ��� ���� �����ְ� �ݳ��޴� ��� : Ǯ�����
			con = pool.getConnection(); // ������(pool ���)
			sql = "SELECT * FROM tblzipcode WHERE AREA3 LIKE ?"; // like '%�������%'
			//sql���� �Ű������� pstmt ��ü�� ����
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "%"+ area3 +"%"); // 1�� sql���� ? ������ ����
			rs = pstmt.executeQuery(); // ���� sql�� ����
			while(rs.next()) {
				String str = rs.getString(1) + "\t";
				str+=rs.getString(2) + "\t";
				str+=rs.getString(3) + "\t";
				str+=rs.getString(4);
				System.out.println(str);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			pool.freeConnection(con,pstmt,rs);
		}
		return vlist;
	}
	
	public static void main(String[] args){
		MemberMgr mgr= new MemberMgr();
		mgr.zipcodeRead("�������");
	}
}
