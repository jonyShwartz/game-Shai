package game;

import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class CarObstacleOppositePath {
	private double x,y;
	private ImageIcon car;
	private int width;
	private int height;
	

	
	public CarObstacleOppositePath(ImageIcon car,int x,int y) {
		this.car = car;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
//        Thread t = new Thread(() -> {
//        	while(true) {
//        	try {
//        		this.y+=0.7;
//				Thread.sleep(1) ;
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			} 
//        	}
//        });t.start();
	}
	
	
	protected void paint(Graphics g) {
		this.car.paintIcon(null, g, (int)x, (int)y);
	}

	public int getX() {
		return (int)x;
	}

	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return (int)y;
	}


	public void setY(int y) {
		this.y = y;
	}
	
	public void moveDown(double x) {
		this.y = y + x;
	}
	
	public boolean checkCollision (CustomRectangel other) {
		boolean collision = false;
		Rectangle thisRectangel = new Rectangle((int)this.x,(int)this.y,this.width,this.height);
		Rectangle otherRectangel = new Rectangle(other.x,other.y,other.width,other.height);
	if(thisRectangel.intersects(otherRectangel)) {
		collision = true;
	}
	return collision;
	}
}
