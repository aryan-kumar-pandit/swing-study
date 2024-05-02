package com.swing1;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyPassword {

	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Aryan 1st swing");
		frame.setBounds(100, 100, 1000, 500);
		
		Container c=frame.getContentPane();
		c.setLayout(null);
		
		JPasswordField pass=new JPasswordField();
		pass.setBounds(100, 50, 120, 30);
		c.add(pass);
		
		pass.setEchoChar('*');// to set password apart from dot style
		frame.setVisible(true);

	}

}
