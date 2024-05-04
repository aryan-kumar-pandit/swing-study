package com.swing1;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyJOptionPane {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Border layout example");
		frame.setBounds(300, 200, 500, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		JButton b1=new JButton("PAGE START");
		frame.add(b1);
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String str=JOptionPane.showInputDialog("enter your name");
				
			}
			
		});
		
frame.setVisible(true);
	}

}
