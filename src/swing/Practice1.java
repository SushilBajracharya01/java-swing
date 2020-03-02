package swing;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;

public class Practice1 {
	//frame
	JFrame f;
	JLabel lblname, lblpassword, lblgender, lblsem, lblmajorsub;
	JTextField txtname, txtpass;
	JPasswordField jpass;
	JRadioButton rbmale, rbfemale, rbother;
	JComboBox<String> jcbsem;
	JCheckBox jcbc, jcbjava;
	JButton jbtn;
	
	
	Practice1() {
		f = new JFrame();

		//name
		lblname = new JLabel("Name");
		lblname.setBounds(50, 50, 100, 30);
		f.add(lblname);
		
		//input textfield
		txtname = new JTextField();
		txtname.setBounds(160, 50, 150, 30);
		f.add(txtname);
		
		//password
		lblpassword = new JLabel("Password: ");
		lblpassword.setBounds(50, 90, 100, 30);
		f.add(lblpassword);
		// input password
		txtpass = new JTextField();
		txtpass.setBounds(160, 90, 150, 30);
		f.add(txtpass);
		
		//gender
		lblgender = new JLabel("Gender: ");
		lblgender.setBounds(50, 130, 100, 30);
		f.add(lblgender);
		//radio
		rbmale = new JRadioButton("Male");
		rbmale.setBounds(160, 120, 80, 50);
		f.add(rbmale);
		
		rbfemale = new JRadioButton("Female");
		rbfemale.setBounds(250, 120, 80, 50);
		f.add(rbfemale);
		
		rbother = new JRadioButton("Other");
		rbother.setBounds(340, 120, 80, 50);
		f.add(rbother);
		
		//lblsem
		lblsem = new JLabel("Semester: ");
		lblsem.setBounds(50, 170, 100, 30);
		f.add(lblsem);
		
		String semesters[] = {"1st","2nd","3rd","4th","5th","6th","7th","8th"};
		jcbsem = new JComboBox<String>(semesters);
		jcbsem.setBounds(160, 170, 100,30);
		f.add(jcbsem);
		
		jbtn = new JButton("Send");
		jbtn.setBounds(160, 230, 100, 40);
		f.add(jbtn);
		
		
		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		//TODO Auto-generated 
		Practice1 sw = new Practice1();
		
		
	}
}
