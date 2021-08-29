import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame{
	 Container c1;
	 JMenuBar mnBarra;
	 JMenu mnArquivo, mnEntrada ,mnPrincipal, mnSobremesa;
	 JMenuItem miInicio, miSair,miPrato1, miPrato2, miPrato3, miPrato4, miPrato5, miPrato6, miPrato7, miPrato8, miPrato9;
	 JLabel jlLogo, jlInvi;
	 ImageIcon imgLogo;
	

	public Main() {
		inicializarComponentes();
		definirEventos();
	}

	public void inicializarComponentes() {
		c1 = getContentPane();
		
		mnBarra = new JMenuBar();
		
		mnArquivo = new JMenu("Arquivo");
		mnArquivo.setMnemonic('A');
		
		mnEntrada = new JMenu("Entrada");
		mnEntrada.setMnemonic('E');
		
		mnPrincipal = new JMenu("Principal");
		mnPrincipal.setMnemonic('P');
		
		mnSobremesa = new JMenu("Sobremesa");
		mnSobremesa.setMnemonic('S');
		
		miPrato1 = new JMenuItem("pão");
		miPrato1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
		miPrato2 = new JMenuItem("Frios");
		miPrato2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
		miPrato3 = new JMenuItem("Queijos");
		miPrato3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
		
		miPrato4 = new JMenuItem("Carne");
		miPrato4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
		miPrato5 = new JMenuItem("Frango");
		miPrato5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));
		miPrato6 = new JMenuItem("Costela");
		miPrato6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, ActionEvent.CTRL_MASK));
		
		miPrato7 = new JMenuItem("Pudim");
		miPrato7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK));
		miPrato8 = new JMenuItem("Sorvete");
		miPrato8.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, ActionEvent.CTRL_MASK));
		miPrato9 = new JMenuItem("Torta");
		miPrato9.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.CTRL_MASK));
		
		miInicio = new JMenuItem("Inicio");
		miSair = new JMenuItem("Sair");
		
		mnArquivo.add(miInicio);
		mnArquivo.add(miSair);
		
		mnEntrada.add(miPrato1);
		mnEntrada.add(miPrato2);
		mnEntrada.add(miPrato3);
		
		mnPrincipal.add(miPrato4);
		mnPrincipal.add(miPrato5);
		mnPrincipal.add(miPrato6);
		
		mnSobremesa.add(miPrato7);
		mnSobremesa.add(miPrato8);
		mnSobremesa.add(miPrato9);
		
		mnBarra.add(mnArquivo);
		mnBarra.add(mnEntrada);
		mnBarra.add(mnPrincipal);
		mnBarra.add(mnSobremesa);
		
		setJMenuBar(mnBarra);
		
		imgLogo = new ImageIcon("logoRestaurante.jpg");
		jlLogo = new JLabel(imgLogo);
		jlLogo.setSize(600, 600);
		
		c1.add(jlLogo);	
		
		jlInvi = new JLabel();
		jlInvi.setVisible(false);
		c1.add(jlInvi);		
		
	}
	public void definirEventos() {
		
		miInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setSize(600, 600);
				setLocationRelativeTo(null);
				setTitle("Inicio");
				c1.removeAll(); 
				c1.add(jlInvi);	
				c1.add(jlLogo);	
				c1.validate();
			}
		});
		
		miSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		miPrato1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Prato1 a1 = new Prato1();
				setTitle("Pão");
				c1.removeAll();
				c1.add(a1);
				c1.validate();
			}
		});
		
		miPrato2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Prato2 a1 = new Prato2();
				setTitle("Frios");
				c1.removeAll();
				c1.add(a1);
				c1.validate();
			}
		});
		
		miPrato3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Prato3 a1 = new Prato3();
				setTitle("Queijos");
				c1.removeAll();
				c1.add(a1);
				c1.validate();
			}
		});
		miPrato4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Prato4 a1 = new Prato4();
				setTitle("Carne");
				c1.removeAll();
				c1.add(a1);
				c1.validate();
			}
		});
		miPrato5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Prato5 a1 = new Prato5();
				setTitle("Frango");
				c1.removeAll();
				c1.add(a1);
				c1.validate();
			}
		});
		miPrato6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Prato6 a1 = new Prato6();
				setTitle("Costela");
				c1.removeAll();
				c1.add(a1);
				c1.validate();
			}
		});
		miPrato7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Prato7 a1 = new Prato7();
				setTitle("Pudim");
				c1.removeAll();
				c1.add(a1);
				c1.validate();
			}
		});
		miPrato8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Prato8 a1 = new Prato8();
				setTitle("Sorvete");
				c1.removeAll();
				c1.add(a1);
				c1.validate();
			}
		});
		miPrato9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Prato9 a1 = new Prato9();
				setTitle("Torta");
				c1.removeAll();
				c1.add(a1);
				c1.validate();
			}
		});
	}

	public static void main (String args[]) {
		 Main frame = new Main();
		 frame.setTitle("Restaurante");
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setSize(600,600);
		 frame.setLocationRelativeTo(null);
		 frame.setResizable(false);
		 frame.setVisible(true);

	}
}
