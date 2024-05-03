package com.swing1;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionDemo3 {

	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("Action listner");
		f.setBounds(100, 100, 1000, 500);
		
		Container c=f.getContentPane();
		c.setLayout(null);
		
		JButton btn1= new JButton("RED");
		btn1.setBounds(100, 100, 100, 50);
		c.add(btn1);
		btn1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e)
			{
				c.setBackground(Color.red);
			}
			});
	}

}

