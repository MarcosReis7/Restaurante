import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Prato1 extends JPanel {
	private ImageIcon imgPrato;
	private JLabel jlPrato;
	
	public Prato1() {
		Componentes();
	}

	public void Componentes() {
		setLayout(null);
		imgPrato = new ImageIcon("Prato1.jpg");
		jlPrato = new JLabel(imgPrato);
		jlPrato.setBounds(0, 0, 564, 297);
		add(jlPrato);
	}
	
}
