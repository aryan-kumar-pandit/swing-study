package com.swing1;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyMenuBar {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menubar= new JMenuBar();
		
		JMenu file=new JMenu("FILE");
		
		JMenuItem i1=new JMenuItem("New");
		JMenuItem i2=new JMenuItem("open");
		JMenuItem i3=new JMenuItem("save");
		
		file.add(i1);
		file.add(i2);
		file.add(i3);
		
		JMenu edit=new JMenu("EDIT");
		JMenuItem i4=new JMenuItem("UNDO");
		JMenuItem i5=new JMenuItem("REDO");
		edit.add(i4);
		edit.add(i5);
		
		JMenu copy=new JMenu("COPY");
		JMenuItem i6=new JMenuItem("COPY1");
		JMenuItem i7=new JMenuItem("COPY2");
		copy.add(i6);
		copy.add(i7);
		file.add(copy);
		
		
		menubar.add(file);
		menubar.add(edit);
		frame.setJMenuBar(menubar);
		
		frame.setVisible(true);


	}

}
