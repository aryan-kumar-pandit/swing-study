package com.swing1;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

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
		ImageIcon icon= new ImageIcon("C:\\Users\\Aryan\\git\\swing-study\\Swing study\\src\\com\\swing1\\abc.jpg");
		JLabel label=new JLabel(icon);
		label.setBounds(100, 50, icon.getIconWidth(), icon.getIconHeight());
		c.add(label);
		
		

	}

}
