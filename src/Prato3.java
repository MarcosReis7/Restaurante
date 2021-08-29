import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Prato3 extends JPanel {
	private ImageIcon imgPrato;
	private JLabel jlPrato;
	
	public Prato3() {
		Componentes();
	}

	public void Componentes() {
		setLayout(null);
		imgPrato = new ImageIcon("queijos.jpg");
		jlPrato = new JLabel(imgPrato);
		jlPrato.setBounds(0, 0, 600, 600);
		add(jlPrato);
	}
	
}
