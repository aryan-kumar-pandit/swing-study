package com.swing1;

import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JFrame1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(700, 500);
		//frame.setLocation(100, 100);
		frame.setTitle("Aryan 1st swing");
		ImageIcon icon=new ImageIcon("C:\\Users\\Aryan\\eclipse-workspace\\Swing study\\src\\com\\swing1\\abc.jpg");
		frame.setIconImage(icon.getImage());
		frame.setBounds(100, 100, 1000, 500);
		Container c=frame.getContentPane();
		c.setBackground(Color.red);
		//Color color = new Color();
		//frame.setResizable(false); -- frame wont' get resized
		
		

	}

}
