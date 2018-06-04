import java.awt.AWTException;
import java.awt.Color;
import java.awt.Robot;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
 
public class Fenetre extends JFrame {
	
	/*private JPanel pan = new JPanel();*/
	
    JTextArea area = new JTextArea();

	public Fenetre(){
		
	    this.setTitle("RISK");
	    this.setSize(600, 500);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setContentPane(new Panneau());
	    this.setVisible(true);
	    area.setBounds(2,2,400,400);
	    this.getContentPane().add(area);
	}
	
	public void ecrireTexte(String t) {
		area.setText(t);
	}
}

