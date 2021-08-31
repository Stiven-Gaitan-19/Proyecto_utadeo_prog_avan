package co.edu.utadeo.controller.evento;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import co.edu.utadeo.controller.agencia.AgenciaController;
import co.edu.utadeo.controller.aparicion.AparicionController;
import co.edu.utadeo.controller.artista.ArtistaController;
import co.edu.utadeo.controller.caracteristica.CaracteristicaController;
import co.edu.utadeo.controller.coleccion.ColeccionController;
import co.edu.utadeo.controller.desfile.DesfileController;
import co.edu.utadeo.controller.disenador.DisenadorController;
import co.edu.utadeo.controller.disenador.DisenadorEditController;
import co.edu.utadeo.controller.empleadodirectivo.EmpleadoDirectivoController;
import co.edu.utadeo.controller.empleadodirectivo.EmpleadoDirectivoEditController;
import co.edu.utadeo.controller.empleadoraso.EmpleadoRasoController;
import co.edu.utadeo.controller.foto.FotoController;
import co.edu.utadeo.controller.genero.GeneroController;
import co.edu.utadeo.controller.modelo.ModeloController;
import co.edu.utadeo.controller.pabellon.PabellonController;
import co.edu.utadeo.controller.pais.PaisController;
import co.edu.utadeo.controller.portafolio.PortafolioController;
import co.edu.utadeo.domain.EmpleadoDirectivo;
import co.edu.utadeo.domain.Evento;
import co.edu.utadeo.model.EmpleadoDirectivoDAO;
import co.edu.utadeo.model.EventoDAO;

import java.awt.Color;
import java.awt.Font;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class EventoController extends JFrame {

	private JTable table;
	private EventoDAO eventoDAO;
	private String[] columnsTable = {"Codigo", "Nombre", "Fecha Inicio", "Fecha Fin", "Empleado Direc"};

	/**
	 * Create the frame.
	 */
	public EventoController() {

		eventoDAO = new EventoDAO();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 490);
		
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
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 566, 430);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Eliminar");
		btnNewButton_2.setBounds(416, 368, 89, 23);
		panel.add(btnNewButton_2);
		btnNewButton_2.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		
		JButton btnNewButton_1 = new JButton("Editar\r\n");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new EventoEditController();
				frame.setSize(582,490);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				frame.setResizable(false);
				close();
			}
		});
		btnNewButton_1.setBounds(241, 368, 89, 23);
		panel.add(btnNewButton_1);
		btnNewButton_1.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		
		JButton btnNewButton = new JButton("Agregar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new EventoEditController();
				frame.setSize(582,490);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
				frame.setResizable(false);
				close();
			}
		});
		btnNewButton.setBounds(63, 368, 89, 23);
		panel.add(btnNewButton);
		btnNewButton.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		
		JLabel lblNewLabel = new JLabel("The Star Rover - Eventos");
		lblNewLabel.setBounds(162, 21, 267, 52);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Roboto Medium", Font.PLAIN, 22));

		initializeTable(panel);
		
	}
	
	private void close() {
		this.dispose();
	}

	private void initializeTable(JPanel panel){
		List<Evento> eventos = eventoDAO.findAll();
		Object[][] data = new String[eventos.size()][5];
		for(int i=0; i<eventos.size(); i++){
			data[i][0] = String.valueOf(eventos.get(i).getCode());
			data[i][1] = String.valueOf(eventos.get(i).getNombre());
			data[i][2] = String.valueOf(eventos.get(i).getFechaInicio());
			data[i][3] = String.valueOf(eventos.get(i).getFechaFin());
			data[i][4] = String.valueOf(eventos.get(i).getEmpleadoDirectivo().getNombre());
		}

		table = new JTable(new DefaultTableModel(data, columnsTable));

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(50, 110, 470, 211);

		panel.add(scrollPane);
	}
	
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
