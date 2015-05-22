package com.tim10.glavna_knjiga.windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;

import java.awt.Color;
import java.text.NumberFormat;
import java.util.List;

import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JButton;

import com.tim10.glavna_knjiga.dbutils.KontniOkvirFrameViewUtils;

import antlr.Utils;

import javax.swing.ScrollPaneConstants;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFormattedTextField;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;

public class KontniOkvirFrameView extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private ImageIcon save = new ImageIcon("images/save.png");
	private KontniOkvirFrameViewUtils utils = KontniOkvirFrameViewUtils.getInstace();
	private JScrollPane scrollPane;
	private JTable tblKontniOkvir;
	private JTable table;
	private JFormattedTextField formattedTextField;
	private JScrollPane scrollPane_1;
	private JTextField textField;
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
		panel.setBounds(10, 75, 764, 475);
		
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		scrollPane_1 = new JScrollPane();
		panel.add(scrollPane_1);
	
		Object[][] rowData = utils.getAllKontniOkvir();
		
		table = new JTable(rowData, new Object[] { "Sifra konta", "Naziv konta" });
		table.setFont(new Font("Dialog", Font.BOLD, 15));
		table.setForeground(Color.DARK_GRAY);
		table.setShowHorizontalLines(false);
		scrollPane_1.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new TitledBorder(null, "Filteri", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(30, 144, 255)));
		panel_1.setBounds(10, 12, 780, 60);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblSifraKonta = new JLabel("Sifra konta:");
		lblSifraKonta.setBounds(524, 25, 100, 15);
		panel_1.add(lblSifraKonta);
		
		formattedTextField = new JFormattedTextField(NumberFormat.getIntegerInstance());
		formattedTextField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				updateTableData();
			}
		});
		formattedTextField.setBounds(630, 25, 100, 19);
		panel_1.add(formattedTextField);
		
		JLabel lblNazivKonta = new JLabel("Naziv konta:");
		lblNazivKonta.setBounds(200, 25, 100, 15);
		panel_1.add(lblNazivKonta);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				updateTableData();
			}
		});
		textField.setBounds(300, 25, 200, 19);
		panel_1.add(textField);
		textField.setColumns(10);
	}
	
	private void updateTableData() {
		Object[][] rowData = utils.getAllKontniOkvirByParameters(formattedTextField.getText(), textField.getText());
		
		table = new JTable(rowData, new Object[] { "Sifra konta", "Naziv konta" });
		table.setFont(new Font("Dialog", Font.BOLD, 15));
		table.setForeground(Color.DARK_GRAY);
		table.setShowHorizontalLines(false);
		scrollPane_1.setViewportView(table);
	}
}
