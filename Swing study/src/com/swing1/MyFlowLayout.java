package com.swing1;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFlowLayout extends JFrame{
	
	JButton btn1=new JButton("Button 1");
	JButton btn2=new JButton("Button 2");
	JButton btn3=new JButton("Button 3");
	JButton btn4=new JButton("Button 4");
	JButton btn5=new JButton("Button 5");
	public MyFlowLayout()
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
		FlowLayout f=new FlowLayout();//FlowLayout.LEFT for left
		f.setHgap(10);
		f.setVgap(5);
		c.setLayout(f);
		
		
	}

	public static void main(String[] args) {
		
		new MyFlowLayout();

	}

}
