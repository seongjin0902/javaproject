package project;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class Login {

	public static void main(String[] args) {
		new Login_GUI();
	}
}

class Login_GUI extends JFrame implements ActionListener, KeyListener {
	JButton btn1;
	JButton btn2;
//	JButton btn3;
	JButton btn4;
	JButton btn5;

	JTable tbl1;
	JTable tbl2;
	JLabel txt3;

	JTextArea area1;
	JScrollPane scroll1;
	JScrollPane scroll2;
	
	DefaultTableModel model;

	Login_GUI() {
		// Frame
		super("");
		setBounds(100, 100, 500, 500);

		// Panel
		JPanel panel = new JPanel(); // 패널생성

		panel.setLayout(null);

		// Component
		btn1 = new JButton("로그인");
		btn2 = new JButton("취소");



		// Positioning

		btn1.setBounds(120, 250, 120, 50); // 로그인
		btn2.setBounds(260, 250, 120, 50); //	취소


		// Event처리
		
//		btn1 로그인 처리 해야됨

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		


		btn1.setFont(new Font("굴림", Font.BOLD, 12));
		btn2.setFont(new Font("굴림", Font.BOLD, 12));

		// Add_Panel_Component
		panel.add(btn1);
		panel.add(btn2);

		// Frame
		add(panel); // 프레임에 panel추가

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		//로그인 취소 시 메인화면으로 이동
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Main_GUI();
				
			}
		});

	}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {}

	@Override
	public void keyReleased(KeyEvent e) {}

	@Override
	public void actionPerformed(ActionEvent e) {}

}