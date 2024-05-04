package com.swing1;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class MyTabbedPane {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Border layout example");
		frame.setBounds(250, 250, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		
		JTabbedPane tp=new JTabbedPane();
		tp.setBounds(50, 50, 250, 250);
		frame.add(tp);
		
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		p1.add(new JLabel("This is my first page"));
		p2.add(new JLabel("This is my second page"));
		p3.add(new JLabel("This is my third page"));
		tp.add("First",p1);
		tp.add("second",p2);
		tp.add("Third",p3);

		frame.setVisible(true);
		
	}

}
