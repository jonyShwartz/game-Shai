package game;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Window extends JFrame{
	
	
	
	public static final int Window_Width = 1000;
	public static final int Window_Height = 772;
	
	public static void main(String[] args) {
		Window window = new Window();
	}
	
	public Window() {
		panel p = new panel();
		this.add(p);
//		GameScence gameScene = new GameScence(0, 0, Window_Width, Window_Height);
//		this.add(gameScene);
		//this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(Window_Width,Window_Height);
		this.setVisible(true);
		
		
		
		
		
	}
	
}
