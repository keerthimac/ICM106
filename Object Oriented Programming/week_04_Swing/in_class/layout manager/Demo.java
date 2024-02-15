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
		b1.setText("Exit");
		f1.add("South",b1);
		
		JTextField t1=new JTextField();
		f1.add("North",t1);

		f1.setVisible(true);		
	}
}
 
