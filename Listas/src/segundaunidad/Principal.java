package segundaunidad;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField txtid_cancion;
	private JTextField txtalbum;
	private JTextField txtartista;
	private JTextField txtgenero;
	ListaDoblementeEnlazada nueva=new ListaDoblementeEnlazada();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 462, 372);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNodoAdelante = new JButton("Insertar Nodo Adelante");
		btnNodoAdelante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				NodoDobleEnlazado ejecutar=new NodoDobleEnlazado();
				
				ejecutar.setId_cancion(Integer.parseInt(txtid_cancion.getText()));
				ejecutar.setAlbum(txtalbum.getText());
				ejecutar.setArtista(txtartista.getText());
				ejecutar.setGenero(txtgenero.getText());
				
				nueva.insertarnodoadelante(ejecutar);
				JOptionPane.showMessageDialog(null, "Valores insertados correctamente.");
				
				
			}
		});
		btnNodoAdelante.setBounds(10, 29, 145, 23);
		contentPane.add(btnNodoAdelante);
		
		JButton btnNodoAtras = new JButton("Insertar Nodo Atras");
		btnNodoAtras.setBounds(10, 63, 145, 23);
		contentPane.add(btnNodoAtras);
		
		JButton btnEliminarPrimero = new JButton("Eliminar Primer Nodo");
		btnEliminarPrimero.setBounds(10, 97, 145, 23);
		contentPane.add(btnEliminarPrimero);
		
		JButton btnEliminarUltimo = new JButton("Eliminar Ultimo Nodo");
		btnEliminarUltimo.setBounds(10, 131, 145, 23);
		contentPane.add(btnEliminarUltimo);
		
		JButton btnRecorridoAdelante = new JButton("Recorrido Adelante");
		btnRecorridoAdelante.setBounds(10, 165, 145, 23);
		contentPane.add(btnRecorridoAdelante);
		
		JButton btnRecorridoAtras = new JButton("Recorrido Atras");
		btnRecorridoAtras.setBounds(10, 199, 145, 23);
		contentPane.add(btnRecorridoAtras);
		
		JLabel lblIngreseElTipo = new JLabel("Ingrese el id de la de cancion:");
		lblIngreseElTipo.setBounds(221, 29, 168, 14);
		contentPane.add(lblIngreseElTipo);
		
		txtid_cancion = new JTextField();
		txtid_cancion.setBounds(221, 44, 168, 20);
		contentPane.add(txtid_cancion);
		txtid_cancion.setColumns(10);
		
		JLabel lblIngreseLaCancion = new JLabel("Ingrese el album:");
		lblIngreseLaCancion.setBounds(221, 75, 110, 14);
		contentPane.add(lblIngreseLaCancion);
		
		txtalbum = new JTextField();
		txtalbum.setBounds(221, 98, 168, 20);
		contentPane.add(txtalbum);
		txtalbum.setColumns(10);
		
		JLabel lblIngreseElAlbum = new JLabel("Ingrese el artista:");
		lblIngreseElAlbum.setBounds(221, 135, 110, 14);
		contentPane.add(lblIngreseElAlbum);
		
		txtartista = new JTextField();
		txtartista.setBounds(221, 160, 168, 20);
		contentPane.add(txtartista);
		txtartista.setColumns(10);
		
		JLabel lblIngreseElAutor = new JLabel(" Ingrese el genero:");
		lblIngreseElAutor.setBounds(221, 199, 98, 14);
		contentPane.add(lblIngreseElAutor);
		
		txtgenero = new JTextField();
		txtgenero.setBounds(221, 220, 168, 20);
		contentPane.add(txtgenero);
		txtgenero.setColumns(10);
	}
}
