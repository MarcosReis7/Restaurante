
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Prato2 extends JPanel {
	private ImageIcon imgPrato;
	private JLabel jlPrato;
	
	public Prato2() {
		Componentes();
	}

	public void Componentes() {
		setLayout(null);
		imgPrato = new ImageIcon("frios.jfif");
		jlPrato = new JLabel(imgPrato);
		jlPrato.setBounds(0, 0, 600, 600);
		add(jlPrato);
	}
	
}
