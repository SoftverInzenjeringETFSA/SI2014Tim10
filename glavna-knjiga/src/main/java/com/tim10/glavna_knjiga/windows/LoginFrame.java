
package com.tim10.glavna_knjiga.windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;

import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import com.tim10.glavna_knjiga.dbutils.LoginPanelUtils;
import com.tim10.glavna_knjiga.session.UserData;

import java.awt.Canvas;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class LoginFrame extends JFrame {
	private JTextField textKorisnickoIme;
	private JPasswordField textLozinka;
	private JLabel lblPreduzece;
	private JComboBox cmbPreduzece;
	private JLabel lblNetacniLoginPodaci;
	private JComboBox cmbTipKorisnika;

	private LoginPanelUtils utils1 = LoginPanelUtils.getInstace();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
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
	public LoginFrame() {
		getContentPane().addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					checkLoginAndGo();
				}
			}
		});
		setTitle("Glavna knjiga");
		setResizable(false);
		getContentPane().setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		getContentPane().setLayout(null);

		JPanel pnLogin = new JPanel();
		pnLogin.setBackground(Color.WHITE);
		pnLogin.setBorder(new TitledBorder(null, "Prijava",
				TitledBorder.CENTER, TitledBorder.TOP, null, new Color(30, 144,
						255)));
		pnLogin.setBounds(22, 22, 744, 400);
		getContentPane().add(pnLogin);
		pnLogin.setLayout(null);

		JLabel lblTipKorisnika = new JLabel("Tip korisnika:");
		lblTipKorisnika.setBounds(129, 185, 100, 15);
		pnLogin.add(lblTipKorisnika);

		cmbTipKorisnika = new JComboBox();
		cmbTipKorisnika.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
				if ("Racunovodja".equals(((JComboBox) (e.getSource())).getSelectedItem().toString())) {
					lblPreduzece.setVisible(true);
					cmbPreduzece.setVisible(true);
				} else {
					lblPreduzece.setVisible(false);
					cmbPreduzece.setVisible(false);
				}
			}
		});
		cmbTipKorisnika.addPropertyChangeListener(new PropertyChangeListener() {
                    public void propertyChange(PropertyChangeEvent evt) {

			}
		});
		cmbTipKorisnika.setModel(new DefaultComboBoxModel(utils1
				.getAllKorisnikTipoviNazivi().toArray()));
		cmbTipKorisnika.setFont(new Font("Dialog", Font.BOLD, 12));
		cmbTipKorisnika.setBackground(Color.WHITE);
		cmbTipKorisnika.setForeground(Color.LIGHT_GRAY);
		cmbTipKorisnika.setBounds(253, 180, 300, 24);
		pnLogin.add(cmbTipKorisnika);

		JLabel lblKorisnikoIme = new JLabel("Korisničko ime:");
		lblKorisnikoIme.setBounds(117, 73, 120, 15);
		pnLogin.add(lblKorisnikoIme);

		textKorisnickoIme = new JTextField();
		textKorisnickoIme.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					checkLoginAndGo();
				}
			}
		});
		textKorisnickoIme.setBounds(253, 68, 300, 25);
		pnLogin.add(textKorisnickoIme);
		textKorisnickoIme.setColumns(10);

		JLabel lblLozinka = new JLabel("Lozinka:");
		lblLozinka.setBounds(163, 128, 90, 15);
		pnLogin.add(lblLozinka);

		this.textLozinka = new JPasswordField();
		textLozinka.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					checkLoginAndGo();
				}
			}
		});
		textLozinka.setBounds(253, 123, 300, 25);
		pnLogin.add(textLozinka);

		lblPreduzece = new JLabel("Preduzeće:");
		lblPreduzece.setBounds(142, 243, 100, 15);
		lblPreduzece.setVisible(false);
		pnLogin.add(lblPreduzece);

		cmbPreduzece = new JComboBox();
		cmbPreduzece.setModel(new DefaultComboBoxModel(utils1.getAllPreduzeca()
				.toArray()));
		cmbPreduzece.setForeground(Color.LIGHT_GRAY);
		cmbPreduzece.setFont(new Font("Dialog", Font.BOLD, 12));
		cmbPreduzece.setBackground(Color.WHITE);
		cmbPreduzece.setBounds(253, 238, 300, 24);
		cmbPreduzece.setVisible(false);
		pnLogin.add(cmbPreduzece);

		JButton btnUlogujSe = new JButton("Uloguj se!");
		btnUlogujSe.addActionListener(new ActionListener() {
                    //@Override
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnUlogujSe.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				checkLoginAndGo();
			}
		});
		btnUlogujSe.setForeground(Color.WHITE);
		btnUlogujSe.setBackground(new Color(30, 144, 255));
		btnUlogujSe.setBounds(433, 324, 117, 25);
		pnLogin.add(btnUlogujSe);

		lblNetacniLoginPodaci = new JLabel("Netacni login podaci");
		lblNetacniLoginPodaci.setForeground(new Color(255, 0, 0));
		lblNetacniLoginPodaci.setBounds(395, 297, 155, 15);
		lblNetacniLoginPodaci.setVisible(false);
		pnLogin.add(lblNetacniLoginPodaci);

		JPanel pnlLogo = new JPanel();
		pnlLogo.setBorder(new TitledBorder(null, "", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		pnlLogo.setBackground(Color.WHITE);
		pnlLogo.setBounds(22, 434, 744, 100);
		getContentPane().add(pnlLogo);
		pnlLogo.setLayout(null);

		JLabel lblFamehof = new JLabel("FAMEHOF");
		lblFamehof.setBounds(224, -12, 600, 124);
		lblFamehof.setFont(new Font("Purisa", Font.BOLD, 75));
		lblFamehof.setForeground(new Color(30, 144, 255));
		pnlLogo.add(lblFamehof);
		
		ImageIcon logoIcon = new ImageIcon("images/famehof-logo-thumb.png");
		JButton btnNewButton = new JButton(logoIcon);
		btnNewButton.setEnabled(false);
		btnNewButton.setBounds(12, 12, 150, 75);
		pnlLogo.add(btnNewButton);
	}

	private void checkLoginAndGo() {
		String korisnickoIme = textKorisnickoIme.getText();
		String lozinka = textLozinka.getText();
		String tipKorisnika = cmbTipKorisnika.getSelectedItem().toString();
		LoginPanelUtils utils = LoginPanelUtils.getInstace();
		Boolean isLoginValid = utils.isValidUsernamePasswordCombination(
				korisnickoIme, lozinka, tipKorisnika);

		if (isLoginValid) {
			UserData userData = UserData.getInstace();
			userData.setKorisnik(utils.getKorisnikByUsername(korisnickoIme));
			if ("Racunovodja".equals(cmbTipKorisnika.getSelectedItem().toString())) {
				String preduzece = cmbPreduzece.getSelectedItem().toString();
				userData.setPreduzece(utils.getPreduzeceByName(preduzece));
			} else {
				userData.setPreduzece(null);
			}
			
			if("Racunovodja".equals(tipKorisnika)) {
                                
				System.out.println("entered...");
				HomeFrameRacunovodja homeFrame = new HomeFrameRacunovodja();
				homeFrame.setVisible(true);
			} else if("Administrator".equals(tipKorisnika)) {
				HomeFrameAdmin adminHomeFrame = new HomeFrameAdmin();
                                adminHomeFrame.setVisible(true);
			}
			
			dispose();
		} else {
			lblNetacniLoginPodaci.setVisible(true);
		}
	}
}