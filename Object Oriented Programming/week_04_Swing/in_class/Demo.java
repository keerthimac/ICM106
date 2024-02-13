import javax.swing.*;
class Demo{
	public static void main(String args[]){
		JFrame f1=new JFrame();
		f1.setSize(300,300);
		f1.setTitle("Calculator");
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setLocationRelativeTo(null);
		
		JButton b1=new JButton();
		b1.setText("Exit");
		
		f1.add(b1);
				
		f1.setVisible(true);
	}
}
