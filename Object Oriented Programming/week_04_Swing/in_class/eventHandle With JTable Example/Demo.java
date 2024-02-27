import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class ViewCustomerForm extends JFrame{
	private JLabel titleLabel;
	private JButton btnAddCustomer;
	
	private DefaultTableModel dtm;
	private JTable tblCustomerDetails;
	
	
	ViewCustomerForm(){
		setTitle("View Customer Form");
		setSize(600,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);	
		
		titleLabel=new JLabel("View Customer Form");
		titleLabel.setFont(new Font("",1,30));
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		add("North",titleLabel);
		
		String[] columnName={"Customer ID", "Name", "Address","Salary"};
		dtm=new DefaultTableModel(columnName,0);
		
		tblCustomerDetails=new JTable(dtm);
		
		JScrollPane tablePane=new JScrollPane(tblCustomerDetails);
		add("Center",tablePane);
		
		btnAddCustomer=new JButton("Add Customer");
		btnAddCustomer.setFont(new Font("",1,20));
		
		btnAddCustomer.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				Scanner input=new Scanner(System.in);
				System.out.print("Input customer id : ");
				String id=input.nextLine();
				
				System.out.print("Input customer name : ");
				String name=input.nextLine();
				
				System.out.print("Input customer address : ");
				String address=input.nextLine();
				
				System.out.print("Input salary : ");
				double salary=input.nextDouble();
				
				Object[] rowData={id,name,address,salary};
				dtm.addRow(rowData);
			}
		});
		
		JPanel buttonPanel=new JPanel();
		buttonPanel.add(btnAddCustomer);
		add("South",buttonPanel);
	}
}
class Demo{
	public static void main(String args[]){
		new ViewCustomerForm().setVisible(true);
	}
}
