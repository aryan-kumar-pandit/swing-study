package com.swing1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSplitPane;
//splitpane not worked
public class MyJSplitPane {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Jsplit pane");
		frame.setBounds(250, 250, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		JButton btn1=new JButton("LEFT");
		JButton btn2=new JButton("RIGHT");
		
		JSplitPane splitPane=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		splitPane.setTopComponent(btn1);
		splitPane.setBottomComponent(btn2);
		splitPane.setDividerSize(10);
		splitPane.setDividerLocation(100);
		splitPane.setOneTouchExpandable(true);
		frame.add(splitPane);
		frame.validate();
		frame.setVisible(true);

	}

}
