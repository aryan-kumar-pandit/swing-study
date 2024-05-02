package com.swing1;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame implements ActionListener
{
	Container c;
	JButton btn;
	
	MyFrame()
	{
		c=this.getContentPane();
		c.setLayout(null);
		
		btn= new JButton("Click Me");
		btn.setBounds(100, 100, 100, 50);
		c.add(btn);
		btn.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		c.setBackground(Color.yellow);
		
	}
	
	
}

public class ActionDemo {

	public static void main(String[] args) {
		MyFrame f=new MyFrame();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("Action listner");
		f.setBounds(100, 100, 1000, 500);

	}

}
