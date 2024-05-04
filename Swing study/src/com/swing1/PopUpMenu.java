package com.swing1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class PopUpMenu extends JFrame implements ActionListener{

	JPopupMenu pm;
	JMenuItem m1,m2,m3;
	
	PopUpMenu() {
		
		setTitle("popupmenu");
		setBounds(250, 250, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setVisible(true);
		
		pm=new JPopupMenu();
		m1=new JMenuItem("item 1");
		m2=new JMenuItem("item 2");
		m3=new JMenuItem("item 3");
		pm.add(m1);
		pm.add(m2);
		pm.add(m3);
		add(pm);
		m1.addActionListener(this);
		m2.addActionListener(this);
		m3.addActionListener(this);
		
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)
			{
				if(e.getButton()==MouseEvent.BUTTON3)
				{
				int x=e.getX();
				int y=e.getY();
				pm.show(PopUpMenu.this,x,y);
				}
				
			}
		});
	}

	public static void main(String[] args) {
	
		PopUpMenu p=new PopUpMenu();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==m1)
		{
			System.out.println("item 1");
		}
		else if(e.getSource()==m2)
		{
			System.out.println("item 2");
		}
		else if (e.getSource()==m3)
		{
			System.out.println("item 3");
		}
		
	}

}
