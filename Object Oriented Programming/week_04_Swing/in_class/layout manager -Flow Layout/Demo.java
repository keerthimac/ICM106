import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame{
	private JButton btnCenter;
	private JButton btnSouth;
	private JButton btnNorth;
	private JButton btnWest;
	private JButton btnEast;
	
	MyFrame(){
		setSize(300,300);
		setTitle("My Demo Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);	
		
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		btnCenter=new JButton("Center");
		btnCenter.setFont(new Font("",1,25));
		add(btnCenter);
		
		btnSouth=new JButton("South");
		btnSouth.setFont(new Font("",1,25));
		add(btnSouth);
		
		btnNorth=new JButton("North");
		btnNorth.setFont(new Font("",1,25));
		add(btnNorth);
		
		btnWest=new JButton("West");
		btnWest.setFont(new Font("",1,25));
		add(btnWest);
		
		btnEast=new JButton("East");
		btnEast.setFont(new Font("",1,25));
		add(btnEast);
	}
}




class Demo{
	public static void main(String args[]){
		new MyFrame().setVisible(true);
	}
}

