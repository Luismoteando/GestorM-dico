package presentacion;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;












import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.ScrollPaneConstants;
import javax.swing.JLayeredPane;
import javax.swing.JFormattedTextField;

import com.toedter.calendar.JDateChooser;

import javax.swing.JSeparator;

@SuppressWarnings("serial")
public class Application extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabMenu;
	private JSplitPane spAgenda;
	private JSplitPane spHistorias;
	private JSplitPane spPacientes;
	private JPanel panelHistorias;
	private JButton btnCrearHistoria;
	private JButton btnModificarHistoria;
	private JButton btnBorrarHistoria;
	private JPanel panelAgenda;
	private JButton btnCrearCita;
	private JButton btnModificarCita;
	private JButton btnBorrarCita;
	private JPanel pnlPacientes;
	private JButton btnCrearPaciente;
	private JButton btnModificarPaciente;
	private JButton btnBorrarPaciente;
	private JSplitPane sp2Agenda;
	private JScrollPane scrollPanePacientes;
	private JSplitPane sp2Historias;
	private JTable tableHistorias;
	private JPanel pnlDetallesHistoria;
	private JLabel lblSintomas;
	private JTextArea txtSintomas;
	private JLabel lblDiagnostico;
	private JTextArea txtDiagnostico;
	private JLabel lblTratamiento;
	private JTextArea txtTratamiento;
	private JTable tablePacientes;
	private JPanel pnlMenu;
	private JPanel pnlEditar;
	private JPanel pnlConfiguracion;
	private JPanel pnlAyuda;
	private JPanel pnlSesion;
	private JButton btnCortar;
	private JButton btnPegar;
	private JButton btnCopiar;
	private JButton btnConfiguracion;
	private JButton btnAcercaDe;
	private JButton btnAyuda;
	private JButton btnCerrarSesion;
	private JPanel pnlHistorias;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBoxOrdenar;
	private JScrollPane scrollPaneHistorias;
	private JLabel lblOrdenarPor;
	private JButton btnDeshacer;
	private Font font = new Font("Segoe UI", Font.PLAIN, 13); //$NON-NLS-1$
	private JPanel pnlCitas;
	private JTextField txtAsunto;
	private TextPrompt tpAsunto;
	private JLabel lblHoraInicio;
	private JTextField txtHoraDeInicio;
	private JLabel lblHoraFin;
	private JTextField txtHoraDeFin;
	private JButton btnCancelar;
	private JButton btnGuardar;
	private TextPrompt tpHoraInicio;
	private TextPrompt tpHoraFin;
	private JScrollPane scrollPaneDescripcion;
	private JTextArea taDescripcion;
	private TextPrompt tpDescripcion;
	private JButton btnCancelar2;
	private JButton btnGuardar2;
	private JPanel pnlListado;
	private JScrollPane scrollPaneListado;
	private JPanel medico1;
	private CompoundBorder borde;
	private CompoundBorder borde2;
	private CompoundBorder borde3;
	private JScrollPane scrollPaneSintomas;
	private JScrollPane scrollPaneDiagnostico;
	private JScrollPane scrollPaneTratamiento;
	private JLayeredPane layeredPanePacientes;
	private JPanel pnlModificarPaciente;
	private String msintomas = null;
	private String mdiagnostico = null;
	private String mtratamiento = null;
	private boolean editar = false;
	private String nsintomas = null;
	private String ndiagnostico = null;
	private String ntratamiento = null;
	private int contador = -1;
	private JLabel lblPaciente;
	private JLabel lblApellidos;
	private JLabel lblNombre;
	private JLabel lblDomicilio;
	private JLabel lblCiudad;
	private JLabel lblEstado;
	private JLabel lblCodigoPostal;
	private JTextField txtPaciente1;
	private JTextField txtMiPaciente;
	private JTextField txtApellido1;
	private JTextField txtApellido2;
	private JTextField txtNombre;
	private JScrollPane scrollPaneDomicilio;
	private JTextArea taDomicilio;
	private JTextField txtCiudad;
	private JTextField txtEstado;
	private JTextField txtCodigoPostal;
	private JLabel lblTelfDomicilio;
	private JLabel lblTelfTrabajo;
	private JLabel lblEmail;
	private JLabel lblGenero;
	private JLabel lblLugarNacimiento;
	private JLabel lblSeguridadSocial;
	private JLabel lblFechaNacimiento;
	private JLabel lblEdad;
	private JLabel lblMedico;
	private JFormattedTextField ftxtTelfDomicilio;
	private JFormattedTextField ftxtTelfTrabajo;
	private JTextField txtEmail;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBoxGenero;
	private JTextField txtSeguridadSocial;
	private JTextField txtLugarNacimiento;
	private JDateChooser dateChooser;
	private JTextField txtEdad;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBoxMedicos;
	private JLabel lblFoto;
	private JButton btnCambiar;
	private JButton btnEliminar;
	private JButton btnCamara;
	private JButton btnCancelar3;
	private JButton btnGuardar3;
	private JSeparator separator;
	private JLabel lblEstadoCivil;
	private JLabel lblNombresPadres;
	private JLabel lblProcedencia;
	private JLabel lblOcupacion;
	private JLabel lblObservaciones;
	private JScrollPane scrollPaneObservaciones;
	private JTextArea taObservaciones;
	private JTextField txtOcupacion;
	@SuppressWarnings("rawtypes")
	private JComboBox comboBoxEstadoCivil;
	private JTextField txtNombresPadres;
	private JTextField txtProcedencia;
	static JLayeredPane layeredPaneMedicos;
	static JPanel pnlVerDetalles;
	private JLabel lblFoto2;
	private JLabel lblTelfDomicilio2;
	private JFormattedTextField ftxtTelfDomicilio2;
	private JLabel lblApellidos2;
	private JTextField txtApellidos3;
	private JTextField txtApellidos4;
	private JLabel lblTelfTrabajo2;
	private JFormattedTextField ftxtTelfTrabajo2;
	private JLabel lblNombre2;
	private JTextField txtNombre2;
	private JLabel lblEmail2;
	private JTextField txtEmail2;
	private JLabel lblDomicilio2;
	private JScrollPane scrollPaneDomicilio2;
	private JLabel lblGenero2;
	private JTextField txtGenero2;
	private JLabel lblSeguridadSocial2;
	private JTextField txtSeguridadSocial2;
	private JLabel lblCiudad2;
	private JTextField txtCiudad2;
	private JLabel lblLugarNacimiento2;
	private JTextField txtLugarNacimiento2;
	private JLabel lblLocalidad2;
	private JTextField txtLocalidad2;
	private JLabel lblFechaNacimiento2;
	private JDateChooser dateChooserNacimiento;
	private JLabel lblCodigoPostal2;
	private JTextField txtCodigoPostal2;
	private JLabel lblEdad2;
	private JTextField txtEdad2;
	private JSeparator separator_1;
	private JLabel lblEspecialidad;
	private JLabel lblHistoria;
	private JTextField txtHistoria;
	private JLabel lblExtension;
	private JTextField txtExtension;
	private JButton btnAtras;
	private CompoundBorder borde4;
	private  JTextField txtEspecialidad;
	private  JTextArea taDomicilio2;
	private JLabel lblHorarioDeHistoria;
	private  JFormattedTextField ftxtHorarioHistoria;
	static JPanel pnlContactar;
	private CompoundBorder borde5;
	private JTextField txtAsunto2;
	private JScrollPane scrollPaneMensaje;
	private JTextArea taMensaje;
	private JButton btnEnviar;
	private TextPrompt tpMensaje;
	private TextPrompt tpAsunto2;
	private JButton btnDescartar;
	private boolean modificar = false;
	private JButton btnVerDetalles;
	private JLabel lblNifnie;
	private JFormattedTextField ftxtNifnie;
	private JScrollPane scrollPaneCitas;
	private JTable tableAgenda;
	private JDateChooser dateChooserAgenda;
	private TextPrompt tpPaciente;
	private boolean cita = false;
	private JButton btnAdjuntar;
	private JPanel pnlDatos;
	private JLabel lblUsuario;
	private JLabel lblUltimoAcceso;
	private JLabel lblFoto3;
	private JLabel lblPath;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application frame = new Application();
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
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Application() {
		setTitle(MessagesApplication.getString("Application.1")); //$NON-NLS-1$
		setVisible(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Application.class.getResource("/presentacion/Icons/bicon.png"))); //$NON-NLS-1$
		setMinimumSize(new Dimension(500, 500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1087, 715);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{685, 0};
		gbl_contentPane.rowHeights = new int[]{70, 230, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		{
			pnlMenu = new JPanel();
			GridBagConstraints gbc_pnlMenu = new GridBagConstraints();
			gbc_pnlMenu.fill = GridBagConstraints.BOTH;
			gbc_pnlMenu.insets = new Insets(0, 0, 5, 0);
			gbc_pnlMenu.gridx = 0;
			gbc_pnlMenu.gridy = 0;
			contentPane.add(pnlMenu, gbc_pnlMenu);
			GridBagLayout gbl_pnlMenu = new GridBagLayout();
			gbl_pnlMenu.columnWidths = new int[]{140, 140, 140, 140, 208, 0};
			gbl_pnlMenu.rowHeights = new int[]{70, 0};
			gbl_pnlMenu.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_pnlMenu.rowWeights = new double[]{1.0, Double.MIN_VALUE};
			pnlMenu.setLayout(gbl_pnlMenu);
			{
				pnlEditar = new JPanel();
				pnlEditar.setBorder(new TitledBorder(null, MessagesApplication.getString("Application.3"), TitledBorder.LEADING, TitledBorder.TOP, font, Color.DARK_GRAY)); //$NON-NLS-1$
				GridBagConstraints gbc_pnlEditar = new GridBagConstraints();
				gbc_pnlEditar.fill = GridBagConstraints.BOTH;
				gbc_pnlEditar.insets = new Insets(0, 0, 0, 5);
				gbc_pnlEditar.gridx = 0;
				gbc_pnlEditar.gridy = 0;
				pnlMenu.add(pnlEditar, gbc_pnlEditar);
				GridBagLayout gbl_pnlEditar = new GridBagLayout();
				gbl_pnlEditar.columnWidths = new int[]{63, 63, 0};
				gbl_pnlEditar.rowHeights = new int[]{35, 35, 35, 0};
				gbl_pnlEditar.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
				gbl_pnlEditar.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
				pnlEditar.setLayout(gbl_pnlEditar);
				{
					btnPegar = new JButton(MessagesApplication.getString("Application.4")); //$NON-NLS-1$
					btnPegar.setIcon(new ImageIcon(Application.class.getResource("/presentacion/Icons/paste_32.png"))); //$NON-NLS-1$
					btnPegar.setFont(font);
					GridBagConstraints gbc_btnPegar = new GridBagConstraints();
					gbc_btnPegar.gridheight = 3;
					gbc_btnPegar.fill = GridBagConstraints.BOTH;
					gbc_btnPegar.insets = new Insets(0, 0, 0, 5);
					gbc_btnPegar.gridx = 0;
					gbc_btnPegar.gridy = 0;
					pnlEditar.add(btnPegar, gbc_btnPegar);
				}
				{
					btnCopiar = new JButton(MessagesApplication.getString("Application.6")); //$NON-NLS-1$
					btnCopiar.setIcon(new ImageIcon(Application.class.getResource("/presentacion/Icons/copy_16.png"))); //$NON-NLS-1$
					btnCopiar.setFont(font);
					btnCopiar.setAlignmentX(Component.RIGHT_ALIGNMENT);
					GridBagConstraints gbc_btnCopiar = new GridBagConstraints();
					gbc_btnCopiar.insets = new Insets(0, 0, 5, 0);
					gbc_btnCopiar.fill = GridBagConstraints.BOTH;
					gbc_btnCopiar.gridx = 1;
					gbc_btnCopiar.gridy = 0;
					pnlEditar.add(btnCopiar, gbc_btnCopiar);
				}
				{
					btnCortar = new JButton(MessagesApplication.getString("Application.8")); //$NON-NLS-1$
					btnCortar.setIcon(new ImageIcon(Application.class.getResource("/presentacion/Icons/cut_16.png"))); //$NON-NLS-1$
					btnCortar.setFont(font);
					GridBagConstraints gbc_btnCortar = new GridBagConstraints();
					gbc_btnCortar.fill = GridBagConstraints.BOTH;
					gbc_btnCortar.insets = new Insets(0, 0, 5, 0);
					gbc_btnCortar.gridx = 1;
					gbc_btnCortar.gridy = 1;
					pnlEditar.add(btnCortar, gbc_btnCortar);
				}
				{
					btnDeshacer = new JButton(MessagesApplication.getString("Application.10")); //$NON-NLS-1$
					btnDeshacer.setIcon(new ImageIcon(Application.class.getResource("/presentacion/Icons/undo_16.png"))); //$NON-NLS-1$
					btnDeshacer.setFont(font);
					GridBagConstraints gbc_btnDeshacer = new GridBagConstraints();
					gbc_btnDeshacer.fill = GridBagConstraints.VERTICAL;
					gbc_btnDeshacer.gridx = 1;
					gbc_btnDeshacer.gridy = 2;
					pnlEditar.add(btnDeshacer, gbc_btnDeshacer);
				}
			}
			{
				pnlConfiguracion = new JPanel();
				pnlConfiguracion.setBorder(new TitledBorder(null, MessagesApplication.getString("Application.12"), TitledBorder.LEADING, TitledBorder.TOP, font, Color.DARK_GRAY)); //$NON-NLS-1$
				GridBagConstraints gbc_pnlConfiguracion = new GridBagConstraints();
				gbc_pnlConfiguracion.fill = GridBagConstraints.BOTH;
				gbc_pnlConfiguracion.insets = new Insets(0, 0, 0, 5);
				gbc_pnlConfiguracion.gridx = 1;
				gbc_pnlConfiguracion.gridy = 0;
				pnlMenu.add(pnlConfiguracion, gbc_pnlConfiguracion);
				pnlConfiguracion.setLayout(new GridLayout(0, 1, 0, 0));
				{
					btnConfiguracion = new JButton(MessagesApplication.getString("Application.13")); //$NON-NLS-1$
					btnConfiguracion.setIcon(new ImageIcon(Application.class.getResource("/presentacion/Icons/settings_32.png"))); //$NON-NLS-1$
					btnConfiguracion.setFont(font);					
					pnlConfiguracion.add(btnConfiguracion);
				}
			}
			{
				pnlAyuda = new JPanel();
				pnlAyuda.setBorder(new TitledBorder(null, MessagesApplication.getString("Application.15"), TitledBorder.LEADING, TitledBorder.TOP, font, Color.DARK_GRAY)); //$NON-NLS-1$
				GridBagConstraints gbc_pnlAyuda = new GridBagConstraints();
				gbc_pnlAyuda.fill = GridBagConstraints.BOTH;
				gbc_pnlAyuda.insets = new Insets(0, 0, 0, 5);
				gbc_pnlAyuda.gridx = 2;
				gbc_pnlAyuda.gridy = 0;
				pnlMenu.add(pnlAyuda, gbc_pnlAyuda);
				GridBagLayout gbl_pnlAyuda = new GridBagLayout();
				gbl_pnlAyuda.columnWidths = new int[]{139, 0};
				gbl_pnlAyuda.rowHeights = new int[]{52, 52, 0};
				gbl_pnlAyuda.columnWeights = new double[]{0.0, Double.MIN_VALUE};
				gbl_pnlAyuda.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
				pnlAyuda.setLayout(gbl_pnlAyuda);
				{
					btnAcercaDe = new JButton(MessagesApplication.getString("Application.16")); //$NON-NLS-1$
					btnAcercaDe.addActionListener(new BtnAcercaDeActionListener());
					btnAcercaDe.setHorizontalAlignment(SwingConstants.LEFT);
					btnAcercaDe.setIcon(new ImageIcon(Application.class.getResource("/presentacion/Icons/about_32.png"))); //$NON-NLS-1$
					btnAcercaDe.setFont(font);
					GridBagConstraints gbc_btnAcercaDe = new GridBagConstraints();
					gbc_btnAcercaDe.fill = GridBagConstraints.BOTH;
					gbc_btnAcercaDe.insets = new Insets(0, 0, 5, 0);
					gbc_btnAcercaDe.gridx = 0;
					gbc_btnAcercaDe.gridy = 0;
					pnlAyuda.add(btnAcercaDe, gbc_btnAcercaDe);
				}
				{
					btnAyuda = new JButton(MessagesApplication.getString("Application.18")); //$NON-NLS-1$
					btnAyuda.addActionListener(new BtnAyudaActionListener());
					btnAyuda.setHorizontalAlignment(SwingConstants.LEFT);
					btnAyuda.setIcon(new ImageIcon(Application.class.getResource("/presentacion/Icons/help_32.png"))); //$NON-NLS-1$
					btnAyuda.setFont(font);
					GridBagConstraints gbc_btnAyuda = new GridBagConstraints();
					gbc_btnAyuda.fill = GridBagConstraints.BOTH;
					gbc_btnAyuda.gridx = 0;
					gbc_btnAyuda.gridy = 1;
					pnlAyuda.add(btnAyuda, gbc_btnAyuda);
				}
			}
			{
				pnlSesion = new JPanel();
				pnlSesion.setBorder(new TitledBorder(null, MessagesApplication.getString("Application.20"), TitledBorder.LEADING, TitledBorder.TOP, font, Color.DARK_GRAY)); //$NON-NLS-1$
				GridBagConstraints gbc_pnlSesion = new GridBagConstraints();
				gbc_pnlSesion.insets = new Insets(0, 0, 0, 5);
				gbc_pnlSesion.fill = GridBagConstraints.BOTH;
				gbc_pnlSesion.gridx = 3;
				gbc_pnlSesion.gridy = 0;
				pnlMenu.add(pnlSesion, gbc_pnlSesion);
				pnlSesion.setLayout(new GridLayout(0, 1, 0, 0));
				{
					btnCerrarSesion = new JButton(MessagesApplication.getString("Application.21")); //$NON-NLS-1$
					btnCerrarSesion.addActionListener(new BtnSalirActionListener());
					btnCerrarSesion.setIcon(new ImageIcon(Application.class.getResource("/presentacion/Icons/logout_32.png"))); //$NON-NLS-1$
					btnCerrarSesion.setFont(font);	
					pnlSesion.add(btnCerrarSesion);
				}
			}
			{
				pnlDatos = new JPanel();
				pnlDatos.setBorder(new TitledBorder(null, MessagesApplication.getString("Application.22"), TitledBorder.LEADING, TitledBorder.TOP, font, Color.DARK_GRAY));
				GridBagConstraints gbc_pnlDatos = new GridBagConstraints();
				gbc_pnlDatos.fill = GridBagConstraints.BOTH;
				gbc_pnlDatos.gridx = 4;
				gbc_pnlDatos.gridy = 0;
				pnlMenu.add(pnlDatos, gbc_pnlDatos);
				pnlDatos.setLayout(new GridLayout(0, 1, 0, 0));
				{
					lblFoto3 = new JLabel();
					lblFoto3.setIcon(new ImageIcon(Application.class.getResource("/presentacion/Icons/man-4_43.png")));
					lblFoto3.setFont(font);
					lblFoto3.setHorizontalAlignment(SwingConstants.CENTER);
					pnlDatos.add(lblFoto3);
				}
				{
					lblUsuario = new JLabel(MessagesApplication.getString("Application.lblUsuario.text")); //$NON-NLS-1$
					lblUsuario.setFont(font);
					pnlDatos.add(lblUsuario);
				}
				{
					lblUltimoAcceso = new JLabel(MessagesApplication.getString("Application.lblltimaVez.text")); //$NON-NLS-1$
					lblUltimoAcceso.setFont(font);
					pnlDatos.add(lblUltimoAcceso);
				}
			}
		}
		tabMenu = new JTabbedPane(JTabbedPane.LEFT);
		GridBagConstraints gbc_tabMenu = new GridBagConstraints();
		gbc_tabMenu.fill = GridBagConstraints.BOTH;
		gbc_tabMenu.gridx = 0;
		gbc_tabMenu.gridy = 1;
		contentPane.add(tabMenu, gbc_tabMenu);

		//Variables para poner las imágenes en los tabs
		ImageIcon agendaIcon = new ImageIcon(this.getClass().getResource("/presentacion/Icons/calendar_64.png")); //$NON-NLS-1$
		ImageIcon HistoriasIcon = new ImageIcon(this.getClass().getResource("/presentacion/Icons/history_64.png")); //$NON-NLS-1$
		ImageIcon pacientesIcon = new ImageIcon(this.getClass().getResource("/presentacion/Icons/patients_64.png")); //$NON-NLS-1$
		ImageIcon medicosIcon = new ImageIcon(this.getClass().getResource("/presentacion/Icons/doctors_64.png")); //$NON-NLS-1$

		{

			spAgenda = new JSplitPane();
			spAgenda.setEnabled(false);
			spAgenda.setOrientation(JSplitPane.VERTICAL_SPLIT);
			tabMenu.addTab(MessagesApplication.getString("Application.28"), agendaIcon, spAgenda, null); //$NON-NLS-1$
			tabMenu.setFont(font);
			{
				panelAgenda = new JPanel();
				spAgenda.setLeftComponent(panelAgenda);
				{
					btnCrearCita = new JButton(MessagesApplication.getString("Application.29")); //$NON-NLS-1$
					btnCrearCita.addActionListener(new BtnCrearCitaActionListener());
					btnCrearCita.setIcon(new ImageIcon(Application.class.getResource("/presentacion/Icons/add_16.png"))); //$NON-NLS-1$
					btnCrearCita.setFont(font);
					panelAgenda.add(btnCrearCita);
				}
				{
					btnModificarCita = new JButton(MessagesApplication.getString("Application.31")); //$NON-NLS-1$
					btnModificarCita.setEnabled(false);
					btnModificarCita.addActionListener(new BtnModificarCitaActionListener());
					btnModificarCita.setIcon(new ImageIcon(Application.class.getResource("/presentacion/Icons/edit_16.png"))); //$NON-NLS-1$
					btnModificarCita.setFont(font);
					panelAgenda.add(btnModificarCita);
				}
				{
					btnBorrarCita = new JButton(MessagesApplication.getString("Application.33")); //$NON-NLS-1$
					btnBorrarCita.addActionListener(new BtnBorrarCitaActionListener());
					btnBorrarCita.setEnabled(false);
					btnBorrarCita.setIcon(new ImageIcon(Application.class.getResource("/presentacion/Icons/delete_16.png"))); //$NON-NLS-1$
					btnBorrarCita.setFont(font);
					panelAgenda.add(btnBorrarCita);
				}
			}
			{
				sp2Agenda = new JSplitPane();
				spAgenda.setRightComponent(sp2Agenda);
				{
					pnlCitas = new JPanel();
					borde = BorderFactory.createCompoundBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), MessagesApplication.getString("Application.36"), TitledBorder.LEADING, TitledBorder.TOP, font, Color.DARK_GRAY),  //$NON-NLS-1$ //$NON-NLS-2$
							BorderFactory.createEmptyBorder(5,5,5,5));
					pnlCitas.setBorder(borde);
					sp2Agenda.setLeftComponent(pnlCitas);
					GridBagLayout gbl_pnlCitas = new GridBagLayout();
					gbl_pnlCitas.columnWidths = new int[]{123, 28, 100, 0, 100, 0};
					gbl_pnlCitas.rowHeights = new int[]{0, 0, 28, 107, 0, 0, 0};
					gbl_pnlCitas.columnWeights = new double[]{1.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
					gbl_pnlCitas.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
					pnlCitas.setLayout(gbl_pnlCitas);
					{
						txtAsunto = new JTextField();
						txtAsunto.setEnabled(false);
						GridBagConstraints gbc_txtAsunto = new GridBagConstraints();
						gbc_txtAsunto.gridwidth = 5;
						gbc_txtAsunto.insets = new Insets(0, 0, 5, 0);
						gbc_txtAsunto.fill = GridBagConstraints.HORIZONTAL;
						gbc_txtAsunto.gridx = 0;
						gbc_txtAsunto.gridy = 0;
						pnlCitas.add(txtAsunto, gbc_txtAsunto);
						txtAsunto.setColumns(10);
					}
					{
						tpAsunto = new TextPrompt(MessagesApplication.getString("Application.37"), txtAsunto); //$NON-NLS-1$
						tpAsunto.setLocation(114, 3);
						tpAsunto.setFont(font);
						tpAsunto.setForeground(Color.BLACK);
						tpAsunto.changeAlpha(0.5f);
						{
							dateChooserAgenda = new JDateChooser();
							dateChooserAgenda.setDateFormatString("dd/MM/yyyy"); //$NON-NLS-1$
							dateChooserAgenda.setFont(font);
							dateChooserAgenda.setEnabled(false);
							dateChooserAgenda.getCalendarButton().setIcon(new ImageIcon(Application.class.getResource("/presentacion/Icons/calendar_16.png"))); //$NON-NLS-1$
							GridBagConstraints gbc_dateChooserAgenda = new GridBagConstraints();
							gbc_dateChooserAgenda.insets = new Insets(0, 0, 5, 5);
							gbc_dateChooserAgenda.fill = GridBagConstraints.BOTH;
							gbc_dateChooserAgenda.gridx = 0;
							gbc_dateChooserAgenda.gridy = 1;
							pnlCitas.add(dateChooserAgenda, gbc_dateChooserAgenda);
						}
						
						
						{
							lblHoraInicio = new JLabel(MessagesApplication.getString("Application.40")); //$NON-NLS-1$
							lblHoraInicio.setIcon(null);
							lblHoraInicio.setFont(font);
							GridBagConstraints gbc_lblHoraInicio = new GridBagConstraints();
							gbc_lblHoraInicio.anchor = GridBagConstraints.EAST;
							gbc_lblHoraInicio.insets = new Insets(0, 0, 5, 5);
							gbc_lblHoraInicio.gridx = 1;
							gbc_lblHoraInicio.gridy = 1;
							pnlCitas.add(lblHoraInicio, gbc_lblHoraInicio);
						}
						{
							txtHoraDeInicio = new JTextField();
							txtHoraDeInicio.setEnabled(false);
							GridBagConstraints gbc_txtHoraDeInicio = new GridBagConstraints();
							gbc_txtHoraDeInicio.insets = new Insets(0, 0, 5, 5);
							gbc_txtHoraDeInicio.fill = GridBagConstraints.HORIZONTAL;
							gbc_txtHoraDeInicio.gridx = 2;
							gbc_txtHoraDeInicio.gridy = 1;
							pnlCitas.add(txtHoraDeInicio, gbc_txtHoraDeInicio);
							txtHoraDeInicio.setColumns(10);
						}
						{
							tpHoraInicio = new TextPrompt(MessagesApplication.getString("Application.41"), txtHoraDeInicio); //$NON-NLS-1$
							tpHoraInicio.setLocation(114, 3);
							tpHoraInicio.setFont(font);
							tpHoraInicio.setForeground(Color.BLACK);
							tpHoraInicio.changeAlpha(0.5f);
						}
						{
							lblHoraFin = new JLabel(MessagesApplication.getString("Application.42")); //$NON-NLS-1$
							lblHoraFin.setFont(font);
							GridBagConstraints gbc_lblHoraFin = new GridBagConstraints();
							gbc_lblHoraFin.insets = new Insets(0, 0, 5, 5);
							gbc_lblHoraFin.gridx = 3;
							gbc_lblHoraFin.gridy = 1;
							pnlCitas.add(lblHoraFin, gbc_lblHoraFin);
						}
						{
							txtHoraDeFin = new JTextField();
							txtHoraDeFin.setEnabled(false);
							GridBagConstraints gbc_txtHoraDeFin = new GridBagConstraints();
							gbc_txtHoraDeFin.insets = new Insets(0, 0, 5, 0);
							gbc_txtHoraDeFin.fill = GridBagConstraints.HORIZONTAL;
							gbc_txtHoraDeFin.gridx = 4;
							gbc_txtHoraDeFin.gridy = 1;
							pnlCitas.add(txtHoraDeFin, gbc_txtHoraDeFin);
							txtHoraDeFin.setColumns(10);
						}
						{
							tpHoraFin = new TextPrompt(MessagesApplication.getString("Application.43"), txtHoraDeFin); //$NON-NLS-1$
							tpHoraFin.setLocation(114, 3);
							tpHoraFin.setFont(font);
							tpHoraFin.setForeground(Color.BLACK);
							tpHoraFin.changeAlpha(0.5f);
						}
						{
							txtMiPaciente = new JTextField();
							txtMiPaciente.setEnabled(false);
							GridBagConstraints gbc_txtMiPaciente = new GridBagConstraints();
							gbc_txtMiPaciente.gridwidth = 5;
							gbc_txtMiPaciente.insets = new Insets(0, 0, 5, 5);
							gbc_txtMiPaciente.fill = GridBagConstraints.BOTH;
							gbc_txtMiPaciente.gridx = 0;
							gbc_txtMiPaciente.gridy = 2;
							pnlCitas.add(txtMiPaciente, gbc_txtMiPaciente);
							txtMiPaciente.setColumns(10);
						}
						{
							tpPaciente = new TextPrompt(MessagesApplication.getString("Application.44"), txtMiPaciente); //$NON-NLS-1$
							tpPaciente.setLocation(114, 3);
							tpPaciente.setFont(font);
							tpPaciente.setForeground(Color.BLACK);
							tpPaciente.changeAlpha(0.5f);
						}
						{
							scrollPaneDescripcion = new JScrollPane();
							scrollPaneDescripcion.setEnabled(false);
							scrollPaneDescripcion.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
							scrollPaneDescripcion.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
							GridBagConstraints gbc_scrollPaneDescripcion = new GridBagConstraints();
							gbc_scrollPaneDescripcion.gridwidth = 5;
							gbc_scrollPaneDescripcion.insets = new Insets(0, 0, 5, 0);
							gbc_scrollPaneDescripcion.fill = GridBagConstraints.BOTH;
							gbc_scrollPaneDescripcion.gridx = 0;
							gbc_scrollPaneDescripcion.gridy = 3;
							pnlCitas.add(scrollPaneDescripcion, gbc_scrollPaneDescripcion);
							{
								taDescripcion = new JTextArea();
								taDescripcion.setEnabled(false);
								taDescripcion.setLineWrap(true);
								scrollPaneDescripcion.setViewportView(taDescripcion);
							}
							{
								tpDescripcion = new TextPrompt(MessagesApplication.getString("Application.45"), taDescripcion); //$NON-NLS-1$
								tpDescripcion.setVerticalAlignment(SwingConstants.TOP);
								tpDescripcion.setLocation(114, 3);
								tpDescripcion.setFont(font);
								tpDescripcion.setForeground(Color.BLACK);
								tpDescripcion.changeAlpha(0.5f);
							}
						}
						{
						}
						sp2Agenda.setDividerLocation(420);
						tpAsunto.setLocation(114, 3);
						tpAsunto.setFont(font);
						tpAsunto.setForeground(Color.BLACK);
						tpAsunto.changeAlpha(0.5f);
					}
				}
			}
		}
		{
			spHistorias = new JSplitPane();
			spHistorias.setEnabled(false);
			spHistorias.setOrientation(JSplitPane.VERTICAL_SPLIT);
			tabMenu.addTab(MessagesApplication.getString("Application.46"), HistoriasIcon, spHistorias, null); //$NON-NLS-1$
			{
				panelHistorias = new JPanel();
				spHistorias.setLeftComponent(panelHistorias);
				{
					btnCrearHistoria = new JButton(MessagesApplication.getString("Application.47")); //$NON-NLS-1$
					btnCrearHistoria.addActionListener(new BtnCrearHistoriaActionListener());
					btnCrearHistoria.setIcon(new ImageIcon(Application.class.getResource("/presentacion/Icons/add_16.png"))); //$NON-NLS-1$
					btnCrearHistoria.setFont(font);
					panelHistorias.add(btnCrearHistoria);
				}
				{
					btnModificarHistoria = new JButton(MessagesApplication.getString("Application.49")); //$NON-NLS-1$
					btnModificarHistoria.setEnabled(false);
					btnModificarHistoria.addActionListener(new BtnModificarHistoriaActionListener());
					btnModificarHistoria.setIcon(new ImageIcon(Application.class.getResource("/presentacion/Icons/edit_16.png"))); //$NON-NLS-1$
					btnModificarHistoria.setFont(font);
					panelHistorias.add(btnModificarHistoria);
				}
				{
					btnBorrarHistoria = new JButton(MessagesApplication.getString("Application.51")); //$NON-NLS-1$
					btnBorrarHistoria.setEnabled(false);
					btnBorrarHistoria.addActionListener(new BtnBorrarHistoriaActionListener());
					btnBorrarHistoria.setIcon(new ImageIcon(Application.class.getResource("/presentacion/Icons/delete_16.png"))); //$NON-NLS-1$
					btnBorrarHistoria.setFont(font);
					panelHistorias.add(btnBorrarHistoria);
				}
			}
			{
				sp2Historias = new JSplitPane();
				spHistorias.setRightComponent(sp2Historias);
				{
					pnlDetallesHistoria = new JPanel();
					borde2 = BorderFactory.createCompoundBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), MessagesApplication.getString("Application.54"), TitledBorder.LEADING, TitledBorder.TOP, font, Color.DARK_GRAY),  //$NON-NLS-1$ //$NON-NLS-2$
							BorderFactory.createEmptyBorder(5,5,5,5));
					pnlDetallesHistoria.setBorder(borde2);
					sp2Historias.setRightComponent(pnlDetallesHistoria);
					GridBagLayout gbl_pnlDetallesHistoria = new GridBagLayout();
					gbl_pnlDetallesHistoria.columnWidths = new int[]{72, 117, 109, 0};
					gbl_pnlDetallesHistoria.rowHeights = new int[]{14, 70, 14, 70, 14, 70, 0, 0};
					gbl_pnlDetallesHistoria.columnWeights = new double[]{1.0, 1.0, 0.0, Double.MIN_VALUE};
					gbl_pnlDetallesHistoria.rowWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
					pnlDetallesHistoria.setLayout(gbl_pnlDetallesHistoria);
					lblSintomas = new JLabel(MessagesApplication.getString("Application.55")); //$NON-NLS-1$
					lblSintomas.setFont(font);
					GridBagConstraints gbc_lblSintomas = new GridBagConstraints();
					gbc_lblSintomas.anchor = GridBagConstraints.NORTHWEST;
					gbc_lblSintomas.insets = new Insets(0, 0, 5, 5);
					gbc_lblSintomas.gridx = 0;
					gbc_lblSintomas.gridy = 0;
					pnlDetallesHistoria.add(lblSintomas, gbc_lblSintomas);
					{
						scrollPaneSintomas = new JScrollPane();
						scrollPaneSintomas.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
						scrollPaneSintomas.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
						GridBagConstraints gbc_scrollPaneSintomas = new GridBagConstraints();
						gbc_scrollPaneSintomas.gridwidth = 3;
						gbc_scrollPaneSintomas.insets = new Insets(0, 0, 5, 0);
						gbc_scrollPaneSintomas.fill = GridBagConstraints.BOTH;
						gbc_scrollPaneSintomas.gridx = 0;
						gbc_scrollPaneSintomas.gridy = 1;
						pnlDetallesHistoria.add(scrollPaneSintomas, gbc_scrollPaneSintomas);
						txtSintomas = new JTextArea();
						txtSintomas.setEditable(false);
						txtSintomas.setLineWrap(true);
						scrollPaneSintomas.setViewportView(txtSintomas);
						txtSintomas.setBackground(Color.WHITE);
						txtSintomas.setFont(font);
					}
					lblDiagnostico = new JLabel(MessagesApplication.getString("Application.56")); //$NON-NLS-1$
					lblDiagnostico.setFont(font);
					GridBagConstraints gbc_lblDiagnostico = new GridBagConstraints();
					gbc_lblDiagnostico.anchor = GridBagConstraints.NORTHWEST;
					gbc_lblDiagnostico.insets = new Insets(0, 0, 5, 5);
					gbc_lblDiagnostico.gridx = 0;
					gbc_lblDiagnostico.gridy = 2;
					pnlDetallesHistoria.add(lblDiagnostico, gbc_lblDiagnostico);
					{
						scrollPaneDiagnostico = new JScrollPane();
						scrollPaneDiagnostico.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
						scrollPaneDiagnostico.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
						GridBagConstraints gbc_scrollPaneDiagnostico = new GridBagConstraints();
						gbc_scrollPaneDiagnostico.gridwidth = 3;
						gbc_scrollPaneDiagnostico.insets = new Insets(0, 0, 5, 0);
						gbc_scrollPaneDiagnostico.fill = GridBagConstraints.BOTH;
						gbc_scrollPaneDiagnostico.gridx = 0;
						gbc_scrollPaneDiagnostico.gridy = 3;
						pnlDetallesHistoria.add(scrollPaneDiagnostico, gbc_scrollPaneDiagnostico);
						txtDiagnostico = new JTextArea();
						txtDiagnostico.setEditable(false);
						txtDiagnostico.setLineWrap(true);
						scrollPaneDiagnostico.setViewportView(txtDiagnostico);
						txtDiagnostico.setBackground(Color.WHITE);
						txtDiagnostico.setFont(font);
					}
					lblTratamiento = new JLabel(MessagesApplication.getString("Application.57")); //$NON-NLS-1$
					lblTratamiento.setFont(font);
					GridBagConstraints gbc_lblTratamiento = new GridBagConstraints();
					gbc_lblTratamiento.anchor = GridBagConstraints.NORTHWEST;
					gbc_lblTratamiento.insets = new Insets(0, 0, 5, 5);
					gbc_lblTratamiento.gridx = 0;
					gbc_lblTratamiento.gridy = 4;
					pnlDetallesHistoria.add(lblTratamiento, gbc_lblTratamiento);
					{
						scrollPaneTratamiento = new JScrollPane();
						scrollPaneTratamiento.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
						scrollPaneTratamiento.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
						GridBagConstraints gbc_scrollPaneTratamiento = new GridBagConstraints();
						gbc_scrollPaneTratamiento.gridwidth = 3;
						gbc_scrollPaneTratamiento.insets = new Insets(0, 0, 5, 0);
						gbc_scrollPaneTratamiento.fill = GridBagConstraints.BOTH;
						gbc_scrollPaneTratamiento.gridx = 0;
						gbc_scrollPaneTratamiento.gridy = 5;
						pnlDetallesHistoria.add(scrollPaneTratamiento, gbc_scrollPaneTratamiento);
						txtTratamiento = new JTextArea();
						txtTratamiento.setEditable(false);
						txtTratamiento.setLineWrap(true);
						scrollPaneTratamiento.setViewportView(txtTratamiento);
						txtTratamiento.setBackground(Color.WHITE);
						txtTratamiento.setFont(font);
					}
					{
					}
					btnGuardar2 = new JButton(MessagesApplication.getString("Application.58")); //$NON-NLS-1$
					btnGuardar2.addActionListener(new BtnGuardar2ActionListener());
					btnGuardar2.setEnabled(false);
					btnGuardar2.setIcon(new ImageIcon(Application.class.getResource("/presentacion/Icons/save_24.png"))); //$NON-NLS-1$
					btnGuardar2.setFont(font);
					GridBagConstraints gbc_btnGuardar2 = new GridBagConstraints();
					gbc_btnGuardar2.insets = new Insets(0, 0, 0, 5);
					gbc_btnGuardar2.anchor = GridBagConstraints.EAST;
					gbc_btnGuardar2.gridx = 1;
					gbc_btnGuardar2.gridy = 6;
					pnlDetallesHistoria.add(btnGuardar2, gbc_btnGuardar2);
					{
						btnCancelar2 = new JButton(MessagesApplication.getString("Application.60")); //$NON-NLS-1$
						btnCancelar2.setEnabled(false);
						btnCancelar2.addActionListener(new BtnCancelar2ActionListener());
						btnCancelar2.setIcon(new ImageIcon(Application.class.getResource("/presentacion/Icons/cancel_24.png"))); //$NON-NLS-1$
						btnCancelar2.setFont(font);
						GridBagConstraints gbc_btnCancelar2 = new GridBagConstraints();
						gbc_btnCancelar2.anchor = GridBagConstraints.EAST;
						gbc_btnCancelar2.gridx = 2;
						gbc_btnCancelar2.gridy = 6;
						pnlDetallesHistoria.add(btnCancelar2, gbc_btnCancelar2);
					}
				}
				{
					pnlHistorias = new JPanel();
					sp2Historias.setLeftComponent(pnlHistorias);
					GridBagLayout gbl_pnlHistorias = new GridBagLayout();
					gbl_pnlHistorias.columnWidths = new int[]{79, 95, 0, 0};
					gbl_pnlHistorias.rowHeights = new int[]{30, 0, 0};
					gbl_pnlHistorias.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
					gbl_pnlHistorias.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
					pnlHistorias.setLayout(gbl_pnlHistorias);
					{
						lblOrdenarPor = new JLabel(MessagesApplication.getString("Application.62")); //$NON-NLS-1$
						lblOrdenarPor.setFont(font);
						GridBagConstraints gbc_lblOrdenarPor = new GridBagConstraints();
						gbc_lblOrdenarPor.insets = new Insets(0, 0, 5, 5);
						gbc_lblOrdenarPor.anchor = GridBagConstraints.EAST;
						gbc_lblOrdenarPor.gridx = 0;
						gbc_lblOrdenarPor.gridy = 0;
						pnlHistorias.add(lblOrdenarPor, gbc_lblOrdenarPor);
					}
					String[] ordenar = {MessagesApplication.getString("Application.63"), MessagesApplication.getString("Application.64"), MessagesApplication.getString("Application.65")}; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
					comboBoxOrdenar = new JComboBox(ordenar);
					comboBoxOrdenar.setFont(font);
					GridBagConstraints gbc_comboBoxOrdenar = new GridBagConstraints();
					gbc_comboBoxOrdenar.fill = GridBagConstraints.HORIZONTAL;
					gbc_comboBoxOrdenar.insets = new Insets(0, 0, 5, 5);
					gbc_comboBoxOrdenar.gridx = 1;
					gbc_comboBoxOrdenar.gridy = 0;
					pnlHistorias.add(comboBoxOrdenar, gbc_comboBoxOrdenar);
					{
						scrollPaneHistorias = new JScrollPane();
						GridBagConstraints gbc_scrollPaneHistorias = new GridBagConstraints();
						gbc_scrollPaneHistorias.gridwidth = 3;
						gbc_scrollPaneHistorias.fill = GridBagConstraints.BOTH;
						gbc_scrollPaneHistorias.gridx = 0;
						gbc_scrollPaneHistorias.gridy = 1;
						pnlHistorias.add(scrollPaneHistorias, gbc_scrollPaneHistorias);
						{
							tableHistorias = new JTable();
							tableHistorias.addMouseListener(new TableHistoriasMouseListener());
							scrollPaneHistorias.setViewportView(tableHistorias);
							tableHistorias.setModel(new DefaultTableModel(
									new Object[][] {
										{"22/07/2008", "Rodriguez-Manzaneque, Ruth", "Cabanillas, Jose Miguel"}, //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
										{"19/10/2012", "Sotomayor, Clara", "Cepeda, Jaime"}, //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
										{"16/01/2015", "Prado, Lydia", "Ortiz, Luis Miguel"}, //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
										{"14/02/2000", "Montoro, Andr\u00E9s", "Velasco, Alberto"}, //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
									},
									new String[] {
											MessagesApplication.getString("Application.78"), MessagesApplication.getString("Application.79"), MessagesApplication.getString("Application.80") //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
									}
									));
							tableHistorias.getColumnModel().getColumn(1).setPreferredWidth(150);
							tableHistorias.getColumnModel().getColumn(1).setMinWidth(150);
							tableHistorias.getColumnModel().getColumn(2).setPreferredWidth(115);
							tableHistorias.getColumnModel().getColumn(2).setMinWidth(115);
							tableHistorias.setFont(font);
						}
					}

				}
				sp2Historias.setDividerLocation(450);
			}
		}
		spPacientes = new JSplitPane();
		spPacientes.setEnabled(false);
		spPacientes.setOrientation(JSplitPane.VERTICAL_SPLIT);
		tabMenu.addTab(MessagesApplication.getString("Application.81"), pacientesIcon, spPacientes, null); //$NON-NLS-1$
		{
			pnlPacientes = new JPanel();
			spPacientes.setLeftComponent(pnlPacientes);
			{
				btnCrearPaciente = new JButton(MessagesApplication.getString("Application.82")); //$NON-NLS-1$
				btnCrearPaciente.addActionListener(new BtnCrearPacienteActionListener());
				btnCrearPaciente.setIcon(new ImageIcon(Application.class.getResource("/presentacion/Icons/add_16.png"))); //$NON-NLS-1$
				btnCrearPaciente.setFont(font);
				pnlPacientes.add(btnCrearPaciente);
			}
			{
				btnModificarPaciente = new JButton(MessagesApplication.getString("Application.84")); //$NON-NLS-1$
				btnModificarPaciente.addActionListener(new BtnModificarPacienteActionListener());
				btnModificarPaciente.setEnabled(false);
				btnModificarPaciente.setIcon(new ImageIcon(Application.class.getResource("/presentacion/Icons/edit_16.png"))); //$NON-NLS-1$
				btnModificarPaciente.setFont(font);
				pnlPacientes.add(btnModificarPaciente);
			}
			{
				btnBorrarPaciente = new JButton(MessagesApplication.getString("Application.86")); //$NON-NLS-1$
				btnBorrarPaciente.setEnabled(false);
				btnBorrarPaciente.addActionListener(new BtnBorrarPacienteActionListener());
				btnBorrarPaciente.setIcon(new ImageIcon(Application.class.getResource("/presentacion/Icons/delete_16.png"))); //$NON-NLS-1$
				btnBorrarPaciente.setFont(font);
				pnlPacientes.add(btnBorrarPaciente);
			}			
			{
				btnVerDetalles = new JButton(MessagesApplication.getString("Application.88")); //$NON-NLS-1$
				btnVerDetalles.addActionListener(new BtnVerDetallesActionListener());
				btnVerDetalles.setEnabled(false);
				btnVerDetalles.setFont(font);
				btnVerDetalles.setIcon(new ImageIcon(Application.class.getResource("/presentacion/Icons/details_16.png"))); //$NON-NLS-1$
				pnlPacientes.add(btnVerDetalles);
			}
			layeredPanePacientes = new JLayeredPane();
			spPacientes.setRightComponent(layeredPanePacientes);
			scrollPanePacientes = new JScrollPane();
			layeredPanePacientes.setLayer(scrollPanePacientes, 1);
			layeredPanePacientes.add(scrollPanePacientes);
			scrollPanePacientes.setBounds(0, 0, 859, 466);
			scrollPanePacientes.setFont(new Font("Tw Cen MT", Font.PLAIN, 15)); //$NON-NLS-1$
			{
				tablePacientes = new JTable();
				tablePacientes.addMouseListener(new TablePacientesMouseListener());
				tablePacientes.setModel(new DefaultTableModel(
						new Object[][] {
							{new Integer(1234), "Cabanillas", "Jose Miguel", "Calle Rita", "05963298", "613295780"}, //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
							{new Integer(4567), "Cepeda", "Jaime", "Calle Navaja", "05963691", "613220490"}, //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
							{new Integer(7890), "Ortiz", "Luis Miguel", "Calle La Mata", "05963178", "692548730"}, //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
							{new Integer(6123), "Velasco", "Alberto", "Calle San Antonio", "05901908", "614803472"}, //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
						},
						new String[] {
								MessagesApplication.getString("Application.111"), MessagesApplication.getString("Application.112"), MessagesApplication.getString("Application.113"), MessagesApplication.getString("Application.114"), MessagesApplication.getString("Application.115"), MessagesApplication.getString("Application.116") //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$
						}
						));
				tablePacientes.setFont(font);
				scrollPanePacientes.setViewportView(tablePacientes);
			}
			pnlModificarPaciente = new JPanel();
			layeredPanePacientes.setLayer(pnlModificarPaciente, 0);
			borde3 = BorderFactory.createCompoundBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), MessagesApplication.getString("Application.118"), TitledBorder.LEADING, TitledBorder.TOP, font, Color.DARK_GRAY),  //$NON-NLS-1$ //$NON-NLS-2$
					BorderFactory.createEmptyBorder(10,10,10,10));
			pnlModificarPaciente.setBorder(borde3);
			layeredPanePacientes.add(pnlModificarPaciente);
			pnlModificarPaciente.setBounds(0, 0, 855, 466);
			GridBagLayout gbl_pnlModificarPaciente = new GridBagLayout();
			gbl_pnlModificarPaciente.columnWidths = new int[]{0, 110, 96, 90, 90, 0, 91, 39, 63, 51, 55};
			gbl_pnlModificarPaciente.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0};
			gbl_pnlModificarPaciente.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
			gbl_pnlModificarPaciente.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			pnlModificarPaciente.setLayout(gbl_pnlModificarPaciente);
			{
				lblFoto = new JLabel(""); //$NON-NLS-1$
				lblFoto.setIcon(new ImageIcon(Application.class.getResource("/presentacion/Icons/man-3.png"))); //$NON-NLS-1$
				lblFoto.setFont(font);
				GridBagConstraints gbc_label = new GridBagConstraints();
				gbc_label.gridheight = 4;
				gbc_label.insets = new Insets(0, 0, 5, 5);
				gbc_label.gridx = 1;
				gbc_label.gridy = 0;
				pnlModificarPaciente.add(lblFoto, gbc_label);
			}
			{
				lblPaciente = new JLabel(MessagesApplication.getString("Application.121")); //$NON-NLS-1$
				lblPaciente.setFont(font);
				GridBagConstraints gbc_lblPacienteN = new GridBagConstraints();
				gbc_lblPacienteN.anchor = GridBagConstraints.EAST;
				gbc_lblPacienteN.insets = new Insets(0, 0, 5, 5);
				gbc_lblPacienteN.gridx = 2;
				gbc_lblPacienteN.gridy = 0;
				pnlModificarPaciente.add(lblPaciente, gbc_lblPacienteN);
			}
			{
				txtPaciente1 = new JTextField();
				txtPaciente1.setFont(font);
				GridBagConstraints gbc_txtPaciente = new GridBagConstraints();
				gbc_txtPaciente.insets = new Insets(0, 0, 5, 5);
				gbc_txtPaciente.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtPaciente.gridx = 3;
				gbc_txtPaciente.gridy = 0;
				pnlModificarPaciente.add(txtPaciente1, gbc_txtPaciente);
				txtPaciente1.setColumns(10);
			}
			{
				lblTelfDomicilio = new JLabel(MessagesApplication.getString("Application.122")); //$NON-NLS-1$
				lblTelfDomicilio.setFont(font);
				GridBagConstraints gbc_lblTelfDomicilio = new GridBagConstraints();
				gbc_lblTelfDomicilio.gridwidth = 2;
				gbc_lblTelfDomicilio.anchor = GridBagConstraints.EAST;
				gbc_lblTelfDomicilio.insets = new Insets(0, 0, 5, 5);
				gbc_lblTelfDomicilio.gridx = 6;
				gbc_lblTelfDomicilio.gridy = 0;
				pnlModificarPaciente.add(lblTelfDomicilio, gbc_lblTelfDomicilio);
			}
			{
				ftxtTelfDomicilio = new JFormattedTextField();
				ftxtTelfDomicilio.setFont(font);
				GridBagConstraints gbc_ftxtTelfDomicilio = new GridBagConstraints();
				gbc_ftxtTelfDomicilio.gridwidth = 3;
				gbc_ftxtTelfDomicilio.insets = new Insets(0, 0, 5, 0);
				gbc_ftxtTelfDomicilio.fill = GridBagConstraints.HORIZONTAL;
				gbc_ftxtTelfDomicilio.gridx = 8;
				gbc_ftxtTelfDomicilio.gridy = 0;
				pnlModificarPaciente.add(ftxtTelfDomicilio, gbc_ftxtTelfDomicilio);
			}
			{
				lblNifnie = new JLabel(MessagesApplication.getString("Application.123")); //$NON-NLS-1$
				lblNifnie.setFont(font);
				GridBagConstraints gbc_lblNifnie = new GridBagConstraints();
				gbc_lblNifnie.anchor = GridBagConstraints.EAST;
				gbc_lblNifnie.insets = new Insets(0, 0, 5, 5);
				gbc_lblNifnie.gridx = 2;
				gbc_lblNifnie.gridy = 1;
				pnlModificarPaciente.add(lblNifnie, gbc_lblNifnie);
			}
			{
				ftxtNifnie = new JFormattedTextField();
				ftxtNifnie.setFont(font);
				GridBagConstraints gbc_formattedTextField = new GridBagConstraints();
				gbc_formattedTextField.gridwidth = 2;
				gbc_formattedTextField.insets = new Insets(0, 0, 5, 5);
				gbc_formattedTextField.fill = GridBagConstraints.HORIZONTAL;
				gbc_formattedTextField.gridx = 3;
				gbc_formattedTextField.gridy = 1;
				pnlModificarPaciente.add(ftxtNifnie, gbc_formattedTextField);
			}
			{
				lblApellidos = new JLabel(MessagesApplication.getString("Application.124")); //$NON-NLS-1$
				lblApellidos.setFont(font);
				GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
				gbc_lblApellidos.anchor = GridBagConstraints.EAST;
				gbc_lblApellidos.insets = new Insets(0, 0, 5, 5);
				gbc_lblApellidos.gridx = 2;
				gbc_lblApellidos.gridy = 2;
				pnlModificarPaciente.add(lblApellidos, gbc_lblApellidos);
			}
			{
				txtApellido1 = new JTextField();
				txtApellido1.setFont(font);
				GridBagConstraints gbc_txtApellido1 = new GridBagConstraints();
				gbc_txtApellido1.insets = new Insets(0, 0, 5, 5);
				gbc_txtApellido1.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtApellido1.gridx = 3;
				gbc_txtApellido1.gridy = 2;
				pnlModificarPaciente.add(txtApellido1, gbc_txtApellido1);
				txtApellido1.setColumns(10);
			}
			{
				txtApellido2 = new JTextField();
				txtApellido2.setFont(font);
				GridBagConstraints gbc_txtApellido2 = new GridBagConstraints();
				gbc_txtApellido2.insets = new Insets(0, 0, 5, 5);
				gbc_txtApellido2.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtApellido2.gridx = 4;
				gbc_txtApellido2.gridy = 2;
				pnlModificarPaciente.add(txtApellido2, gbc_txtApellido2);
				txtApellido2.setColumns(10);
			}
			{
				lblTelfTrabajo = new JLabel(MessagesApplication.getString("Application.125")); //$NON-NLS-1$
				lblTelfTrabajo.setFont(font);
				GridBagConstraints gbc_lblTelfTrabajo = new GridBagConstraints();
				gbc_lblTelfTrabajo.gridwidth = 2;
				gbc_lblTelfTrabajo.anchor = GridBagConstraints.EAST;
				gbc_lblTelfTrabajo.insets = new Insets(0, 0, 5, 5);
				gbc_lblTelfTrabajo.gridx = 6;
				gbc_lblTelfTrabajo.gridy = 1;
				pnlModificarPaciente.add(lblTelfTrabajo, gbc_lblTelfTrabajo);
			}
			{
				ftxtTelfTrabajo = new JFormattedTextField();
				ftxtTelfTrabajo.setFont(font);
				GridBagConstraints gbc_ftxtTelfTrabajo = new GridBagConstraints();
				gbc_ftxtTelfTrabajo.gridwidth = 3;
				gbc_ftxtTelfTrabajo.insets = new Insets(0, 0, 5, 0);
				gbc_ftxtTelfTrabajo.fill = GridBagConstraints.HORIZONTAL;
				gbc_ftxtTelfTrabajo.gridx = 8;
				gbc_ftxtTelfTrabajo.gridy = 1;
				pnlModificarPaciente.add(ftxtTelfTrabajo, gbc_ftxtTelfTrabajo);
			}
			{
				txtNombre = new JTextField();
				txtNombre.setFont(font);
				GridBagConstraints gbc_txtNombre = new GridBagConstraints();
				gbc_txtNombre.gridwidth = 2;
				gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
				gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtNombre.gridx = 3;
				gbc_txtNombre.gridy = 3;
				pnlModificarPaciente.add(txtNombre, gbc_txtNombre);
				txtNombre.setColumns(10);
			}
			{
				lblEmail = new JLabel(MessagesApplication.getString("Application.126")); //$NON-NLS-1$
				lblEmail.setFont(font);
				GridBagConstraints gbc_lblEmail = new GridBagConstraints();
				gbc_lblEmail.gridwidth = 2;
				gbc_lblEmail.anchor = GridBagConstraints.EAST;
				gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
				gbc_lblEmail.gridx = 6;
				gbc_lblEmail.gridy = 2;
				pnlModificarPaciente.add(lblEmail, gbc_lblEmail);
			}
			{
				txtEmail = new JTextField();
				txtEmail.setFont(font);
				GridBagConstraints gbc_txtEmail = new GridBagConstraints();
				gbc_txtEmail.gridwidth = 3;
				gbc_txtEmail.insets = new Insets(0, 0, 5, 0);
				gbc_txtEmail.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtEmail.gridx = 8;
				gbc_txtEmail.gridy = 2;
				pnlModificarPaciente.add(txtEmail, gbc_txtEmail);
				txtEmail.setColumns(10);
			}
			{
				lblNombre = new JLabel(MessagesApplication.getString("Application.127")); //$NON-NLS-1$
				lblNombre.setFont(font);
				GridBagConstraints gbc_lblNombre = new GridBagConstraints();
				gbc_lblNombre.anchor = GridBagConstraints.EAST;
				gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
				gbc_lblNombre.gridx = 2;
				gbc_lblNombre.gridy = 3;
				pnlModificarPaciente.add(lblNombre, gbc_lblNombre);
			}
			{
				lblDomicilio = new JLabel(MessagesApplication.getString("Application.128")); //$NON-NLS-1$
				lblDomicilio.setFont(font);
				GridBagConstraints gbc_lblDomicilio = new GridBagConstraints();
				gbc_lblDomicilio.anchor = GridBagConstraints.NORTHEAST;
				gbc_lblDomicilio.insets = new Insets(0, 0, 5, 5);
				gbc_lblDomicilio.gridx = 2;
				gbc_lblDomicilio.gridy = 4;
				pnlModificarPaciente.add(lblDomicilio, gbc_lblDomicilio);
			}
			{
				scrollPaneDomicilio = new JScrollPane();
				scrollPaneDescripcion.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
				scrollPaneDescripcion.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
				{
					btnGuardar = new JButton(MessagesApplication.getString("Application.129")); //$NON-NLS-1$
					btnGuardar.addActionListener(new BtnGuardarActionListener());
					btnGuardar.setVisible(false);
					btnGuardar.setIcon(new ImageIcon(Application.class.getResource("/presentacion/Icons/save_24.png"))); //$NON-NLS-1$
					btnGuardar.setFont(font);
					GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
					gbc_btnGuardar.anchor = GridBagConstraints.WEST;
					gbc_btnGuardar.insets = new Insets(0, 0, 5, 5);
					gbc_btnGuardar.fill = GridBagConstraints.VERTICAL;
					gbc_btnGuardar.gridx = 2;
					gbc_btnGuardar.gridy = 4;
					pnlCitas.add(btnGuardar, gbc_btnGuardar);
				}
				btnCancelar = new JButton(MessagesApplication.getString("Application.131")); //$NON-NLS-1$
				btnCancelar.setVisible(false);
				btnCancelar.addActionListener(new BtnCancelarActionListener());
				btnCancelar.setIcon(new ImageIcon(Application.class.getResource("/presentacion/Icons/cancel_24.png"))); //$NON-NLS-1$
				btnCancelar.setFont(font);
				GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
				gbc_btnCancelar.anchor = GridBagConstraints.EAST;
				gbc_btnCancelar.fill = GridBagConstraints.VERTICAL;
				gbc_btnCancelar.insets = new Insets(0, 0, 5, 0);
				gbc_btnCancelar.gridx = 4;
				gbc_btnCancelar.gridy = 4;
				pnlCitas.add(btnCancelar, gbc_btnCancelar);
				{
					scrollPaneCitas = new JScrollPane();
					sp2Agenda.setRightComponent(scrollPaneCitas);
					{
						tableAgenda = new JTable();
						tableAgenda.addMouseListener(new TableAgendaMouseListener());
						tableAgenda.setModel(new DefaultTableModel(
							new Object[][] {
								{"12/01/2017", "16:00", "17:00", "Luis Miguel Ortiz"}, //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
								{"16/01/2017", "12:00", "13:00", "Luis Miguel Ortiz"}, //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
								{"18/01/2017", "10:30", "11:30", "Jose Miguel Cabanillas"}, //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
								{"24/01/2017", "18:30", "19:30", "Jose Miguel Cabanillas"}, //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
							},
							new String[] {
								MessagesApplication.getString("Application.9"), MessagesApplication.getString("Application.7"), MessagesApplication.getString("Application.5"), MessagesApplication.getString("Application.2") //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
							}
						));
						scrollPaneCitas.setViewportView(tableAgenda);
					}
				}
				GridBagConstraints gbc_scrollPaneDomicilio = new GridBagConstraints();
				gbc_scrollPaneDomicilio.gridwidth = 2;
				gbc_scrollPaneDomicilio.gridheight = 2;
				gbc_scrollPaneDomicilio.insets = new Insets(0, 0, 5, 5);
				gbc_scrollPaneDomicilio.fill = GridBagConstraints.BOTH;
				gbc_scrollPaneDomicilio.gridx = 3;
				gbc_scrollPaneDomicilio.gridy = 4;
				pnlModificarPaciente.add(scrollPaneDomicilio, gbc_scrollPaneDomicilio);
				{
					taDomicilio = new JTextArea();
					taDomicilio.setLineWrap(true);
					taDomicilio.setAlignmentY(Component.TOP_ALIGNMENT);
					taDomicilio.setLocation(114, 3);
					taDomicilio.setFont(font);
					taDomicilio.setForeground(Color.BLACK);
					tpDescripcion.changeAlpha(0.5f);
					scrollPaneDomicilio.setViewportView(taDomicilio);
				}
			}
			{
				lblGenero = new JLabel(MessagesApplication.getString("Application.0")); //$NON-NLS-1$
				lblGenero.setFont(font);
				GridBagConstraints gbc_lblGenero = new GridBagConstraints();
				gbc_lblGenero.gridwidth = 2;
				gbc_lblGenero.anchor = GridBagConstraints.EAST;
				gbc_lblGenero.insets = new Insets(0, 0, 5, 5);
				gbc_lblGenero.gridx = 6;
				gbc_lblGenero.gridy = 3;
				pnlModificarPaciente.add(lblGenero, gbc_lblGenero);
			}
			{
				comboBoxGenero = new JComboBox();
				comboBoxGenero.setFont(font);
				GridBagConstraints gbc_comboBoxGenero = new GridBagConstraints();
				gbc_comboBoxGenero.gridwidth = 2;
				gbc_comboBoxGenero.insets = new Insets(0, 0, 5, 5);
				gbc_comboBoxGenero.fill = GridBagConstraints.HORIZONTAL;
				gbc_comboBoxGenero.gridx = 8;
				gbc_comboBoxGenero.gridy = 3;
				pnlModificarPaciente.add(comboBoxGenero, gbc_comboBoxGenero);
			}
			{
				btnCambiar = new JButton(MessagesApplication.getString("Application.11")); //$NON-NLS-1$
				btnCambiar.setFont(font);
				btnCambiar.setIcon(new ImageIcon(Application.class.getResource("/presentacion/Icons/upload_24.png"))); //$NON-NLS-1$
				GridBagConstraints gbc_btnCambiar = new GridBagConstraints();
				gbc_btnCambiar.fill = GridBagConstraints.HORIZONTAL;
				gbc_btnCambiar.insets = new Insets(0, 0, 5, 5);
				gbc_btnCambiar.gridx = 1;
				gbc_btnCambiar.gridy = 4;
				pnlModificarPaciente.add(btnCambiar, gbc_btnCambiar);
			}
			{
				lblSeguridadSocial = new JLabel(MessagesApplication.getString("Application.156")); //$NON-NLS-1$
				lblSeguridadSocial.setFont(font);
				GridBagConstraints gbc_lblSeguridadSocial = new GridBagConstraints();
				gbc_lblSeguridadSocial.gridwidth = 2;
				gbc_lblSeguridadSocial.anchor = GridBagConstraints.EAST;
				gbc_lblSeguridadSocial.insets = new Insets(0, 0, 5, 5);
				gbc_lblSeguridadSocial.gridx = 6;
				gbc_lblSeguridadSocial.gridy = 4;
				pnlModificarPaciente.add(lblSeguridadSocial, gbc_lblSeguridadSocial);
			}
			{
				txtSeguridadSocial = new JTextField();
				txtSeguridadSocial.setFont(font);
				GridBagConstraints gbc_txtSeguridadSocial = new GridBagConstraints();
				gbc_txtSeguridadSocial.gridwidth = 3;
				gbc_txtSeguridadSocial.insets = new Insets(0, 0, 5, 0);
				gbc_txtSeguridadSocial.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtSeguridadSocial.gridx = 8;
				gbc_txtSeguridadSocial.gridy = 4;
				pnlModificarPaciente.add(txtSeguridadSocial, gbc_txtSeguridadSocial);
				txtSeguridadSocial.setColumns(10);
			}
			{
				btnEliminar = new JButton(MessagesApplication.getString("Application.157")); //$NON-NLS-1$
				btnEliminar.setFont(font);
				btnEliminar.setIcon(new ImageIcon(Application.class.getResource("/presentacion/Icons/delete_16.png"))); //$NON-NLS-1$
				GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
				gbc_btnEliminar.fill = GridBagConstraints.HORIZONTAL;
				gbc_btnEliminar.insets = new Insets(0, 0, 5, 5);
				gbc_btnEliminar.gridx = 1;
				gbc_btnEliminar.gridy = 5;
				pnlModificarPaciente.add(btnEliminar, gbc_btnEliminar);
			}
			{
				lblCiudad = new JLabel(MessagesApplication.getString("Application.159")); //$NON-NLS-1$
				lblCiudad.setFont(font);
				GridBagConstraints gbc_lblCiudad = new GridBagConstraints();
				gbc_lblCiudad.anchor = GridBagConstraints.EAST;
				gbc_lblCiudad.insets = new Insets(0, 0, 5, 5);
				gbc_lblCiudad.gridx = 2;
				gbc_lblCiudad.gridy = 6;
				pnlModificarPaciente.add(lblCiudad, gbc_lblCiudad);
			}
			{
				txtCiudad = new JTextField();
				txtCiudad.setFont(font);
				GridBagConstraints gbc_txtCiudad = new GridBagConstraints();
				gbc_txtCiudad.insets = new Insets(0, 0, 5, 5);
				gbc_txtCiudad.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtCiudad.gridx = 3;
				gbc_txtCiudad.gridy = 6;
				pnlModificarPaciente.add(txtCiudad, gbc_txtCiudad);
				txtCiudad.setColumns(10);
			}
			{
				lblLugarNacimiento = new JLabel(MessagesApplication.getString("Application.160")); //$NON-NLS-1$
				lblLugarNacimiento.setFont(font);
				GridBagConstraints gbc_lblLugarNacimiento = new GridBagConstraints();
				gbc_lblLugarNacimiento.gridwidth = 2;
				gbc_lblLugarNacimiento.anchor = GridBagConstraints.EAST;
				gbc_lblLugarNacimiento.insets = new Insets(0, 0, 5, 5);
				gbc_lblLugarNacimiento.gridx = 6;
				gbc_lblLugarNacimiento.gridy = 5;
				pnlModificarPaciente.add(lblLugarNacimiento, gbc_lblLugarNacimiento);
			}
			{
				txtLugarNacimiento = new JTextField();
				txtLugarNacimiento.setFont(font);
				GridBagConstraints gbc_txtLugarNacimiento = new GridBagConstraints();
				gbc_txtLugarNacimiento.gridwidth = 2;
				gbc_txtLugarNacimiento.insets = new Insets(0, 0, 5, 5);
				gbc_txtLugarNacimiento.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtLugarNacimiento.gridx = 8;
				gbc_txtLugarNacimiento.gridy = 5;
				pnlModificarPaciente.add(txtLugarNacimiento, gbc_txtLugarNacimiento);
				txtLugarNacimiento.setColumns(10);
			}
			{
				btnCamara = new JButton(MessagesApplication.getString("Application.161")); //$NON-NLS-1$
				btnCamara.setFont(font);
				btnCamara.setIcon(new ImageIcon(Application.class.getResource("/presentacion/Icons/camera_16.png"))); //$NON-NLS-1$
				GridBagConstraints gbc_btnCamara = new GridBagConstraints();
				gbc_btnCamara.fill = GridBagConstraints.HORIZONTAL;
				gbc_btnCamara.insets = new Insets(0, 0, 5, 5);
				gbc_btnCamara.gridx = 1;
				gbc_btnCamara.gridy = 6;
				pnlModificarPaciente.add(btnCamara, gbc_btnCamara);
			}
			{
				lblFechaNacimiento = new JLabel(MessagesApplication.getString("Application.163")); //$NON-NLS-1$
				lblFechaNacimiento.setFont(font);
				GridBagConstraints gbc_lblFechaNacimiento = new GridBagConstraints();
				gbc_lblFechaNacimiento.gridwidth = 2;
				gbc_lblFechaNacimiento.anchor = GridBagConstraints.EAST;
				gbc_lblFechaNacimiento.insets = new Insets(0, 0, 5, 5);
				gbc_lblFechaNacimiento.gridx = 6;
				gbc_lblFechaNacimiento.gridy = 6;
				pnlModificarPaciente.add(lblFechaNacimiento, gbc_lblFechaNacimiento);
			}
			{
				dateChooser = new JDateChooser();
				dateChooser.setFont(font);
				GridBagConstraints gbc_dateChooser = new GridBagConstraints();
				gbc_dateChooser.gridwidth = 2;
				gbc_dateChooser.insets = new Insets(0, 0, 5, 5);
				gbc_dateChooser.fill = GridBagConstraints.BOTH;
				gbc_dateChooser.gridx = 8;
				gbc_dateChooser.gridy = 6;
				pnlModificarPaciente.add(dateChooser, gbc_dateChooser);
			}
			{
				lblEstado = new JLabel(MessagesApplication.getString("Application.164")); //$NON-NLS-1$
				lblEstado.setFont(font);
				GridBagConstraints gbc_label = new GridBagConstraints();
				gbc_label.anchor = GridBagConstraints.EAST;
				gbc_label.insets = new Insets(0, 0, 5, 5);
				gbc_label.gridx = 2;
				gbc_label.gridy = 7;
				pnlModificarPaciente.add(lblEstado, gbc_label);
			}
			{
				txtEstado = new JTextField();
				txtEstado.setFont(font);
				GridBagConstraints gbc_txtEstado = new GridBagConstraints();
				gbc_txtEstado.insets = new Insets(0, 0, 5, 5);
				gbc_txtEstado.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtEstado.gridx = 3;
				gbc_txtEstado.gridy = 7;
				pnlModificarPaciente.add(txtEstado, gbc_txtEstado);
				txtEstado.setColumns(10);
			}
			{
				lblEdad = new JLabel(MessagesApplication.getString("Application.165")); //$NON-NLS-1$
				lblEdad.setFont(font);
				GridBagConstraints gbc_lblEdad = new GridBagConstraints();
				gbc_lblEdad.gridwidth = 2;
				gbc_lblEdad.anchor = GridBagConstraints.EAST;
				gbc_lblEdad.insets = new Insets(0, 0, 5, 5);
				gbc_lblEdad.gridx = 6;
				gbc_lblEdad.gridy = 7;
				pnlModificarPaciente.add(lblEdad, gbc_lblEdad);
			}
			{
				txtEdad = new JTextField();
				txtEdad.setFont(font);
				GridBagConstraints gbc_txtEdad = new GridBagConstraints();
				gbc_txtEdad.gridwidth = 2;
				gbc_txtEdad.insets = new Insets(0, 0, 5, 5);
				gbc_txtEdad.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtEdad.gridx = 8;
				gbc_txtEdad.gridy = 7;
				pnlModificarPaciente.add(txtEdad, gbc_txtEdad);
				txtEdad.setColumns(10);
			}
			{
				lblCodigoPostal = new JLabel(MessagesApplication.getString("Application.166")); //$NON-NLS-1$
				lblCodigoPostal.setFont(font);
				GridBagConstraints gbc_lblCodigoPostal = new GridBagConstraints();
				gbc_lblCodigoPostal.anchor = GridBagConstraints.EAST;
				gbc_lblCodigoPostal.insets = new Insets(0, 0, 5, 5);
				gbc_lblCodigoPostal.gridx = 2;
				gbc_lblCodigoPostal.gridy = 8;
				pnlModificarPaciente.add(lblCodigoPostal, gbc_lblCodigoPostal);
			}
			{
				txtCodigoPostal = new JTextField();
				txtCodigoPostal.setFont(font);
				GridBagConstraints gbc_txtCodigoPostal = new GridBagConstraints();
				gbc_txtCodigoPostal.insets = new Insets(0, 0, 5, 5);
				gbc_txtCodigoPostal.fill = GridBagConstraints.HORIZONTAL;
				gbc_txtCodigoPostal.gridx = 3;
				gbc_txtCodigoPostal.gridy = 8;
				pnlModificarPaciente.add(txtCodigoPostal, gbc_txtCodigoPostal);
				txtCodigoPostal.setColumns(10);
			}
			{
				lblMedico = new JLabel(MessagesApplication.getString("Application.167")); //$NON-NLS-1$
				lblMedico.setFont(font);
				GridBagConstraints gbc_lblMedico = new GridBagConstraints();
				gbc_lblMedico.gridwidth = 2;
				gbc_lblMedico.anchor = GridBagConstraints.EAST;
				gbc_lblMedico.insets = new Insets(0, 0, 5, 5);
				gbc_lblMedico.gridx = 6;
				gbc_lblMedico.gridy = 8;
				pnlModificarPaciente.add(lblMedico, gbc_lblMedico);
			}
			{
				comboBoxMedicos = new JComboBox();
				comboBoxMedicos.setFont(font);
				GridBagConstraints gbc_comboBoxMedicos = new GridBagConstraints();
				gbc_comboBoxMedicos.gridwidth = 3;
				gbc_comboBoxMedicos.insets = new Insets(0, 0, 5, 0);
				gbc_comboBoxMedicos.fill = GridBagConstraints.HORIZONTAL;
				gbc_comboBoxMedicos.gridx = 8;
				gbc_comboBoxMedicos.gridy = 8;
				pnlModificarPaciente.add(comboBoxMedicos, gbc_comboBoxMedicos);
			}
			{
				{
					separator = new JSeparator();
					separator.setPreferredSize(new Dimension(5,1));
					GridBagConstraints gbc_separator = new GridBagConstraints();
					gbc_separator.fill = GridBagConstraints.HORIZONTAL;
					gbc_separator.weightx = 1;
					gbc_separator.gridwidth = 10;
					gbc_separator.insets = new Insets(0, 0, 5, 0);
					gbc_separator.gridx = 1;
					gbc_separator.gridy = 9;
					pnlModificarPaciente.add(separator, gbc_separator);
				}
				{
					lblEstadoCivil = new JLabel(MessagesApplication.getString("Application.168")); //$NON-NLS-1$
					lblEstadoCivil.setFont(font);
					GridBagConstraints gbc_lblEstadoCivil = new GridBagConstraints();
					gbc_lblEstadoCivil.anchor = GridBagConstraints.EAST;
					gbc_lblEstadoCivil.insets = new Insets(0, 0, 5, 5);
					gbc_lblEstadoCivil.gridx = 2;
					gbc_lblEstadoCivil.gridy = 10;
					pnlModificarPaciente.add(lblEstadoCivil, gbc_lblEstadoCivil);
				}
				{
					comboBoxEstadoCivil = new JComboBox();
					comboBoxEstadoCivil.setFont(font);
					GridBagConstraints gbc_comboBoxEstadoCivil = new GridBagConstraints();
					gbc_comboBoxEstadoCivil.insets = new Insets(0, 0, 5, 5);
					gbc_comboBoxEstadoCivil.fill = GridBagConstraints.HORIZONTAL;
					gbc_comboBoxEstadoCivil.gridx = 3;
					gbc_comboBoxEstadoCivil.gridy = 10;
					pnlModificarPaciente.add(comboBoxEstadoCivil, gbc_comboBoxEstadoCivil);
				}
				{
					lblOcupacion = new JLabel(MessagesApplication.getString("Application.169")); //$NON-NLS-1$
					lblOcupacion.setFont(font);
					GridBagConstraints gbc_lblOcupacion = new GridBagConstraints();
					gbc_lblOcupacion.gridwidth = 2;
					gbc_lblOcupacion.anchor = GridBagConstraints.EAST;
					gbc_lblOcupacion.insets = new Insets(0, 0, 5, 5);
					gbc_lblOcupacion.gridx = 6;
					gbc_lblOcupacion.gridy = 10;
					pnlModificarPaciente.add(lblOcupacion, gbc_lblOcupacion);
				}
				{
					txtOcupacion = new JTextField();
					txtOcupacion.setFont(font);
					GridBagConstraints gbc_txtOcupacion = new GridBagConstraints();
					gbc_txtOcupacion.gridwidth = 3;
					gbc_txtOcupacion.insets = new Insets(0, 0, 5, 0);
					gbc_txtOcupacion.fill = GridBagConstraints.HORIZONTAL;
					gbc_txtOcupacion.gridx = 8;
					gbc_txtOcupacion.gridy = 10;
					pnlModificarPaciente.add(txtOcupacion, gbc_txtOcupacion);
					txtOcupacion.setColumns(10);
				}
				{
					lblNombresPadres = new JLabel(MessagesApplication.getString("Application.170")); //$NON-NLS-1$
					lblNombresPadres.setFont(font);
					GridBagConstraints gbc_lblNombresPadres = new GridBagConstraints();
					gbc_lblNombresPadres.anchor = GridBagConstraints.EAST;
					gbc_lblNombresPadres.insets = new Insets(0, 0, 5, 5);
					gbc_lblNombresPadres.gridx = 2;
					gbc_lblNombresPadres.gridy = 11;
					pnlModificarPaciente.add(lblNombresPadres, gbc_lblNombresPadres);
				}
				{
					txtNombresPadres = new JTextField();
					txtNombresPadres.setFont(font);
					GridBagConstraints gbc_txtNombresPadres = new GridBagConstraints();
					gbc_txtNombresPadres.gridwidth = 2;
					gbc_txtNombresPadres.insets = new Insets(0, 0, 5, 5);
					gbc_txtNombresPadres.fill = GridBagConstraints.HORIZONTAL;
					gbc_txtNombresPadres.gridx = 3;
					gbc_txtNombresPadres.gridy = 11;
					pnlModificarPaciente.add(txtNombresPadres, gbc_txtNombresPadres);
					txtNombresPadres.setColumns(10);
				}
				{
					lblObservaciones = new JLabel(MessagesApplication.getString("Application.171")); //$NON-NLS-1$
					lblObservaciones.setFont(font);
					GridBagConstraints gbc_lblObservaciones = new GridBagConstraints();
					gbc_lblObservaciones.gridwidth = 2;
					gbc_lblObservaciones.anchor = GridBagConstraints.EAST;
					gbc_lblObservaciones.insets = new Insets(0, 0, 5, 5);
					gbc_lblObservaciones.gridx = 6;
					gbc_lblObservaciones.gridy = 11;
					pnlModificarPaciente.add(lblObservaciones, gbc_lblObservaciones);
				}
				{
					scrollPaneObservaciones = new JScrollPane();
					GridBagConstraints gbc_scrollPaneObservaciones = new GridBagConstraints();
					gbc_scrollPaneObservaciones.gridheight = 2;
					gbc_scrollPaneObservaciones.gridwidth = 3;
					gbc_scrollPaneObservaciones.insets = new Insets(0, 0, 5, 0);
					gbc_scrollPaneObservaciones.fill = GridBagConstraints.BOTH;
					gbc_scrollPaneObservaciones.gridx = 8;
					gbc_scrollPaneObservaciones.gridy = 11;
					pnlModificarPaciente.add(scrollPaneObservaciones, gbc_scrollPaneObservaciones);
					{
						taObservaciones = new JTextArea();
						taObservaciones.setFont(font);
						scrollPaneObservaciones.setViewportView(taObservaciones);
					}
				}
				{
					lblProcedencia = new JLabel(MessagesApplication.getString("Application.172")); //$NON-NLS-1$
					lblProcedencia.setFont(font);
					GridBagConstraints gbc_lblProcedencia = new GridBagConstraints();
					gbc_lblProcedencia.anchor = GridBagConstraints.EAST;
					gbc_lblProcedencia.insets = new Insets(0, 0, 5, 5);
					gbc_lblProcedencia.gridx = 2;
					gbc_lblProcedencia.gridy = 12;
					pnlModificarPaciente.add(lblProcedencia, gbc_lblProcedencia);
				}
				{
					txtProcedencia = new JTextField();
					txtProcedencia.setFont(font);
					GridBagConstraints gbc_txtProcedencia = new GridBagConstraints();
					gbc_txtProcedencia.insets = new Insets(0, 0, 5, 5);
					gbc_txtProcedencia.fill = GridBagConstraints.HORIZONTAL;
					gbc_txtProcedencia.gridx = 3;
					gbc_txtProcedencia.gridy = 12;
					pnlModificarPaciente.add(txtProcedencia, gbc_txtProcedencia);
					txtProcedencia.setColumns(10);
				}
			}
			{
				btnGuardar3 = new JButton(MessagesApplication.getString("Application.173")); //$NON-NLS-1$
				btnGuardar3.addActionListener(new BtnGuardar3ActionListener());
				btnGuardar3.setIcon(new ImageIcon(Application.class.getResource("/presentacion/Icons/save_24.png"))); //$NON-NLS-1$
				btnGuardar3.setFont(font);
				GridBagConstraints gbc_btnGuardar3 = new GridBagConstraints();
				gbc_btnGuardar3.gridwidth = 2;
				gbc_btnGuardar3.fill = GridBagConstraints.HORIZONTAL;
				gbc_btnGuardar3.insets = new Insets(0, 0, 0, 5);
				gbc_btnGuardar3.gridx = 7;
				gbc_btnGuardar3.gridy = 13;
				pnlModificarPaciente.add(btnGuardar3, gbc_btnGuardar3);
			}				
			btnCancelar3 = new JButton(MessagesApplication.getString("Application.175")); //$NON-NLS-1$
			btnCancelar3.addActionListener(new BtnCancelar3ActionListener());
			btnCancelar3.setIcon(new ImageIcon(Application.class.getResource("/presentacion/Icons/cancel_24.png"))); //$NON-NLS-1$
			btnCancelar3.setFont(font);
			GridBagConstraints gbc_btnCancelar3 = new GridBagConstraints();
			gbc_btnCancelar3.gridwidth = 2;
			gbc_btnCancelar3.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnCancelar3.gridx = 9;
			gbc_btnCancelar3.gridy = 13;
			pnlModificarPaciente.add(btnCancelar3, gbc_btnCancelar3);
		}		
		layeredPaneMedicos = new JLayeredPane();
		tabMenu.addTab(MessagesApplication.getString("Application.177"), medicosIcon, layeredPaneMedicos, null); //$NON-NLS-1$
		scrollPaneListado = new JScrollPane();
		layeredPaneMedicos.setLayer(scrollPaneListado, 1);
		scrollPaneListado.setBounds(0, 0, 855, 509);
		layeredPaneMedicos.add(scrollPaneListado);
		scrollPaneListado.setFont(font);			
		{
			pnlListado = new JPanel();
			scrollPaneListado.setViewportView(pnlListado);
			pnlListado.setLayout(new GridLayout(0, 1, 0, 0));
			medico1 = new MiPanelMedico();
			pnlListado.add(medico1);
		}
		pnlVerDetalles = new JPanel();
		layeredPaneMedicos.setLayer(pnlVerDetalles, 0);
		borde4 = BorderFactory.createCompoundBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), MessagesApplication.getString("Application.179"), TitledBorder.LEADING, TitledBorder.TOP, font, Color.DARK_GRAY),  //$NON-NLS-1$ //$NON-NLS-2$
				BorderFactory.createEmptyBorder(10,10,10,10));
		pnlVerDetalles.setBorder(borde4);
		pnlVerDetalles.setBounds(0, 0, 855, 509);
		layeredPaneMedicos.add(pnlVerDetalles);
		GridBagLayout gbl_pnlVerDetalles = new GridBagLayout();
		gbl_pnlVerDetalles.columnWidths = new int[]{0, 110, 96, 90, 90, 0, 91, 39, 105, 27, 48, 0};
		gbl_pnlVerDetalles.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0};
		gbl_pnlVerDetalles.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlVerDetalles.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlVerDetalles.setLayout(gbl_pnlVerDetalles);
		{
			lblFoto2 = new JLabel(""); //$NON-NLS-1$
			lblFoto2.setIcon(new ImageIcon(Application.class.getResource("/presentacion/Icons/man-3.png"))); //$NON-NLS-1$
			lblFoto2.setFont(font);
			GridBagConstraints gbc_lblFoto2 = new GridBagConstraints();
			gbc_lblFoto2.gridheight = 4;
			gbc_lblFoto2.insets = new Insets(0, 0, 5, 5);
			gbc_lblFoto2.gridx = 1;
			gbc_lblFoto2.gridy = 0;
			pnlVerDetalles.add(lblFoto2, gbc_lblFoto2);
		}
		{
			lblApellidos2 = new JLabel(MessagesApplication.getString("Application.182")); //$NON-NLS-1$
			lblApellidos2.setFont(font);
			GridBagConstraints gbc_lblApellidos2 = new GridBagConstraints();
			gbc_lblApellidos2.anchor = GridBagConstraints.EAST;
			gbc_lblApellidos2.insets = new Insets(0, 0, 5, 5);
			gbc_lblApellidos2.gridx = 2;
			gbc_lblApellidos2.gridy = 0;
			pnlVerDetalles.add(lblApellidos2, gbc_lblApellidos2);
		}
		{
			txtApellidos3 = new JTextField();
			txtApellidos3.setText("Prado"); //$NON-NLS-1$
			txtApellidos3.setEditable(false);
			txtApellidos3.setFont(font);
			txtApellidos3.setColumns(10);
			GridBagConstraints gbc_txtApellidos3 = new GridBagConstraints();
			gbc_txtApellidos3.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtApellidos3.insets = new Insets(0, 0, 5, 5);
			gbc_txtApellidos3.gridx = 3;
			gbc_txtApellidos3.gridy = 0;
			pnlVerDetalles.add(txtApellidos3, gbc_txtApellidos3);
		}
		{
			txtApellidos4 = new JTextField();
			txtApellidos4.setText("Ibáñez"); //$NON-NLS-1$
			txtApellidos4.setEditable(false);
			txtApellidos4.setFont(font);
			txtApellidos4.setColumns(10);
			GridBagConstraints gbc_txtApellidos4 = new GridBagConstraints();
			gbc_txtApellidos4.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtApellidos4.insets = new Insets(0, 0, 5, 5);
			gbc_txtApellidos4.gridx = 4;
			gbc_txtApellidos4.gridy = 0;
			pnlVerDetalles.add(txtApellidos4, gbc_txtApellidos4);
		}
		{
			lblTelfTrabajo2 = new JLabel(MessagesApplication.getString("Application.185")); //$NON-NLS-1$
			lblTelfTrabajo2.setFont(font);
			GridBagConstraints gbc_lblTelfTrabajo2 = new GridBagConstraints();
			gbc_lblTelfTrabajo2.anchor = GridBagConstraints.EAST;
			gbc_lblTelfTrabajo2.gridwidth = 2;
			gbc_lblTelfTrabajo2.insets = new Insets(0, 0, 5, 5);
			gbc_lblTelfTrabajo2.gridx = 6;
			gbc_lblTelfTrabajo2.gridy = 0;
			pnlVerDetalles.add(lblTelfTrabajo2, gbc_lblTelfTrabajo2);
		}
		{
			ftxtTelfTrabajo2 = new JFormattedTextField();
			ftxtTelfTrabajo2.setText("658301573"); //$NON-NLS-1$
			ftxtTelfTrabajo2.setEditable(false);
			ftxtTelfTrabajo2.setFont(font);
			GridBagConstraints gbc_ftxtTelfTrabajo2 = new GridBagConstraints();
			gbc_ftxtTelfTrabajo2.fill = GridBagConstraints.HORIZONTAL;
			gbc_ftxtTelfTrabajo2.gridwidth = 3;
			gbc_ftxtTelfTrabajo2.insets = new Insets(0, 0, 5, 0);
			gbc_ftxtTelfTrabajo2.gridx = 8;
			gbc_ftxtTelfTrabajo2.gridy = 0;
			pnlVerDetalles.add(ftxtTelfTrabajo2, gbc_ftxtTelfTrabajo2);
		}
		{
			lblNombre2 = new JLabel(MessagesApplication.getString("Application.187")); //$NON-NLS-1$
			lblNombre2.setFont(font);
			GridBagConstraints gbc_lblNombre2 = new GridBagConstraints();
			gbc_lblNombre2.anchor = GridBagConstraints.EAST;
			gbc_lblNombre2.insets = new Insets(0, 0, 5, 5);
			gbc_lblNombre2.gridx = 2;
			gbc_lblNombre2.gridy = 1;
			pnlVerDetalles.add(lblNombre2, gbc_lblNombre2);
		}
		{
			txtNombre2 = new JTextField();
			txtNombre2.setText("Estíbaliz"); //$NON-NLS-1$
			txtNombre2.setEditable(false);
			txtNombre2.setFont(font);
			txtNombre2.setColumns(10);
			GridBagConstraints gbc_txtNombre2 = new GridBagConstraints();
			gbc_txtNombre2.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtNombre2.gridwidth = 2;
			gbc_txtNombre2.insets = new Insets(0, 0, 5, 5);
			gbc_txtNombre2.gridx = 3;
			gbc_txtNombre2.gridy = 1;
			pnlVerDetalles.add(txtNombre2, gbc_txtNombre2);
		}
		{
			lblEmail2 = new JLabel(MessagesApplication.getString("Application.189")); //$NON-NLS-1$
			lblEmail2.setFont(font);
			GridBagConstraints gbc_lblEmail2 = new GridBagConstraints();
			gbc_lblEmail2.anchor = GridBagConstraints.EAST;
			gbc_lblEmail2.gridwidth = 2;
			gbc_lblEmail2.insets = new Insets(0, 0, 5, 5);
			gbc_lblEmail2.gridx = 6;
			gbc_lblEmail2.gridy = 1;
			pnlVerDetalles.add(lblEmail2, gbc_lblEmail2);
		}
		{
			txtEmail2 = new JTextField();
			txtEmail2.setText("estibaliz@briarcliff.com"); //$NON-NLS-1$
			txtEmail2.setEditable(false);
			txtEmail2.setFont(font);
			txtEmail2.setColumns(10);
			GridBagConstraints gbc_txtEmail2 = new GridBagConstraints();
			gbc_txtEmail2.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtEmail2.gridwidth = 3;
			gbc_txtEmail2.insets = new Insets(0, 0, 5, 0);
			gbc_txtEmail2.gridx = 8;
			gbc_txtEmail2.gridy = 1;
			pnlVerDetalles.add(txtEmail2, gbc_txtEmail2);
		}
		{
			lblDomicilio2 = new JLabel(MessagesApplication.getString("Application.191")); //$NON-NLS-1$
			lblDomicilio2.setFont(font);
			GridBagConstraints gbc_lblDomicilio2 = new GridBagConstraints();
			gbc_lblDomicilio2.anchor = GridBagConstraints.NORTHEAST;
			gbc_lblDomicilio2.insets = new Insets(0, 0, 5, 5);
			gbc_lblDomicilio2.gridx = 2;
			gbc_lblDomicilio2.gridy = 2;
			pnlVerDetalles.add(lblDomicilio2, gbc_lblDomicilio2);
		}
		{
			scrollPaneDomicilio2 = new JScrollPane();
			GridBagConstraints gbc_scrollPaneDomicilio2 = new GridBagConstraints();
			gbc_scrollPaneDomicilio2.fill = GridBagConstraints.BOTH;
			gbc_scrollPaneDomicilio2.gridheight = 2;
			gbc_scrollPaneDomicilio2.gridwidth = 2;
			gbc_scrollPaneDomicilio2.insets = new Insets(0, 0, 5, 5);
			gbc_scrollPaneDomicilio2.gridx = 3;
			gbc_scrollPaneDomicilio2.gridy = 2;
			pnlVerDetalles.add(scrollPaneDomicilio2, gbc_scrollPaneDomicilio2);
			{
				taDomicilio2 = new JTextArea();
				taDomicilio2.setText(MessagesApplication.getString("Application.14")); //$NON-NLS-1$
				taDomicilio2.setEditable(false);
				scrollPaneDomicilio2.setViewportView(taDomicilio2);
			}
		}
		{
			lblGenero2 = new JLabel(MessagesApplication.getString("Application.193")); //$NON-NLS-1$
			lblGenero2.setFont(font);
			GridBagConstraints gbc_lblGenero2 = new GridBagConstraints();
			gbc_lblGenero2.anchor = GridBagConstraints.EAST;
			gbc_lblGenero2.gridwidth = 2;
			gbc_lblGenero2.insets = new Insets(0, 0, 5, 5);
			gbc_lblGenero2.gridx = 6;
			gbc_lblGenero2.gridy = 2;
			pnlVerDetalles.add(lblGenero2, gbc_lblGenero2);
		}
		{
			txtGenero2 = new JTextField();
			txtGenero2.setEditable(false);
			txtGenero2.setText(MessagesApplication.getString("Application.194")); //$NON-NLS-1$
			txtGenero2.setFont(font);
			GridBagConstraints gbc_txtGenero2 = new GridBagConstraints();
			gbc_txtGenero2.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtGenero2.gridwidth = 2;
			gbc_txtGenero2.insets = new Insets(0, 0, 5, 5);
			gbc_txtGenero2.gridx = 8;
			gbc_txtGenero2.gridy = 2;
			pnlVerDetalles.add(txtGenero2, gbc_txtGenero2);
		}
		{
			lblSeguridadSocial2 = new JLabel(MessagesApplication.getString("Application.195")); //$NON-NLS-1$
			lblSeguridadSocial2.setFont(font);
			GridBagConstraints gbc_lblSeguridadSocial2 = new GridBagConstraints();
			gbc_lblSeguridadSocial2.anchor = GridBagConstraints.EAST;
			gbc_lblSeguridadSocial2.gridwidth = 2;
			gbc_lblSeguridadSocial2.insets = new Insets(0, 0, 5, 5);
			gbc_lblSeguridadSocial2.gridx = 6;
			gbc_lblSeguridadSocial2.gridy = 3;
			pnlVerDetalles.add(lblSeguridadSocial2, gbc_lblSeguridadSocial2);
		}
		{
			txtSeguridadSocial2 = new JTextField();
			txtSeguridadSocial2.setText("650023871665"); //$NON-NLS-1$
			txtSeguridadSocial2.setEditable(false);
			txtSeguridadSocial2.setFont(font);
			txtSeguridadSocial2.setColumns(10);
			GridBagConstraints gbc_txtSeguridadSocial2 = new GridBagConstraints();
			gbc_txtSeguridadSocial2.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtSeguridadSocial2.gridwidth = 3;
			gbc_txtSeguridadSocial2.insets = new Insets(0, 0, 5, 0);
			gbc_txtSeguridadSocial2.gridx = 8;
			gbc_txtSeguridadSocial2.gridy = 3;
			pnlVerDetalles.add(txtSeguridadSocial2, gbc_txtSeguridadSocial2);
		}
		{
			lblCiudad2 = new JLabel(MessagesApplication.getString("Application.197")); //$NON-NLS-1$
			lblCiudad2.setFont(font);
			GridBagConstraints gbc_lblCiudad2 = new GridBagConstraints();
			gbc_lblCiudad2.anchor = GridBagConstraints.EAST;
			gbc_lblCiudad2.insets = new Insets(0, 0, 5, 5);
			gbc_lblCiudad2.gridx = 2;
			gbc_lblCiudad2.gridy = 4;
			pnlVerDetalles.add(lblCiudad2, gbc_lblCiudad2);
		}
		{
			txtCiudad2 = new JTextField();
			txtCiudad2.setText("Puertollano"); //$NON-NLS-1$
			txtCiudad2.setEditable(false);
			txtCiudad2.setFont(font);
			txtCiudad2.setColumns(10);
			GridBagConstraints gbc_txtCiudad2 = new GridBagConstraints();
			gbc_txtCiudad2.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtCiudad2.insets = new Insets(0, 0, 5, 5);
			gbc_txtCiudad2.gridx = 3;
			gbc_txtCiudad2.gridy = 4;
			pnlVerDetalles.add(txtCiudad2, gbc_txtCiudad2);
		}
		{
			lblLugarNacimiento2 = new JLabel(MessagesApplication.getString("Application.199")); //$NON-NLS-1$
			lblLugarNacimiento2.setFont(font);
			GridBagConstraints gbc_lblLugarNacimiento2 = new GridBagConstraints();
			gbc_lblLugarNacimiento2.anchor = GridBagConstraints.EAST;
			gbc_lblLugarNacimiento2.gridwidth = 2;
			gbc_lblLugarNacimiento2.insets = new Insets(0, 0, 5, 5);
			gbc_lblLugarNacimiento2.gridx = 6;
			gbc_lblLugarNacimiento2.gridy = 4;
			pnlVerDetalles.add(lblLugarNacimiento2, gbc_lblLugarNacimiento2);
		}
		{
			txtLugarNacimiento2 = new JTextField();
			txtLugarNacimiento2.setText("Ciudad Real"); //$NON-NLS-1$
			txtLugarNacimiento2.setEditable(false);
			txtLugarNacimiento2.setFont(font);
			txtLugarNacimiento2.setColumns(10);
			GridBagConstraints gbc_txtLugarNacimiento2 = new GridBagConstraints();
			gbc_txtLugarNacimiento2.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtLugarNacimiento2.gridwidth = 2;
			gbc_txtLugarNacimiento2.insets = new Insets(0, 0, 5, 5);
			gbc_txtLugarNacimiento2.gridx = 8;
			gbc_txtLugarNacimiento2.gridy = 4;
			pnlVerDetalles.add(txtLugarNacimiento2, gbc_txtLugarNacimiento2);
		}
		{
			lblLocalidad2 = new JLabel(MessagesApplication.getString("Application.201")); //$NON-NLS-1$
			lblLocalidad2.setFont(font);
			GridBagConstraints gbc_lblLocalidad2 = new GridBagConstraints();
			gbc_lblLocalidad2.anchor = GridBagConstraints.EAST;
			gbc_lblLocalidad2.insets = new Insets(0, 0, 5, 5);
			gbc_lblLocalidad2.gridx = 2;
			gbc_lblLocalidad2.gridy = 5;
			pnlVerDetalles.add(lblLocalidad2, gbc_lblLocalidad2);
		}
		{
			txtLocalidad2 = new JTextField();
			txtLocalidad2.setText("Ciudad Real"); //$NON-NLS-1$
			txtLocalidad2.setEditable(false);
			txtLocalidad2.setFont(font);
			txtLocalidad2.setColumns(10);
			GridBagConstraints gbc_txtLocalidad2 = new GridBagConstraints();
			gbc_txtLocalidad2.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtLocalidad2.insets = new Insets(0, 0, 5, 5);
			gbc_txtLocalidad2.gridx = 3;
			gbc_txtLocalidad2.gridy = 5;
			pnlVerDetalles.add(txtLocalidad2, gbc_txtLocalidad2);
		}
		{
			lblFechaNacimiento2 = new JLabel(MessagesApplication.getString("Application.203")); //$NON-NLS-1$
			lblFechaNacimiento2.setFont(font);
			GridBagConstraints gbc_lblFechaNacimiento2 = new GridBagConstraints();
			gbc_lblFechaNacimiento2.anchor = GridBagConstraints.EAST;
			gbc_lblFechaNacimiento2.gridwidth = 2;
			gbc_lblFechaNacimiento2.insets = new Insets(0, 0, 5, 5);
			gbc_lblFechaNacimiento2.gridx = 6;
			gbc_lblFechaNacimiento2.gridy = 5;
			pnlVerDetalles.add(lblFechaNacimiento2, gbc_lblFechaNacimiento2);
		}
		{
			dateChooserNacimiento = new JDateChooser();
			dateChooserNacimiento.setEnabled(false);
			Calendar c = new GregorianCalendar();
			dateChooserNacimiento.setCalendar(c);
			dateChooserNacimiento.setFont(font);
			GridBagConstraints gbc_dateChooserNacimiento = new GridBagConstraints();
			gbc_dateChooserNacimiento.fill = GridBagConstraints.BOTH;
			gbc_dateChooserNacimiento.gridwidth = 2;
			gbc_dateChooserNacimiento.insets = new Insets(0, 0, 5, 5);
			gbc_dateChooserNacimiento.gridx = 8;
			gbc_dateChooserNacimiento.gridy = 5;
			pnlVerDetalles.add(dateChooserNacimiento, gbc_dateChooserNacimiento);
		}
		{
			lblCodigoPostal2 = new JLabel(MessagesApplication.getString("Application.204")); //$NON-NLS-1$
			lblCodigoPostal2.setFont(font);
			GridBagConstraints gbc_lblCodigoPostal2 = new GridBagConstraints();
			gbc_lblCodigoPostal2.anchor = GridBagConstraints.EAST;
			gbc_lblCodigoPostal2.insets = new Insets(0, 0, 5, 5);
			gbc_lblCodigoPostal2.gridx = 2;
			gbc_lblCodigoPostal2.gridy = 6;
			pnlVerDetalles.add(lblCodigoPostal2, gbc_lblCodigoPostal2);
		}
		{
			txtCodigoPostal2 = new JTextField();
			txtCodigoPostal2.setText("13500"); //$NON-NLS-1$
			txtCodigoPostal2.setEditable(false);
			txtCodigoPostal2.setFont(font);
			txtCodigoPostal2.setColumns(10);
			GridBagConstraints gbc_txtCodigoPostal2 = new GridBagConstraints();
			gbc_txtCodigoPostal2.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtCodigoPostal2.insets = new Insets(0, 0, 5, 5);
			gbc_txtCodigoPostal2.gridx = 3;
			gbc_txtCodigoPostal2.gridy = 6;
			pnlVerDetalles.add(txtCodigoPostal2, gbc_txtCodigoPostal2);
		}
		{
			lblEdad2 = new JLabel(MessagesApplication.getString("Application.206")); //$NON-NLS-1$
			lblEdad2.setFont(font);
			GridBagConstraints gbc_lblEdad2 = new GridBagConstraints();
			gbc_lblEdad2.anchor = GridBagConstraints.EAST;
			gbc_lblEdad2.gridwidth = 2;
			gbc_lblEdad2.insets = new Insets(0, 0, 5, 5);
			gbc_lblEdad2.gridx = 6;
			gbc_lblEdad2.gridy = 6;
			pnlVerDetalles.add(lblEdad2, gbc_lblEdad2);
		}
		{
			txtEdad2 = new JTextField();
			txtEdad2.setText("24"); //$NON-NLS-1$
			txtEdad2.setEditable(false);
			txtEdad2.setFont(font);
			txtEdad2.setColumns(10);
			GridBagConstraints gbc_txtEdad2 = new GridBagConstraints();
			gbc_txtEdad2.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtEdad2.gridwidth = 2;
			gbc_txtEdad2.insets = new Insets(0, 0, 5, 5);
			gbc_txtEdad2.gridx = 8;
			gbc_txtEdad2.gridy = 6;
			pnlVerDetalles.add(txtEdad2, gbc_txtEdad2);
		}
		{
			lblTelfDomicilio2 = new JLabel(MessagesApplication.getString("Application.208")); //$NON-NLS-1$
			lblTelfDomicilio2.setFont(font);
			GridBagConstraints gbc_lblTelfDomicilio2 = new GridBagConstraints();
			gbc_lblTelfDomicilio2.anchor = GridBagConstraints.EAST;
			gbc_lblTelfDomicilio2.insets = new Insets(0, 0, 5, 5);
			gbc_lblTelfDomicilio2.gridx = 2;
			gbc_lblTelfDomicilio2.gridy = 7;
			pnlVerDetalles.add(lblTelfDomicilio2, gbc_lblTelfDomicilio2);
		}
		{
			ftxtTelfDomicilio2 = new JFormattedTextField();
			ftxtTelfDomicilio2.setText("926548730"); //$NON-NLS-1$
			ftxtTelfDomicilio2.setEditable(false);
			ftxtTelfDomicilio2.setFont(font);
			GridBagConstraints gbc_ftxtTelfDomicilio2 = new GridBagConstraints();
			gbc_ftxtTelfDomicilio2.fill = GridBagConstraints.HORIZONTAL;
			gbc_ftxtTelfDomicilio2.gridwidth = 2;
			gbc_ftxtTelfDomicilio2.insets = new Insets(0, 0, 5, 5);
			gbc_ftxtTelfDomicilio2.gridx = 3;
			gbc_ftxtTelfDomicilio2.gridy = 7;
			pnlVerDetalles.add(ftxtTelfDomicilio2, gbc_ftxtTelfDomicilio2);
		}
		{
			separator_1 = new JSeparator();
			separator_1.setPreferredSize(new Dimension(5, 1));
			GridBagConstraints gbc_separator_1 = new GridBagConstraints();
			gbc_separator_1.weightx = 1.0;
			gbc_separator_1.fill = GridBagConstraints.HORIZONTAL;
			gbc_separator_1.gridwidth = 10;
			gbc_separator_1.insets = new Insets(0, 0, 5, 0);
			gbc_separator_1.gridx = 1;
			gbc_separator_1.gridy = 8;
			pnlVerDetalles.add(separator_1, gbc_separator_1);
		}
		{
			lblEspecialidad = new JLabel(MessagesApplication.getString("Application.210")); //$NON-NLS-1$
			lblEspecialidad.setFont(font);
			GridBagConstraints gbc_lblEspecialidad = new GridBagConstraints();
			gbc_lblEspecialidad.anchor = GridBagConstraints.EAST;
			gbc_lblEspecialidad.insets = new Insets(0, 0, 5, 5);
			gbc_lblEspecialidad.gridx = 2;
			gbc_lblEspecialidad.gridy = 9;
			pnlVerDetalles.add(lblEspecialidad, gbc_lblEspecialidad);
		}
		{
			txtEspecialidad = new JTextField();
			txtEspecialidad.setText(MessagesApplication.getString("Application.211")); //$NON-NLS-1$
			txtEspecialidad.setEditable(false);
			txtEspecialidad.setFont(new Font("Segoe UI", Font.PLAIN, 13)); //$NON-NLS-1$
			txtEspecialidad.setColumns(10);
			GridBagConstraints gbc_txtEspecialidad = new GridBagConstraints();
			gbc_txtEspecialidad.gridwidth = 2;
			gbc_txtEspecialidad.insets = new Insets(0, 0, 5, 5);
			gbc_txtEspecialidad.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtEspecialidad.gridx = 3;
			gbc_txtEspecialidad.gridy = 9;
			pnlVerDetalles.add(txtEspecialidad, gbc_txtEspecialidad);
		}
		{
			lblHistoria = new JLabel(MessagesApplication.getString("Application.213")); //$NON-NLS-1$
			lblHistoria.setFont(font);
			GridBagConstraints gbc_lblHistoria = new GridBagConstraints();
			gbc_lblHistoria.anchor = GridBagConstraints.EAST;
			gbc_lblHistoria.insets = new Insets(0, 0, 5, 5);
			gbc_lblHistoria.gridx = 2;
			gbc_lblHistoria.gridy = 10;
			pnlVerDetalles.add(lblHistoria, gbc_lblHistoria);
		}
		{
			txtHistoria = new JTextField();
			txtHistoria.setText("24"); //$NON-NLS-1$
			txtHistoria.setEditable(false);
			txtHistoria.setFont(font);
			txtHistoria.setColumns(10);
			GridBagConstraints gbc_txtHistoria = new GridBagConstraints();
			gbc_txtHistoria.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtHistoria.insets = new Insets(0, 0, 5, 5);
			gbc_txtHistoria.gridx = 3;
			gbc_txtHistoria.gridy = 10;
			pnlVerDetalles.add(txtHistoria, gbc_txtHistoria);
		}
		{
			lblExtension = new JLabel(MessagesApplication.getString("Application.215")); //$NON-NLS-1$
			lblExtension.setFont(font);
			GridBagConstraints gbc_lblExtension = new GridBagConstraints();
			gbc_lblExtension.anchor = GridBagConstraints.EAST;
			gbc_lblExtension.insets = new Insets(0, 0, 5, 5);
			gbc_lblExtension.gridx = 2;
			gbc_lblExtension.gridy = 11;
			pnlVerDetalles.add(lblExtension, gbc_lblExtension);
		}
		{
			txtExtension = new JTextField();
			txtExtension.setText("8524"); //$NON-NLS-1$
			txtExtension.setEditable(false);
			txtExtension.setFont(font);
			txtExtension.setColumns(10);
			GridBagConstraints gbc_txtExtension = new GridBagConstraints();
			gbc_txtExtension.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtExtension.insets = new Insets(0, 0, 5, 5);
			gbc_txtExtension.gridx = 3;
			gbc_txtExtension.gridy = 11;
			pnlVerDetalles.add(txtExtension, gbc_txtExtension);
		}
		{
			lblHorarioDeHistoria = new JLabel(MessagesApplication.getString("Application.217")); //$NON-NLS-1$
			lblHorarioDeHistoria.setFont(new Font("Segoe UI", Font.PLAIN, 13)); //$NON-NLS-1$
			GridBagConstraints gbc_lblHorarioDeHistoria = new GridBagConstraints();
			gbc_lblHorarioDeHistoria.anchor = GridBagConstraints.EAST;
			gbc_lblHorarioDeHistoria.insets = new Insets(0, 0, 5, 5);
			gbc_lblHorarioDeHistoria.gridx = 2;
			gbc_lblHorarioDeHistoria.gridy = 12;
			pnlVerDetalles.add(lblHorarioDeHistoria, gbc_lblHorarioDeHistoria);
		}
		{
			ftxtHorarioHistoria = new JFormattedTextField();
			ftxtHorarioHistoria.setText("12:00 - 20:00"); //$NON-NLS-1$
			ftxtHorarioHistoria.setEditable(false);
			ftxtHorarioHistoria.setFont(new Font("Segoe UI", Font.PLAIN, 13)); //$NON-NLS-1$
			GridBagConstraints gbc_ftxtHorarioHistoria = new GridBagConstraints();
			gbc_ftxtHorarioHistoria.insets = new Insets(0, 0, 5, 5);
			gbc_ftxtHorarioHistoria.fill = GridBagConstraints.HORIZONTAL;
			gbc_ftxtHorarioHistoria.gridx = 3;
			gbc_ftxtHorarioHistoria.gridy = 12;
			pnlVerDetalles.add(ftxtHorarioHistoria, gbc_ftxtHorarioHistoria);
		}
		{
			btnAtras = new JButton(MessagesApplication.getString("Application.221")); //$NON-NLS-1$
			btnAtras.addActionListener(new BtnCancelar4ActionListener());
			btnAtras.setIcon(new ImageIcon(Application.class.getResource("/presentacion/Icons/back_24.png"))); //$NON-NLS-1$
			btnAtras.setFont(font);
			GridBagConstraints gbc_btnAtras = new GridBagConstraints();
			gbc_btnAtras.fill = GridBagConstraints.HORIZONTAL;
			gbc_btnAtras.gridwidth = 2;
			gbc_btnAtras.gridx = 9;
			gbc_btnAtras.gridy = 13;
			pnlVerDetalles.add(btnAtras, gbc_btnAtras);
		}

		pnlContactar = new JPanel();
		borde5 = BorderFactory.createCompoundBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), MessagesApplication.getString("Application.224"), TitledBorder.LEADING, TitledBorder.TOP, font, Color.DARK_GRAY),  //$NON-NLS-1$ //$NON-NLS-2$
				BorderFactory.createEmptyBorder(10,10,10,10));
		pnlContactar.setBorder(borde5);
		layeredPaneMedicos.setLayer(pnlContactar, 0);
		pnlContactar.setBounds(0, 0, 908, 509);
		layeredPaneMedicos.add(pnlContactar);
		GridBagLayout gbl_pnlContactar = new GridBagLayout();
		gbl_pnlContactar.columnWidths = new int[]{323, 275, 0, 0, 0};
		gbl_pnlContactar.rowHeights = new int[]{0, 0, 0, 0};
		gbl_pnlContactar.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlContactar.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		pnlContactar.setLayout(gbl_pnlContactar);
		{
			txtAsunto2 = new JTextField();
			GridBagConstraints gbc_txtAsunto2 = new GridBagConstraints();
			gbc_txtAsunto2.insets = new Insets(0, 0, 5, 5);
			gbc_txtAsunto2.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtAsunto2.gridx = 0;
			gbc_txtAsunto2.gridy = 0;
			pnlContactar.add(txtAsunto2, gbc_txtAsunto2);
			txtAsunto2.setColumns(10);
		}
		{
			tpAsunto2 = new TextPrompt(MessagesApplication.getString("Application.225"), txtAsunto2); //$NON-NLS-1$
			tpAsunto2.setLocation(114, 3);
			tpAsunto2.setFont(font);
			tpAsunto2.setForeground(Color.BLACK);
			tpAsunto2.changeAlpha(0.5f);
		}
		{
			lblPath = new JLabel(MessagesApplication.getString("Application.label.text")); //$NON-NLS-1$
			lblPath.setVisible(false);
			GridBagConstraints gbc_lblPath = new GridBagConstraints();
			gbc_lblPath.insets = new Insets(0, 0, 5, 5);
			gbc_lblPath.gridx = 1;
			gbc_lblPath.gridy = 0;
			pnlContactar.add(lblPath, gbc_lblPath);
		}
		{
			scrollPaneMensaje = new JScrollPane();
			scrollPaneMensaje.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			GridBagConstraints gbc_scrollPaneMensaje = new GridBagConstraints();
			gbc_scrollPaneMensaje.gridwidth = 4;
			gbc_scrollPaneMensaje.insets = new Insets(0, 0, 5, 0);
			gbc_scrollPaneMensaje.fill = GridBagConstraints.BOTH;
			gbc_scrollPaneMensaje.gridx = 0;
			gbc_scrollPaneMensaje.gridy = 1;
			pnlContactar.add(scrollPaneMensaje, gbc_scrollPaneMensaje);
			{
				taMensaje = new JTextArea();
				taMensaje.setLineWrap(true);
				scrollPaneMensaje.setViewportView(taMensaje);
				{
					tpMensaje = new TextPrompt(MessagesApplication.getString("Application.226"), taMensaje); //$NON-NLS-1$
					tpMensaje.setVerticalAlignment(SwingConstants.TOP);
					tpMensaje.setLocation(114, 3);
					tpMensaje.setFont(font);
					tpMensaje.setForeground(Color.BLACK);
					tpMensaje.changeAlpha(0.5f);
				}
			}
		}
		{
			btnDescartar = new JButton(MessagesApplication.getString("Application.227")); //$NON-NLS-1$
			btnDescartar.addActionListener(new BtnDescartarActionListener());
			{
				btnAdjuntar = new JButton(MessagesApplication.getString("Application.btnAdjuntar.text")); //$NON-NLS-1$
				btnAdjuntar.addActionListener(new BtnAdjuntarActionListener());
				btnAdjuntar.setIcon(new ImageIcon(Application.class.getResource("/presentacion/Icons/attach_24.png")));
				btnAdjuntar.setFont(font);
				GridBagConstraints gbc_btnAdjuntar = new GridBagConstraints();
				gbc_btnAdjuntar.fill = GridBagConstraints.VERTICAL;
				gbc_btnAdjuntar.anchor = GridBagConstraints.WEST;
				gbc_btnAdjuntar.insets = new Insets(0, 0, 0, 5);
				gbc_btnAdjuntar.gridx = 0;
				gbc_btnAdjuntar.gridy = 2;
				pnlContactar.add(btnAdjuntar, gbc_btnAdjuntar);
			}
			btnDescartar.setIcon(new ImageIcon(Application.class.getResource("/presentacion/Icons/cancel_24.png"))); //$NON-NLS-1$
			btnDescartar.setFont(new Font("Segoe UI", Font.PLAIN, 13)); //$NON-NLS-1$
			GridBagConstraints gbc_btnDescartar = new GridBagConstraints();
			gbc_btnDescartar.fill = GridBagConstraints.VERTICAL;
			gbc_btnDescartar.insets = new Insets(0, 0, 0, 5);
			gbc_btnDescartar.gridx = 2;
			gbc_btnDescartar.gridy = 2;
			pnlContactar.add(btnDescartar, gbc_btnDescartar);
		}
		{
			btnEnviar = new JButton(MessagesApplication.getString("Application.230")); //$NON-NLS-1$
			btnEnviar.addActionListener(new BtnEnviarActionListener());
			btnEnviar.setIcon(new ImageIcon(Application.class.getResource("/presentacion/Icons/send_32.png"))); //$NON-NLS-1$
			btnEnviar.setFont(font);
			GridBagConstraints gbc_btnEnviar = new GridBagConstraints();
			gbc_btnEnviar.fill = GridBagConstraints.VERTICAL;
			gbc_btnEnviar.gridx = 3;
			gbc_btnEnviar.gridy = 2;
			pnlContactar.add(btnEnviar, gbc_btnEnviar);
		}
	}

	public boolean getEditar() {
		return editar;
	}

	public boolean setEditar(boolean editar) {
		this.editar = editar;
		return editar;
	}
	private class BtnSalirActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			setVisible(false);
			JOptionPane.showMessageDialog(null, MessagesApplication.getString("Application.232"), "", JOptionPane.INFORMATION_MESSAGE); //$NON-NLS-1$ //$NON-NLS-2$
			new VentanaLogin().setVisible(true);
		}
	}
	private class BtnBorrarHistoriaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {			
			DefaultTableModel delete = (DefaultTableModel) tableHistorias.getModel();
			delete.removeRow(tableHistorias.getSelectedRow());
			btnModificarHistoria.setEnabled(false);
			btnBorrarHistoria.setEnabled(false);
			txtSintomas.setText(""); //$NON-NLS-1$
			txtDiagnostico.setText(""); //$NON-NLS-1$
			txtTratamiento.setText(""); //$NON-NLS-1$

		}
	}
	private class BtnBorrarPacienteActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			DefaultTableModel delete = (DefaultTableModel) tablePacientes.getModel();
			delete.removeRow(tablePacientes.getSelectedRow());
			btnModificarPaciente.setEnabled(false);
			btnBorrarPaciente.setEnabled(false);
			btnVerDetalles.setEnabled(false);
		}
	}
	public void noVisibilidadHistoria() {
		txtSintomas.setEditable(false);
		txtDiagnostico.setEditable(false);
		txtTratamiento.setEditable(false);
		btnGuardar2.setEnabled(false);
		btnCancelar2.setEnabled(false);
		btnModificarHistoria.setEnabled(true);
		btnBorrarHistoria.setEnabled(true);
	}
	public void siVisibilidadHistoria() {
		txtSintomas.setEditable(true);
		txtDiagnostico.setEditable(true);
		txtTratamiento.setEditable(true);
		btnGuardar2.setEnabled(true);
		btnCancelar2.setEnabled(true);
	}
	private class TableHistoriasMouseListener extends MouseAdapter {
		String sintomas = null;
		String diagnostico = null;
		String tratamiento = null;

		public void modificados() {
			sintomas = nsintomas;
			diagnostico = ndiagnostico;
			tratamiento = ntratamiento;
		}
		public void mouseClicked(MouseEvent arg0) {

			btnModificarHistoria.setEnabled(true);
			btnBorrarHistoria.setEnabled(true);

			int fila;

			fila = tableHistorias.getSelectedRow();
			DefaultTableModel tb = (DefaultTableModel) tableHistorias.getModel();

			if((String) tb.getValueAt(fila, 0) != null) {
				if(fila == 0) {
					noVisibilidadHistoria();
					sintomas = MessagesApplication.getString("Application.237") //$NON-NLS-1$
							+ MessagesApplication.getString("Application.238") //$NON-NLS-1$
							+ MessagesApplication.getString("Application.239"); //$NON-NLS-1$
					diagnostico = MessagesApplication.getString("Application.240"); //$NON-NLS-1$
					tratamiento = MessagesApplication.getString("Application.241") //$NON-NLS-1$
							+ MessagesApplication.getString("Application.242") //$NON-NLS-1$
							+ MessagesApplication.getString("Application.243") //$NON-NLS-1$
							+ MessagesApplication.getString("Application.244"); //$NON-NLS-1$
					if(contador == 0) {
						modificados();
					}
				}
				if(fila == 1) {
					noVisibilidadHistoria();
					sintomas = MessagesApplication.getString("Application.245") //$NON-NLS-1$
							+ MessagesApplication.getString("Application.246") //$NON-NLS-1$
							+ MessagesApplication.getString("Application.247") //$NON-NLS-1$
							+ MessagesApplication.getString("Application.248") //$NON-NLS-1$
							+ MessagesApplication.getString("Application.249"); //$NON-NLS-1$
					diagnostico = MessagesApplication.getString("Application.250"); //$NON-NLS-1$
					tratamiento = MessagesApplication.getString("Application.251") //$NON-NLS-1$
							+ MessagesApplication.getString("Application.252") //$NON-NLS-1$
							+ MessagesApplication.getString("Application.253") //$NON-NLS-1$
							+ MessagesApplication.getString("Application.254") //$NON-NLS-1$
							+ MessagesApplication.getString("Application.255"); //$NON-NLS-1$
					if(contador == 1) {
						modificados();
					}
				}
				if(fila == 2) {
					noVisibilidadHistoria();
					sintomas = MessagesApplication.getString("Application.237") //$NON-NLS-1$
							+ MessagesApplication.getString("Application.238") //$NON-NLS-1$
							+ MessagesApplication.getString("Application.239"); //$NON-NLS-1$
					diagnostico = MessagesApplication.getString("Application.240"); //$NON-NLS-1$
					tratamiento = MessagesApplication.getString("Application.241") //$NON-NLS-1$
							+ MessagesApplication.getString("Application.242") //$NON-NLS-1$
							+ MessagesApplication.getString("Application.243") //$NON-NLS-1$
							+ MessagesApplication.getString("Application.244"); //$NON-NLS-1$
					if(contador == 0) {
						modificados();
					}
				}
				if(fila == 3) {
					sintomas = MessagesApplication.getString("Application.245") //$NON-NLS-1$
							+ MessagesApplication.getString("Application.246") //$NON-NLS-1$
							+ MessagesApplication.getString("Application.247") //$NON-NLS-1$
							+ MessagesApplication.getString("Application.248") //$NON-NLS-1$
							+ MessagesApplication.getString("Application.249"); //$NON-NLS-1$
					diagnostico = MessagesApplication.getString("Application.250"); //$NON-NLS-1$
					tratamiento = MessagesApplication.getString("Application.251") //$NON-NLS-1$
							+ MessagesApplication.getString("Application.252") //$NON-NLS-1$
							+ MessagesApplication.getString("Application.253") //$NON-NLS-1$
							+ MessagesApplication.getString("Application.254") //$NON-NLS-1$
							+ MessagesApplication.getString("Application.255"); //$NON-NLS-1$
					if(contador == 1) {
						modificados();
					}
				}
				if(fila == 4) {
					if(getEditar() == false) {
						noVisibilidadHistoria();
					} else if(getEditar() == true) {
						siVisibilidadHistoria();
						btnModificarHistoria.setEnabled(false);
						btnBorrarHistoria.setEnabled(false);
					}
					sintomas = msintomas;
					diagnostico = mdiagnostico;
					tratamiento = mtratamiento;
				}
			}

			txtSintomas.setText(sintomas);
			txtDiagnostico.setText(diagnostico);
			txtTratamiento.setText(tratamiento);
		}
	}

	private class BtnModificarHistoriaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			siVisibilidadHistoria();

		}
	}
	private class BtnCrearHistoriaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			setEditar(true);
			DefaultTableModel tb = (DefaultTableModel) tableHistorias.getModel();
			tb.addRow(new Object[] {"", "", ""}); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			btnModificarHistoria.setEnabled(false);
			btnBorrarHistoria.setEnabled(false);
		}
	}

	private class BtnGuardar2ActionListener implements ActionListener {
		public void valores() {
			nsintomas = txtSintomas.getText();
			ndiagnostico = txtDiagnostico.getText();
			ntratamiento = txtTratamiento.getText();
			noVisibilidadHistoria();
		}
		public void actionPerformed(ActionEvent arg0) {
			int fila = tableHistorias.getSelectedRow();
			if(fila == 0) {
				contador = 0;
				valores();
			}if(fila == 1) {
				contador = 1;
				valores();
			}if(fila == 2) {
				contador = 2;
				valores();
			}if(fila == 3) {
				contador = 3;
				valores();
			}if(fila == 4) {
				msintomas = txtSintomas.getText();
				mdiagnostico = txtDiagnostico.getText();
				mtratamiento = txtTratamiento.getText();
				btnGuardar2.setEnabled(false);
				btnCancelar2.setEnabled(false);
				setEditar(false);
			}
		}
	}

	private class BtnCrearPacienteActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			setModificar(false);
			siVisibilidadPacientes();
			btnCrearPaciente.setEnabled(false);
			btnModificarPaciente.setEnabled(false);
			btnBorrarPaciente.setEnabled(false);
			btnVerDetalles.setEnabled(false);
			layeredPanePacientes.setLayer(pnlModificarPaciente, 2);
		}
	}
	private class TablePacientesMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent arg0) {
			btnModificarPaciente.setEnabled(true);
			btnBorrarPaciente.setEnabled(true);
			btnVerDetalles.setEnabled(true);
		}
	}

	private class BtnCancelar2ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(JOptionPane.showConfirmDialog(rootPane, MessagesApplication.getString("Application.265"), //$NON-NLS-1$
					MessagesApplication.getString("Application.266"), JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) { //$NON-NLS-1$
				tableHistorias.clearSelection();		
				btnModificarHistoria.setEnabled(false);
				btnBorrarHistoria.setEnabled(false);
				txtSintomas.setText(""); //$NON-NLS-1$
				txtSintomas.setEnabled(false);
				txtDiagnostico.setText(""); //$NON-NLS-1$
				txtDiagnostico.setEnabled(false);
				txtTratamiento.setText(""); //$NON-NLS-1$
				txtTratamiento.setEnabled(false);
				btnCancelar2.setEnabled(false);
				btnGuardar2.setEnabled(false);
			}
		}
	}

	public void noVisibilidadPacientes() {
		btnCrearPaciente.setEnabled(false);
		btnModificarPaciente.setEnabled(false);
		btnBorrarPaciente.setEnabled(false);
		btnVerDetalles.setEnabled(false);
		txtPaciente1.setEditable(false);
		ftxtNifnie.setEditable(false);
		txtApellido1.setEditable(false);
		txtApellido2.setEditable(false);
		txtNombre.setEditable(false);
		scrollPaneDomicilio.setEnabled(false);
		taDomicilio.setEditable(false);
		txtCiudad.setEditable(false);
		txtEstado.setEditable(false);
		txtCodigoPostal.setEditable(false);
		ftxtTelfDomicilio.setEditable(false);
		ftxtTelfTrabajo.setEditable(false);
		txtEmail.setEditable(false);
		comboBoxGenero.setEditable(false);
		txtSeguridadSocial.setEditable(false);
		txtLugarNacimiento.setEditable(false);
		dateChooser.setEnabled(false);
		txtEdad.setEditable(false);
		comboBoxMedicos.setEditable(false);
		comboBoxEstadoCivil.setEnabled(false);
		txtNombresPadres.setEditable(false);
		txtProcedencia.setEditable(false);
		txtOcupacion.setEditable(false);
		taObservaciones.setEditable(false);
		btnCambiar.setEnabled(false);
		btnEliminar.setEnabled(false);
		btnCamara.setEnabled(false);
	}

	public void siVisibilidadPacientes() {
		btnCrearPaciente.setEnabled(true);
		btnModificarPaciente.setEnabled(true);
		btnBorrarPaciente.setEnabled(true);
		btnVerDetalles.setEnabled(true);
		txtPaciente1.setEditable(true);
		ftxtNifnie.setEditable(true);
		txtApellido1.setEditable(true);
		txtApellido2.setEditable(true);
		txtNombre.setEditable(true);
		scrollPaneDomicilio.setEnabled(true);
		taDomicilio.setEditable(true);
		txtCiudad.setEditable(true);
		txtEstado.setEditable(true);
		txtCodigoPostal.setEditable(true);
		ftxtTelfDomicilio.setEditable(true);
		ftxtTelfTrabajo.setEditable(true);
		txtEmail.setEditable(true);
		comboBoxGenero.setEditable(true);
		txtSeguridadSocial.setEditable(true);
		txtLugarNacimiento.setEditable(true);
		dateChooser.setEnabled(true);
		txtEdad.setEditable(true);
		comboBoxMedicos.setEditable(true);
		comboBoxEstadoCivil.setEnabled(true);
		txtNombresPadres.setEditable(true);
		txtProcedencia.setEditable(true);
		txtOcupacion.setEditable(true);
		taObservaciones.setEditable(true);
		btnCambiar.setEnabled(true);
		btnEliminar.setEnabled(true);
		btnCamara.setEnabled(true);
	}

	private class BtnModificarPacienteActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int fila = tablePacientes.getSelectedRow();
			DefaultTableModel tb = (DefaultTableModel) tablePacientes.getModel();			
			siVisibilidadPacientes();
			btnCrearPaciente.setEnabled(false);
			btnModificarPaciente.setEnabled(false);
			btnBorrarPaciente.setEnabled(false);
			btnVerDetalles.setEnabled(false);
			txtPaciente1.setText(String.valueOf(tb.getValueAt(fila,0)));
			txtApellido1.setText(String.valueOf(tb.getValueAt(fila,1)));
			txtNombre.setText(String.valueOf(tb.getValueAt(fila,2)));
			taDomicilio.setText(String.valueOf(tb.getValueAt(fila,3)));
			ftxtNifnie.setText(String.valueOf(tb.getValueAt(fila,4)));
			ftxtTelfDomicilio.setText(String.valueOf(tb.getValueAt(fila,5)));
			layeredPanePacientes.setLayer(pnlModificarPaciente, 2);
			setModificar(true);
		}
	}
	public void limpiarAlGuardar() {
		txtPaciente1.setText(""); //$NON-NLS-1$
		txtApellido1.setText(""); //$NON-NLS-1$
		txtNombre.setText(""); //$NON-NLS-1$
		taDomicilio.setText(""); //$NON-NLS-1$
		ftxtNifnie.setText(""); //$NON-NLS-1$
		ftxtTelfDomicilio.setText(""); //$NON-NLS-1$
	}
	private class BtnGuardar3ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			DefaultTableModel tb = (DefaultTableModel) tablePacientes.getModel();
			if(getModificar() == false) {
				tb.addRow(new Object[] {txtPaciente1.getText(), txtApellido1.getText(), txtNombre.getText(), taDomicilio.getText(), ftxtNifnie.getText(), ftxtTelfDomicilio.getText()});		
			}
			else if(getModificar() == true) {
				int fila = tablePacientes.getSelectedRow();
				tb.setValueAt((String)txtPaciente1.getText(), fila, 0);
				tb.setValueAt(txtApellido1.getText(), fila, 1);
				tb.setValueAt(txtNombre.getText(), fila, 2);
				tb.setValueAt(taDomicilio.getText(), fila, 3);
				tb.setValueAt(ftxtNifnie.getText(), fila, 4);
				tb.setValueAt(ftxtTelfDomicilio.getText(), fila, 5);
			}
			layeredPanePacientes.setLayer(pnlModificarPaciente, 0);
			siVisibilidadPacientes();
			limpiarAlGuardar();
		}
	}

	private class BtnCancelar3ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(btnCancelar3.getText() == MessagesApplication.getString("Application.287")) { //$NON-NLS-1$
				layeredPanePacientes.setLayer(pnlModificarPaciente, 0);
				siVisibilidadPacientes();
				limpiarAlGuardar();
				btnCancelar3.setText(MessagesApplication.getString("Application.277")); //$NON-NLS-1$
				btnCancelar3.setIcon(new ImageIcon(Application.class.getResource("/presentacion/Icons/cancel_24.png"))); //$NON-NLS-1$
				btnGuardar3.setVisible(true);
			}
			else if(JOptionPane.showConfirmDialog(rootPane, MessagesApplication.getString("Application.279"), //$NON-NLS-1$
					MessagesApplication.getString("Application.280"), JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) { //$NON-NLS-1$
				layeredPanePacientes.setLayer(pnlModificarPaciente, 0);
				siVisibilidadPacientes();
				limpiarAlGuardar();
			}			
		}
	}

	private class BtnCancelarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(JOptionPane.showConfirmDialog(rootPane, MessagesApplication.getString("Application.281"), //$NON-NLS-1$
					MessagesApplication.getString("Application.282"), JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION); //$NON-NLS-1$
			agendaNoVisibilidad();
			limpiarAgenda();
		}
	}

	public boolean getModificar() {
		return modificar;
	}

	public boolean setModificar(boolean modificar) {
		this.modificar = modificar;
		return modificar;
	}

	private class BtnCancelar4ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			layeredPaneMedicos.setLayer(pnlVerDetalles, 0);
		}
	}
	private class BtnDescartarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(JOptionPane.showConfirmDialog(rootPane, MessagesApplication.getString("Application.283"), //$NON-NLS-1$
					MessagesApplication.getString("Application.284"), JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) { //$NON-NLS-1$
				layeredPaneMedicos.setLayer(pnlContactar, 0);
			}
		}
	}
	private class BtnEnviarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			lblPath.setVisible(false);
			layeredPaneMedicos.setLayer(pnlContactar, 0);
			JOptionPane.showMessageDialog(null, MessagesApplication.getString("Application.285"), "", JOptionPane.INFORMATION_MESSAGE); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}
	private class BtnVerDetallesActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			int fila = tablePacientes.getSelectedRow();
			DefaultTableModel tb = (DefaultTableModel) tablePacientes.getModel();			
			siVisibilidadPacientes();
			txtPaciente1.setText(String.valueOf(tb.getValueAt(fila,0)));
			txtApellido1.setText(String.valueOf(tb.getValueAt(fila,1)));
			txtNombre.setText(String.valueOf(tb.getValueAt(fila,2)));
			taDomicilio.setText(String.valueOf(tb.getValueAt(fila,3)));
			ftxtNifnie.setText(String.valueOf(tb.getValueAt(fila,4)));
			ftxtTelfDomicilio.setText(String.valueOf(tb.getValueAt(fila,5)));
			noVisibilidadPacientes();
			layeredPanePacientes.setLayer(pnlModificarPaciente, 2);
			setModificar(true);
			btnGuardar3.setVisible(false);
			btnCancelar3.setText(MessagesApplication.getString("Application.287")); //$NON-NLS-1$
			btnCancelar3.setIcon(new ImageIcon(Application.class.getResource("/presentacion/Icons/back_24.png"))); //$NON-NLS-1$
		}
	}
	public void agendaSiVisibilidad(){
		txtAsunto.setEnabled(true);
		dateChooserAgenda.setEnabled(true);
		txtHoraDeInicio.setEnabled(true);
		txtHoraDeFin.setEnabled(true);
		taDescripcion.setEnabled(true);
		txtMiPaciente.setEnabled(true);
		btnGuardar.setVisible(true);
		btnCancelar.setVisible(true);
	}
	public void agendaNoVisibilidad(){
		txtAsunto.setEnabled(false);
		dateChooserAgenda.setEnabled(false);
		txtHoraDeInicio.setEnabled(false);
		txtHoraDeFin.setEnabled(false);
		taDescripcion.setEnabled(false);
		btnGuardar.setVisible(false);
		btnCancelar.setVisible(false);
		txtMiPaciente.setEnabled(false);
	}
	public void limpiarAgenda(){
		txtAsunto.setText(""); //$NON-NLS-1$
		dateChooserAgenda.setDate(null);
		txtHoraDeInicio.setText(""); //$NON-NLS-1$
		txtHoraDeFin.setText(""); //$NON-NLS-1$
		taDescripcion.setText(""); //$NON-NLS-1$
		txtMiPaciente.setText(""); //$NON-NLS-1$
		btnGuardar.setVisible(false);
		btnCancelar.setVisible(false);
	}
	public boolean getCita() {
		return cita;
	}

	public boolean setCita(boolean cita) {
		this.cita = cita;
		return cita;
	}
	private class BtnCrearCitaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			agendaSiVisibilidad();
			btnBorrarCita.setEnabled(false);
			setCita(false);
			Calendar c = new GregorianCalendar();
			dateChooserAgenda.setCalendar(c);
		}
	}
	private class BtnGuardarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			String dia = null, mes = null, year = null, fecha = null;
			DefaultTableModel tb = (DefaultTableModel) tableAgenda.getModel();
			try{
				
				dia = Integer.toString(dateChooserAgenda.getCalendar().get(Calendar.DAY_OF_MONTH));
				mes = Integer.toString(dateChooserAgenda.getCalendar().get(Calendar.MONTH) + 1);
				year = Integer.toString(dateChooserAgenda.getCalendar().get(Calendar.YEAR));
				fecha = (dia + "/" + mes + "/" + year); //$NON-NLS-1$ //$NON-NLS-2$
			}catch(java.lang.NullPointerException e){
			}
			if(getCita() == false){
				tb.addRow(new Object[] {fecha, txtHoraDeInicio.getText(), txtHoraDeFin.getText(), txtMiPaciente.getText()});
			}else if(getCita() == true){
				int fila = tableAgenda.getSelectedRow();
				tb.setValueAt(fecha, fila, 0);
				tb.setValueAt(txtHoraDeInicio.getText(), fila, 1);
				tb.setValueAt(txtHoraDeFin.getText(), fila, 2);
				tb.setValueAt(txtMiPaciente.getText(), fila, 3);
				
			}
			limpiarAgenda();
			agendaNoVisibilidad();
		}
	}
	private class BtnModificarCitaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			agendaSiVisibilidad();
			btnBorrarCita.setEnabled(false);
			int fila = tableAgenda.getSelectedRow();
			DefaultTableModel tb = (DefaultTableModel) tableAgenda.getModel();
			Calendar c = new GregorianCalendar();
			dateChooserAgenda.setCalendar(c);
			txtHoraDeInicio.setText(String.valueOf(tb.getValueAt(fila,1)));
			txtHoraDeFin.setText(String.valueOf(tb.getValueAt(fila,2)));
			txtMiPaciente.setText(String.valueOf(tb.getValueAt(fila,3)));
			setCita(true);
		}
	}

	private class TableAgendaMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			btnModificarCita.setEnabled(true);
			btnBorrarCita.setEnabled(true);
			agendaNoVisibilidad();
			limpiarAgenda();
		}
	}
	private class BtnBorrarCitaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			DefaultTableModel delete = (DefaultTableModel) tableAgenda.getModel();
			delete.removeRow(tableAgenda.getSelectedRow());
			btnModificarCita.setEnabled(false);
			btnBorrarCita.setEnabled(false);
			agendaNoVisibilidad();
			limpiarAgenda();
		}
	}
	private class BtnAcercaDeActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, MessagesApplication.getString("Application.17") //$NON-NLS-1$
					+ "Luis Miguel Ortiz Rozalén\n" //$NON-NLS-1$
					+ "Lydia Prado Ibáñez", MessagesApplication.getString("Application.24"), JOptionPane.INFORMATION_MESSAGE); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}
	private class BtnAdjuntarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JFileChooser fcAbrir = new JFileChooser();
			int valorDevuelto = fcAbrir.showOpenDialog(pnlContactar);
			if (valorDevuelto == JFileChooser.APPROVE_OPTION) {
				File file = fcAbrir.getSelectedFile();
				String path = file.getName();
				lblPath.setFont(font);
				lblPath.setText(MessagesApplication.getString("Application.label.text") + path);
				lblPath.setVisible(true);
			}
		}
	}
	private class BtnAyudaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			new VentanaAyuda().setVisible(true);
		}
	}
}
