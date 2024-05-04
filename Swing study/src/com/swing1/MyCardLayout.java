package com.swing1;

import java.awt.CardLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyCardLayout {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Card layout example");
		frame.setBounds(300, 200, 500, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container=frame.getContentPane();
		
		CardLayout cardLayout=new CardLayout();
		container.setLayout(cardLayout);
		
		JButton btn1=new JButton("page 1");
		JButton btn2=new JButton("page 2");
		JButton btn3=new JButton("page 3");
		JButton btn4=new JButton("page 4");
		container.add(btn1,"1");
		container.add(btn2,"2");
		container.add(btn3,"3");
		container.add(btn4,"4");
		cardLayout.next(container);
		cardLayout.previous(container);
		
		frame.setVisible(true);

	}

}
