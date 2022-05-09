package game;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class EndPanel extends JPanel{

	public static final int Window_Width = 1000;
	public static final int Window_Height = 772;
	private ImageIcon image;
	
	public EndPanel() {
//		this.setBackground(Color.black);
		this.setBounds(0, 0, Window_Width, Window_Width);
		this.image = new ImageIcon("photo_2022-05-09_18-17-31.jpg");
		this.setLayout(null);
		

	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.image.paintIcon(this, g, 0, 0);
	}
}
