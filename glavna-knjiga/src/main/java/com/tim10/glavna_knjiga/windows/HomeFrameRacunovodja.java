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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;

import com.tim10.glavna_knjiga.dbutils.HomeFrameRacunovodjaUtils;
import com.tim10.glavna_knjiga.session.UserData;

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
	private JLabel lblKorisnickoImeValue;
	private JLabel lblPreduzeceValue;
	
	private HomeFrameRacunovodjaUtils utils = HomeFrameRacunovodjaUtils.getInstace();
	private UserData userData = UserData.getInstace();
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
		setTitle("Glavni meni");
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
		mntmKontniPlan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KontniPlanFrame kontniPlanFrame = new KontniPlanFrame();
				kontniPlanFrame.setVisible(true);
			}
		});
		mntmKontniPlan.setForeground(Color.WHITE);
		mntmKontniPlan.setFont(new Font("Segoe UI", Font.BOLD, 12));
		mntmKontniPlan.setBackground(new Color(30, 144, 255));
		mnKonto.add(mntmKontniPlan);
		
		mntmKontniOkvir = new JMenuItem("Kontni okvir");
		mntmKontniOkvir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KontniOkvirFrameView kontniOkvirFrame = new KontniOkvirFrameView();
				kontniOkvirFrame.setVisible(true);
			}
		});
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
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Podaci", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(30, 144, 255)));
		panel.setBounds(100, 105, 600, 400);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblIme = new JLabel("Ime:");
		lblIme.setBounds(74, 63, 70, 15);
		panel.add(lblIme);
		
		JLabel lblPrezime = new JLabel("Prezime:");
		lblPrezime.setBounds(74, 109, 70, 15);
		panel.add(lblPrezime);
		
		JLabel lblKorisnickoIme = new JLabel("Korisnicko ime:");
		lblKorisnickoIme.setBounds(74, 156, 120, 15);
		panel.add(lblKorisnickoIme);
		
		JLabel lblPreduzece = new JLabel("Preduzece:");
		lblPreduzece.setBounds(74, 200, 100, 15);
		panel.add(lblPreduzece);
		
		JLabel lblImeValue = new JLabel("ime");
		System.out.println();
		lblImeValue.setText(userData.getKorisnik().getIme());
		lblImeValue.setForeground(new Color(255, 140, 0));
		lblImeValue.setBounds(221, 63, 150, 15);
		panel.add(lblImeValue);
		
		JLabel lblPrezimeValue = new JLabel("prezime");
		lblPrezimeValue.setText(userData.getKorisnik().getPrezime());
		lblPrezimeValue.setForeground(new Color(255, 140, 0));
		lblPrezimeValue.setBounds(221, 106, 150, 15);
		panel.add(lblPrezimeValue);
		
		lblKorisnickoImeValue = new JLabel("korisnicko ime");
		lblKorisnickoImeValue.setText(userData.getKorisnik().getKorisnickoIme());
		lblKorisnickoImeValue.setForeground(new Color(255, 140, 0));
		lblKorisnickoImeValue.setBounds(221, 154, 150, 15);
		panel.add(lblKorisnickoImeValue);
		
		lblPreduzeceValue = new JLabel("preduzece");
		lblPreduzeceValue.setText(userData.getPreduzece().getNaziv());
		lblPreduzeceValue.setForeground(new Color(255, 140, 0));
		lblPreduzeceValue.setBounds(221, 196, 150, 15);
		panel.add(lblPreduzeceValue);
	}
}
