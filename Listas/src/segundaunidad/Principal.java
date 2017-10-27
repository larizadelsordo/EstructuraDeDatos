package segundaunidad;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import java.awt.TextArea;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField textid;
	private JTextField textalbum;
	private JTextField textartista;
	private JTextField textgenero;
	private JTextField textnombre;
	ListaDoblementeEnlazada ld=new ListaDoblementeEnlazada();

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
		setBounds(100, 100, 596, 544);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnIngresarNodoAdelante = new JButton("Ingresar nodo Adelante");
		btnIngresarNodoAdelante.setBackground(new Color(255, 228, 181));
		btnIngresarNodoAdelante.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		btnIngresarNodoAdelante.setForeground(new Color(219, 112, 147));
		btnIngresarNodoAdelante.setBounds(354, 58, 181, 23);
		btnIngresarNodoAdelante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textid.getText().isEmpty()||textnombre.getText().isEmpty()||textalbum.getText().isEmpty()||textartista.getText().isEmpty()||textgenero.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null,"llenar todos los campos ");
				}else {
				
				
				Musica nuevo=new Musica();
				nuevo.setId_cancion(textid.getText());
				nuevo.setNombrecancion(textnombre.getText());
				nuevo.setAlbum(textalbum.getText());
				nuevo.setArtista(textartista.getText());
				nuevo.setGenero(textgenero.getText());
				
				
			    ld.insertarfinal(nuevo);
			    JOptionPane.showMessageDialog(null,"valores insertados adelante");
			    textid.setText("");
			    textnombre.setText("");
			    textalbum.setText("");
			    textartista.setText("");
			    textgenero.setText("");
				}
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnIngresarNodoAdelante);
		
		JButton btnIngresarNodoAtras = new JButton("Ingresar nodo Atras ");
		btnIngresarNodoAtras.setBackground(new Color(255, 228, 181));
		btnIngresarNodoAtras.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		btnIngresarNodoAtras.setForeground(new Color(219, 112, 147));
		btnIngresarNodoAtras.setBounds(354, 118, 181, 23);
		btnIngresarNodoAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(textid.getText().isEmpty()||textnombre.getText().isEmpty()||textalbum.getText().isEmpty()||textartista.getText().isEmpty()||textgenero.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null,"llenar todos los campos ");
				}else {
				
				
				Musica nuevo=new Musica();
				nuevo.setId_cancion(textid.getText());
				nuevo.setNombrecancion(textnombre.getText());
				nuevo.setAlbum(textalbum.getText());
				nuevo.setArtista(textartista.getText());
				nuevo.setGenero(textgenero.getText());
				
				
			    ld.insertarfinal(nuevo);
			    JOptionPane.showMessageDialog(null,"valores insertados atras");
			    textid.setText("");
			    textnombre.setText("");
			    textalbum.setText("");
			    textartista.setText("");
			    textgenero.setText("");
				}
			}
		});
		contentPane.add(btnIngresarNodoAtras);
		
		JButton btnEliminarPrimerNodo = new JButton("Eliminar primer Nodo");
		btnEliminarPrimerNodo.setBackground(new Color(255, 228, 181));
		btnEliminarPrimerNodo.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		btnEliminarPrimerNodo.setForeground(new Color(219, 112, 147));
		btnEliminarPrimerNodo.setBounds(354, 170, 181, 23);
		btnEliminarPrimerNodo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION);
				if (JOptionPane.OK_OPTION == resp)
				{
					ld.eliminarinicio();
					JOptionPane.showMessageDialog(null, "registro eliminado ");
				}
					else
						JOptionPane.showMessageDialog(null, "NO SE A  BORRADO NADA  ");
					
				
			}
		});
		contentPane.add(btnEliminarPrimerNodo);
		
		JButton btnEliminarUltimoNodo = new JButton("Eliminar Ultimo Nodo");
		btnEliminarUltimoNodo.setBackground(new Color(255, 228, 181));
		btnEliminarUltimoNodo.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		btnEliminarUltimoNodo.setForeground(new Color(219, 112, 147));
		btnEliminarUltimoNodo.setBounds(354, 226, 181, 23);
		btnEliminarUltimoNodo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION);
				if (JOptionPane.OK_OPTION == resp)
				{
					ld.eliminarfinal();
					JOptionPane.showMessageDialog(null, "registro eliminado ");
				}
					else
						JOptionPane.showMessageDialog(null, "NO SE A  BORRADO NADA  ");
					
			
			}
		});
		contentPane.add(btnEliminarUltimoNodo);
		
		
		TextArea txtresul = new TextArea();
		txtresul.setBounds(20, 309, 550, 126);
		contentPane.add(txtresul);
       

		
		JButton btnRecorridoAdelante = new JButton("Imprimir  Adelante");
		btnRecorridoAdelante.setBackground(new Color(255, 228, 181));
		btnRecorridoAdelante.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		btnRecorridoAdelante.setForeground(new Color(219, 112, 147));
		btnRecorridoAdelante.setBounds(104, 458, 147, 23);
		btnRecorridoAdelante.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
			        txtresul.setText(ld.mostrarfrente().toString());
			        
			}
		});
		contentPane.add(btnRecorridoAdelante);
		
		JButton btnRecorridoAtras = new JButton("Imprimir  Atras");
		btnRecorridoAtras.setBackground(new Color(255, 228, 181));
		btnRecorridoAtras.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		btnRecorridoAtras.setForeground(new Color(219, 112, 147));
		btnRecorridoAtras.setBounds(310, 458, 147, 23);
		btnRecorridoAtras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				txtresul.setText(ld.mostrardetras().toString());
		       

			}
		});
		contentPane.add(btnRecorridoAtras);
		
		JLabel lblIngreseIdDe = new JLabel("Ingrese id de la cancion :");
		lblIngreseIdDe.setBounds(20, 11, 162, 18);
		lblIngreseIdDe.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		contentPane.add(lblIngreseIdDe);
		
		JLabel lblIngreseElAlbum = new JLabel("Ingrese el album");
		lblIngreseElAlbum.setBounds(20, 146, 140, 14);
		lblIngreseElAlbum.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		contentPane.add(lblIngreseElAlbum);
		
		JLabel lblIngreseElArtista = new JLabel("Ingrese el artista");
		lblIngreseElArtista.setBounds(20, 202, 147, 14);
		lblIngreseElArtista.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		contentPane.add(lblIngreseElArtista);
		
		JLabel lblIngreseElGenero = new JLabel("Ingrese el genero");
		lblIngreseElGenero.setBounds(20, 258, 140, 14);
		lblIngreseElGenero.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		contentPane.add(lblIngreseElGenero);
		
		textid = new JTextField();
		textid.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		textid.setBounds(20, 40, 182, 20);
		contentPane.add(textid);
		textid.setColumns(10);
		
		textalbum = new JTextField();
		textalbum.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		textalbum.setBounds(20, 171, 182, 20);
		contentPane.add(textalbum);
		textalbum.setColumns(10);
		
		textartista = new JTextField();
		textartista.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		textartista.setBounds(20, 227, 182, 20);
		contentPane.add(textartista);
		textartista.setColumns(10);
		
		textgenero = new JTextField();
		textgenero.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		textgenero.setBounds(20, 283, 182, 20);
		contentPane.add(textgenero);
		textgenero.setColumns(10);
		
		JLabel lblNombreDeLa = new JLabel("Nombre de la cancion");
		lblNombreDeLa.setBounds(20, 74, 162, 14);
		lblNombreDeLa.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		contentPane.add(lblNombreDeLa);
		
		textnombre = new JTextField();
		textnombre.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		textnombre.setBounds(20, 105, 182, 20);
		contentPane.add(textnombre);
		textnombre.setColumns(10);
		ImageIcon foto2 = new ImageIcon("C:\\Users\\Diego\\Downloads\\images.jpg");
		JLabel fondo = new JLabel("");
		fondo.setBackground(new Color(255, 228, 225));
		fondo.setHorizontalAlignment(SwingConstants.CENTER);
		fondo.setBounds(10, 0, 580, 506);
		fondo.setIcon(new ImageIcon("C:\\Users\\Diego\\Downloads\\images.jpg"));
		ImageIcon icono_linea2 = new ImageIcon(foto2.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_DEFAULT));
		fondo.setIcon(icono_linea2);
		contentPane.add(fondo);
	}
}