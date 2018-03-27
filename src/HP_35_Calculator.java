import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

public class HP_35_Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

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
		setBounds(100, 100, 450, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(78, 11, 284, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button7 = new JButton("7");
		button7.setBounds(38, 127, 46, 35);
		contentPane.add(button7);
		
		JButton button8 = new JButton("8");
		button8.setBounds(94, 127, 46, 35);
		contentPane.add(button8);
		
		JButton button9 = new JButton("9");
		button9.setBounds(150, 127, 46, 35);
		contentPane.add(button9);
		
		JButton button4 = new JButton("4");
		button4.setBounds(38, 173, 46, 35);
		contentPane.add(button4);
		
		JButton button5 = new JButton("5");
		button5.setBounds(94, 173, 46, 35);
		contentPane.add(button5);
		
		JButton button6 = new JButton("6");
		button6.setBounds(150, 173, 46, 35);
		contentPane.add(button6);
		
		JButton button1 = new JButton("1");
		button1.setBounds(38, 219, 46, 35);
		contentPane.add(button1);
		
		JButton button2 = new JButton("2");
		button2.setBounds(94, 219, 46, 35);
		contentPane.add(button2);
		
		JButton button_5 = new JButton("3");
		button_5.setBounds(150, 219, 46, 35);
		contentPane.add(button_5);
		
		JButton button0 = new JButton("0");
		button0.setBounds(94, 265, 46, 35);
		contentPane.add(button0);
		
		JButton buttond = new JButton("d");
		buttond.setBounds(279, 127, 46, 35);
		contentPane.add(buttond);
		
		JButton buttonc = new JButton("c");
		buttonc.setBounds(335, 127, 46, 35);
		contentPane.add(buttonc);
		
		JButton buttonm = new JButton("m");
		buttonm.setBounds(179, 81, 46, 35);
		contentPane.add(buttonm);
		
		JButton buttonf = new JButton("f");
		buttonf.setBounds(235, 81, 46, 35);
		contentPane.add(buttonf);
		
		JButton buttonx = new JButton("x");
		buttonx.setBounds(367, 57, 46, 35);
		contentPane.add(buttonx);
		
		JButton buttonMulti = new JButton("*");
		buttonMulti.setBounds(279, 173, 46, 35);
		contentPane.add(buttonMulti);
		
		JButton button_div = new JButton("/");
		button_div.setBounds(335, 173, 46, 35);
		contentPane.add(button_div);
		
		JButton buttonPlus = new JButton("+");
		buttonPlus.setBounds(279, 219, 46, 35);
		contentPane.add(buttonPlus);
		
		JButton buttonMinus = new JButton("-");
		buttonMinus.setBounds(335, 219, 46, 35);
		contentPane.add(buttonMinus);
		
		JButton buttonEqual = new JButton("=");
		buttonEqual.setBounds(305, 265, 46, 35);
		contentPane.add(buttonEqual);
	}
}
