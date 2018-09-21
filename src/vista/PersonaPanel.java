package vista;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.GridLayout;
import java.text.NumberFormat;
import java.text.ParseException;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;
import java.awt.Font;

public class PersonaPanel extends JPanel{
	private JTextField txtNombre;
	
	public PersonaPanel() throws ParseException{
		setBackground(Color.MAGENTA);
		setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 0), 5, true), "Datos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 0)));
		setLayout(new GridLayout(5, 2, 0, 0));
		
		JLabel lblNombre = new JLabel("Nombre:");
		add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Tekton Pro Cond", Font.BOLD | Font.ITALIC, 46));
		txtNombre.setBackground(Color.RED);
		txtNombre.setForeground(Color.CYAN);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblEdad = new JLabel("Edad: ");
		add(lblEdad);
		
		//NumberFormat formatoNumero = NumberFormat.getIntegerInstance(); //Se hace la mascara de numeros
		//formatoNumero.setMinimumIntegerDigits(1);
		//formatoNumero.setMaximumIntegerDigits(3);
		
		MaskFormatter formatoNumero = new MaskFormatter("###");
		JFormattedTextField txtEdad = new JFormattedTextField(formatoNumero);
		txtEdad.setFont(new Font("Wide Latin", Font.ITALIC, 44));
		txtEdad.setBackground(Color.ORANGE);
		txtEdad.setForeground(Color.GREEN);
		add(txtEdad);
		
		JLabel lblGenero = new JLabel("Genero:");
		add(lblGenero);
		
		JPanel panelGenero = new JPanel();
		panelGenero.setBackground(new Color(255, 99, 71));
		add(panelGenero);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setBackground(Color.PINK);
		rdbtnMasculino.setSelected(true);
		panelGenero.add(rdbtnMasculino);
		
		JRadioButton rdbtnFemenino = new JRadioButton("Femenino");
		rdbtnFemenino.setBackground(Color.BLUE);
		panelGenero.add(rdbtnFemenino);
		
		ButtonGroup grupoGenero = new ButtonGroup();
		grupoGenero.add(rdbtnMasculino);
		grupoGenero.add(rdbtnFemenino);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		add(lblTelefono);
		
		MaskFormatter telefonoFormato = new MaskFormatter("(###)###-####");
		
		JFormattedTextField formattedTextField = new JFormattedTextField(telefonoFormato);
		formattedTextField.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 50));
		formattedTextField.setBackground(Color.GREEN);
		formattedTextField.setForeground(Color.ORANGE);
		add(formattedTextField);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setBackground(Color.WHITE);
		add(lblCorreo);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setFont(new Font("RomanS", Font.BOLD | Font.ITALIC, 40));
		formattedTextField_1.setBackground(Color.CYAN);
		formattedTextField_1.setForeground(Color.RED);
		add(formattedTextField_1);
		
	}
	
	

}
