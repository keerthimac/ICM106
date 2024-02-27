import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

class ViewCustomerForm extends JFrame {
	private JLabel titleLabel;

	private DefaultTableModel dtm;
	private JTable tblCustomerDetails;

	ViewCustomerForm() {
		setTitle("View Customer Form");
		setSize(600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		titleLabel = new JLabel("View Customer Form");
		titleLabel.setFont(new Font("", 1, 30));
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		add("North", titleLabel);

		String[] columnName = { "Customer ID", "Name", "Address", "Salary" };
		dtm = new DefaultTableModel(columnName, 0);

		tblCustomerDetails = new JTable(dtm);

		JScrollPane tablePane = new JScrollPane(tblCustomerDetails);
		add("Center", tablePane);

		Object[] rowData = { "C001", "Danapala", "Panadura", 45000 };
		dtm.addRow(rowData);
	}
}

class Demo {
	public static void main(String args[]) {
		new ViewCustomerForm().setVisible(true);
	}
}
