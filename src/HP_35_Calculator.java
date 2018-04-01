import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JComboBox;

public class HP_35_Calculator extends JFrame  implements ActionListener{

	private JPanel contentPane;
	protected Deque<String> memory = new ArrayDeque<>();
	protected Deque<String> mem = new ArrayDeque<>();
	String prev;
	String[] test;
	
	//Work on greeting message that shows the brand of the calculator and other anesthetics
	//Also work on input validation and creativity

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
		JButton buttonb = new JButton("b");
		JButton buttonc = new JButton("c");
		JButton buttonm = new JButton("m");
		JButton buttonf = new JButton("f");
		JButton buttonx = new JButton("x");
		JButton buttonMulti = new JButton("*");
		JButton buttonDiv = new JButton("/");
		JButton buttonPlus = new JButton("+");
		JButton buttonMinus = new JButton("-");
		JButton buttonEqual = new JButton("=");
		JButton buttonSpace = new JButton("Space");
		
		JTextArea expressionTxtA = new JTextArea();
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
		setBounds(100, 100, 393, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		button7.setBounds(10, 138, 46, 35);
		contentPane.add(button7);
			
		button8.setBounds(66, 138, 46, 35);
		contentPane.add(button8);
			
		button9.setBounds(122, 138, 46, 35);
		contentPane.add(button9);
				
		button4.setBounds(10, 184, 46, 35);
		contentPane.add(button4);
			
		button5.setBounds(66, 184, 46, 35);
		contentPane.add(button5);
			
		button6.setBounds(122, 184, 46, 35);
		contentPane.add(button6);	
		
		button1.setBounds(10, 230, 46, 35);
		contentPane.add(button1);
			
		button2.setBounds(66, 230, 46, 35);
		contentPane.add(button2);
			
		button3.setBounds(122, 230, 46, 35);
		contentPane.add(button3);

		button0.setBounds(66, 276, 46, 35);
		contentPane.add(button0);
		
		buttonb.setBounds(264, 138, 46, 35);
		contentPane.add(buttonb);		
		
		buttonc.setBounds(320, 138, 46, 35);
		contentPane.add(buttonc);
		
		buttonm.setBounds(166, 92, 46, 35);
		contentPane.add(buttonm);
		
		buttonf.setBounds(222, 92, 46, 35);
		contentPane.add(buttonf);
		
		buttonx.setBounds(320, 57, 46, 35);
		contentPane.add(buttonx);
		
		buttonMulti.setBounds(264, 184, 46, 35);
		contentPane.add(buttonMulti);
		
		buttonDiv.setBounds(320, 184, 46, 35);
		contentPane.add(buttonDiv);
		
		buttonPlus.setBounds(264, 230, 46, 35);
		contentPane.add(buttonPlus);
		
		buttonMinus.setBounds(320, 230, 46, 35);
		contentPane.add(buttonMinus);
		
		buttonEqual.setBounds(291, 276, 46, 35);
		contentPane.add(buttonEqual);
		
		buttonSpace.setBounds(166, 276, 101, 35);
		contentPane.add(buttonSpace);
		
		expressionTxtA.setBounds(35, 11, 287, 35);
		contentPane.add(expressionTxtA);
		
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
		buttonSpace.addActionListener(this);
		
		buttonx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				expressionTxtA.setText("");
				expressionTxtA.setText("GoodBye");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.exit(0);
			}
		});
		
		buttonc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				expressionTxtA.setText("");
			}
		});
		
		buttonEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int answer = calculatePostFix();
				
				expressionTxtA.setText("");
				expressionTxtA.setText(String.valueOf(answer));
			}
		});
		
		buttonm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
		//get items from memory stack and push them back to text area and set it
				if(memory.size() < 1) {
					expressionTxtA.append("");
				}
				else {
					expressionTxtA.append(memory.pop());
				}				
			}
		});
		
		buttonb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String inputExpression = expressionTxtA.getText();	
				String[] Expression = inputExpression.split("");
				Deque<String> stack = new ArrayDeque<>();
				
				expressionTxtA.setText(expressionTxtA.getText().substring(0,expressionTxtA.getText().length()-1));
				
				for(int i = 0; i < Expression.length; i++) {
					
					stack.push(Expression[i]);
				}				
						
				 String mem = stack.pop();
				 memory.push(mem);
				 
				 Arrays.copyOf(Expression, Expression.length-1);
				 			 
				 System.out.println(stack);
				 System.out.println(mem);
				 System.out.println(memory);

			}
		});
		
		buttonf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				RandomAccessFile raFile = null;
				String inputExpression = expressionTxtA.getText();
							
				try {
					
					raFile = new RandomAccessFile("expression.dat","rw");				
					raFile.seek(raFile.length());
					raFile.writeUTF(inputExpression + "\n");
					
				}catch(IOException e) {
					
					e.printStackTrace();
					System.out.println("Error Accessing file");
				}finally {
					try {
						raFile.close();
					}catch(IOException e0) {
						
						e0.printStackTrace();
						System.out.println("Error closing file");
					}
				}
			}
		});		
	}
	
	public void actionPerformed(ActionEvent e){
	
		Object source = e.getSource();
		
		if(source == button7){
		
			expressionTxtA.append("7");
		}
		
		if(source == button8){
		
			expressionTxtA.append("8");
		}
		
		if(source == button9){
		
			expressionTxtA.append("9");
		}
		
		if(source == button4){
		
			expressionTxtA.append("4");
		}
		
		if(source == button5){
		
			expressionTxtA.append("5");
		}
		
		if(source == button6){
		
			expressionTxtA.append("6");
		}
		
		if(source == button1){
		
			expressionTxtA.append("1");
		}
		
		if(source == button2){
		
			expressionTxtA.append("2");
		}
		
		if(source == button3){
		
			expressionTxtA.append("3");
		}
				
		if(source == button0){
		
			expressionTxtA.append("0");
		}
		if(source == buttonMulti){
		
			expressionTxtA.append("*");
		}
		
		if(source == buttonDiv){
		
			expressionTxtA.append("/");
		}
		
		if(source == buttonPlus){
		
			expressionTxtA.append("+");
		}
		
		if(source == buttonMinus){
		
			expressionTxtA.append("-");
		}
		
		if(source == buttonSpace){
			expressionTxtA.append(" ");
		}
	}
	
	public int calculatePostFix() {
		
		String inputExpression = expressionTxtA.getText();
		String[] Expression = inputExpression.split(" ");
				
		Deque<Integer> stack = new ArrayDeque<>();
		int operand1, operand2;
		
		for(int i = 0; i < Expression.length; i++) {
			
			if(Expression[i].equals("*")) {
				
				 operand2 = stack.pop();
				 operand1 = stack.pop();
				 
				 System.out.println("Operating: " + operand1 + " * " + operand2);
				 System.out.println("Pushing results: " + (operand1 * operand2));
				 stack.push(operand1 * operand2);
			}
			
			else if(Expression[i].equals("/")) {
				
				 operand2 = stack.pop();
				 operand1 = stack.pop();
				 
				 System.out.println("Operating: " + operand1 + " / " + operand2);
				 System.out.println("Pushing results: " + (operand1 / operand2));
				 stack.push(operand1 / operand2);
			}
			
			else if(Expression[i].equals("+")) {
				
				 operand2 = stack.pop();
				 operand1 = stack.pop();
				 
				 System.out.println("Operating: " + operand1 + " + " + operand2);
				 System.out.println("Pushing results: " + (operand1 + operand2));
				 stack.push(operand1 + operand2);
			}
			
			else if(Expression[i].equals("-")) {
				
				 operand2 = stack.pop();
				 operand1 = stack.pop();
				 
				 System.out.println("Operating: " + operand1 + " - " + operand2);
				 System.out.println("Pushing results: " + (operand1 - operand2));
				 stack.push(operand1 - operand2);
			}
			else {
				System.out.println("Pushed: " + Expression[i]);
				stack.push(Integer.parseInt(Expression[i]));
			}
			
		}
		
		int result = stack.pop();
		System.out.println("The result is: " + result);
		
		
		return result;
	}
	
	public String infixToPostfix(String expression) {
		
		String result="AI";
		
		//expression = expression_reader();
		
		return result;
	}
}
