package frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;

public class frLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frLogin frame = new frLogin();
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
	public frLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(BorderFactory.createTitledBorder(null, "Prijava", TitledBorder.CENTER, TitledBorder.TOP, new Font("arial",Font.PLAIN,20)));
		contentPane.add(panel, BorderLayout.CENTER);
		
		JLabel label = new JLabel("Korisničko ime :");
		label.setFont(new Font("Dialog", Font.PLAIN, 12));
		label.setBounds(35, 81, 94, 25);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Lozinka : ");
		label_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		label_1.setBounds(35, 127, 75, 25);
		panel.add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(150, 84, 150, 20);
		panel.add(textField);
		
		JButton button = new JButton("Prijava");
		button.setBackground(SystemColor.window);
		button.setBounds(206, 180, 94, 30);
		panel.add(button);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(150, 130, 150, 20);
		panel.add(passwordField);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEnabled(false);
		comboBox.setBackground(SystemColor.window);
		comboBox.setBounds(150, 233, 150, 20);
		panel.add(comboBox);
		
		JLabel label_2 = new JLabel("Preduzeće : ");
		label_2.setBounds(35, 231, 75, 25);
		panel.add(label_2);
	}

}
