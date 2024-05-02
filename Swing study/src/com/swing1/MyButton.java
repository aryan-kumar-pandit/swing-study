package com.swing1;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class MyButton {

	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Aryan 1st swing");
		frame.setBounds(100, 100, 1000, 500);
		
		Container c=frame.getContentPane();
		c.setLayout(null);
		
		JButton btn=new JButton("click me");
		btn.setBounds(100, 50, 120, 30);
		c.add(btn);
		btn.setText("mybutton");
		btn.setForeground(Color.green);
		btn.setBackground(Color.YELLOW);
		
		Cursor cur=new Cursor(Cursor.HAND_CURSOR);
		btn.setCursor(cur);
		
		//btn.setEnabled(false);
		//btn.setVisible(false);
	
	
		frame.setVisible(true);

	}

}
