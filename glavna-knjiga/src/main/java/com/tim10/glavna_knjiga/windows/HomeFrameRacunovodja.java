package com.tim10.glavna_knjiga.windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.Font;

public class HomeFrameRacunovodja extends JFrame {

	/*---DEKLARACIJA*/
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenu mnKonto;
	private JMenuItem mntmKontniPlan;
	private JMenuItem mntmKontniOkvir;
	private JMenu menu_1;
	private JMenu mnNalog;
	private JMenuItem mnNoviNalog;
	private JMenuItem mnPregledNaloga;
	private JMenu mnIzvjestaj;
	private JMenuItem mnGenerisiIzvjestaj;
	private JMenu mnOdjava;
	private JMenuItem mntmOdjavaIzSistema;
	/*---DEKLARACIJA*/
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeFrameRacunovodja frame = new HomeFrameRacunovodja();
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
	public HomeFrameRacunovodja() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		menuBar = new JMenuBar();
		menuBar.setBackground(new Color(30, 144, 255));
		menuBar.setBounds(0, 0, 784, 37);
		contentPane.add(menuBar);
		
		menu = new JMenu("     ");
		menu.setEnabled(false);
		menuBar.add(menu);
		
		mnKonto = new JMenu("Konto");
		mnKonto.setForeground(Color.WHITE);
		mnKonto.setFont(new Font("Segoe UI", Font.BOLD, 13));
		menuBar.add(mnKonto);
		
		mntmKontniPlan = new JMenuItem("Kontni plan");
		mntmKontniPlan.setForeground(Color.WHITE);
		mntmKontniPlan.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mntmKontniPlan.setBackground(new Color(30, 144, 255));
		mnKonto.add(mntmKontniPlan);
		
		mntmKontniOkvir = new JMenuItem("Kontni okvir");
		mntmKontniOkvir.setForeground(Color.WHITE);
		mntmKontniOkvir.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mntmKontniOkvir.setBackground(new Color(30, 144, 255));
		mnKonto.add(mntmKontniOkvir);
		
		menu_1 = new JMenu("     ");
		menu_1.setEnabled(false);
		menuBar.add(menu_1);
		
		mnNalog = new JMenu("Nalog");
		mnNalog.setForeground(Color.WHITE);
		mnNalog.setBackground(Color.WHITE);
		mnNalog.setFont(new Font("Segoe UI", Font.BOLD, 13));
		menuBar.add(mnNalog);
		
		mnNoviNalog = new JMenuItem("Novi nalog");
		mnNoviNalog.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mnNoviNalog.setForeground(Color.WHITE);
		mnNoviNalog.setBackground(new Color(30, 144, 255));
		mnNalog.add(mnNoviNalog);
		
		mnPregledNaloga = new JMenuItem("Pregled naloga");
		mnPregledNaloga.setForeground(Color.WHITE);
		mnPregledNaloga.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mnPregledNaloga.setBackground(new Color(30, 144, 255));
		mnNalog.add(mnPregledNaloga);
		
		JMenu menu_2 = new JMenu("     ");
		menu_2.setEnabled(false);
		menuBar.add(menu_2);
		
		mnIzvjestaj = new JMenu("Izvještaj");
		mnIzvjestaj.setForeground(Color.WHITE);
		mnIzvjestaj.setBackground(Color.WHITE);
		mnIzvjestaj.setFont(new Font("Segoe UI", Font.BOLD, 13));
		menuBar.add(mnIzvjestaj);
		
		mnGenerisiIzvjestaj = new JMenuItem("Generiši izvještaj");
		mnGenerisiIzvjestaj.setBackground(new Color(30, 144, 255));
		mnGenerisiIzvjestaj.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mnGenerisiIzvjestaj.setForeground(Color.WHITE);
		mnIzvjestaj.add(mnGenerisiIzvjestaj);
		
		JMenu menu_3 = new JMenu("     ");
		menu_3.setEnabled(false);
		menuBar.add(menu_3);
		
		mnOdjava = new JMenu("Odjava");
		mnOdjava.setForeground(Color.WHITE);
		mnOdjava.setBackground(Color.WHITE);
		mnOdjava.setFont(new Font("Segoe UI", Font.BOLD, 13));
		menuBar.add(mnOdjava);
		
		mntmOdjavaIzSistema = new JMenuItem("Odjava iz sistema");
		mntmOdjavaIzSistema.setForeground(Color.WHITE);
		mntmOdjavaIzSistema.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mntmOdjavaIzSistema.setBackground(new Color(30, 144, 255));
		mnOdjava.add(mntmOdjavaIzSistema);
	}
}
