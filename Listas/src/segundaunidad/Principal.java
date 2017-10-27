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
	private JTextField txtid;
	private JTextField txtalbum;
	private JTextField txtartista;
	private JTextField txtgenero;
	private JTextField txtnombre;
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
		
		JButton btningresaradelante = new JButton("Ingresar nodo Adelante");
		btningresaradelante.setBackground(new Color(255, 228, 181));
		btningresaradelante.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		btningresaradelante.setForeground(new Color(219, 112, 147));
		btningresaradelante.setBounds(354, 58, 181, 23);
		btningresaradelante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(txtid.getText().isEmpty()||txtnombre.getText().isEmpty()||txtalbum.getText().isEmpty()||txtartista.getText().isEmpty()||txtgenero.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null,"Completar todos los campos");
				}else {
				
				
				Musica nuevo=new Musica();
				nuevo.setId_cancion(txtid.getText());
				nuevo.setNombrecancion(txtnombre.getText());
				nuevo.setAlbum(txtalbum.getText());
				nuevo.setArtista(txtartista.getText());
				nuevo.setGenero(txtgenero.getText());
				
				
			    ld.insertarfinal(nuevo);
			    JOptionPane.showMessageDialog(null,"Valores insertados adelante de forma correcta.");
			    txtid.setText("");
			    txtnombre.setText("");
			    txtalbum.setText("");
			    txtartista.setText("");
			    txtgenero.setText("");
				}
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btningresaradelante);
		
		JButton btningresaratras = new JButton("Ingresar nodo Atras ");
		btningresaratras.setBackground(new Color(255, 228, 181));
		btningresaratras.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		btningresaratras.setForeground(new Color(219, 112, 147));
		btningresaratras.setBounds(354, 118, 181, 23);
		btningresaratras.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(txtid.getText().isEmpty()||txtnombre.getText().isEmpty()||txtalbum.getText().isEmpty()||txtartista.getText().isEmpty()||txtgenero.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null,"Completar todos los campos");
				}else {
				
				
				Musica nuevo=new Musica();
				nuevo.setId_cancion(txtid.getText());
				nuevo.setNombrecancion(txtnombre.getText());
				nuevo.setAlbum(txtalbum.getText());
				nuevo.setArtista(txtartista.getText());
				nuevo.setGenero(txtgenero.getText());
				
				
			    ld.insertarfinal(nuevo);
			    JOptionPane.showMessageDialog(null,"Valores insertados atras de forma correcta");
			    txtid.setText("");
			    txtnombre.setText("");
			    txtalbum.setText("");
			    txtartista.setText("");
			    txtgenero.setText("");
				}
			}
		});
		contentPane.add(btningresaratras);
		
		JButton btneliminarprimero = new JButton("Eliminar primer Nodo");
		btneliminarprimero.setBackground(new Color(255, 228, 181));
		btneliminarprimero.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		btneliminarprimero.setForeground(new Color(219, 112, 147));
		btneliminarprimero.setBounds(354, 170, 181, 23);
		btneliminarprimero.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar el registro?", "Alerta!", JOptionPane.YES_NO_OPTION);
				if (JOptionPane.OK_OPTION == resp)
				{
					ld.eliminarinicio();
					JOptionPane.showMessageDialog(null, "Registro Eliminado ");
				}
					else
						JOptionPane.showMessageDialog(null, "No se ha borrado");
					
				
			}
		});
		contentPane.add(btneliminarprimero);
		
		JButton btneliminarultimo = new JButton("Eliminar Ultimo Nodo");
		btneliminarultimo.setBackground(new Color(255, 228, 181));
		btneliminarultimo.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		btneliminarultimo.setForeground(new Color(219, 112, 147));
		btneliminarultimo.setBounds(354, 226, 181, 23);
		btneliminarultimo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar el registro?", "Alerta!", JOptionPane.YES_NO_OPTION);
				if (JOptionPane.OK_OPTION == resp)
				{
					ld.eliminarfinal();
					JOptionPane.showMessageDialog(null, "Registro Eliminado");
				}
					else
						JOptionPane.showMessageDialog(null, "No se ha borrado");
					
			
			}
		});
		contentPane.add(btneliminarultimo);
		
		
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
		
		JLabel lblIngreseIdDe = new JLabel("Ingrese id de la cancion:");
		lblIngreseIdDe.setBounds(20, 11, 162, 18);
		lblIngreseIdDe.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		contentPane.add(lblIngreseIdDe);
		
		JLabel lblIngreseElAlbum = new JLabel("Ingrese el album:");
		lblIngreseElAlbum.setBounds(20, 146, 140, 14);
		lblIngreseElAlbum.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		contentPane.add(lblIngreseElAlbum);
		
		JLabel lblIngreseElArtista = new JLabel("Ingrese el artista:");
		lblIngreseElArtista.setBounds(20, 202, 147, 14);
		lblIngreseElArtista.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		contentPane.add(lblIngreseElArtista);
		
		JLabel lblIngreseElGenero = new JLabel("Ingrese el genero:");
		lblIngreseElGenero.setBounds(20, 258, 140, 14);
		lblIngreseElGenero.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		contentPane.add(lblIngreseElGenero);
		
		txtid = new JTextField();
		txtid.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		txtid.setBounds(20, 40, 182, 20);
		contentPane.add(txtid);
		txtid.setColumns(10);
		
		txtalbum = new JTextField();
		txtalbum.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		txtalbum.setBounds(20, 171, 182, 20);
		contentPane.add(txtalbum);
		txtalbum.setColumns(10);
		
		txtartista = new JTextField();
		txtartista.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		txtartista.setBounds(20, 227, 182, 20);
		contentPane.add(txtartista);
		txtartista.setColumns(10);
		
		txtgenero = new JTextField();
		txtgenero.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		txtgenero.setBounds(20, 283, 182, 20);
		contentPane.add(txtgenero);
		txtgenero.setColumns(10);
		
		JLabel lblNombreDeLa = new JLabel("Nombre de la cancion:");
		lblNombreDeLa.setBounds(20, 74, 162, 14);
		lblNombreDeLa.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		contentPane.add(lblNombreDeLa);
		
		txtnombre = new JTextField();
		txtnombre.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		txtnombre.setBounds(20, 105, 182, 20);
		contentPane.add(txtnombre);
		txtnombre.setColumns(10);
		JLabel fondo = new JLabel("");
		fondo.setBackground(Color.PINK);
		fondo.setHorizontalAlignment(SwingConstants.CENTER);
		fondo.setBounds(10, 0, 580, 506);
		
	}
}