package game;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public class CarObstacle {
	
	public double x,y;
	private ImageIcon car;
	//public boolean bool;
	
	public CarObstacle(ImageIcon car,int x,int y) {
		this.car = car;
		this.x = x;
		this.y = y;
	//	this.bool = true;
		
        Thread t = new Thread(() -> {
        	while(true) {
        	try {
        		this.y+=0.5;
				Thread.sleep(1) ;
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
        	}
        });t.start();
	}
//	public void boolChanges() {
//		try {
//			bool = true;
//			Thread.sleep(5000);
//			bool = false;
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}	
//	}
	
	
//    public boolean show() {
//    	return bool;
//    }

	
	
	protected void paint(Graphics g) {
//		new Thread(() -> {
//			while(true) {
//    		if(bool == true) {
        		this.car.paintIcon(null, g,(int) x, (int)y);
//    		}
//			}
//		}).start();
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
	
}
