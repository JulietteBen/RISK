import java.awt.AWTException;
import java.awt.Color;
import java.awt.Robot;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.swing.JFrame;

public class RISK {

	public static void main(String[] args) {
		Fenetre fen = new Fenetre();
		Continent c = new Continent();
		
		try {
			c.getcontinent();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fen.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				try {
					Robot robot = new Robot();
					int x = e.getX();
					int y = e.getY();
					System.out.println("x: " + x + " y : " + y);
					Color color = robot.getPixelColor(x,y);
					System.out.println(color.getRed() + " " + color.getGreen() + " " + color.getBlue());
					int r = color.getRed(); 
					int g = color.getGreen();
					int b = color.getBlue();
					for (Region re:c.listregion) {
						if(re.r == r && re.b == b && re.g == g) {
							System.out.println(re.nom);
							fen.ecrireTexte(re.nom);
						}
					}

				} catch (AWTException ex) {
					ex.printStackTrace();
				}
			}
		});
	}

}