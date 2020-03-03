package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.JPasswordField;
import javax.swing.JRadioButton;

public class Practice1 {
	// frame
	JFrame f;
	JLabel lblname, lblpassword, lblgender, lblsem, lblmajorsub;
	JTextField txtname, txtpass;
	JPasswordField jpass;
	JRadioButton rbmale, rbfemale, rbother;
	JComboBox<String> jcbsem;
	JCheckBox jcbc, jcbjava;
	JButton jbtn;

	private class SubmitListener implements ActionListener {
		// JDBC driver name and database URL

		public static final String DB_DRIVER_CLASS = "com.mysql.jdbc.Driver";
		public static final String DB_URL = "jdbc:mysql://localhost:3306/SchoolManagement";

		// database credentails
		public static final String DB_USERNAME = "root";
		public static final String DB_PASSWORD = "password";

		public String sql = "insert into studentRecord (Name, Password, Gender, Semester) values (?,?,?,?);";

		public void InsertSubmit(String Name, String Password, String Gender, String Semester) {

			Connection conn = null;
			PreparedStatement pstmt = null;

			try {
				// Step 2: Register JDBC driver
				Class.forName("com.mysql.cj.jdbc.Driver");

				// Step 3: Open a connection
				System.out.println("Connecting to a selected database...");
				conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
				System.out.println("Connected database successfully...");

				// Step 4: Execute a query
				System.out.println("Inserting records into the table...");
				pstmt = conn.prepareStatement(sql);
				
				pstmt.setString(1, Name);
				pstmt.setString(2, Password);
				pstmt.setString(3, Gender);
				pstmt.setString(4, Semester);

				boolean executed = pstmt.execute();

				if (executed) {
					System.out.println("Inserted");
				} else {
					System.out.println("Insert Failed");
				}

			} catch (Exception e) {
				System.out.println(e);
			} finally {
			}
		}

		public void actionPerformed(ActionEvent e) {
			String Name = txtname.getText();
			String Password = txtpass.getText();
			String Gender;
			if (rbmale.isSelected()) {
				Gender = "M";
			} else if (rbfemale.isSelected()) {
				Gender = "F";
			} else {
				Gender = "O";
			}
			String Semester = jcbsem.getSelectedItem().toString();
			
			
			InsertSubmit(Name, Password, Gender, Semester);

		}
	}

	Practice1() {
		f = new JFrame();

		// name
		lblname = new JLabel("Name");
		lblname.setBounds(50, 50, 100, 30);
		f.add(lblname);

		// input textfield
		txtname = new JTextField();
		txtname.setBounds(160, 50, 150, 30);
		f.add(txtname);

		// password
		lblpassword = new JLabel("Password: ");
		lblpassword.setBounds(50, 90, 100, 30);
		f.add(lblpassword);
		// input password
		txtpass = new JTextField();
		txtpass.setBounds(160, 90, 150, 30);
		f.add(txtpass);

		// gender
		ButtonGroup genderGroup = new ButtonGroup();

		lblgender = new JLabel("Gender: ");
		lblgender.setBounds(50, 130, 100, 30);
		f.add(lblgender);
		// radio
		rbmale = new JRadioButton("Male");
		rbmale.setBounds(160, 120, 80, 50);
		rbmale.setSelected(true);

		rbfemale = new JRadioButton("Female");
		rbfemale.setBounds(250, 120, 80, 50);

		rbother = new JRadioButton("Other");
		rbother.setBounds(340, 120, 80, 50);

		genderGroup.add(rbmale);
		genderGroup.add(rbfemale);
		genderGroup.add(rbother);

		f.add(rbmale);
		f.add(rbfemale);
		f.add(rbother);

		// lblsem
		lblsem = new JLabel("Semester: ");
		lblsem.setBounds(50, 170, 100, 30);
		f.add(lblsem);

		String semesters[] = { "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th" };
		jcbsem = new JComboBox<String>(semesters);
		jcbsem.setBounds(160, 170, 100, 30);
		f.add(jcbsem);

		jbtn = new JButton("Send");
		jbtn.setBounds(160, 230, 100, 40);
		SubmitListener submitClick = new SubmitListener();
		jbtn.addActionListener(submitClick);
		jbtn.doClick();
		f.add(jbtn);

		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated
		Practice1 sw = new Practice1();

	}
}
