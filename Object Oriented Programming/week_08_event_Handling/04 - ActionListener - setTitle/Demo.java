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
		add(textField);	
		
		exitButton = new JButton("EXIT");
		exitButton.setFont(new Font("",1,25));
		add(exitButton);
		
		exitButton.addActionListener(new setTitleButtonAction(this));

	}
}

class setTitleButtonAction implements ActionListener{
	MyFrame myFrame;
	
	setTitleButtonAction(MyFrame myFrame){
		this.myFrame = myFrame;
	}
	
	public void actionPerformed(ActionEvent evt){
		String title = myFrame.textField.getText();
		myFrame.setTitle(title);
	}
}
class Demo{ 
	public static void main(String args[]){
		new MyFrame().setVisible(true);
	}
}

 
