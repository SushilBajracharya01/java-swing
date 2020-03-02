package swing;

import javax.swing.JLabel;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class Calculator {


	JFrame f;
	JLabel num1Lbl, num2Lbl, sumLbl, prodLbl;
	JTextField num1TxtFld, num2TxtFld, sumTxtFld, prodTxtFld;
	JButton addBtn, subBtn, mulBtn, clearBtn;

	private class AddClickListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
	    	float num1 = Float.parseFloat(num1TxtFld.getText());
	    	float num2 = Float.parseFloat(num2TxtFld.getText());
	    	
	    	float sum = num1 + num2;
	    	
	    	sumTxtFld.setText(Float.toString(sum));
	    }
	}
	
	private class SubClickListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
	    	float num1 = Float.parseFloat(num1TxtFld.getText());
	    	float num2 = Float.parseFloat(num2TxtFld.getText());
	    	
	    	float sum = num1 - num2;
	    	
	    	sumTxtFld.setText(Float.toString(sum));
	    }
	}
	
	private class MulClickListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
	    	float num1 = Float.parseFloat(num1TxtFld.getText());
	    	float num2 = Float.parseFloat(num2TxtFld.getText());
	    	
	    	float mul = num1 * num2;
	    	
	    	prodTxtFld.setText(Float.toString(mul));
	    }
	}
	
	private class ClearClickListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
	    	num1TxtFld.setText("0.0");
	    	num2TxtFld.setText("0.0");
	    	
	    	sumTxtFld.setText("0.0");
	    	prodTxtFld.setText("0.0");

	    }
	}
	
	Calculator() {
		f = new JFrame();

		num1Lbl = new JLabel("Num1: ");
		num1Lbl.setBounds(30, 50, 50, 30);
		f.add(num1Lbl);

		num1TxtFld = new JTextField();
		num1TxtFld.setBounds(80, 50, 80, 30);
		num1TxtFld.setText("0.0");
		f.add(num1TxtFld);

		num2Lbl = new JLabel("Num2: ");
		num2Lbl.setBounds(30, 110, 50, 30);
		f.add(num2Lbl);

		num2TxtFld = new JTextField();
		num2TxtFld.setBounds(80, 110, 80, 30);
		num2TxtFld.setText("0.0");
		f.add(num2TxtFld);

		sumLbl = new JLabel("Sum: ");
		sumLbl.setBounds(30, 170, 50, 30);
		f.add(sumLbl);

		sumTxtFld = new JTextField();
		sumTxtFld.setBounds(80, 170, 80, 30);
		sumTxtFld.setEditable(false);
		f.add(sumTxtFld);

		prodLbl = new JLabel("Prod.: ");
		prodLbl.setBounds(30, 230, 50, 30);
		f.add(prodLbl);

		prodTxtFld = new JTextField();
		prodTxtFld.setBounds(80, 230, 80, 30);
		prodTxtFld.setEditable(false);
		f.add(prodTxtFld);

		addBtn = new JButton("Add");
		addBtn.setBounds(30, 300, 80, 30);
		AddClickListener addClick = new AddClickListener();
		addBtn.addActionListener(addClick);
		addBtn.doClick();
		f.add(addBtn);

		subBtn = new JButton("Sub");
		subBtn.setBounds(120, 300, 80, 30);
		SubClickListener subClick = new SubClickListener();
		subBtn.addActionListener(subClick);
		subBtn.doClick();
		f.add(subBtn);

		mulBtn = new JButton("Mul");
		mulBtn.setBounds(210, 300, 80, 30);
		MulClickListener mulClick = new MulClickListener();
		mulBtn.addActionListener(mulClick);
		mulBtn.doClick();
		f.add(mulBtn);

		clearBtn = new JButton("Clear");
		clearBtn.setBounds(120, 340, 80, 30);
		ClearClickListener clearClick = new ClearClickListener();
		clearBtn.addActionListener(clearClick);
		addBtn.doClick();
		f.add(clearBtn);

		
		f.setTitle("Calculator ;)");
		f.setSize(350, 500);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		Calculator cal = new Calculator();
	}

}
