package com.swing1;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyBorderLayout {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Border layout example");
		frame.setBounds(300, 200, 500, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=frame.getContentPane();
		
		BorderLayout borderLayout=new BorderLayout();
		c.setLayout(borderLayout);
		borderLayout.setHgap(10);
		borderLayout.setVgap(5);
		
		JButton b1=new JButton("PAGE START");
		JButton b2=new JButton("PAGE END");
		JButton b3=new JButton("LINE START");
		JButton b4=new JButton("LINE END");
		JButton b5=new JButton("CENTER");
		
		c.add(b1,BorderLayout.PAGE_START);
		c.add(b2,BorderLayout.PAGE_END);
		c.add(b3,BorderLayout.LINE_START);
		c.add(b4,BorderLayout.LINE_END);
		c.add(b5,BorderLayout.CENTER);
		
		frame.setVisible(true);

	}

}
