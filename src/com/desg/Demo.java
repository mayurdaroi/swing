package com.desg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
// #1
public class Demo extends JFrame {

	public JPanel contentPane;
	public JTextField mybox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo frame = new Demo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Demo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);//oo
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Emp.Name");
		lblNewLabel.setBounds(36, 33, 53, 20);
		contentPane.add(lblNewLabel);
		
		mybox = new JTextField();
		mybox.setBounds(98, 33, 86, 20);
		contentPane.add(mybox);
		mybox.setColumns(10);
		
		
		
		JCheckBox chckbxChecklist = new JCheckBox("checkList");
		chckbxChecklist.setBounds(46, 60, 97, 23);
		contentPane.add(chckbxChecklist);
		
		JButton btnNewButton_1 = new JButton("button 2");
		btnNewButton_1.addActionListener(new ActionPerformer(null));//called action listener(performer) present in My custom class
		btnNewButton_1.setBounds(183, 90, 97, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ename=mybox.getText();
			ActionPerformer ap=new ActionPerformer(ename);
			ap.setVisible(true);
			}
		});
		btnNewButton.setBounds(56, 90, 89, 23);
		contentPane.add(btnNewButton);
	}
}
