import javax.swing.*;
import java.awt.*;

class AddCustomerForm extends JFrame{
	private JLabel titleLabel;
	private JButton btnAdd;
	private JButton btnCancel;
	
	private JLabel lblId;
	private JLabel lblName;
	private JLabel lblAddress;
	private JLabel lblSalary;
	
	private JTextField txtId;
	private JTextField txtName;
	private JTextField txtAddress;
	private JTextField txtSalary;
	
	AddCustomerForm(){
		setSize(600,400);
		setTitle("My Customer Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		titleLabel = new JLabel("Add Customer From");
		titleLabel.setFont(new Font("",1,30));
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		add("North",titleLabel);
		
		JPanel buttonPannel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		btnAdd = new JButton("Add Customer");
		btnAdd.setFont(new Font("",1,20));
		btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("",1,20));
		buttonPannel.add(btnAdd);
		buttonPannel.add(btnCancel);
		add("South",buttonPannel);
		
		JPanel labelPanel = new JPanel(new GridLayout(4,1));
		
		lblId = new JLabel("Customer Id");
		lblId.setFont(new Font("",1,20));
		labelPanel.add(lblId);

		lblName = new JLabel("Name");
		lblName.setFont(new Font("",1,20));
		labelPanel.add(lblName);

		lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("",1,20));
		labelPanel.add(lblAddress);

		lblSalary = new JLabel("Salary");
		lblSalary.setFont(new Font("",1,20));
		labelPanel.add(lblSalary);
		
		JPanel textPanel = new JPanel(new GridLayout(4,1));
		
		
		txtId = new JTextField(5);
		txtId.setFont(new Font("",1,20));
		JPanel idTextPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		idTextPanel.add(txtId);
		textPanel.add(idTextPanel);
		
		txtName = new JTextField(10);
		txtName.setFont(new Font("",1,20));
		JPanel nameTextPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		nameTextPanel.add(txtName);
		textPanel.add(nameTextPanel);
		
		txtAddress = new JTextField(20);
		txtAddress.setFont(new Font("",1,20));
		JPanel addressTextPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		addressTextPanel.add(txtAddress);
		textPanel.add(addressTextPanel);
		
		txtSalary = new JTextField(6);
		txtSalary.setFont(new Font("",1,20));
		JPanel salaryTextPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		salaryTextPanel.add(txtSalary);
		textPanel.add(salaryTextPanel);
		
		add("West",labelPanel);
		add("East",textPanel);
		pack();
	}
}
class Demo{
	public static void main(String args[]){
		new AddCustomerForm().setVisible(true);
	}
}
