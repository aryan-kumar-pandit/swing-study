package com.swing1;

import java.awt.Container;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class MyFrame3 extends JFrame implements ActionListener
{
	Container c;
	JLabel label1,label2;
	JTextField user;
	JPasswordField pass;
	JButton btn;
	MyFrame3()
	{
		setTitle("LoginForm");
		
		setSize(400, 300);
		setLocation(100, 100);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		c=getContentPane();// we should use frame.getContentPane() but
		//c=this.getContentPane();
		//getContentPane(); method present in JFrame class
		c.setLayout(null);
		label1=new JLabel("USERNAME");
		label2=new JLabel("PASSWORD");
		label1.setBounds(10, 50, 100, 20);
		label2.setBounds(10, 100, 100, 20);
		c.add(label1);
		c.add(label2);
		user=new JTextField();
		user.setBounds(120, 50, 120, 20);
		c.add(user);
		pass= new JPasswordField();
		pass.setBounds(120, 100, 120, 20);
		c.add(pass);
		btn=new JButton("Login");
		btn.setBounds(100,150,70,20);
		c.add(btn);
		btn.addActionListener(this);
		setVisible(true);
	}
	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("USERNAME "+ user.getText());
		System.out.println("PASSWORD "+ pass.getText());
	}
	
}
public class LoginForm {

	public static void main(String[] args) {
		MyFrame3 frame=new MyFrame3();

	}

}
