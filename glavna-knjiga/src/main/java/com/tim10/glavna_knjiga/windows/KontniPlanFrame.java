package com.tim10.glavna_knjiga.windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;

public class KontniPlanFrame extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KontniPlanFrame frame = new KontniPlanFrame();
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
	public KontniPlanFrame() {
		setTitle("Kontni plan");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(30, 144, 255), 2, true), "Kontni plan", TitledBorder.LEFT, TitledBorder.TOP, new Font("arial", Font.BOLD,17), new Color(30, 144, 255)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 11, 764, 540);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnOtvoriKontniOkvir = new JButton("Otvori kontni okvir");
		btnOtvoriKontniOkvir.setForeground(Color.WHITE);
		btnOtvoriKontniOkvir.setBackground(new Color(30, 144, 255));
		btnOtvoriKontniOkvir.setBounds(52, 68, 150, 25);
		panel.add(btnOtvoriKontniOkvir);
		
		JLabel lblPretraga = new JLabel("Pretraga ");
		lblPretraga.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPretraga.setBounds(493, 69, 76, 20);
		panel.add(lblPretraga);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setBounds(558, 68, 150, 25);
		panel.add(textField);
		textField.setColumns(10);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(30, 144, 255)));
		table.setBounds(10, 127, 744, 402);
		panel.add(table);
	}
}
