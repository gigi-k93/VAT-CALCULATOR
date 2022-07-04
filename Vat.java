package vat_calculator;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Vat {
JFrame myf= new JFrame("VAT CALCULATOR");

JPanel p1= new JPanel(new FlowLayout());
JPanel p2= new JPanel(new GridLayout(4,2,10,20));
JPanel p3= new JPanel( new GridLayout(1,2,10,20));

JLabel lblHead= new JLabel("VAT CALCULATOR");
JLabel lblGross= new JLabel("GROSS");
JLabel lblVAT= new JLabel("VAT_AMOUNT");
JLabel lblAMT= new JLabel("AMOUNT");
JLabel lblTOT= new JLabel("TOTAL");

JTextField txtGross= new JTextField();
JTextField txtVat=new JTextField();
JTextField txtAmt= new JTextField();
JTextField txtTotal= new JTextField();

JButton btnCalculate= new JButton("Calculate");
JButton btnCancel= new JButton("Cancel");

public void createAndShowGUI() {
	p1.add(lblHead);
	p2.add(lblGross);
	p2.add(txtGross);
	p2.add(lblVAT);
	p2.add(txtVat);
	p2.add(lblAMT);
	p2.add(txtAmt);
	p2.add(lblTOT);
	p2.add(txtTotal);
	p3.add(btnCalculate);
	btnCalculate.addActionListener(new Calculate());
	p3.add(btnCancel);
	btnCalculate.setBackground(Color.pink);
	btnCancel.addActionListener(new Cancel());
	btnCancel.setBackground(Color.pink);
	
	myf.getContentPane().add(p1);
	myf.setVisible(true);
	myf.setLocation(300,300);
	myf.setSize(350,350);
	
	myf.add(p1, BorderLayout.NORTH);
	myf.add(p2, BorderLayout.CENTER);
	myf.add(p3, BorderLayout.SOUTH);
	myf.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
}

private class Calculate implements ActionListener{
    @Override   
 public void actionPerformed(ActionEvent e){
    	double gross, vat, amt, total;
        gross= Double.parseDouble(txtGross.getText());
        vat= 0.15 * gross;
        String vats= String.valueOf(vat);
        txtVat.setText(vats);
        amt= vat;
        String amts=String.valueOf(amt);
        txtAmt.setText(amts);
        
        total= gross + amt;
        String totals= String.valueOf(total);
        txtTotal.setText(totals);
    }
}
    private class Cancel implements ActionListener{
    	@Override
    public void actionPerformed(ActionEvent e) {
    		System.exit(0);
    	}
    		
    	}
    }
