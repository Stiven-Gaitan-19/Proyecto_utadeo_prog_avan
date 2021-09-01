package co.edu.utadeo.controller.artista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.transaction.Transactional.TxType;
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

import co.edu.utadeo.controller.agencia.AgenciaController;
import co.edu.utadeo.controller.aparicion.AparicionController;
import co.edu.utadeo.controller.caracteristica.CaracteristicaController;
import co.edu.utadeo.controller.coleccion.ColeccionController;
import co.edu.utadeo.controller.desfile.DesfileController;
import co.edu.utadeo.controller.disenador.DisenadorController;
import co.edu.utadeo.controller.disenador.DisenadorEditController;
import co.edu.utadeo.controller.empleadodirectivo.EmpleadoDirectivoController;
import co.edu.utadeo.controller.empleadoraso.EmpleadoRasoController;
import co.edu.utadeo.controller.evento.EventoController;
import co.edu.utadeo.controller.foto.FotoController;
import co.edu.utadeo.controller.genero.GeneroController;
import co.edu.utadeo.controller.modelo.ModeloController;
import co.edu.utadeo.controller.pabellon.PabellonController;
import co.edu.utadeo.controller.pais.PaisController;
import co.edu.utadeo.controller.portafolio.PortafolioController;
import co.edu.utadeo.model.ArtistaDAO;
import co.edu.utadeo.model.GeneroMusicalDAO;
import co.edu.utadeo.domain.Artista;
import co.edu.utadeo.domain.EmpleadoDirectivo;
import co.edu.utadeo.domain.GeneroMusical;

import javax.swing.JSlider;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ArtistaEditController extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JComboBox comboGeneroMusical;
	private ArtistaDAO artistaDAO;
	private GeneroMusicalDAO generoMusicalDAO;
	private List<GeneroMusical> generoMusical;
	/**
	 * Create the frame.
	 */
	public ArtistaEditController() {
		generoMusicalDAO = new GeneroMusicalDAO();
		artistaDAO = new ArtistaDAO();
		
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
		contentPane.setLayout(null);
	    
		JLabel lblNewLabel = new JLabel("Editar-Crear Artistas");
		lblNewLabel.setBounds(209, 11, 200, 37);
		lblNewLabel.setFont(new Font("Roboto Medium", Font.PLAIN, 18));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Codigo");
		lblNewLabel_1.setBounds(110, 104, 65, 23);
		lblNewLabel_1.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Genero Musical");
		lblNewLabel_2.setBounds(107, 253, 106, 14);
		lblNewLabel_2.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nombre");
		lblNewLabel_3.setBounds(110, 177, 57, 14);
		lblNewLabel_3.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_3);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveArtista();
				
			}
		});
		btnGuardar.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnGuardar.setBounds(123, 325, 90, 30);
		contentPane.add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new ArtistaController();
                frame.setSize(582,490);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                close();
			}
		});
		btnCancelar.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnCancelar.setBounds(353, 325, 89, 30);
		contentPane.add(btnCancelar);
		
		
		generoMusical = generoMusicalDAO.findAll();
		List<Integer> generoMusicalList = generoMusical.stream().map(generoMusical -> generoMusical.getId()).collect(Collectors.toList());
		Integer[] generoMusical1 = new Integer[generoMusicalList.size()];
		comboGeneroMusical = new JComboBox(generoMusicalList.toArray(generoMusical1));
		comboGeneroMusical.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboGeneroMusical.setBounds(242, 245, 200, 30);
		contentPane.add(comboGeneroMusical);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(242, 97, 200, 30);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(242, 170, 200, 30);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
	}
	
	private void close() {
		this.dispose();
	}
	
	private void saveArtista() {
		Artista artista = new Artista();
		artista.setCode(Integer.parseInt(txtCodigo.getText().trim()));
		artista.setNombre(txtNombre.getText().trim());
		artista.setGeneroMusical(findGeneroMusical((Integer) comboGeneroMusical.getSelectedItem()));
		artistaDAO.create(artista);
		JOptionPane.showMessageDialog(null, "Evento agregado");
		
		JFrame frame = new ArtistaController();
        frame.setSize(582,490);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        close();
        
       
	}
	
	private GeneroMusical findGeneroMusical(Integer genero){
		Optional<GeneroMusical> generoMusical1 = generoMusical.stream().filter(employee -> employee.getId() == genero).findFirst();
		if(generoMusical1.isPresent()){
			return  generoMusical1.get();
		}
		return null;
	}
}
