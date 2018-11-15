package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;

@SuppressWarnings("serial")
public class VentanaAyuda extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JTextArea taAyuda;
	private Font font = new Font("Segoe UI", Font.PLAIN, 13); //$NON-NLS-1$

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaAyuda frame = new VentanaAyuda();
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
	public VentanaAyuda() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaAyuda.class.getResource("/presentacion/Icons/bicon.png"))); //$NON-NLS-1$
		setTitle(MessagesAyuda.getString("Ayuda"));
		setBounds(100, 100, 580, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		panel.add(scrollPane);
		
		taAyuda = new JTextArea();
		taAyuda.setWrapStyleWord(true);
		taAyuda.setLineWrap(true);
		taAyuda.setEditable(false);
		taAyuda.setText("La aplicación del Consultorio Briarcliff consta de dos partes:\n" //$NON-NLS-1$
				+ "\n- BARRA DE HERRAMIENTAS -\n" //$NON-NLS-1$
				+ "\nComo se trata de un prototipo, los menús de 'Editar' y 'Configuración' no son funcionales," //$NON-NLS-1$
				+ "sin embargo, en el panel de 'Ayuda' encontramos dos botones:\n" //$NON-NLS-1$
				+ "\n- Acerca de...: muestra el nombre de los desarrolladores de la aplicación.\n" //$NON-NLS-1$
				+ "- Ayuda: muestra ayuda en caso de que el usuario la necesite.\n" //$NON-NLS-1$
				+ "\nEl panel 'Sesion' dispone de un botón de 'Cerrar sesión' para que el usuario pueda salir de la aplicación" //$NON-NLS-1$
				+ "y cambiar de usuario en el momento que desee. Los 'Datos de inicio de sesión' muestran información del" //$NON-NLS-1$
				+ "usuario que ha iniciado sesión en ese momento: foto, usuario y fecha de último acceso.\n" //$NON-NLS-1$
				+ "\n- PANEL DE GESTIONES -\n" //$NON-NLS-1$
				+ "\nConsta de un panel con varias pestañas, que van a permitir acceder a diferentes gestores.\n" //$NON-NLS-1$
				+ "La pestaña de 'Agenda' dispone de varios botones:\n" //$NON-NLS-1$
				+ "\n- Crear cita: debe escribir la información en la parte izquierda del panel, y al pulsar 'Guardar' su cita" //$NON-NLS-1$
				+ "quedará registrada en la tabla." //$NON-NLS-1$
				+ "\n- Modificar cita: debe haber seleccionado previamente una fila de la tabla de la derecha, y a continuación," //$NON-NLS-1$
				+ "podrá modificar los datos en el formulario." //$NON-NLS-1$
				+ "\n- Borrar cita: debe haber seleccionado previamente una fila de la tabla de la derecha, la cual desaparecerá" //$NON-NLS-1$
				+ "tras haberla borrado.\n" //$NON-NLS-1$
				+ "\nEn la pestaña de 'Historias':\n" //$NON-NLS-1$
				+ "\n- 'Crear historia': creará una fila nueva en la tabla de la izquierda, y podrá detallar la historia en las cajas" //$NON-NLS-1$
				+ "de texto que se encuentran en 'Detalles de la Historia'." //$NON-NLS-1$
				+ "\n- 'Modificar historia': debe seleccionar previamente alguna fila de la tabla. Después se habilitarán las cajas de " //$NON-NLS-1$
				+ "texto de 'Detalles de la Historia' y tendrá la posibilidad de modificar los datos. A continuación pulse 'Guardar' para" //$NON-NLS-1$
				+ "salvar los cambios." //$NON-NLS-1$
				+ "\n- 'Borrar historia: debe haber seleccionado previamente una fila de la tabla de la izquierda, la cual desaparecerá" //$NON-NLS-1$
				+ "tras haberla borrado.\n" //$NON-NLS-1$
				+ "\nLa pestaña de 'Pacientes' también dispone de varios botones:\n" //$NON-NLS-1$
				+ "\n- Crear paciente: se abrirá un formulario donde debe escribir la información, y al pulsar 'Guardar', su paciente" //$NON-NLS-1$
				+ "quedará registrado en la tabla." //$NON-NLS-1$
				+ "\n- Modificar paciente: debe haber seleccionado previamente una fila de la tabla, y a continuación," //$NON-NLS-1$
				+ "podrá modificar los datos en el formulario. Pulsar 'Guardar' para salvar cambios." //$NON-NLS-1$
				+ "\n- Borrar paciente: debe haber seleccionado previamente una fila de la tabla, la cual desaparecerá" //$NON-NLS-1$
				+ "tras haberlo borrado." //$NON-NLS-1$
				+ "\n- Ver detalles: debe haber seleccionado previamente una fila de la tabla de la derecha, y a continuación," //$NON-NLS-1$
				+ "podrá ver los datos en el formulario.\n" //$NON-NLS-1$
				+ "\nEn la pestaña de 'Médicos':\n" //$NON-NLS-1$
				+ "\n- 'Contactar': mostrará dos cajas de texto donde podrá introducir un 'Asunto' y un 'Mensaje'. Además tiene la posibilidad" //$NON-NLS-1$
				+ "de adjuntar algun archivo pulsando 'Adjuntar'. Cuando haya terminado pulse 'Enviar'." //$NON-NLS-1$
				+ "\n- 'Ver detalles': se mostrarán en un formulario los datos del especialista seleccionado.\n"); //$NON-NLS-1$
		taAyuda.setFont(font);
		taAyuda.setCaretPosition(0);
		scrollPane.setViewportView(taAyuda);
	}

}
