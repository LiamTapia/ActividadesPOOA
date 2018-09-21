package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.ParseException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;

import modelo.Genero;
import modelo.Persona;

import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class AgendaUI extends JFrame {

	private JPanel contentPane;
	private DefaultListModel <Persona> modelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgendaUI frame = new AgendaUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws ParseException 
	 */
	public AgendaUI() throws ParseException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 487, 299);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelBotones = new JPanel();
		panelBotones.setBackground(new Color(50, 205, 50));
		contentPane.add(panelBotones, BorderLayout.SOUTH);
		
		JButton btnNuevo = new JButton("Nuevo");
		panelBotones.add(btnNuevo);
		
		JButton btnAgregar = new JButton("Agregar");
		panelBotones.add(btnAgregar);
		
		JButton btnEditar = new JButton("Editar");
		panelBotones.add(btnEditar);
		
		JButton btnEliminar = new JButton("Eliminar");
		panelBotones.add(btnEliminar);
		
		JPanel panelPrincipal = new JPanel();
		contentPane.add(panelPrincipal, BorderLayout.CENTER);
		panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.X_AXIS));
		
		PersonaPanel personaPanel = new PersonaPanel();
		panelPrincipal.add(personaPanel);
		
		JPanel panelResultados = new JPanel();
		panelResultados.setForeground(new Color(255, 255, 255));
		panelResultados.setBackground(new Color(0, 0, 0));
		panelResultados.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 5), "Resultados", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panelPrincipal.add(panelResultados);
		panelResultados.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panelResultados.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		modelo = new DefaultListModel <Persona>();
		list.setModel(modelo);
		
		Persona p = new Persona("Juan", "12345", "132456", 23, Genero.MASCULINO);
		Persona p2 = new Persona("Maria", "12345", "132456", 23, Genero.FEMENINO);
		Persona p3 = new Persona("Juanosaurio", "12345", "132456", 23, Genero.MASCULINO);
		
		modelo.addElement(p);
		modelo.addElement(p2);
		modelo.addElement(p3);

	}

}
