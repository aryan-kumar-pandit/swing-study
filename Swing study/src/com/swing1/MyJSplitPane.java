package com.swing1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSplitPane;

public class MyJSplitPane extends JFrame {

	MyJSplitPane()
	{
		
		setTitle("Jsplit pane");
		setBounds(250, 250, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
		JButton btn1=new JButton("LEFT");
		JButton btn2=new JButton("RIGHT");
		
		JSplitPane splitPane=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		splitPane.setTopComponent(btn1);
		splitPane.setBottomComponent(btn2);
		splitPane.setDividerSize(10);
		splitPane.setDividerLocation(100);
		splitPane.setOneTouchExpandable(true);
		add(splitPane);
		validate();
		
	}
	
	public static void main(String[] args) {
		new MyJSplitPane();
		

	}

}
