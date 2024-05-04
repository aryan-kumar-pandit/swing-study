package com.swing1;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyGridLayout extends JFrame{
	
	JButton btn1=new JButton("Button 1");
	JButton btn2=new JButton("Button 2");
	JButton btn3=new JButton("Button 3");
	JButton btn4=new JButton("Button 4");
	JButton btn5=new JButton("Button 5");
	public MyGridLayout()
	{
		setTitle("flowlayout");
		setBounds(300, 200, 500, 200);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		c.add(btn4,0);
		c.add(btn5);
		GridLayout g=new GridLayout(3,2);//3 rows, 2 columns
		g.setHgap(10);
		g.setVgap(5);
		c.setLayout(g);
		
		
	}
	public static void main(String[] args) {
		new MyGridLayout();


	}

}
