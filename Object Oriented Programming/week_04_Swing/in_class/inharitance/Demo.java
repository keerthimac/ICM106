import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame{
	private JButton btnCenter;
	private JButton btnNorth;
	private JButton btnSouth;
	private JButton btnEast;
	private JButton btnWest;

	MyFrame(){
		setSize(300,300);
		setTitle("My Demo Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		btnCenter =new JButton("Center");	 
		btnNorth =new JButton("North");
		btnSouth =new JButton("South");
		btnEast =new JButton("East");
		btnWest =new JButton("West");

		btnCenter.setFont(new Font("",Font.BOLD,25));
		btnNorth.setFont(new Font("",Font.BOLD,25));
		btnSouth.setFont(new Font("",Font.BOLD,25));
		btnEast.setFont(new Font("",Font.BOLD,25));
		btnWest.setFont(new Font("",Font.BOLD,25));
		
		add("Center",btnCenter);		
		add("South",btnSouth);		
		add("North",btnNorth);		
		add("East",btnEast);		
		add("West",btnWest);
		
	}
}

class Demo{
	public static void main(String args[]){
		MyFrame f1=new MyFrame();
		f1.setVisible(true);		
	}
}
 
