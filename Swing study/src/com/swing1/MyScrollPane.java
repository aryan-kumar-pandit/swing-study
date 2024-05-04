package com.swing1;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MyScrollPane {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Border layout example");
		frame.setBounds(400, 300, 500, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		
		JTextArea ta=new JTextArea(10,15);
		
		
		JScrollPane jp=new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		frame.add(jp);
		frame.setVisible(true);

	}

}
