package com.desg;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
//#2
public class ActionPerformer extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField t1;
	private JTextField t2;
    private String name;
    public void setName(String name)
    {
    	this.name=name;
    }
    public String getName()
    {
    	return name;
    }
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//ActionPerformer frame = new ActionPerformer();
				//	frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ActionPerformer(String name) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("name");
		lblName.setBounds(33, 27, 46, 14);
		contentPane.add(lblName);
		
		JLabel lblNewLabel = new JLabel("address");
		lblNewLabel.setBounds(33, 60, 46, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			//String name=t1.getText();
			//String address=t2.getText();
			System.out.println(name+"--");
			
			
			
			
			}
		});
		btnNewButton.setBounds(67, 103, 89, 23);
		contentPane.add(btnNewButton);
		
		t1 = new JTextField();
		t1.setBounds(89, 24, 86, 20);
		contentPane.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(89, 57, 86, 20);
		contentPane.add(t2);
		t2.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(67, 103, 89, 23);
		contentPane.add(btnNewButton_1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("name");
		lblName.setBounds(33, 27, 46, 14);
		contentPane.add(lblName);
		
		JLabel lblNewLabel = new JLabel("address");
		lblNewLabel.setBounds(33, 60, 46, 14);
		contentPane.add(lblNewLabel);
		
	}

	
	

}
