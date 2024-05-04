package com.swing1;

import java.awt.ScrollPane;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MyJTable {

	public static void main(String[] args) {
		
		String[][] data= {
				{"001","ram","21"},
				{"002","balramm","22"},
				{"003","shyamm","23"}
		};
		String[] columnNames= {
				"rollNo","Name","Age"
		};
		JTable table=new JTable(data,columnNames);
		JFrame frame = new JFrame("Border layout example");
		frame.add(new JScrollPane(table));
		frame.setBounds(250, 250, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		frame.setVisible(true);

	}

}
