import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame{
	private JButton[] btnArray;
	private JTextField textField;
	
	MyFrame(){
		setSize(300,300);
		setTitle("My Demo Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		textField = new JTextField(5);
		textField.setFont(new Font("",1,20));
		add("North",textField);
		
		JPanel buttonPanel=new JPanel();
		buttonPanel.setLayout(new GridLayout(4,4,2,2));
		
		btnArray=new JButton[16];
		String[] btnNames={"7","8","9","*","4","5","6","/","1","2","3","+","0",".","=","-"};
		for (int i = 0; i < 16; i++){
			btnArray[i]=new JButton(btnNames[i]);
			btnArray[i].setFont(new Font("",1,20));
			buttonPanel.add(btnArray[i]);
		}
		add("Center",buttonPanel);		
	}
}
class Demo{
	public static void main(String args[]){
		new MyFrame().setVisible(true);
	}
}
