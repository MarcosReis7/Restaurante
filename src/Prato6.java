import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Prato6 extends JPanel {
	private ImageIcon imgPrato;
	private JLabel jlPrato;
	
	public Prato6() {
		Componentes();
	}

	public void Componentes() {
		setLayout(null);
		imgPrato = new ImageIcon("costela.jpg");
		jlPrato = new JLabel(imgPrato);
		jlPrato.setBounds(0, 0, 600, 600);
		add(jlPrato);
	}
	
}
