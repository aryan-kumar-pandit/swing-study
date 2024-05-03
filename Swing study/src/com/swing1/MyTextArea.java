package com.swing1;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JTextArea;


public class MyTextArea {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=frame.getContentPane();
		c.setLayout(null);
		
		JTextArea t1=new JTextArea();
		t1.setBounds(100, 100, 400, 200);
		c.add(t1);
		t1.setText("This is my area");
		t1.setLineWrap(true);// words will come downward once it reaches end of text area
		frame.setVisible(true);
		
	}

}
