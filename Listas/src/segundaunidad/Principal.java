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
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField txtid_cancion;
	private JTextField txtalbum;
	private JTextField txtartista;
	private JTextField txtgenero;
	ListaDoblementeEnlazada nueva=new ListaDoblementeEnlazada();
	private JTextField txtresultado;
	

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
		setBounds(100, 100, 462, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNodoAdelante = new JButton("Insertar Nodo Adelante");
		btnNodoAdelante.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		btnNodoAdelante.setForeground(SystemColor.activeCaption);
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
		btnNodoAdelante.setBounds(10, 47, 175, 23);
		contentPane.add(btnNodoAdelante);
		
		JButton btnNodoAtras = new JButton("Insertar Nodo Atras");
		btnNodoAtras.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		btnNodoAtras.setForeground(SystemColor.activeCaption);
		btnNodoAtras.setBounds(10, 81, 175, 23);
		contentPane.add(btnNodoAtras);
		
		JButton btnEliminarPrimero = new JButton("Eliminar Primer Nodo");
		btnEliminarPrimero.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		btnEliminarPrimero.setForeground(SystemColor.activeCaption);
		btnEliminarPrimero.setBounds(10, 115, 175, 23);
		contentPane.add(btnEliminarPrimero);
		
		JButton btnEliminarUltimo = new JButton("Eliminar Ultimo Nodo");
		btnEliminarUltimo.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		btnEliminarUltimo.setForeground(SystemColor.activeCaption);
		btnEliminarUltimo.setBounds(10, 149, 175, 23);
		contentPane.add(btnEliminarUltimo);
		
		JButton btnRecorridoAdelante = new JButton("Recorrido Adelante");
		btnRecorridoAdelante.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		btnRecorridoAdelante.setForeground(SystemColor.activeCaption);
		btnRecorridoAdelante.setBounds(10, 183, 175, 23);
		contentPane.add(btnRecorridoAdelante);
		
		JButton btnRecorridoAtras = new JButton("Recorrido Atras");
		btnRecorridoAtras.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		btnRecorridoAtras.setForeground(SystemColor.activeCaption);
		btnRecorridoAtras.setBounds(10, 217, 175, 23);
		contentPane.add(btnRecorridoAtras);
		
		JLabel lblIngreseElTipo = new JLabel("Ingrese el id de la de cancion:");
		lblIngreseElTipo.setForeground(Color.BLACK);
		lblIngreseElTipo.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblIngreseElTipo.setBounds(221, 29, 197, 14);
		contentPane.add(lblIngreseElTipo);
		
		txtid_cancion = new JTextField();
		txtid_cancion.setForeground(Color.BLACK);
		txtid_cancion.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		txtid_cancion.setBounds(221, 44, 197, 20);
		contentPane.add(txtid_cancion);
		txtid_cancion.setColumns(10);
		
		JLabel lblIngreseLaCancion = new JLabel("Ingrese el album:");
		lblIngreseLaCancion.setForeground(Color.BLACK);
		lblIngreseLaCancion.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblIngreseLaCancion.setBounds(221, 75, 197, 14);
		contentPane.add(lblIngreseLaCancion);
		
		txtalbum = new JTextField();
		txtalbum.setForeground(Color.BLACK);
		txtalbum.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		txtalbum.setBounds(221, 98, 197, 20);
		contentPane.add(txtalbum);
		txtalbum.setColumns(10);
		
		JLabel lblIngreseElAlbum = new JLabel("Ingrese el artista:");
		lblIngreseElAlbum.setForeground(Color.BLACK);
		lblIngreseElAlbum.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblIngreseElAlbum.setBounds(221, 135, 197, 14);
		contentPane.add(lblIngreseElAlbum);
		
		txtartista = new JTextField();
		txtartista.setForeground(Color.BLACK);
		txtartista.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		txtartista.setBounds(221, 160, 197, 20);
		contentPane.add(txtartista);
		txtartista.setColumns(10);
		
		JLabel lblIngreseElAutor = new JLabel(" Ingrese el genero:");
		lblIngreseElAutor.setForeground(Color.BLACK);
		lblIngreseElAutor.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		lblIngreseElAutor.setBounds(221, 199, 197, 14);
		contentPane.add(lblIngreseElAutor);
		
		txtgenero = new JTextField();
		txtgenero.setForeground(Color.BLACK);
		txtgenero.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		txtgenero.setBounds(221, 220, 197, 20);
		contentPane.add(txtgenero);
		txtgenero.setColumns(10);
		
		txtresultado = new JTextField();
		txtresultado.setBounds(27, 271, 409, 94);
		contentPane.add(txtresultado);
		txtresultado.setColumns(10);
	}
}
