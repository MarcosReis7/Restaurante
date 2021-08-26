import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame{
	private Container c1;
	private JMenuBar mnBarra;
	private JMenu mnArquivo, mnEntrada ,mnPrincipal, mnSobremesa;
	private JMenuItem miSair,miPrato1, miPrato2, miPrato3, miPrato4, miPrato5, miPrato6, miPrato7, miPrato8, miPrato9;
	

	public Main() {
		inicializarComponentes();
		definirEventos();
	}

	private void inicializarComponentes() {
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
		
		miSair = new JMenuItem("Sair");
		miSair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		
		
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
		
	}
	private void definirEventos() {
		miSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		miPrato1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main a1 = new Main();
				c1.removeAll();
				c1.add(a1);
				c1.validate();
			
				
			
			}
		});
		
	}

	public static void main(String args[]) {
		 Main frame = new Main();
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setBounds(0,0,500,300);
		 frame.setVisible(true);

	}
}
