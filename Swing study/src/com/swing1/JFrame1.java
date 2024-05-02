package com.swing1;

import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrame1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Aryan 1st swing");
		frame.setBounds(100, 100, 1000, 500);
		Container c=frame.getContentPane();
		c.setLayout(null);
		JLabel label=new JLabel("username");
		label.setBounds(100,50,100,30);
		c.add(label);
		
		

	}

}
