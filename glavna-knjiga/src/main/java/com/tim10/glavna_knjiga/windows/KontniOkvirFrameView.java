package com.tim10.glavna_knjiga.windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;

import java.awt.Color;

import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.JButton;

public class KontniOkvirFrameView extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JTable tblKontniOkvir;
	private ImageIcon save = new ImageIcon("images/save.png");
	private JButton btnSaveKontniOkvir;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KontniOkvirFrameView frame = new KontniOkvirFrameView();
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
	public KontniOkvirFrameView() {
		setTitle("Kontni okvir");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(30, 144, 255), 2, true), "Kontni okvir", TitledBorder.LEFT, TitledBorder.TOP, new Font("arial", Font.BOLD,17), new Color(30, 144, 255)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 11, 764, 540);
		
		contentPane.add(panel);
		panel.setLayout(null);
		
		tblKontniOkvir = new JTable();
		tblKontniOkvir.setBorder(new LineBorder(new Color(30, 144, 255), 1, true));
		tblKontniOkvir.setBounds(10, 46, 744, 374);
		panel.add(tblKontniOkvir);
		
		btnSaveKontniOkvir = new JButton(save);
		btnSaveKontniOkvir.setBackground(new Color(30, 144, 255));
		btnSaveKontniOkvir.setBounds(688, 465, 40, 40);
		panel.add(btnSaveKontniOkvir);
		btnSaveKontniOkvir.setToolTipText("Spasi promjene");
	}
}
