package nado;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame extends JFrame implements ActionListener{
	private JPanel displayPanel; // 숫자 입력한 거 보이게 하는 패널인가? 그냥 전체 display를 의미하는 패널인 것 같음
	private JPanel buttonPanel; // 버튼 패널(숫자, 기호)
	private JPanel debugPanel; // ?? 계산기 밑에 넣을 패널 ??
	
	JTextField display; // 왜 text로 만드는거지? 계산기 display에는 기호도 들어가야 하니까
	
	JButton[] buttons; // 0~9까지 10개 버튼 배열로 만들기
	JButton btnPlus;
	JButton btnMinus;
	JButton btnProduct; // 곱하기
	JButton btnDivide; // 나누기
	JButton btnEqual; // =
	JButton btnCE; // 0으로 되돌림
	
	private JLabel prev; // 라벨이 텍스트 상자 그런 느낌인건가?
	private JLabel operator;
	private JLabel flag;
	
	public MainFrame() { // 생성자
		this.setSize(350,500); // 사이즈 설정
		this.setTitle("계산기"); // gui제목
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창을 닫으면 프로그램도 종료
		
		this.setLayout(new BorderLayout()); // 창 안에 다른 컴포넌트를 붙이기 위한 새로운 레이아웃 생성
		// BorderLayout : 기본레이아웃으로 상, 하, 좌, 우, 중아으로 배치
		
		// 3개의 panel 객체를 만들고 각각 layout을 설정하겠다
		displayPanel = new JPanel();
		buttonPanel = new JPanel();
		debugPanel = new JPanel(); //??
		
		displayPanel.setLayout(new FlowLayout()); 
		// FlowLayout : 컴포넌트들을 왼쪽에서 오른쪽으로 일렬배치, 컨테이너 크기를 넘으면 자동으로 아래로 배치, 생성자로 정렬방식 지정가능
		buttonPanel.setLayout(new GridLayout(0, 4, 5, 5)); 
		// GridLayout : 컴포넌트들을 행과 열로 배치, 컴포넌트 크기는 컨테이너 크기에 자동으로 맞춰짐
		debugPanel.setLayout(new FlowLayout());
		
		// display요소
		display = new JTextField(11); // 글자 수가 '11'자 들어가게 하겠다
		display.setText("0"); // 초기 계산기 화면을 0으로 만듬
		display.setHorizontalAlignment(JTextField.RIGHT); // field는 정렬
		Font font = new Font("Serif",Font.BOLD, 30); // Serif : 삐침이 나와있는 글씨체(?) san serif : non삐침
		display.setFont(font);
		
		// 만들어 놓은 요소들을 display패널에 붙임
		displayPanel.add(display);
		
		// 버튼 관련
		Font fontBtn = new Font("Serif", Font.BOLD, 20); // 버튼에도 폰트객체 생성
		
		// Button패널에 붙일 요소 만들기
		buttons = new JButton[10]; // Button 10개가 들어있는 JButton 배열객체 생성, 메모리만 만들어진 것
		
		// 실제 버튼 객체 생성
		for(int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(Integer.toString(i)); // i를 String으로 받음 왜지? !! 이 buttons에는 숫자가 들어가는건데??버튼패널에 넣을 때 같이 넣어줘야 해서 그런건가?? 아마도 이 프레임디스플레이 전체가 textfield이기 때문인 것 같음!
			buttons[i].setFont(fontBtn); // 버튼 객체에 대한 폰트 지정
			
			buttons[i].addActionListener(this);
		}
		
		btnPlus = new JButton("+");
		btnMinus = new JButton("-");
		btnProduct = new JButton("*");
		btnDivide = new JButton("/");
		btnEqual = new JButton("=");
		btnCE = new JButton("CE");
		
		btnPlus.addActionListener(this);
		btnMinus.addActionListener(this);
		btnProduct.addActionListener(this);
		btnDivide.addActionListener(this);
		btnEqual.addActionListener(this);
		btnCE.addActionListener(this);
		
		//버튼패널에 생성한 객체들을 넣어줌!
		buttonPanel.add(buttons[1]);
		buttonPanel.add(buttons[2]);
		buttonPanel.add(buttons[3]);
		buttonPanel.add(btnPlus);
		
		buttonPanel.add(buttons[4]);
		buttonPanel.add(buttons[5]);
		buttonPanel.add(buttons[6]);
		buttonPanel.add(btnMinus);
		
		buttonPanel.add(buttons[7]);
		buttonPanel.add(buttons[8]);
		buttonPanel.add(buttons[9]);
		buttonPanel.add(btnProduct);
		
		buttonPanel.add(btnDivide);
		buttonPanel.add(buttons[0]);
		buttonPanel.add(btnEqual);
		buttonPanel.add(btnCE);
		/*
		 * 1 2 3 +
		 * 4 5 6 -
		 * 7 8 9 *
		 * / 0 = CE 의 형태
		 */
		
		// debugPanel에 라벨요소를 만들어줌?
		prev =  new JLabel("");
		operator =  new JLabel("");
		flag =  new JLabel(""); // 라벨이 뭐지? 텍스트 상자 같은 느낌이라고 생각하면 됨
		
		debugPanel.add(new JLabel("PREV:"));
		debugPanel.add(prev);
		
		debugPanel.add(new JLabel("OPERATOR:"));
		debugPanel.add(operator);
		
		debugPanel.add(new JLabel("FLAG:"));
		debugPanel.add(flag);
		
		
		// Frame에 Panel 붙이기
		this.add(displayPanel, BorderLayout.NORTH);
		this.add(buttonPanel, BorderLayout.CENTER);
		this.add(debugPanel, BorderLayout.SOUTH);
		
		this.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	for(int i = 0; i < buttons.length; i++) {
		if(e.getSource() == buttons[i]) { 
			if(display.getText().equals("0")) { // 이미 display에 초기값이 0이 있기 때문에 0을 없애고 숫자 패널 버튼 0을 넣는다 그런건가??
				display.setText(""+i);
			}else {
				if(operator.getText().equals("")) { // 첫 번째로 입력한 숫자면 operator로 입력한 숫자를 넣고
					display.setText(display.getText() + i);
				}else {
					if(flag.getText().equals("")) { // 두 번째 입력한 숫자면 flag로 넣고
						display.setText(""+i); // 입력되어 있는 숫자를 공백으로 만든 후 입력된 숫자가 표시되도록 설정
						flag.setText("#"); // #은 계산할 숫자를 마우스로 클릭하면 debugpanel 보이는 칸에 flag : # 이렇게 표시된다는 뜻같음....
					}else { // 그 외
						display.setText(display.getText() + i);
					}
				}
			}
		}
	}
	if(e.getSource() == btnEqual) {
		double op1, op2, result;
		op1 = Double.parseDouble(prev.getText()); //문자 -> 숫자(double)
		op2 = Double.parseDouble(display.getText()); 
		if(operator.getText().equals("+")) {
			result = op1 + op2;
			display.setText(""+result);
		}if(operator.getText().equals("-")) {
			result = op1 - op2;
			display.setText(""+result);
		}if(operator.getText().equals("*")) {
			result = op1 * op2;
			display.setText(""+result);
		}if(operator.getText().equals("/")) {
			result = op1 / op2;
			display.setText(""+result);
		}
	}
	if(e.getSource() == btnPlus) {
		prev.setText(display.getText());
		operator.setText("+");
		flag.setText("");
	}
	if(e.getSource() == btnMinus) {
		prev.setText(display.getText());
		operator.setText("-");
		flag.setText("");
	}
	if(e.getSource() == btnProduct) {
		prev.setText(display.getText());
		operator.setText("*");
		flag.setText("");
	}
	if(e.getSource() == btnDivide) {
		prev.setText(display.getText());
		operator.setText("/");
		flag.setText("");
	}
	if(e.getSource() == btnCE) {
		display.setText("0");
		prev.setText("");
		operator.setText("");
		flag.setText("");
	}
	}
} // prev가 맨 처음 입력하는 숫자를 넣어주는 텍스트 상자, operator는 기호 falg가 다음 계산할 숫자를 넣어주는 텍스트같음 
