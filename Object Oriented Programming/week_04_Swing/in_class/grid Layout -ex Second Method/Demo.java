import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame{
	private JButton[] btnArray;
	
	MyFrame(){
		setSize(300,300);
		setTitle("My Demo Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);	
		
		setLayout(new GridLayout(4,4,2,2));
		
		btnArray=new JButton[16];
		String[] btnNames={"7","8","9","*","4","5","6","/","1","2","3","+","0",".","=","-"};
		for (int i = 0; i < 16; i++){
			btnArray[i]=new JButton(btnNames[i]);
			btnArray[i].setFont(new Font("",1,20));
			add(btnArray[i]);
		}
	}
}
class Demo{
	public static void main(String args[]){
		new MyFrame().setVisible(true);
	}
}
