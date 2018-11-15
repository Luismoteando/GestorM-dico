package presentacion;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;

@SuppressWarnings("serial")
public class MiPanelMedico extends JPanel {
	private JPanel pnlMedico;
	private JLabel lblApellidos;
	private JTextField txtApellidos;
	private JLabel lblExtension;
	private JTextField txtExtension;
	private JLabel lblNombre;
	private JTextField txtNombre;
	private JLabel lblConsulta;
	private JTextField txtConsulta;
	private JButton btnDetalles;
	private JLabel lblEspecialidad;
	private JTextField txtEspecialidad;
	private JLabel lblHorario;
	private JTextField txtHorario;
	private JButton btnContactar;
	private Font font = new Font("Segoe UI", Font.PLAIN, 13); //$NON-NLS-1$
	private CompoundBorder borde;
	private JLabel lblFoto;

	/**
	 * Create the panel.
	 */
	public MiPanelMedico() {
		
		pnlMedico = new JPanel();
		borde = BorderFactory.createCompoundBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), 
				BorderFactory.createEmptyBorder(10,10,10,10));
		pnlMedico.setBorder(borde);
		add(pnlMedico);
		GridBagLayout gbl_pnlMedico = new GridBagLayout();
		gbl_pnlMedico.columnWidths = new int[]{115, 106, 94, 111, 35, 123, 93, 0};
		gbl_pnlMedico.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_pnlMedico.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlMedico.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlMedico.setLayout(gbl_pnlMedico);
		
		lblApellidos = new JLabel(MessagesMiPanelMedico.getString("MiPanelMedico.1")); //$NON-NLS-1$
		lblApellidos.setFont(font);
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.anchor = GridBagConstraints.EAST;
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos.gridx = 1;
		gbc_lblApellidos.gridy = 0;
		pnlMedico.add(lblApellidos, gbc_lblApellidos);
		
		txtApellidos = new JTextField();
		txtApellidos.setText("Prado Ibáñez"); //$NON-NLS-1$
		txtApellidos.setEditable(false);
		txtApellidos.setFont(font);
		txtApellidos.setColumns(10);
		txtApellidos.setBackground(Color.WHITE);
		GridBagConstraints gbc_txtApellidos = new GridBagConstraints();
		gbc_txtApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellidos.gridwidth = 2;
		gbc_txtApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_txtApellidos.gridx = 2;
		gbc_txtApellidos.gridy = 0;
		pnlMedico.add(txtApellidos, gbc_txtApellidos);
		
		lblExtension = new JLabel(MessagesMiPanelMedico.getString("MiPanelMedico.3")); //$NON-NLS-1$
		lblExtension.setFont(font);
		GridBagConstraints gbc_lblExtension = new GridBagConstraints();
		gbc_lblExtension.anchor = GridBagConstraints.EAST;
		gbc_lblExtension.insets = new Insets(0, 0, 5, 5);
		gbc_lblExtension.gridx = 5;
		gbc_lblExtension.gridy = 0;
		pnlMedico.add(lblExtension, gbc_lblExtension);
		
		txtExtension = new JTextField();
		txtExtension.setText("8524"); //$NON-NLS-1$
		txtExtension.setFont(font);
		txtExtension.setEditable(false);
		txtExtension.setColumns(10);
		txtExtension.setBackground(Color.WHITE);
		GridBagConstraints gbc_txtExtension = new GridBagConstraints();
		gbc_txtExtension.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtExtension.insets = new Insets(0, 0, 5, 5);
		gbc_txtExtension.gridx = 6;
		gbc_txtExtension.gridy = 0;
		pnlMedico.add(txtExtension, gbc_txtExtension);
		
		lblFoto = new JLabel(""); //$NON-NLS-1$
		lblFoto.setIcon(new ImageIcon(MiPanelMedico.class.getResource("/presentacion/Icons/man-3.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_lblFoto = new GridBagConstraints();
		gbc_lblFoto.gridheight = 3;
		gbc_lblFoto.insets = new Insets(0, 0, 5, 5);
		gbc_lblFoto.gridx = 0;
		gbc_lblFoto.gridy = 0;
		pnlMedico.add(lblFoto, gbc_lblFoto);
		
		lblNombre = new JLabel(MessagesMiPanelMedico.getString("MiPanelMedico.7")); //$NON-NLS-1$
		lblNombre.setFont(font);
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 1;
		pnlMedico.add(lblNombre, gbc_lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setText("Estíbaliz"); //$NON-NLS-1$
		txtNombre.setFont(font);
		txtNombre.setEditable(false);
		txtNombre.setColumns(10);
		txtNombre.setBackground(Color.WHITE);
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridwidth = 2;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.gridx = 2;
		gbc_txtNombre.gridy = 1;
		pnlMedico.add(txtNombre, gbc_txtNombre);
		
		lblConsulta = new JLabel(MessagesMiPanelMedico.getString("MiPanelMedico.9")); //$NON-NLS-1$
		lblConsulta.setFont(font);
		GridBagConstraints gbc_lblConsulta = new GridBagConstraints();
		gbc_lblConsulta.anchor = GridBagConstraints.EAST;
		gbc_lblConsulta.insets = new Insets(0, 0, 5, 5);
		gbc_lblConsulta.gridx = 5;
		gbc_lblConsulta.gridy = 1;
		pnlMedico.add(lblConsulta, gbc_lblConsulta);
		
		txtConsulta = new JTextField();
		txtConsulta.setText("24"); //$NON-NLS-1$
		txtConsulta.setFont(font);
		txtConsulta.setEditable(false);
		txtConsulta.setColumns(10);
		txtConsulta.setBackground(Color.WHITE);
		GridBagConstraints gbc_txtConsulta = new GridBagConstraints();
		gbc_txtConsulta.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtConsulta.insets = new Insets(0, 0, 5, 5);
		gbc_txtConsulta.gridx = 6;
		gbc_txtConsulta.gridy = 1;
		pnlMedico.add(txtConsulta, gbc_txtConsulta);
		
		lblEspecialidad = new JLabel(MessagesMiPanelMedico.getString("MiPanelMedico.11")); //$NON-NLS-1$
		lblEspecialidad.setFont(font);
		GridBagConstraints gbc_lblEspecialidad = new GridBagConstraints();
		gbc_lblEspecialidad.anchor = GridBagConstraints.EAST;
		gbc_lblEspecialidad.insets = new Insets(0, 0, 5, 5);
		gbc_lblEspecialidad.gridx = 1;
		gbc_lblEspecialidad.gridy = 2;
		pnlMedico.add(lblEspecialidad, gbc_lblEspecialidad);
		
		txtEspecialidad = new JTextField();
		txtEspecialidad.setText(MessagesMiPanelMedico.getString("MiPanelMedico.12")); //$NON-NLS-1$
		txtEspecialidad.setFont(font);
		txtEspecialidad.setEditable(false);
		txtEspecialidad.setColumns(10);
		txtEspecialidad.setBackground(Color.WHITE);
		GridBagConstraints gbc_txtEspecialidad = new GridBagConstraints();
		gbc_txtEspecialidad.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEspecialidad.gridwidth = 2;
		gbc_txtEspecialidad.insets = new Insets(0, 0, 5, 5);
		gbc_txtEspecialidad.gridx = 2;
		gbc_txtEspecialidad.gridy = 2;
		pnlMedico.add(txtEspecialidad, gbc_txtEspecialidad);
		
		lblHorario = new JLabel(MessagesMiPanelMedico.getString("MiPanelMedico.13")); //$NON-NLS-1$
		lblHorario.setFont(font);
		GridBagConstraints gbc_lblHorario = new GridBagConstraints();
		gbc_lblHorario.anchor = GridBagConstraints.EAST;
		gbc_lblHorario.insets = new Insets(0, 0, 5, 5);
		gbc_lblHorario.gridx = 5;
		gbc_lblHorario.gridy = 2;
		pnlMedico.add(lblHorario, gbc_lblHorario);
		
		txtHorario = new JTextField();
		txtHorario.setText("12:00 - 20:00"); //$NON-NLS-1$
		txtHorario.setFont(font);
		txtHorario.setEditable(false);
		txtHorario.setColumns(10);
		txtHorario.setBackground(Color.WHITE);
		GridBagConstraints gbc_txtHorario = new GridBagConstraints();
		gbc_txtHorario.insets = new Insets(0, 0, 5, 5);
		gbc_txtHorario.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtHorario.gridx = 6;
		gbc_txtHorario.gridy = 2;
		pnlMedico.add(txtHorario, gbc_txtHorario);
		
		btnContactar = new JButton(MessagesMiPanelMedico.getString("MiPanelMedico.15")); //$NON-NLS-1$
		btnContactar.addActionListener(new BtnContactarActionListener());
		btnContactar.setIcon(new ImageIcon(MiPanelMedico.class.getResource("/presentacion/Icons/email_16.png"))); //$NON-NLS-1$
		btnContactar.setFont(font);
		GridBagConstraints gbc_btnContactar = new GridBagConstraints();
		gbc_btnContactar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnContactar.anchor = GridBagConstraints.SOUTH;
		gbc_btnContactar.insets = new Insets(0, 0, 0, 5);
		gbc_btnContactar.gridx = 5;
		gbc_btnContactar.gridy = 3;
		pnlMedico.add(btnContactar, gbc_btnContactar);
		
		btnDetalles = new JButton(MessagesMiPanelMedico.getString("MiPanelMedico.17")); //$NON-NLS-1$
		btnDetalles.addActionListener(new BtnDetallesActionListener());
		btnDetalles.setIcon(new ImageIcon(MiPanelMedico.class.getResource("/presentacion/Icons/details_16.png"))); //$NON-NLS-1$
		btnDetalles.setFont(font);
		GridBagConstraints gbc_btnDetalles = new GridBagConstraints();
		gbc_btnDetalles.insets = new Insets(0, 0, 0, 5);
		gbc_btnDetalles.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnDetalles.gridx = 6;
		gbc_btnDetalles.gridy = 3;
		pnlMedico.add(btnDetalles, gbc_btnDetalles);

	}

	private class BtnDetallesActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			Application.layeredPaneMedicos.setLayer(Application.pnlVerDetalles, 2);
		}
	}
	
	private class BtnContactarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			Application.layeredPaneMedicos.setLayer(Application.pnlContactar, 2);
		}
	}
	
}
