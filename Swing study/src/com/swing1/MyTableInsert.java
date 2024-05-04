package com.swing1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class MyTableInsert {

	public static void main(String[] args) {
		new MyTable();

	}

}

class MyTable extends JFrame
{
	JTable table;
	JTextField t1,t2,t3;
	JButton b1,b2,b3;
	public MyTable() {

		setTitle("Table Insert");
		setBounds(250, 250, 700, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		Object[][] data= {
				{"001","ram","21"},
				{"002","balramm","22"},
				{"003","shyamm","23"}
		};
		String[] columnNames= {
				"rollNo","Name","Age"
		};
		DefaultTableModel model = new DefaultTableModel(data,columnNames);
		
		table=new JTable(model);
		setLayout(new GridLayout(3,1));
		JPanel panel=new JPanel();
		add(new JScrollPane(table));
		add(new JPanel());
		add(panel);
		
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		
		b1=new JButton("ADD");
		b2=new JButton("UPDATE");
		b3=new JButton("DELETE");
		
		panel.setLayout(new GridLayout(3,3));
		panel.add(new JLabel("Roll NO"));
		panel.add(t1);
		panel.add(b1);
		
		panel.add(new JLabel("NAME"));
		panel.add(t2);
		panel.add(b2);
		
		panel.add(new JLabel("AGE"));
		panel.add(t3);
		panel.add(b3);
		
		b1.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
					int rollNo=Integer.parseInt(t1.getText().toString());
					String name=t2.getText().toString();
					int age=Integer.parseInt(t3.getText().toString());
					Object[] newRow= {rollNo,name,age};
					model.addRow(newRow);
					t1.setText(null);
					t2.setText(null);
					t3.setText(null);
						
					}
			
				});
		validate();
	}
	
	
}
