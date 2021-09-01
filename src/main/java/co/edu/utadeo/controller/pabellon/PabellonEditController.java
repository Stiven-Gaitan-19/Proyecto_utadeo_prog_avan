package co.edu.utadeo.controller.pabellon;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JTextField;

import co.edu.utadeo.controller.agencia.AgenciaController;
import co.edu.utadeo.controller.aparicion.AparicionController;
import co.edu.utadeo.controller.artista.ArtistaController;
import co.edu.utadeo.controller.caracteristica.CaracteristicaController;
import co.edu.utadeo.controller.coleccion.ColeccionController;
import co.edu.utadeo.controller.desfile.DesfileController;
import co.edu.utadeo.controller.disenador.DisenadorController;
import co.edu.utadeo.controller.empleadodirectivo.EmpleadoDirectivoController;
import co.edu.utadeo.controller.empleadoraso.EmpleadoRasoController;
import co.edu.utadeo.controller.evento.EventoController;
import co.edu.utadeo.controller.foto.FotoController;
import co.edu.utadeo.controller.genero.GeneroController;
import co.edu.utadeo.controller.modelo.ModeloController;
import co.edu.utadeo.controller.pais.PaisController;
import co.edu.utadeo.controller.portafolio.PortafolioController;
import co.edu.utadeo.domain.Empleado;
import co.edu.utadeo.domain.EmpleadoDirectivo;
import co.edu.utadeo.domain.EmpleadoRaso;
import co.edu.utadeo.domain.Pabellon;
import co.edu.utadeo.model.EmpleadoDirectivoDAO;
import co.edu.utadeo.model.EmpleadoRasoDAO;
import co.edu.utadeo.model.PabellonDAO;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;


