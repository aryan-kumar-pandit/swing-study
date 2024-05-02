package com.swing1;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame1 extends JFrame implements ActionListener
{
	Container c;
	JButton btn1= new JButton("RED");
	JButton btn2= new JButton("YELLOW");
	JButton btn3= new JButton("GREEN");
	
	MyFrame1()
	{
		c=this.getContentPane();
		c.setLayout(null);
		
		btn1.setBounds(100, 100, 100, 50);
		btn2.setBounds(250, 100, 100, 50);
		btn3.setBounds(400, 100, 100, 50);
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1) {
			c.setBackground(Color.red);	
		}
		if(e.getSource()==btn2) {
			c.setBackground(Color.yellow);	
		}
		if(e.getSource()==btn3) {
			c.setBackground(Color.green);	
		}
		
	}
}

public class ActionDemo2 {

	public static void main(String[] args) {
		MyFrame1 f=new MyFrame1();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("Action listner");
		f.setBounds(100, 100, 1000, 500);

	}

}
