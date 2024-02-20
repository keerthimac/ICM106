import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame{
	private JButton btnNine;
	private JButton btnEight;
	private JButton btnSeven;
	private JButton btnSix;
	private JButton btnFive;
	private JButton btnFour;
	private JButton btnThree;
	private JButton btnTwo;
	private JButton btnOne;
	private JButton btnZero;
	private JButton btnPlus;
	private JButton btnMinus;
	private JButton btnEqual;
	private JButton btnDot;
	private JButton btnDivision;
	private JButton btnMultiple;
	
	MyFrame(){
		setSize(300,300);
		setTitle("My Demo Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);	
		
		setLayout(new GridLayout(4,4));

		btnSeven=new JButton("7");
		btnSeven.setFont(new Font("",1,25));
		add(btnSeven);

		btnEight=new JButton("8");
		btnEight.setFont(new Font("",1,25));
		add(btnEight);
		
		btnNine=new JButton("9");
		btnNine.setFont(new Font("",1,25));
		add(btnNine);

		btnMultiple=new JButton("*");
		btnMultiple.setFont(new Font("",1,25));
		add(btnMultiple);

		btnFour=new JButton("4");
		btnFour.setFont(new Font("",1,25));
		add(btnFour);
		
		btnFive=new JButton("5");
		btnFive.setFont(new Font("",1,25));
		add(btnFive);		
		
		btnSix=new JButton("6");
		btnSix.setFont(new Font("",1,25));
		add(btnSix);

		btnDivision=new JButton("/");
		btnDivision.setFont(new Font("",1,25));
		add(btnDivision);		

		btnOne=new JButton("1");
		btnOne.setFont(new Font("",1,25));
		add(btnOne);

		btnTwo=new JButton("2");
		btnTwo.setFont(new Font("",1,25));
		add(btnTwo);

		btnThree=new JButton("3");
		btnThree.setFont(new Font("",1,25));
		add(btnThree);
		
		btnPlus=new JButton("+");
		btnPlus.setFont(new Font("",1,25));
		add(btnPlus);
		
		btnZero=new JButton("0");
		btnZero.setFont(new Font("",1,25));
		add(btnZero);
		
		btnDot=new JButton(".");
		btnDot.setFont(new Font("",1,25));
		add(btnDot);
		
		btnEqual=new JButton("=");
		btnEqual.setFont(new Font("",1,25));
		add(btnEqual);		
		
		btnMinus=new JButton("-");
		btnMinus.setFont(new Font("",1,25));
		add(btnMinus);	
		
	}
}




class Demo{
	public static void main(String args[]){
		new MyFrame().setVisible(true);
	}
}

