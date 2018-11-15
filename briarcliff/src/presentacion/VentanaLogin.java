package presentacion;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class VentanaLogin {
	
	private JFrame frmLogin;
	private JPanel panel;
	private JLabel lblLogo;
	private JTextField tfUsuario;
	private TextPrompt tpUsuario;
	private JLabel lblAviso;
	private JPasswordField pwdfPassword;
	private TextPrompt tpPassword ;
	private JButton btnEntrar;
	private Font font = new Font("Segoe UI", Font.PLAIN, 13); //$NON-NLS-1$
	private JButton btnEspaol;
	private JButton btnEnglish;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaLogin window = new VentanaLogin();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.getContentPane().setBackground(Color.WHITE);
		frmLogin.setTitle(MessagesLogin.getString("VentanaLogin.frmLogin.title")); //$NON-NLS-1$
		frmLogin.setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaLogin.class.getResource("/presentacion/Icons/bicon.png"))); //$NON-NLS-1$
		frmLogin.setBounds(100, 100, 417, 382);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		
		
		{
			panel = new JPanel();
			panel.setBackground(Color.WHITE);
			panel.setBounds(10, 10, 381, 321);
			frmLogin.getContentPane().add(panel);
			panel.setLayout(null);
			{
				lblLogo = new JLabel(""); //$NON-NLS-1$
				lblLogo.setIcon(new ImageIcon(VentanaLogin.class.getResource("/presentacion/Icons/briarcliff.png"))); //$NON-NLS-1$
				lblLogo.setBounds(84, 0, 213, 138);
				panel.add(lblLogo);
			}
			{
				tfUsuario = new JTextField();
				tfUsuario.addActionListener(new EntrarActionListener());
				tfUsuario.setBounds(119, 149, 142, 25);
				panel.add(tfUsuario);
				tfUsuario.setColumns(10);
			}			
			{
				tpUsuario = new TextPrompt(MessagesLogin.getString("VentanaLogin.4"), tfUsuario); //$NON-NLS-1$
				tpUsuario.setLocation(114, 3);
				tpUsuario.setFont(font);
				tpUsuario.setForeground(Color.BLACK);
				tpUsuario.changeAlpha(0.5f);
				
			}			
			{
				pwdfPassword = new JPasswordField();
				pwdfPassword.addActionListener(new EntrarActionListener());
				pwdfPassword.setBounds(119, 188, 142, 25);
				panel.add(pwdfPassword);
			}			
			{
				tpPassword = new TextPrompt(MessagesLogin.getString("VentanaLogin.5"), pwdfPassword); //$NON-NLS-1$
				tpPassword.setLocation(114, 3);
				tpPassword.setFont(font);
				tpPassword.setForeground(Color.BLACK);
				tpPassword.changeAlpha(0.5f);
				
			}	
			{
				lblAviso = new JLabel(""); //$NON-NLS-1$
				lblAviso.setHorizontalAlignment(SwingConstants.LEFT);
				lblAviso.setIconTextGap(2);
				lblAviso.setFont(font);
				lblAviso.setBackground(Color.WHITE);
				lblAviso.setOpaque(true);
				lblAviso.setBounds(74, 219, 233, 60);
				panel.add(lblAviso);
			}
			{
				btnEntrar = new JButton(MessagesLogin.getString("VentanaLogin.btnEntrar.text")); //$NON-NLS-1$
				btnEntrar.addActionListener(new EntrarActionListener());
				btnEntrar.setFont(font);
				btnEntrar.setBounds(141, 285, 99, 36);
				panel.add(btnEntrar);
			}
			{
				btnEspaol = new JButton(MessagesLogin.getString("VentanaLogin.rdbtnEspaol.text")); //$NON-NLS-1$
				btnEspaol.setMargin(new Insets(2, 2, 2, 2));
				btnEspaol.addActionListener(new BtnEspaolActionListener());
				btnEspaol.setIcon(new ImageIcon(VentanaLogin.class.getResource("/presentacion/Icons/spanish_16.png"))); //$NON-NLS-1$
				buttonGroup.add(btnEspaol);
				btnEspaol.setBounds(331, 0, 50, 23);
				panel.add(btnEspaol);
			}
			{
				btnEnglish = new JButton(MessagesLogin.getString("VentanaLogin.rdbtnEnglish.text")); //$NON-NLS-1$
				btnEnglish.setMargin(new Insets(2, 2, 2, 2));
				btnEnglish.setIcon(new ImageIcon(VentanaLogin.class.getResource("/presentacion/Icons/english_16.png"))); //$NON-NLS-1$
				btnEnglish.addActionListener(new RdbtnEnglishActionListener());
				buttonGroup.add(btnEnglish);
				btnEnglish.setBounds(331, 25, 50, 23);
				panel.add(btnEnglish);
			}
		}
		
	}

	private class EntrarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if((tfUsuario.getText().equals("Lydia") && String.valueOf(pwdfPassword.getPassword()).equals("Prado")) || (tfUsuario.getText().equals("Luismi") && String.valueOf(pwdfPassword.getPassword()).equals("Ortiz"))) {	 //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
				lblAviso.setVisible(false);
				tfUsuario.setText(""); //$NON-NLS-1$
				pwdfPassword.setText(""); //$NON-NLS-1$
				new Application().setVisible(true);
				frmLogin.setVisible(false);
			} else {
				lblAviso.setBackground(Color.red);
				lblAviso.setForeground(Color.white);
				lblAviso.setText(MessagesLogin.getString("VentanaLogin.lblAviso.text")); //$NON-NLS-1$
				lblAviso.setIcon(new ImageIcon(VentanaLogin.class.getResource("/presentacion/Icons/flag.png"))); //$NON-NLS-1$
				lblAviso.setVisible(true);
				tfUsuario.setText(""); //$NON-NLS-1$
				pwdfPassword.setText(""); //$NON-NLS-1$
			}
		}
	}
	private class RdbtnEnglishActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			frmLogin.setVisible(false);
			MessagesLogin.setIdioma("inglés");
			MessagesApplication.setIdioma("inglés"); //$NON-NLS-1$
			MessagesMiPanelMedico.setIdioma("inglés");
			MessagesAyuda.setIdioma("inglés");
			new VentanaLogin().setVisible(true);
				
		}
	}
	private class BtnEspaolActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			frmLogin.setVisible(false);
			MessagesLogin.setIdioma("español");
			MessagesApplication.setIdioma("español"); //$NON-NLS-1$
			MessagesMiPanelMedico.setIdioma("español");
			MessagesAyuda.setIdioma("español");
			new VentanaLogin().setVisible(true);
		}
	}

	public void setVisible(boolean visible) {
		frmLogin.setVisible(visible);
	}
}