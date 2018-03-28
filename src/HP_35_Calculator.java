import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class HP_35_Calculator extends JFrame  implements ActionListener{

	private JPanel contentPane;
	private JTextField textField_1;

		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button0 = new JButton("0");
		JButton buttond = new JButton("d");
		JButton buttonc = new JButton("c");
		JButton buttonm = new JButton("m");
		JButton buttonf = new JButton("f");
		JButton buttonx = new JButton("x");
		JButton buttonMulti = new JButton("*");
		JButton buttonDiv = new JButton("/");
		JButton buttonPlus = new JButton("+");
		JButton buttonMinus = new JButton("-");
		JButton buttonEqual = new JButton("=");
		
		JTextArea expression = new JTextArea();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HP_35_Calculator frame = new HP_35_Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HP_35_Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 408, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		button7.setBounds(22, 164, 46, 35);
		contentPane.add(button7);
			
		button8.setBounds(78, 164, 46, 35);
		contentPane.add(button8);
			
		button9.setBounds(134, 164, 46, 35);
		contentPane.add(button9);
				
		button4.setBounds(22, 210, 46, 35);
		contentPane.add(button4);
			
		button5.setBounds(78, 210, 46, 35);
		contentPane.add(button5);
			
		button6.setBounds(134, 210, 46, 35);
		contentPane.add(button6);	
		
		button1.setBounds(22, 256, 46, 35);
		contentPane.add(button1);
			
		button2.setBounds(78, 256, 46, 35);
		contentPane.add(button2);
			
		button3.setBounds(134, 256, 46, 35);
		contentPane.add(button3);

		button0.setBounds(78, 302, 46, 35);
		contentPane.add(button0);
		
		buttond.setBounds(276, 164, 46, 35);
		contentPane.add(buttond);		
		
		buttonc.setBounds(335, 164, 46, 35);
		contentPane.add(buttonc);
		
		buttonm.setBounds(178, 118, 46, 35);
		contentPane.add(buttonm);
		
		buttonf.setBounds(235, 118, 46, 35);
		contentPane.add(buttonf);
		
		buttonx.setBounds(335, 101, 46, 35);
		contentPane.add(buttonx);
		
		buttonMulti.setBounds(276, 210, 46, 35);
		contentPane.add(buttonMulti);
		
		buttonDiv.setBounds(335, 210, 46, 35);
		contentPane.add(buttonDiv);
		
		buttonPlus.setBounds(279, 256, 46, 35);
		contentPane.add(buttonPlus);
		
		buttonMinus.setBounds(335, 256, 46, 35);
		contentPane.add(buttonMinus);
		
		buttonEqual.setBounds(310, 302, 46, 35);
		contentPane.add(buttonEqual);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(128, 56, 194, 35);
		contentPane.add(textField_1);
		
		expression.setBounds(35, 11, 287, 35);
		contentPane.add(expression);
		
		
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button0.addActionListener(this);
		buttonPlus.addActionListener(this);
		buttonMinus.addActionListener(this);
		buttonDiv.addActionListener(this);
		buttonMulti.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
	
		Object source = e.getSource();
		
		if(source == button7){
		
			expression.append("7");
		}
		
		if(source == button8){
		
			expression.append("8");
		}
		
		if(source == button9){
		
			expression.append("9");
		}
		
		if(source == button4){
		
			expression.append("4");
		}
		
		if(source == button5){
		
			expression.append("5");
		}
		
		if(source == button6){
		
			expression.append("6");
		}
		
		if(source == button1){
		
			expression.append("1");
		}
		
		if(source == button2){
		
			expression.append("2");
		}
		
		if(source == button3){
		
			expression.append("3");
		}
				
		if(source == button0){
		
			expression.append("0");
		}
		if(source == buttonMulti){
		
			expression.append("*");
		}
		
		if(source == buttonDiv){
		
			expression.append("/");
		}
		
		if(source == buttonPlus){
		
			expression.append("+");
		}
		
		if(source == buttonMinus){
		
			expression.append("-");
		}
	}
}
