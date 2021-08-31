package co.edu.utadeo.controller.pabellon;

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

import com.toedter.components.JSpinField;
import javax.swing.JSlider;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class PabellonEditController extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtTelefono;

	/**
	 * Create the frame.
	 */
	public PabellonEditController() {
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
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Empleado");
		mntmNewMenuItem.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItem);
		
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
	    
		JLabel lblNewLabel = new JLabel("Editar-Crear Pabellon");
		lblNewLabel.setBounds(200, 11, 178, 37);
		lblNewLabel.setFont(new Font("Roboto Medium", Font.PLAIN, 18));
		contentPane.add(lblNewLabel);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(242, 75, 200, 30);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Telefono:");
		lblNewLabel_2.setBounds(99, 122, 106, 14);
		lblNewLabel_2.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("Empleado directivo ");
		lblNewLabel_4.setBounds(79, 154, 139, 29);
		lblNewLabel_4.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_4);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(242, 116, 200, 30);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Nombre:");
		lblNewLabel_3.setBounds(103, 83, 57, 14);
		lblNewLabel_3.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Carnet:");
		lblNewLabel_5.setBounds(127, 183, 74, 14);
		lblNewLabel_5.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_5);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(127, 389, 90, 30);
		contentPane.add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(353, 389, 89, 30);
		contentPane.add(btnCancelar);
		
		JLabel lblNewLabel_6 = new JLabel("Empleado raso");
		lblNewLabel_6.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(88, 220, 117, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Carnet:");
		lblNewLabel_7.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(130, 239, 63, 14);
		contentPane.add(lblNewLabel_7);
		
		JComboBox CbxEmpleadoRaso = new JComboBox();
		CbxEmpleadoRaso.setBounds(242, 220, 200, 30);
		contentPane.add(CbxEmpleadoRaso);
		
		JComboBox CbxEmpleadoDirectivo = new JComboBox();
		CbxEmpleadoDirectivo.setBounds(242, 167, 200, 30);
		contentPane.add(CbxEmpleadoDirectivo);
	}
}