import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PabellonEditController extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtTelefono;
	private JComboBox cbEmpleadoRaso;
	private JComboBox cbEmpleadoDirectivo;
	private PabellonDAO pabellonDAO;
	private EmpleadoRasoDAO empleadoRasoDAO;
	private EmpleadoDirectivoDAO empleadoDirectivoDAO;
	private List<EmpleadoDirectivo> empleadosDirec;
	private List<EmpleadoRaso> empleadosRaso;

	/**
	 * Create the frame.
	 */
	public PabellonEditController() {

		pabellonDAO = new PabellonDAO();
		empleadoDirectivoDAO = new EmpleadoDirectivoDAO();
		empleadoRasoDAO = new EmpleadoRasoDAO();

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
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFrame frame = new AgenciaController();
				frame.setSize(582,490);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				frame.setResizable(false);
				close();
			}
		});
		mntmNewMenuItem_4.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItem_4);

		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Aparicion\r\n");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new AparicionController();

				frame.setSize(582,490);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				frame.setResizable(false);
				close();
			}
		});
		mntmNewMenuItem_5.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItem_5);

		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Artista");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFrame frame = new ArtistaController();
				frame.setSize(582,490);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				frame.setResizable(false);
				close();
			}
		});
		mntmNewMenuItem_6.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItem_6);

		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Caracteristica");
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFrame frame = new CaracteristicaController();
				frame.setSize(582,490);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				frame.setResizable(false);
				close();
			}
		});
		mntmNewMenuItem_7.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItem_7);

		JMenuItem mntmNewMenuItem_8 = new JMenuItem("Coleccion");
		mntmNewMenuItem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFrame frame = new ColeccionController();
				frame.setSize(582,490);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				frame.setResizable(false);
				close();
			}
		});
		mntmNewMenuItem_8.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItem_8);

		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Desfile");
		mntmNewMenuItem_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFrame frame = new DesfileController();
				frame.setSize(582,490);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				frame.setResizable(false);
				close();
			}
		});
		mntmNewMenuItem_9.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItem_9);

		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Dise\u00F1ador");
		mntmNewMenuItem_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				JFrame frame = new DisenadorController();
				frame.setSize(582,490);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				frame.setResizable(false);
				close();
			}
		});
		mntmNewMenuItem_10.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItem_10);

		JMenuItem mntmNewMenuItemEmpDirec = new JMenuItem("Empleado Directivo");
		mntmNewMenuItemEmpDirec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFrame frame = new EmpleadoDirectivoController();
				frame.setSize(582,490);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				frame.setResizable(false);
				close();
			}
		});
		mntmNewMenuItemEmpDirec.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItemEmpDirec);

		JMenuItem mntmNewMenuItemEmpRaso = new JMenuItem("Empleado Raso");
		mntmNewMenuItemEmpRaso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFrame frame = new EmpleadoRasoController();
				frame.setSize(582,490);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				frame.setResizable(false);
				close();
			}
		});
		mntmNewMenuItemEmpRaso.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItemEmpRaso);

		JMenuItem mntmNewMenuItem_11 = new JMenuItem("Evento");
		mntmNewMenuItem_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new EventoController();
				frame.setSize(582,490);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				frame.setResizable(false);
				close();
			}
		});
		mntmNewMenuItem_11.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItem_11);

		JMenuItem mntmNewMenuItem_12 = new JMenuItem("Foto");
		mntmNewMenuItem_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new FotoController();

				frame.setSize(582,490);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				frame.setResizable(false);
				close();
			}
		});
		mntmNewMenuItem_12.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItem_12);

		JMenuItem mntmNewMenuItem_13 = new JMenuItem("GeneroMusical");
		mntmNewMenuItem_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFrame frame = new GeneroController();
				frame.setSize(582,490);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				frame.setResizable(false);
				close();
			}
		});
		mntmNewMenuItem_13.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItem_13);

		JMenuItem mntmNewMenuItem_14 = new JMenuItem("Modelo");
		mntmNewMenuItem_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFrame frame = new ModeloController();
				frame.setSize(582,490);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				frame.setResizable(false);
				close();
			}
		});
		mntmNewMenuItem_14.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItem_14);


		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Pabellon");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFrame frame = new PabellonController();
				frame.setSize(582,490);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				frame.setResizable(false);
				close();
			}
		});
		mntmNewMenuItem_1.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItem_1);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Pais");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFrame frame = new PaisController();
				frame.setSize(582,490);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				frame.setResizable(false);
				close();
			}
		});
		mntmNewMenuItem_2.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItem_2);

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Portafolio");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new PortafolioController();
				frame.setSize(582,490);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				frame.setResizable(false);
				close();
			}
		});
		mntmNewMenuItem_3.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		mnNewMenu.add(mntmNewMenuItem_3);
		getContentPane().setLayout(null);
	    
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
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				savePabellon();
			}
		});
		btnGuardar.setBounds(127, 389, 90, 30);
		contentPane.add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new PabellonController();
                frame.setSize(582,490);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                close();
			}
		});
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

		empleadosRaso = empleadoRasoDAO.findAll();

		cbEmpleadoRaso = new JComboBox(prepareDataCBox(empleadosRaso).toArray());
		cbEmpleadoRaso.setBounds(242, 220, 200, 30);
		contentPane.add(cbEmpleadoRaso);

		empleadosDirec = empleadoDirectivoDAO.findAll();
		cbEmpleadoDirectivo = new JComboBox(prepareDataCBox(empleadosDirec).toArray());
		cbEmpleadoDirectivo.setBounds(242, 167, 200, 30);
		contentPane.add(cbEmpleadoDirectivo);
	}
	private void close() {
		this.dispose();
	}

	private void savePabellon(){
		Pabellon pabellon = new Pabellon();
		pabellon.setNombre(txtNombre.getText().trim());
		pabellon.setTelefono(txtTelefono.getText().trim());
		if(cbEmpleadoRaso.getSelectedItem() != ""){
			pabellon.setEmpleadoRaso((EmpleadoRaso) findEmpleado(empleadosRaso,(Integer) cbEmpleadoRaso.getSelectedItem()));
		}

		if(cbEmpleadoDirectivo.getSelectedItem() != ""){
			pabellon.setEmpleadoDirectivo((EmpleadoDirectivo) findEmpleado(empleadosDirec,(Integer) cbEmpleadoDirectivo.getSelectedItem()));
		}

		pabellonDAO.create(pabellon);
	}

	private Empleado findEmpleado(List<? extends Empleado> empleados, Integer carnet){
		Optional<? extends Empleado> empleado = empleados.stream().filter(employee -> employee.getCarnet() == carnet).findFirst();
		if(empleado.isPresent()){
			return  empleado.get();
		}
		return null;
	}

	private List<Object> prepareDataCBox(List<? extends Empleado> empleados){
		List<Object> empleadosCBox = new ArrayList<>();
		empleadosCBox.add("");
		for (Empleado empleado : empleados){
			empleadosCBox.add(empleado.getCarnet());
		}
		return empleadosCBox;
	}
}
