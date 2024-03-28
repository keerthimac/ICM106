import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 class MyFrame extends JFrame{
	JButton exitButton;
	
	MyFrame(){
		setSize(300,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		exitButton = new JButton("EXIT");
		exitButton.setFont(new Font("",1,25));
		
		exitButton.addMouseListener(new MyClass());
		
		
		add(exitButton);
	}
}

class MyClass implements MouseListener{
	public void mouseEntered(MouseEvent evt){
		System.out.println("Mouse Entered");
	}
	public void mousePressed(MouseEvent evt){
		System.out.println("Mouse Pressed");
	}
	public void mouseReleased(MouseEvent evt){
		System.out.println("Mouse Relesed");
	}
	public void mouseClicked(MouseEvent evt){
		System.out.println("Mouse Clicked");
	} 
	public void mouseExited(MouseEvent evt){
		System.out.println("Mouse Exited");
	}
}
class Demo{ 
	public static void main(String args[]){
		new MyFrame().setVisible(true);
	}
}

 
