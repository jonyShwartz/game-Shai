package game;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class panel extends JPanel{
	public static final int Window_Width = 1000;
	public static final int Window_Height = 772;
	private ImageIcon image;

	public panel() {
		this.setBounds(0, 0, Window_Width, Window_Width);
		this.image = new ImageIcon("startPhoto.jpg");
		this.setLayout(null);
		

		JButton bHard = new JButton("start game");

		

		
		bHard.setBounds(350,450 ,250,50);
		bHard.setBackground(Color.ORANGE);
		bHard.addActionListener((event) -> {
			GameScence gameScene = new GameScence(0, 0, Window_Width, Window_Height);
			this.add(gameScene);
	       
		bHard.setVisible(false);
		});
		
		this.add(bHard);

		
		
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.image.paintIcon(this, g, 0, 0);
	}
	
	

	
	
}
