import javax.swing.*;
import java.awt.*;


class Demo{
	public static void main(String args[]){
		JFrame f1=new JFrame();
		f1.setSize(300,300);
		f1.setTitle("Calculator");
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setLocationRelativeTo(null);
		
		//Default LAyout "BorderLayout"
		JButton b1 =new JButton("South");
		JButton b2 =new JButton("North");
		JButton b3 =new JButton("East");
		JButton b4 =new JButton("West");
		JButton b5 =new JButton("Center");
		
		b1.setFont(new Font("",Font.BOLD,25));
		b2.setFont(new Font("",Font.BOLD,25));
		b3.setFont(new Font("",Font.BOLD,25));
		b4.setFont(new Font("",Font.BOLD,25));
		b5.setFont(new Font("",Font.BOLD,25));

		f1.add("South",b1);
		f1.add("North",b2);
		f1.add("East",b3);
		f1.add("West",b4);
		f1.add("Center",b5);

		f1.setVisible(true);		
	}
}
 
