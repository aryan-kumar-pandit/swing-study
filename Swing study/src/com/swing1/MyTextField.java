package com.swing1;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyTextField {

	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Aryan 1st swing");
		frame.setBounds(100, 100, 1000, 500);
		
		Container c=frame.getContentPane();
		c.setLayout(null);
		
		JTextField t1=new JTextField();
		t1.setBounds(100, 50, 120, 30);
		c.add(t1);
		t1.setText("ARYAN");
		t1.setForeground(Color.green);
		t1.setBackground(Color.YELLOW);
		t1.setEditable(false);
		
		frame.setVisible(true);

	}

}
