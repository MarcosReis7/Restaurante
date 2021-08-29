import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Prato5 extends JPanel {
	private ImageIcon imgPrato;
	private JLabel jlPrato;
	
	public Prato5() {
		Componentes();
	}

	public void Componentes() {
		setLayout(null);
		imgPrato = new ImageIcon("frango.jpg");
		jlPrato = new JLabel(imgPrato);
		jlPrato.setBounds(0, 0, 600, 600);
		add(jlPrato);
	}
	
}
