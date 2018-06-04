import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.AWTException;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.awt.Color;
import java.awt.Robot;

public class Panneau extends JPanel {

	public void paintComponent(Graphics g) { // fonction qui affiche image et zone texte
		try {
			Image img = ImageIO
					.read(new File("C:\\Users\\Juliette\\eclipse-workspace\\RISK3\\src\\Images\\mapmondebis.png"));
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

}
