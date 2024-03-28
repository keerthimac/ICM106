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
		
		exitButton.addActionListener(new MyClass());
		
		add(exitButton);
	}
}

class MyClass implements ActionListener{
	public void actionPerformed(ActionEvent evt){
		System.exit(0);
	}
}
class Demo{ 
	public static void main(String args[]){
		new MyFrame().setVisible(true);
	}
}

 
