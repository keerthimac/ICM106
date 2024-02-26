import javax.swing.*;

class Calculator extends JFrame{
	
}


class Demo{
	public static void main(String args[]){
		Calculator c1=new Calculator();
		c1.setSize(300,300);
		c1.setTitle("Calculator 1");
		c1.setDefaultCloseOperation(Calculator.EXIT_ON_CLOSE);
		c1.setVisible(true);
		
		JFrame c2=new JFrame();
		c2.setSize(300,300);
		c2.setTitle("Calculator2");
		c2.setDefaultCloseOperation(Calculator.EXIT_ON_CLOSE);
		c2.setVisible(true);		
	}
}
 
