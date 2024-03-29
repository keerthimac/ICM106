import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame{
	JButton exitButton;
	JTextField textField;
	
	MyFrame(){
		setSize(300,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		textField=new JTextField(12);
		textField.setFont(new Font("",1,25));
		textField.addKeyListener(new MyClass());
		add(textField);	
		
		exitButton = new JButton("EXIT");
		exitButton.setFont(new Font("",1,25));
		add(exitButton);
		
		
		
	


	}
}

class MyClass implements KeyListener{
	public void keyPressed(KeyEvent evt){
		System.out.println("Mouse Pressed");
	}
	public void keyTyped(KeyEvent evt){
		System.out.println("Mouse Typed");
	}
	public void keyReleased(KeyEvent evt){
		System.out.println("Mouse Relesed");
	}


}
class Demo{ 
	public static void main(String args[]){
		new MyFrame().setVisible(true);
	}
}

 
