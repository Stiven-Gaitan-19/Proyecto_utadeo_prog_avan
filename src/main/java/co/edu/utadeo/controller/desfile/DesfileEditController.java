package co.edu.utadeo.controller.desfile;

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
import javax.swing.JTextArea;

public class DesfileEditController extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Create the frame.
	 */
	public DesfileEditController() {
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
	    
		JLabel lblNewLabel = new JLabel("Editar-Crear Desfile");
		lblNewLabel.setBounds(194, 11, 230, 37);
		lblNewLabel.setFont(new Font("Roboto Medium", Font.PLAIN, 18));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Codigo");
		lblNewLabel_1.setBounds(116, 66, 65, 14);
		lblNewLabel_1.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnNewButton.setBounds(128, 369, 90, 30);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnNewButton_1.setBounds(354, 369, 89, 30);
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(252, 59, 200, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(252, 100, 200, 30);
		contentPane.add(dateChooser);
		
		JLabel lblNewLabel_2 = new JLabel("Fecha");
		lblNewLabel_2.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(116, 105, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Evento");
		lblNewLabel_2_1.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(116, 148, 46, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Dise\u00F1ador");
		lblNewLabel_2_2.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_2_2.setBounds(116, 189, 80, 14);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Pabellon");
		lblNewLabel_2_3.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_2_3.setBounds(116, 227, 80, 14);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Artista");
		lblNewLabel_2_4.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_2_4.setBounds(116, 268, 46, 14);
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("Coleccion");
		lblNewLabel_2_5.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		lblNewLabel_2_5.setBounds(116, 309, 65, 14);
		contentPane.add(lblNewLabel_2_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(252, 141, 202, 30);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(252, 182, 202, 30);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(252, 220, 202, 30);
		contentPane.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(252, 261, 202, 30);
		contentPane.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(252, 302, 202, 30);
		contentPane.add(comboBox_4);
	}
}
