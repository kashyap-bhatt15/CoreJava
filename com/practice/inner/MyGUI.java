package com.practice.inner;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyGUI extends Frame implements ActionListener, WindowListener {

	private static final long serialVersionUID = 1L;
	
	private Panel panel;
	private Label label;
	private TextField textField;
	private Button countButton;
	private Button revButton;
	private int i = 0;

	public MyGUI() {
		panel = new  Panel();
		
		label = new Label("Counter");
		panel.add(label);
		
		textField = new TextField("0", 10);
		textField.setEditable(false);
		panel.add(textField);
		
		countButton = new Button("Increment");
		countButton.addActionListener(this);
		panel.add(countButton);
		
		revButton = new Button("Decrement");
		revButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				i--;
				textField.setText(i + "");
				
			}
		});
		panel.add(revButton);
		
		add(panel);
		addWindowListener(this);
		
		setTitle("My GUI - Using AWT");
		setSize(300, 400);
		setVisible(true);
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		MyGUI gui = new MyGUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		i++;
		textField.setText(i + "");
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("Window Closed");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
