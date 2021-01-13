import javax.swing.*;
import java.awt.*;

public class Rond extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void paintComponent(Graphics g) {
		g.fillOval(210, 10, 10, 10);
		g.setColor(Color.green);
	}

}
