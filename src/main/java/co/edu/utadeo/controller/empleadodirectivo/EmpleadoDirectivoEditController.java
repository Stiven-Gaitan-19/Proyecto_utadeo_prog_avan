package co.edu.utadeo.controller.empleadodirectivo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JCheckBoxMenuItem;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JDateChooser;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import com.toedter.components.JSpinField;
import javax.swing.JSlider;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmpleadoDirectivoEditController extends JFrame {

	private JPanel contentPane;
	private JTextField txtTelefono;
	private JTextField txtUniversidad;
	private JTextField txtCarnet;
	private JTextField txtNombre;
	private JTextField txtPaga;

	/**
	 * Create the frame.
	 */
	public EmpleadoDirectivoEditController() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setEnabled(false);
		menuBar.setBackground(SystemColor.control);
		setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("Men\u00FA");
		mnNewMenu.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		mnNewMenu.setForeground(Color.BLACK);
		mnNewMenu.setBackground(Color.LIGHT_GRAY);
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Agencia");
		mntmNewMenuItem_4.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItem_4);

		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Aparicion\r\n");
		mntmNewMenuItem_5.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItem_5);

		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Artista");
		mntmNewMenuItem_6.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItem_6);

		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Caracteristica");
		mntmNewMenuItem_7.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItem_7);

		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Coleccion");
		mntmNewMenuItem_8.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItem_8);

		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Desfile");
		mntmNewMenuItem_9.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItem_9);

		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Dise\u00F1ador");
		mntmNewMenuItem_10.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItem_10);

		JMenuItem mntmNewMenuItemEmpDirec = new JMenuItem("Empleado Directivo");
		mntmNewMenuItemEmpDirec.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItemEmpDirec);

		JMenuItem mntmNewMenuItemEmpRaso = new JMenuItem("Empleado Raso");
		mntmNewMenuItemEmpRaso.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItemEmpRaso);

		JMenuItem mntmNewMenuItem_11 = new JMenuItem("Evento");
		mntmNewMenuItem_11.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItem_11);

		JMenuItem mntmNewMenuItem_12 = new JMenuItem("Foto");
		mntmNewMenuItem_12.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItem_12);

		JMenuItem mntmNewMenuItem_13 = new JMenuItem("GeneroMusical");
		mntmNewMenuItem_13.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItem_13);

		JMenuItem mntmNewMenuItem_14 = new JMenuItem("Modelo");
		mntmNewMenuItem_14.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItem_14);


		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Pabellon");
		mntmNewMenuItem_1.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItem_1);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Pais");
		mntmNewMenuItem_2.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItem_2);

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Portafolio");
		mntmNewMenuItem_3.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItem_3);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Editar-Crear Empleado Directivo");
		lblNewLabel.setBounds(164, 11, 272, 37);
		lblNewLabel.setFont(new Font("Roboto Medium", Font.PLAIN, 18));
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Carne");
		lblNewLabel_1.setBounds(117, 93, 65, 14);
		lblNewLabel_1.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_1);

		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Empleado agregado");
			}
		});
		btnGuardar.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnGuardar.setBounds(125, 374, 90, 30);
		contentPane.add(btnGuardar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new EmpleadoDirectivoController();
				frame.setSize(582,490);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				close();
			}
		});
		btnCancelar.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnCancelar.setBounds(350, 374, 89, 30);
		contentPane.add(btnCancelar);

		txtTelefono = new JTextField();
		txtTelefono.setBounds(250, 239, 200, 30);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);

		JLabel lblNewLabel_1_1 = new JLabel("Universidad");
		lblNewLabel_1_1.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(117, 297, 76, 14);
		contentPane.add(lblNewLabel_1_1);

		txtUniversidad = new JTextField();
		txtUniversidad.setColumns(10);
		txtUniversidad.setBounds(250, 290, 200, 30);
		contentPane.add(txtUniversidad);

		JLabel lblNewLabel_1_2 = new JLabel("Nombre");
		lblNewLabel_1_2.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(117, 146, 65, 14);
		contentPane.add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_3 = new JLabel("Telefono");
		lblNewLabel_1_3.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_1_3.setBounds(117, 246, 65, 14);
		contentPane.add(lblNewLabel_1_3);

		txtCarnet = new JTextField();
		txtCarnet.setColumns(10);
		txtCarnet.setBounds(250, 86, 200, 30);
		contentPane.add(txtCarnet);

		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(250, 139, 200, 30);
		contentPane.add(txtNombre);

		txtPaga = new JTextField();
		txtPaga.setColumns(10);
		txtPaga.setBounds(250, 189, 200, 30);
		contentPane.add(txtPaga);

		JLabel lblNewLabel_1_2_1 = new JLabel("Paga");
		lblNewLabel_1_2_1.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_1_2_1.setBounds(117, 197, 65, 14);
		contentPane.add(lblNewLabel_1_2_1);
	}

	private void close() {
		this.dispose();
	}
}
