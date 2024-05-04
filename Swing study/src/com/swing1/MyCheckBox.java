package com.swing1;

import java.awt.Container;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyCheckBox {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=frame.getContentPane();
		c.setLayout(null);
		frame.setVisible(true);
		
		JCheckBox j1=new JCheckBox("High school");
		JCheckBox j2=new JCheckBox("intermediate");
		JCheckBox j3=new JCheckBox("college");
		JCheckBox j4=new JCheckBox("post graduate");
		j1.setBounds(100, 50, 100, 20);
		j2.setBounds(100, 100, 100, 20);
		j3.setBounds(100, 150, 100, 20);
		j4.setBounds(100, 200, 100, 20);
		c.add(j1);
		c.add(j2);
		c.add(j3);
		c.add(j4);
		
		j1.setSelected(true);
		j4.setEnabled(false);
		
	}

}
