package game;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class Car {
	
	private int x,y;
	private ImageIcon car;
	public Car(ImageIcon car,int x,int y) {
		this.car = car;
		this.x = x;
		this.y = y;
	}
	
	public void moveRight() {
		this.x=x+150;
	}
	
	public void moveLeft() {
		this.x=x-150;
	}
	
	public void moveUp() {
		this.y = y-10;
	}
	
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void moveDown() {
		this.y = y + 10;
	}
	
	protected void paint(Graphics g) {
		this.car.paintIcon(null, g, x, y);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
}
