import javax.swing.*;
class Demo{
	public static void main(String args[]){
		JFrame f1=new JFrame();
		f1.setSize(300,300);
		f1.setTitle("Calculator");
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setLocationRelativeTo(null);
		
		//Default LAyout "BorderLayout"
		JButton b1 =new JButton();
		b1.setText("South");
		f1.add("South",b1);
		
		JButton b2 =new JButton();
		b2.setSize(300,300);
		b2.setText("North");
		f1.add("North",b2);
		
		JButton b3 =new JButton();
		b3.setText("East");
		f1.add("East",b3);

		JButton b4 =new JButton();
		b4.setText("West");
		f1.add("West",b4);

		JButton b5 =new JButton();
		b5.setText("Center");
		f1.add("Center",b5);

		f1.setVisible(true);		
	}
}
 
