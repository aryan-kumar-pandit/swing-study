package com.swing1;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyComboBox {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=frame.getContentPane();
		c.setLayout(null);
		
		
		String[] values= {"A","B","C","D"};
		
		JComboBox c1=new JComboBox(values);
		c1.setBounds(100, 100, 100, 30);
		c.add(c1);
		c1.setEditable(true);
		c1.setSelectedItem("B");
		//c1.setSelectedIndex(0);
		
		JButton button=new JButton("OK");
		button.setBounds(300, 100, 100, 30);
		c.add(button);
		
		JLabel label=new JLabel("Hello");
		label.setBounds(500, 100, 100, 30);
		c.add(label);
		// important as how we created iterface object
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String item=(String) c1.getSelectedItem();
				label.setText(item);
				
			}
		});
		
		frame.setVisible(true);

	}

	

}
