package Tim10.glavna_knjiga;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Rectangle;

import javax.imageio.ImageIO;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.DialogTypeSelection;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.SystemColor;

import javax.swing.border.TitledBorder;

import java.awt.FlowLayout;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.print.PrinterJob;
import java.io.IOException;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.Icon;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.MatteBorder;

import frames.frKontniPlan;
import frames.frLogin;


public class PocetniFrame {

	private JFrame frame;
	private JPanel pnLogIn;
	private JLabel lbKorisnickoIme;
	private JLabel lbLozinka;
	private JTextField txtKorisnickoIme;
	private JPasswordField txtLozinka;
	private JPanel pnRacunPocetna;
	private JMenuBar menuBar;
	private JMenu mnKonta;
	private JMenuItem mntmKontniOkvir;
	private JMenuItem mntmKontniPlan;
	private JMenu mnNalozi;
	private JMenuItem mntmNoviNalog;
	private JMenuItem mntmNoviNalogS;
	private JMenuItem mntmPregledNaloga;
	private JMenu mnIzvjetaji;
	private JMenuItem mntmKreirajIzvjetaj;
	private JMenu menu;
	private JMenu menu_1;
	private JLabel lblNewLabel;
	private JLabel lbKorisnikTrenutni;
	private JLabel lblPreduzee_1;
	private JLabel lbPreduzece;
	private JMenu menu_2;
	private JMenu mnOdjava;
	private JComboBox cbPreduzeca;
	private JPanel pnKontniOkvir;
	private JTable table;
	private JButton btClose;
	private JButton btSave;
	private Boolean snimioOkvir = false;
	private JTable tbKontniPlan;
	private JButton btClosePlan;
	private JButton btnOtvoriKontniOkvir;
	private JTextField txtPretraga;
	private JPanel pnNoviNalog;
	private JLabel lblNoviNalog;
	private JLabel lbVrjemeKnjizenja;
	private JLabel lblStatusNaloga;
	private JTextField textField;
	private JTextField txtStatusNaloga;
	private JPanel panel_1;
	private JTable tbNoviNalog;
	private JButton btCloseNoviNalog;
	private JPanel panel_2;
	private JButton btDodajStavku;
	private JButton btObrisiStavku;
	private JButton btProknjizi;
	private JPanel panel_3;
	private JLabel lbDuguje;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lbPotrazuje;
	private JLabel lbSaldo;
	private JPanel pnKontniPlan;
	private JPanel pnDodajStavku;
	private JLabel lblDodajStavku;
	private JLabel lblNaziv;
	private JLabel lblDatumKreiranja;
	private JLabel lblKonto;
	private JLabel lblVrstaDokumenta;
	private JLabel lblDuguje;
	private JLabel lblPotrauje;
	private JPanel panel_4;
	private JTextField txtNazivStavke;
	private JTextField txtDatumStavke;
	private JTextField txtStavkaDuguje;
	private JTextField txtStavkaPotrazuje;
	private JButton btCloseNovaStavka;
	private JButton btSaveNovaStavka;
	private ImageIcon closeNN = new ImageIcon("images/close.png");
	private ImageIcon saveNN = new ImageIcon("images/save.png");
	private Boolean snimiStavku = false;
	private JPanel pnPregledNaloga;
	private JLabel lblPregledNaloga;
	private JTable table_1;
	private JPanel panel_5;
	private JLabel lblNaziv_1;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JLabel lblKonto_1;
	private JLabel lblVrstaDokumenta_1;
	private JLabel lblOd;
	private JLabel lblDo;
	private JPanel panel_6;
	private JLabel lblStatus;
	private JComboBox comboBox;
	private JButton btClosePregledNaloga;
	private JPanel pnKreirajIzvjestaj;
	private JLabel lblKreirajIzvjetaj;
	private JLabel lblTipIzvjetaja;
	private JComboBox comboBox_1;
	private JButton btPrint;
	private JButton btExport;
	private JButton btCloseIzvjestaj;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PocetniFrame window = new PocetniFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PocetniFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent arg0) 
			{
				Rectangle r = frame.getBounds();
				
				pnLogIn.setBounds(0, 0, r.width, r.height);
				pnRacunPocetna.setBounds(0,0,r.width, r.height);
			}
		});
		frame.setBounds(100, 100, 833, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		pnRacunPocetna = new JPanel();
		pnRacunPocetna.setBounds(0, 0, 817, 562);
		frame.getContentPane().add(pnRacunPocetna);
		pnRacunPocetna.setBackground(SystemColor.menu);
		pnRacunPocetna.setLayout(null);
		pnRacunPocetna.setVisible(false);
		
		 pnKontniPlan = new JPanel();
		 pnKontniPlan.setBackground(SystemColor.text);
		 pnKontniPlan.setBounds(0, 21, 817, 515);
		 pnRacunPocetna.add(pnKontniPlan);
		 //pnKontniPlan.add(btClose);
		 pnKontniPlan.setVisible(false);
		 pnKontniPlan.setLayout(null);
		 
		 JScrollPane scrollPane_1 = new JScrollPane();
		 scrollPane_1.setBounds(35, 65, 744, 400);
		 scrollPane_1.setViewportBorder(new TitledBorder(null, "Kontni plan", TitledBorder.LEFT, TitledBorder.ABOVE_TOP, null, null));
		 pnKontniPlan.add(scrollPane_1);
		 
		 tbKontniPlan = new JTable();
		 scrollPane_1.setViewportView(tbKontniPlan);
		 btClosePlan = new JButton(closeNN);
		 btClosePlan.setBounds(751, 13, 28, 28);
		 btClosePlan.addActionListener(new ActionListener() 
		 {
		 	public void actionPerformed(ActionEvent e)				//---BUTTON CLOSE PLAN PANEL--- 
		 	{
		 		pnKontniPlan.setVisible(false);
		 		pnRacunPocetna.setVisible(true);
		 	}
		 });															//---BUTTON CLOSE PLAN PANEL---
		 btClosePlan.setToolTipText("Spasi promjene");
		 btClosePlan.setBackground(Color.WHITE);
		 pnKontniPlan.add(btClosePlan);
		 btClosePlan.setToolTipText("Zatvori Kontni plan");
		 
		 btnOtvoriKontniOkvir = new JButton("Otvori kontni okvir");
		 btnOtvoriKontniOkvir.setBackground(SystemColor.control);
		 btnOtvoriKontniOkvir.setBounds(35, 13, 141, 28);
		 btnOtvoriKontniOkvir.addActionListener(new ActionListener()			//---BUTTON OTVORI KONTNI OKVIR--- 
		 {
		 	public void actionPerformed(ActionEvent e) 
		 	{
		 		pnKontniPlan.setVisible(false);
		 		pnKontniOkvir.setVisible(true);
		 	}
		 });
		 pnKontniPlan.add(btnOtvoriKontniOkvir);
		 
		 JLabel lblFilterPretraga = new JLabel("Filter pretraga : ");
		 lblFilterPretraga.setBounds(242, 17, 100, 20);
		 pnKontniPlan.add(lblFilterPretraga);
		 
		 txtPretraga = new JTextField();
		 txtPretraga.setBounds(352, 13, 149, 28);
		 pnKontniPlan.add(txtPretraga);
		 txtPretraga.setColumns(10);
		 
		 pnKreirajIzvjestaj = new JPanel();
		 pnKreirajIzvjestaj.setBackground(SystemColor.text);
		 pnKreirajIzvjestaj.setBounds(0, 21, 817, 515);
		 pnRacunPocetna.add(pnKreirajIzvjestaj);
		 pnKreirajIzvjestaj.setLayout(null);
		 
		 lblKreirajIzvjetaj = new JLabel("Kreiraj izvje\u0161taj");
		 lblKreirajIzvjetaj.setFont(new Font("Tahoma", Font.PLAIN, 15));
		 lblKreirajIzvjetaj.setBounds(30, 26, 118, 20);
		 pnKreirajIzvjestaj.add(lblKreirajIzvjetaj);
		 
		 lblTipIzvjetaja = new JLabel("Tip izvje\u0161taja :");
		 lblTipIzvjetaja.setFont(new Font("Tahoma", Font.PLAIN, 13));
		 lblTipIzvjetaja.setBounds(30, 96, 97, 14);
		 pnKreirajIzvjestaj.add(lblTipIzvjetaja);
		 
		 comboBox_1 = new JComboBox();
		 comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"", "Izvje\u0161taj stanja", "Izvje\u0161taj uspjeha"}));
		 comboBox_1.setBackground(SystemColor.control);
		 comboBox_1.setBounds(163, 94, 97, 20);
		 pnKreirajIzvjestaj.add(comboBox_1);
		 
		 btPrint = new JButton("Printaj");
		 btPrint.setBackground(SystemColor.control);
		 btPrint.addActionListener(new ActionListener() 
		 {
		 	public void actionPerformed(ActionEvent e) 
		 	{
		 		final PrintRequestAttributeSet attributes = new HashPrintRequestAttributeSet();
		         attributes.add(DialogTypeSelection.COMMON);
		         PrinterJob printJob = PrinterJob.getPrinterJob();
		         printJob.printDialog(attributes);
		 	}
		 });
		 btPrint.setBounds(30, 134, 230, 25);
		 pnKreirajIzvjestaj.add(btPrint);
		 
		 btExport = new JButton("Eksportuj u PDF");
		 btExport.setBackground(SystemColor.control);
		 btExport.setBounds(30, 184, 230, 25);
		 pnKreirajIzvjestaj.add(btExport);
		 
		 btCloseIzvjestaj = new JButton(closeNN);
		 btCloseIzvjestaj.addActionListener(new ActionListener()				//---BUTTON CLOSE IZVJESTAJ--- 
		 {
		 	public void actionPerformed(ActionEvent e) 
		 	{
		 		pnKreirajIzvjestaj.setVisible(false);
		 		pnRacunPocetna.setVisible(true);
		 	}
		 });																	//---BUTTON CLOSE IZVJESTAJ---
		 btCloseIzvjestaj.setToolTipText("Zatvori Dodaj stavku");
		 btCloseIzvjestaj.setBackground(Color.WHITE);
		 btCloseIzvjestaj.setBounds(735, 26, 28, 28);
		 pnKreirajIzvjestaj.add(btCloseIzvjestaj);
		 
		 pnDodajStavku = new JPanel();
		 pnDodajStavku.setBackground(SystemColor.text);
		 pnDodajStavku.setBounds(0, 21, 817, 515);
		 pnRacunPocetna.add(pnDodajStavku);
		 pnDodajStavku.setLayout(null);
		 pnDodajStavku.setVisible(false);
		 
		 lblDodajStavku = new JLabel("Dodaj stavku");
		 lblDodajStavku.setFont(new Font("Tahoma", Font.PLAIN, 14));
		 lblDodajStavku.setBounds(24, 27, 93, 26);
		 pnDodajStavku.add(lblDodajStavku);
		 
		 panel_4 = new JPanel();
		 panel_4.setBorder(new TitledBorder(null, "Podaci o stavki", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		 panel_4.setBackground(SystemColor.text);
		 panel_4.setBounds(24, 80, 529, 333);
		 pnDodajStavku.add(panel_4);
		 panel_4.setLayout(null);
		 
		 lblNaziv = new JLabel("Naziv :");
		 lblNaziv.setBounds(10, 32, 45, 14);
		 panel_4.add(lblNaziv);
		 lblNaziv.setFont(new Font("Tahoma", Font.PLAIN, 13));
		 
		 lblDatumKreiranja = new JLabel("Datum kreiranja :");
		 lblDatumKreiranja.setBounds(10, 83, 109, 14);
		 panel_4.add(lblDatumKreiranja);
		 lblDatumKreiranja.setFont(new Font("Tahoma", Font.PLAIN, 13));
		 
		 lblKonto = new JLabel("Konto :");
		 lblKonto.setBounds(10, 129, 46, 14);
		 panel_4.add(lblKonto);
		 lblKonto.setFont(new Font("Tahoma", Font.PLAIN, 13));
		 
		 lblVrstaDokumenta = new JLabel("Vrsta dokumenta :");
		 lblVrstaDokumenta.setBounds(9, 189, 109, 14);
		 panel_4.add(lblVrstaDokumenta);
		 lblVrstaDokumenta.setFont(new Font("Tahoma", Font.PLAIN, 13));
		 
		 lblDuguje = new JLabel("Duguje :");
		 lblDuguje.setBounds(10, 263, 68, 14);
		 panel_4.add(lblDuguje);
		 lblDuguje.setFont(new Font("Tahoma", Font.PLAIN, 13));
		 
		 lblPotrauje = new JLabel("Potra\u017Euje :");
		 lblPotrauje.setBounds(236, 263, 89, 14);
		 panel_4.add(lblPotrauje);
		 lblPotrauje.setFont(new Font("Tahoma", Font.PLAIN, 13));
		 
		 txtNazivStavke = new JTextField();
		 txtNazivStavke.setBounds(277, 30, 170, 20);
		 panel_4.add(txtNazivStavke);
		 txtNazivStavke.setColumns(10);
		 
		 txtDatumStavke = new JTextField();
		 txtDatumStavke.setEditable(false);
		 txtDatumStavke.setColumns(10);
		 txtDatumStavke.setBounds(277, 81, 170, 20);
		 panel_4.add(txtDatumStavke);
		 
		 JComboBox cbKonto = new JComboBox();
		 cbKonto.setBackground(SystemColor.text);
		 cbKonto.setBounds(277, 127, 170, 20);
		 panel_4.add(cbKonto);
		 
		 JComboBox cbVrstaDokumenta = new JComboBox();
		 cbVrstaDokumenta.setBackground(SystemColor.text);
		 cbVrstaDokumenta.setBounds(277, 187, 170, 20);
		 panel_4.add(cbVrstaDokumenta);
		 
		 txtStavkaDuguje = new JTextField();
		 txtStavkaDuguje.setBounds(90, 261, 100, 20);
		 panel_4.add(txtStavkaDuguje);
		 txtStavkaDuguje.setColumns(10);
		 
		 txtStavkaPotrazuje = new JTextField();
		 txtStavkaPotrazuje.setColumns(10);
		 txtStavkaPotrazuje.setBounds(347, 261, 100, 20);
		 panel_4.add(txtStavkaPotrazuje);
		 
		 btCloseNovaStavka = new JButton(closeNN);
		 btCloseNovaStavka.addActionListener(new ActionListener() 	//---BUTTON CLOSE NOVA STAVKA---
		 {
		 	public void actionPerformed(ActionEvent e) 
		 	{
		 		if(snimiStavku == false)
		 		{
		 			int response = JOptionPane.showConfirmDialog(null, "Da li ste sigurni da zelite izaci prije spasavanja?", "Confrim", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		 			if(response == JOptionPane.NO_OPTION)
		 			{
		 				//pusti ga da spasi
		 			}
		 			else if (response == JOptionPane.YES_OPTION)
		 			{
		 				pnDodajStavku.setVisible(false);
		 				pnNoviNalog.setVisible(true);
		 				pnKontniPlan.setVisible(false);
		 				pnKontniOkvir.setVisible(false);
		 				//pnRacunPocetna.setVisible(true);
		 			}
		 		}
		 		else 
		 		{
		 			pnDodajStavku.setVisible(false);
		 			pnNoviNalog.setVisible(true);
		 			pnKontniPlan.setVisible(false);
		 			pnKontniOkvir.setVisible(false);
		 			//pnRacunPocetna.setVisible(true);
		 		}
		 		
		 	}
		 });															//---BUTTON CLOSE NOVA STAVKA---
		 btCloseNovaStavka.setToolTipText("Zatvori Dodaj stavku");
		 btCloseNovaStavka.setBackground(Color.WHITE);
		 btCloseNovaStavka.setBounds(735, 80, 28, 28);
		 pnDodajStavku.add(btCloseNovaStavka);
		 
		 btSaveNovaStavka = new JButton(saveNN);					//---BUTTON SAVE NOVA STAVKA---
		 btSaveNovaStavka.addActionListener(new ActionListener()
		 {
		 	public void actionPerformed(ActionEvent e) 
		 	{
		 		snimiStavku = true;
		 	}
		 });															//---BUTTON SAVE NOVA STAVKA---
		 btSaveNovaStavka.setToolTipText("Spasi promjene");
		 btSaveNovaStavka.setBackground(Color.WHITE);
		 btSaveNovaStavka.setBounds(678, 80, 28, 28);
		 pnDodajStavku.add(btSaveNovaStavka);
		 
		 pnPregledNaloga = new JPanel();
		 pnPregledNaloga.setBackground(SystemColor.text);
		 pnPregledNaloga.setBounds(0, 21, 817, 515);
		 pnRacunPocetna.add(pnPregledNaloga);
		 pnPregledNaloga.setLayout(null);
		 pnPregledNaloga.setVisible(false);
		 
		 lblPregledNaloga = new JLabel("Pregled naloga");
		 lblPregledNaloga.setBounds(24, 24, 123, 29);
		 lblPregledNaloga.setFont(new Font("Tahoma", Font.PLAIN, 14));
		 pnPregledNaloga.add(lblPregledNaloga);
		 
		 table_1 = new JTable();
		 table_1.setBounds(24, 174, 768, 297);
		 table_1.setBackground(SystemColor.control);
		 pnPregledNaloga.add(table_1);
		 
		 panel_5 = new JPanel();
		 panel_5.setBounds(24, 64, 768, 110);
		 panel_5.setBackground(SystemColor.text);
		 panel_5.setBorder(new TitledBorder(null, "Filteri za pretragu", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		 pnPregledNaloga.add(panel_5);
		 panel_5.setLayout(null);
		 
		 lblNaziv_1 = new JLabel("Naziv");
		 lblNaziv_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		 lblNaziv_1.setBounds(36, 34, 46, 14);
		 panel_5.add(lblNaziv_1);
		 
		 textField_4 = new JTextField();
		 textField_4.setBounds(10, 59, 86, 20);
		 panel_5.add(textField_4);
		 textField_4.setColumns(10);
		 
		 textField_5 = new JTextField();
		 textField_5.setColumns(10);
		 textField_5.setBounds(141, 59, 86, 20);
		 panel_5.add(textField_5);
		 
		 textField_6 = new JTextField();
		 textField_6.setColumns(10);
		 textField_6.setBounds(270, 59, 86, 20);
		 panel_5.add(textField_6);
		 
		 lblKonto_1 = new JLabel("Konto");
		 lblKonto_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		 lblKonto_1.setBounds(160, 35, 46, 14);
		 panel_5.add(lblKonto_1);
		 
		 lblVrstaDokumenta_1 = new JLabel("Vrsta dokumenta");
		 lblVrstaDokumenta_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		 lblVrstaDokumenta_1.setBounds(265, 34, 110, 14);
		 panel_5.add(lblVrstaDokumenta_1);
		 
		 panel_6 = new JPanel();
		 panel_6.setBorder(new TitledBorder(null, "Datum", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		 panel_6.setBackground(SystemColor.text);
		 panel_6.setBounds(372, 34, 269, 65);
		 panel_5.add(panel_6);
		 panel_6.setLayout(null);
		 
		 lblOd = new JLabel("Od :");
		 lblOd.setBounds(10, 26, 30, 14);
		 panel_6.add(lblOd);
		 lblOd.setFont(new Font("Tahoma", Font.PLAIN, 13));
		 
		 textField_7 = new JTextField();
		 textField_7.setBounds(39, 24, 86, 20);
		 panel_6.add(textField_7);
		 textField_7.setColumns(10);
		 
		 lblDo = new JLabel("Do :");
		 lblDo.setBounds(145, 26, 30, 14);
		 panel_6.add(lblDo);
		 lblDo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		 
		 textField_8 = new JTextField();
		 textField_8.setBounds(173, 24, 86, 20);
		 panel_6.add(textField_8);
		 textField_8.setColumns(10);
		 
		 lblStatus = new JLabel("Status");
		 lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 13));
		 lblStatus.setBounds(692, 35, 46, 14);
		 panel_5.add(lblStatus);
		 
		 comboBox = new JComboBox();
		 comboBox.setBackground(SystemColor.text);
		 comboBox.setBounds(671, 59, 87, 20);
		 panel_5.add(comboBox);
		 
		 btClosePregledNaloga = new JButton(closeNN);
		 btClosePregledNaloga.setBounds(764, 25, 28, 28);
		 btClosePregledNaloga.addActionListener(new ActionListener()			//BUTTON CLOSE PREGLED NALOGA
		 {	
		 	public void actionPerformed(ActionEvent e) 
		 	{
		 		pnPregledNaloga.setVisible(false);
		 		pnRacunPocetna.setVisible(true);
		 	}
		 });																	//BUTTON CLOSE PREGLED NALOGA
		 btClosePregledNaloga.setToolTipText("Spasi promjene");
		 btClosePregledNaloga.setBackground(Color.WHITE);
		 pnPregledNaloga.add(btClosePregledNaloga);
		 
		 pnNoviNalog = new JPanel();
		 pnNoviNalog.setBounds(0, 21, 817, 515);
		 pnRacunPocetna.add(pnNoviNalog);
		 pnNoviNalog.setBackground(SystemColor.text);
		 pnNoviNalog.setLayout(null);
		 
		 lblNoviNalog = new JLabel("Novi nalog");
		 lblNoviNalog.setFont(new Font("Tahoma", Font.PLAIN, 14));
		 lblNoviNalog.setBounds(20, 11, 94, 24);
		 pnNoviNalog.add(lblNoviNalog);
		 
		 panel_1 = new JPanel();
		 panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Podaci o nalogu", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		 panel_1.setBackground(SystemColor.text);
		 panel_1.setBounds(20, 46, 281, 142);
		 pnNoviNalog.add(panel_1);
		 panel_1.setLayout(null);
		 
		 textField = new JTextField();
		 textField.setBounds(146, 32, 116, 20);
		 panel_1.add(textField);
		 textField.setEditable(false);
		 textField.setColumns(10);
		 
		 lbVrjemeKnjizenja = new JLabel("Vrijeme knji\u017Eenja :");
		 lbVrjemeKnjizenja.setBounds(10, 30, 94, 24);
		 panel_1.add(lbVrjemeKnjizenja);
		 
		 lblStatusNaloga = new JLabel("Status naloga : ");
		 lblStatusNaloga.setBounds(10, 88, 94, 14);
		 panel_1.add(lblStatusNaloga);
		 
		 txtStatusNaloga = new JTextField();
		 txtStatusNaloga.setBounds(146, 85, 116, 20);
		 panel_1.add(txtStatusNaloga);
		 txtStatusNaloga.setEditable(false);
		 txtStatusNaloga.setColumns(10);
		 
		 tbNoviNalog = new JTable();
		 tbNoviNalog.setBackground(SystemColor.menu);
		 tbNoviNalog.setModel(new DefaultTableModel(
		 	new Object[][] {
		 		{null, null, "", null, null, null},
		 	},
		 	new String[] {
		 		"Naziv", "Konto", "Vrsta dokumenta", "Datum kreiranja", "Duguje", "Potrazuje"
		 	}
		 ));
		 tbNoviNalog.getColumnModel().getColumn(2).setPreferredWidth(97);
		 tbNoviNalog.getColumnModel().getColumn(3).setPreferredWidth(101);
		 tbNoviNalog.setBounds(10, 199, 768, 228);
		 pnNoviNalog.add(tbNoviNalog);
		 btCloseNoviNalog = new JButton(closeNN);
		 btCloseNoviNalog.addActionListener(new ActionListener() 			//---BUTTON CLOSE NOVI NALOG---
		 {
		 	public void actionPerformed(ActionEvent e)
		 	{
		 		pnNoviNalog.setVisible(false);
		 		pnKontniOkvir.setVisible(false);
		 		pnKontniPlan.setVisible(false);
		 		pnRacunPocetna.setVisible(true);
		 		
		 	}
		 });																	//---BUTTON CLOSE NOVI NALOG---
		 btCloseNoviNalog.setToolTipText("Spasi promjene");
		 btCloseNoviNalog.setBackground(Color.WHITE);
		 btCloseNoviNalog.setBounds(750, 160, 28, 28);
		 pnNoviNalog.add(btCloseNoviNalog);
		 
		 panel_2 = new JPanel();
		 panel_2.setBorder(new TitledBorder(null, "Akcije za nalog", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		 panel_2.setBackground(SystemColor.text);
		 panel_2.setBounds(361, 46, 218, 142);
		 pnNoviNalog.add(panel_2);
		 panel_2.setLayout(null);
		 
		 btDodajStavku = new JButton("Dodaj stavku");
		 btDodajStavku.addActionListener(new ActionListener()			//---BUTTON DODAJ STAVKU--- 
		 {
		 	public void actionPerformed(ActionEvent e)
		 	{
		 		pnDodajStavku.setVisible(true);
		 		pnNoviNalog.setVisible(false);
		 	}
		 });																//---BUTTON DODAJ STAVKU---
		 btDodajStavku.setBackground(SystemColor.control);
		 btDodajStavku.setBounds(43, 21, 135, 23);
		 panel_2.add(btDodajStavku);
		 
		 btObrisiStavku = new JButton("Obri\u0161i stavku");
		 btObrisiStavku.setBackground(SystemColor.control);
		 btObrisiStavku.setBounds(43, 60, 135, 23);
		 panel_2.add(btObrisiStavku);
		 
		 btProknjizi = new JButton("Proknji\u017Ei");
		 btProknjizi.setBackground(SystemColor.control);
		 btProknjizi.setBounds(43, 98, 135, 23);
		 panel_2.add(btProknjizi);
		 
		 panel_3 = new JPanel();
		 panel_3.setBackground(SystemColor.control);
		 panel_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) SystemColor.activeCaption));
		 panel_3.setBounds(10, 428, 768, 52);
		 pnNoviNalog.add(panel_3);
		 panel_3.setLayout(null);
		 
		 lbDuguje = new JLabel("Duguje :");
		 lbDuguje.setFont(new Font("Tahoma", Font.PLAIN, 13));
		 lbDuguje.setBounds(198, 11, 81, 30);
		 panel_3.add(lbDuguje);
		 
		 textField_1 = new JTextField();
		 textField_1.setEditable(false);
		 textField_1.setBounds(672, 17, 86, 20);
		 panel_3.add(textField_1);
		 textField_1.setColumns(10);
		 
		 textField_2 = new JTextField();
		 textField_2.setEditable(false);
		 textField_2.setColumns(10);
		 textField_2.setBounds(483, 17, 86, 20);
		 panel_3.add(textField_2);
		 
		 textField_3 = new JTextField();
		 textField_3.setEditable(false);
		 textField_3.setColumns(10);
		 textField_3.setBounds(289, 17, 86, 20);
		 panel_3.add(textField_3);
		 
		 lbPotrazuje = new JLabel("Potra\u017Euje :");
		 lbPotrazuje.setFont(new Font("Tahoma", Font.PLAIN, 13));
		 lbPotrazuje.setBounds(392, 11, 81, 30);
		 panel_3.add(lbPotrazuje);
		 
		 lbSaldo = new JLabel("Saldo :");
		 lbSaldo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		 lbSaldo.setBounds(581, 11, 81, 30);
		 panel_3.add(lbSaldo);
		 pnNoviNalog.setVisible(false);
		 
		 menuBar = new JMenuBar();
		 menuBar.setBounds(0, 0, 817, 23);
		 pnRacunPocetna.add(menuBar);
		 
		 mnKonta = new JMenu("Konta");
		 mnKonta.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		 menuBar.add(mnKonta);
		 
		 mntmKontniOkvir = new JMenuItem("Kontni okvir");
		 mntmKontniOkvir.addActionListener(new ActionListener()			//--- MENU KONTNI OKVIR ODABRAN---
		 {
		 	public void actionPerformed(ActionEvent e) 
		 	{
		 		pnKontniOkvir.setVisible(true);
		 		pnKontniPlan.setVisible(false);
		 		pnNoviNalog.setVisible(false);	
		 		pnKreirajIzvjestaj.setVisible(false);
		 		pnDodajStavku.setVisible(false);
		 		pnPregledNaloga.setVisible(false);
		 	}
		 });																//--- MENU KONTNI OKVIR ODABRAN---
		 
		 	mnKonta.add(mntmKontniOkvir);
		 	
		 	mntmKontniPlan = new JMenuItem("Kontni plan");
		 	mntmKontniPlan.addActionListener(new ActionListener() 			//--- MENU KONTNI PLAN ODABRAN---
		 	{
		 		public void actionPerformed(ActionEvent e) 
		 		{
		 			pnKontniPlan.setVisible(true);
		 			pnKontniOkvir.setVisible(false);
		 			pnNoviNalog.setVisible(false);
		 			pnKreirajIzvjestaj.setVisible(false);
		 			pnDodajStavku.setVisible(false);
			 		pnPregledNaloga.setVisible(false);
		 		}
		 	});																//--- MENU KONTNI PLAN ODABRAN---
		 	mnKonta.add(mntmKontniPlan);
		 	
		 	menu = new JMenu("          ");
		 	menu.setEnabled(false);
		 	menuBar.add(menu);
		 	
		 	mnNalozi = new JMenu("Nalozi");
		 	mnNalozi.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		 	menuBar.add(mnNalozi);
		 	
		 	mntmNoviNalog = new JMenuItem("Novi nalog");
		 	mntmNoviNalog.addActionListener(new ActionListener() 
		 	{
		 		public void actionPerformed(ActionEvent e)				//---MENU NOVI NALOG ODABRAN--- 
		 		{
		 			pnNoviNalog.setVisible(true);
		 			pnKontniOkvir.setVisible(false);
		 			pnKontniPlan.setVisible(false);
		 			pnDodajStavku.setVisible(false);
		 			pnPregledNaloga.setVisible(false);
		 			pnKreirajIzvjestaj.setVisible(false);
		 			
		 			
		 		}
		 		
		 	});															//---MENU NOVI NALOG ODABRAN---
		 	mnNalozi.add(mntmNoviNalog);
		 	
		 	mntmNoviNalogS = new JMenuItem("Novi nalog s predlo\u0161kom");
		 	mnNalozi.add(mntmNoviNalogS);
		 	
		 	mntmPregledNaloga = new JMenuItem("Pregled naloga");
		 	mntmPregledNaloga.addActionListener(new ActionListener()			//---MENU PREGLED NALOGA--- 
		 	{
		 		public void actionPerformed(ActionEvent e) 
		 		{
		 			pnPregledNaloga.setVisible(true);
		 			//pnRacunPocetna.setVisible(false);
		 			pnNoviNalog.setVisible(false);
		 			pnKontniPlan.setVisible(false);
		 			pnKontniOkvir.setVisible(false);
		 			pnDodajStavku.setVisible(false);
		 			pnKreirajIzvjestaj.setVisible(false);
		 			
		 		}
		 	});																	//---MENU PREGLED NALOGA---
		 	mnNalozi.add(mntmPregledNaloga);
		 	
		 	menu_1 = new JMenu("          ");
		 	menu_1.setEnabled(false);
		 	menuBar.add(menu_1);
		 	
		 	mnIzvjetaji = new JMenu("Izvje\u0161taji");
		 	mnIzvjetaji.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		 	menuBar.add(mnIzvjetaji);
		 	
		 	mntmKreirajIzvjetaj = new JMenuItem("Kreiraj izvje\u0161taj"); 		//---MENU IZVJESTAJ---
		 	mntmKreirajIzvjetaj.addActionListener(new ActionListener() 
		 	{
		 		public void actionPerformed(ActionEvent e) 
		 		{
		 			pnPregledNaloga.setVisible(false);
		 			//pnRacunPocetna.setVisible(false);
		 			pnNoviNalog.setVisible(false);
		 			pnKontniPlan.setVisible(false);
		 			pnKontniOkvir.setVisible(false);
		 			pnDodajStavku.setVisible(false);
		 			pnKreirajIzvjestaj.setVisible(true);
		 		}	
		 	});																	//---MENU IZVJESTAJ---
		 	mnIzvjetaji.add(mntmKreirajIzvjetaj);
		 	
		 	menu_2 = new JMenu("          ");
		 	menuBar.add(menu_2);
		 	
		 	mnOdjava = new JMenu("Odjava");															//---ODJAVA---
		 	mnOdjava.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		 	menuBar.add(mnOdjava);
		 	
		 	JMenuItem mntmOdjavaIzSistema = new JMenuItem("Odjava iz sistema");
		 	mntmOdjavaIzSistema.addActionListener(new ActionListener()
		 	{
		 		public void actionPerformed(ActionEvent e) 
		 		{
		 			pnRacunPocetna.setVisible(false);
		 			pnLogIn.setVisible(true);
		 		}
		 	});
		 	mnOdjava.add(mntmOdjavaIzSistema);
		 	
		 	lblNewLabel = new JLabel("Korisnik : ");
		 	lblNewLabel.setBackground(SystemColor.text);
		 	lblNewLabel.setBounds(10, 539, 64, 23);
		 	pnRacunPocetna.add(lblNewLabel);
		 	
		 	lbKorisnikTrenutni = new JLabel("");
		 	lbKorisnikTrenutni.setBackground(SystemColor.text);
		 	lbKorisnikTrenutni.setBounds(74, 539, 171, 23);
		 	pnRacunPocetna.add(lbKorisnikTrenutni);
		 	
		 	lblPreduzee_1 = new JLabel("Preduze\u0107e : ");
		 	lblPreduzee_1.setBounds(245, 539, 76, 23);
		 	pnRacunPocetna.add(lblPreduzee_1);
		 	
		 	lbPreduzece = new JLabel("");
		 	lbPreduzece.setBounds(332, 539, 485, 23);
		 	pnRacunPocetna.add(lbPreduzece);
		 	
		 	pnKontniOkvir = new JPanel();
		 	pnKontniOkvir.setBackground(SystemColor.text);
		 	pnKontniOkvir.setBounds(0, 21, 817, 515);
		 	pnRacunPocetna.add(pnKontniOkvir);
		 	pnKontniOkvir.setLayout(null);
		 	
		 	JScrollPane scrollPane = new JScrollPane();
		 	scrollPane.setViewportBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Kontni okvir", TitledBorder.LEFT, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		 	scrollPane.setBounds(35, 60, 744, 400);
		 	pnKontniOkvir.add(scrollPane);
		 	
		 	table = new JTable();
		 	scrollPane.setViewportView(table);
		 	btClose = new JButton(closeNN);
		 	btClose.setToolTipText("Izalazak iz Kontni okvir");
		 	btClose.addActionListener(new ActionListener() 				//--- BUTTON CLOSE PANEL --- 
		 	{
		 		public void actionPerformed(ActionEvent arg0) 
		 		{
		 			if(snimioOkvir == false)
		 			{
		 				int response = JOptionPane.showConfirmDialog(null, "Da li ste sigurni da zelite izaci prije spasavanja?", "Confrim", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		 				if(response == JOptionPane.NO_OPTION)
		 				{
		 					//pusti ga da spasi
		 				}
		 				else if (response == JOptionPane.YES_OPTION)
		 				{
		 					pnKontniOkvir.setVisible(false);
		 					pnRacunPocetna.setVisible(true);
		 				}
		 			}
		 			else 
		 			{
		 				pnKontniOkvir.setVisible(false);
		 				pnRacunPocetna.setVisible(true);
		 			}
		 			
		 		}
		 	});														//--- BUTTON CLOSE PANEL ---
		 	btClose.setBackground(SystemColor.text);
		 	btClose.setBounds(751, 13, 28, 28);
		 	
		 	pnKontniOkvir.add(btClose);
		 	btSave = new JButton(saveNN);
		 	btSave.addActionListener(new ActionListener() 
		 	{
		 		public void actionPerformed(ActionEvent e) 
		 		{
		 			snimioOkvir = true;//pritisnuo button
		 			
		 		}
		 	});
		 	btSave.setToolTipText("Spasi promjene");
		 	btSave.setBackground(SystemColor.text);
		 	btSave.setBounds(707, 13, 28, 28);
		 	pnKontniOkvir.add(btSave);					//---BUTTON SAVE PANEL---
		 	pnKontniOkvir.setVisible(false);
		
		pnLogIn = new JPanel();
		pnLogIn.setBounds(0, 0, 817, 600);
		frame.getContentPane().add(pnLogIn);
		pnLogIn.setBackground(SystemColor.menu);
		pnLogIn.setVisible(true);
		pnLogIn.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(210, 147, 347, 283);
		panel.setBorder(BorderFactory.createTitledBorder(null, "Prijava", TitledBorder.CENTER, TitledBorder.TOP, new Font("arial",Font.PLAIN,20)));
		pnLogIn.add(panel);
		panel.setLayout(null);
		
		lbKorisnickoIme = new JLabel("Korisni\u010Dko ime :");
		lbKorisnickoIme.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbKorisnickoIme.setBounds(35, 81, 94, 25);
		panel.add(lbKorisnickoIme);
		
		lbLozinka = new JLabel("Lozinka : ");
		lbLozinka.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lbLozinka.setBounds(35, 127, 75, 25);
		panel.add(lbLozinka);
		
		txtKorisnickoIme = new JTextField();
		txtKorisnickoIme.setBounds(150, 84, 150, 20);
		panel.add(txtKorisnickoIme);
		txtKorisnickoIme.setColumns(10);
		
		JButton btPrijava = new JButton("Prijava");
		btPrijava.setBackground(SystemColor.control);
		btPrijava.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)	 //---BUTTON PRIJAVA---
			{
				//provjera korisnika, baza hu-ha
				cbPreduzeca.setEnabled(true);
				//pnLogIn.setVisible(false);
				//pnRacunPocetna.setVisible(true);
				lbKorisnikTrenutni.setText(txtKorisnickoIme.getText());
				lbPreduzece.setText((String)cbPreduzeca.getSelectedItem());
			}
		});
		btPrijava.setBounds(206, 180, 94, 30);
		panel.add(btPrijava);
		
		txtLozinka = new JPasswordField();
		txtLozinka.setBounds(150, 130, 150, 20);
		panel.add(txtLozinka);
		
		cbPreduzeca = new JComboBox();
		cbPreduzeca.setBackground(SystemColor.control);
		cbPreduzeca.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) 
			{
				pnLogIn.setVisible(false);
				pnRacunPocetna.setVisible(true);
			}
		});
		cbPreduzeca.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				//pnLogIn.setVisible(false);
				//pnRacunPocetna.setVisible(true);
			}
			
		});
		
			cbPreduzeca.setEnabled(false);
			cbPreduzeca.setModel(new DefaultComboBoxModel(new String[] {"Test1", "Test2", "Test3", "Test4", "Test5"}));
			cbPreduzeca.setBounds(150, 233, 150, 20);
			panel.add(cbPreduzeca);
			
			JLabel lblPreduzee = new JLabel("Preduze\u0107e : ");
			lblPreduzee.setBounds(35, 231, 75, 25);
			panel.add(lblPreduzee);
	    closeNN = new ImageIcon("close.png");
		
		ImageIcon closePlan = new ImageIcon("close.png");
		
		//btClose = new JButton("New button");
		
		ImageIcon close = new ImageIcon("close.png");
		
		ImageIcon save = new ImageIcon("save.png");			//---BUTTON SAVE PANEL---
	}
}