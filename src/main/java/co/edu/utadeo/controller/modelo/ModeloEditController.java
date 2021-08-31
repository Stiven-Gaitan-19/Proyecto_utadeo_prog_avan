package co.edu.utadeo.controller.modelo;

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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ModeloEditController extends JFrame {

	private JPanel contentPane;
	private JTextField txtPasaporte;
	private JTextField txtNombre;
	private JTextField txtParticularidades;
	private JTextField txtPaga;

	/**
	 * Create the frame.
	 */
	public ModeloEditController() {
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
	    
		JLabel lblNewLabel = new JLabel("Editar-Crear Modelo");
		lblNewLabel.setBounds(200, 11, 178, 37);
		lblNewLabel.setFont(new Font("Roboto Medium", Font.PLAIN, 18));
		contentPane.add(lblNewLabel);
		
		txtPasaporte = new JTextField();
		txtPasaporte.setBounds(242, 75, 200, 30);
		contentPane.add(txtPasaporte);
		txtPasaporte.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Pasaporte:");
		lblNewLabel_1.setBounds(99, 82, 106, 19);
		lblNewLabel_1.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_1);
		
		JDateChooser dateNacimiento = new JDateChooser();
		dateNacimiento.setBounds(242, 157, 200, 30);
		contentPane.add(dateNacimiento);
		
		JLabel lblNewLabel_2 = new JLabel("Fecha Nacimiento:");
		lblNewLabel_2.setBounds(99, 168, 118, 14);
		lblNewLabel_2.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("Particularidades:");
		lblNewLabel_4.setBounds(99, 204, 106, 14);
		lblNewLabel_4.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_4);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(242, 116, 200, 30);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Nombre:");
		lblNewLabel_3.setBounds(99, 123, 57, 14);
		lblNewLabel_3.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Paga:");
		lblNewLabel_5.setBounds(99, 243, 57, 28);
		lblNewLabel_5.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_5);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Modelo agregada");
			}
		});
		btnGuardar.setBounds(127, 389, 90, 30);
		contentPane.add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 JFrame frame = new ModeloController();
	                frame.setSize(582,490);
	                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	                frame.setLocationRelativeTo(null);
	                frame.setVisible(true);
	                close();
			}
		});
		btnCancelar.setBounds(353, 389, 89, 30);
		contentPane.add(btnCancelar);
		
		txtParticularidades = new JTextField();
		txtParticularidades.setBounds(242, 198, 200, 30);
		contentPane.add(txtParticularidades);
		txtParticularidades.setColumns(10);
		
		txtPaga = new JTextField();
		txtPaga.setColumns(10);
		txtPaga.setBounds(242, 244, 200, 30);
		contentPane.add(txtPaga);
		
		JLabel lblNewLabel_6 = new JLabel("Agencia:");
		lblNewLabel_6.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(99, 330, 90, 24);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Pais:");
		lblNewLabel_7.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(99, 291, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		JComboBox CbxAgencia = new JComboBox();
		CbxAgencia.setBounds(242, 329, 200, 30);
		contentPane.add(CbxAgencia);
		
		JComboBox CbxPais = new JComboBox();
		CbxPais.setBounds(242, 285, 200, 30);
		contentPane.add(CbxPais);
	}
	private void close() {
		this.dispose();
	}
}
