package game;

import java.util.concurrent.TimeUnit;

import java.util.Timer;//kdjnvsjkldjksvnkcdfubinjvsce
import java.util.TimerTask;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.TimeUnit;

import javax.swing.*;

//import javax.swing.ImageIcon;
//import javax.swing.JLabel;
//import javax.swing.JPanel;

public class GameScence extends JPanel {

	private ImageIcon roadBackgroung;
	private ImageIcon myCar;
	private int x = 520, y = 470;
	private Car car1;
	private CustomRectangel rectangle;
	private ImageIcon whiteCar;
	private ImageIcon yellowCar;
	private ImageIcon orangeCar;
	private ImageIcon porscheCar;
	int[] rightWhiteCarPath = new int[2];
	int[] leftWhiteCarPath = new int[2];
	int[] rightYellowCarPath = new int [2];
	int[] leftYellowCarPath = new int [2];
	int[] rightOrangeCarPath = new int [2];
	int[] leftOrangeCarPath = new int [2];
	int[] rightPorscheCarPath = new int [2];
	int[] leftPorscheCarPath = new int[2];


	private ImageIcon whiteCarOppositivePass;
	private ImageIcon yellowCarOppositivePass;
	private ImageIcon orangeCarOppositivePass;
	private ImageIcon porscheCarOppositivePass;
	private CarObstacle[] carObstacleArr;
	private CarObstacleOppositePath[] carObstacleOppositePathArr;
	private RectangelObstacle[] rectangleObstacleArr;
	private RectangleObstacleOppositePath[] rectangleObstacleOppositePathArr;
	private int counter = 0;
	private JTextField nameTextField;

	public GameScence(int x, int y, int width, int height) {
		this.setBounds(x, y, width, height);
		this.roadBackgroung = new ImageIcon("medium.gif");
		this.setLayout(null);
		this.myCar = new ImageIcon("raceCar.png");
		this.setVisible(true);
		this.car1 = new Car(myCar, this.x, this.y);
		this.rectangle = new CustomRectangel(this.x, this.y, 115, 250, Color.blue);
		this.whiteCar = new ImageIcon("whiteCar.png");
		this.whiteCarOppositivePass = new ImageIcon("whiteCarOppositePath.png");
		this.yellowCar = new ImageIcon("yellowCar.png");
		this.yellowCarOppositivePass = new ImageIcon("yellowCarOppositivePath.png");
		this.orangeCar = new ImageIcon("orangeCar.png");
		this.orangeCarOppositivePass = new ImageIcon("orangeCarOppositivePath.png");
		this.porscheCar = new ImageIcon("porscheCar.png");
		this.porscheCarOppositivePass = new ImageIcon("porscheCarOppositivePath.png");



		
		rightWhiteCarPath[0] = 530;
		rightWhiteCarPath[1] = 680;
		leftWhiteCarPath[0] = 210;
		leftWhiteCarPath[1] = 360;
		
		rightYellowCarPath[0] = 470;
		rightYellowCarPath[1] = 610;
		leftYellowCarPath[0] = 150;
		leftYellowCarPath[1] = 300;
		
		rightOrangeCarPath[0] = 440;
		rightOrangeCarPath[1] = 580;
		leftOrangeCarPath[0] = 140;
		leftOrangeCarPath[1] = 290;
		
		rightPorscheCarPath[0] = 510;
		rightPorscheCarPath[1] = 650;
		leftPorscheCarPath[0] = 210;
		leftPorscheCarPath[1] = 360;
		
		int ycar = 0;
		this.carObstacleArr = new CarObstacle[8000];
		this.rectangleObstacleArr = new RectangelObstacle[8000];
		for (int i = 0; i < this.carObstacleArr.length; i+=4) {
			// CarObstacle carObstacleArrIndex = null;
			CarObstacle carObstacleArrIndex = new CarObstacle(whiteCar, getRandom(rightWhiteCarPath), ycar - 700);
			this.carObstacleArr[i] = carObstacleArrIndex;
			int whiteCarArrIndexX = carObstacleArrIndex.getX();
			int whiteCarArrIndexY = carObstacleArrIndex.getY();

			// RectangelObstacle rectangleObstacleArrIndex = null;
			RectangelObstacle rectangleObstacleArrIndex = new RectangelObstacle(whiteCarArrIndexX,
					whiteCarArrIndexY , 105, 207, Color.blue);
			this.rectangleObstacleArr[i] = rectangleObstacleArrIndex;
			ycar = ycar - 700;
			
	/*------------------------------------------------------------------------------------------------------------------*/
			
			 carObstacleArrIndex = new CarObstacle(yellowCar, getRandom(rightYellowCarPath), ycar - 700);
			this.carObstacleArr[i + 1] = carObstacleArrIndex;
			int yellowCarArrIndexX = carObstacleArrIndex.getX();
			int yellowCarArrIndexY = carObstacleArrIndex.getY();

			// RectangelObstacle rectangleObstacleArrIndex = null;
			 rectangleObstacleArrIndex = new RectangelObstacle(yellowCarArrIndexX + 60,
					yellowCarArrIndexY , 105, 225, Color.blue);
			this.rectangleObstacleArr[i + 1] = rectangleObstacleArrIndex;
			ycar = ycar - 700;
			
	/*------------------------------------------------------------------------------------------------------------------*/

			 carObstacleArrIndex = new CarObstacle(orangeCar, getRandom(rightOrangeCarPath), ycar - 700);
				this.carObstacleArr[i + 2] = carObstacleArrIndex;
				int orangeCarArrIndexX = carObstacleArrIndex.getX();
				int orangeCarArrIndexY = carObstacleArrIndex.getY();

				// RectangelObstacle rectangleObstacleArrIndex = null;
				 rectangleObstacleArrIndex = new RectangelObstacle(orangeCarArrIndexX + 90,
						orangeCarArrIndexY + 85, 105, 205, Color.blue);
				this.rectangleObstacleArr[i + 2] = rectangleObstacleArrIndex;
				ycar = ycar - 700;
				
	/*------------------------------------------------------------------------------------------------------------------*/

				carObstacleArrIndex = new CarObstacle(porscheCar, getRandom(rightPorscheCarPath), ycar - 700);
				this.carObstacleArr[i + 3] = carObstacleArrIndex;
				int porscheCarArrIndexX = carObstacleArrIndex.getX();
				int porscheCarArrIndexY = carObstacleArrIndex.getY();

				// RectangelObstacle rectangleObstacleArrIndex = null;
				 rectangleObstacleArrIndex = new RectangelObstacle(porscheCarArrIndexX + 25 ,
						porscheCarArrIndexY + 10, 105, 235, Color.blue);
				this.rectangleObstacleArr[i + 3] = rectangleObstacleArrIndex;
				ycar = ycar - 700;
				
		}

		
		
		
		
		int ycaroppositive = 0;
		this.carObstacleOppositePathArr = new CarObstacleOppositePath[8000];
		this.rectangleObstacleOppositePathArr = new RectangleObstacleOppositePath[8000];
		
		for (int i = 0; i < this.carObstacleOppositePathArr.length; i+=4) {
			 CarObstacleOppositePath carObstacleArrIndexoppositive = new CarObstacleOppositePath(whiteCarOppositivePass, getRandom(leftWhiteCarPath),
					ycaroppositive - 700);
			this.carObstacleOppositePathArr[i] = carObstacleArrIndexoppositive;
			int whiteCarArrIndexX = carObstacleArrIndexoppositive.getX();
			int whiteCarArrIndexY = carObstacleArrIndexoppositive.getY();

			 RectangleObstacleOppositePath rectangleObstacleArrIndexoppositive = new RectangleObstacleOppositePath(whiteCarArrIndexX,
					 whiteCarArrIndexY, 105, 207, Color.blue);
			this.rectangleObstacleOppositePathArr[i] = rectangleObstacleArrIndexoppositive;
			ycaroppositive = ycaroppositive - 700;
			
	/*------------------------------------------------------------------------------------------------------------------*/
			
			 carObstacleArrIndexoppositive = new CarObstacleOppositePath(yellowCarOppositivePass, getRandom(leftYellowCarPath),
					ycaroppositive - 700);
			this.carObstacleOppositePathArr[i + 1] = carObstacleArrIndexoppositive;
			int yellowCarArrIndexX = carObstacleArrIndexoppositive.getX();
			int yellowCarArrIndexY = carObstacleArrIndexoppositive.getY();

			  rectangleObstacleArrIndexoppositive = new RectangleObstacleOppositePath(yellowCarArrIndexX + 60,
					yellowCarArrIndexY, 105, 225, Color.blue);
			this.rectangleObstacleOppositePathArr[i + 1] = rectangleObstacleArrIndexoppositive;
			ycaroppositive = ycaroppositive - 700;
			
	/*------------------------------------------------------------------------------------------------------------------*/
			
			carObstacleArrIndexoppositive = new CarObstacleOppositePath(orangeCarOppositivePass, getRandom(leftOrangeCarPath),
					ycaroppositive - 700);
			this.carObstacleOppositePathArr[i + 2] = carObstacleArrIndexoppositive;
			int orangeCarArrIndexX = carObstacleArrIndexoppositive.getX();
			int orangeCarArrIndexY = carObstacleArrIndexoppositive.getY();

			  rectangleObstacleArrIndexoppositive = new RectangleObstacleOppositePath(orangeCarArrIndexX + 70,
					orangeCarArrIndexY + 85, 105, 200, Color.blue);
			this.rectangleObstacleOppositePathArr[i + 2] = rectangleObstacleArrIndexoppositive;
			ycaroppositive = ycaroppositive - 700;
		
	/*------------------------------------------------------------------------------------------------------------------*/

			carObstacleArrIndexoppositive = new CarObstacleOppositePath(porscheCarOppositivePass, getRandom(leftPorscheCarPath),
					ycaroppositive - 700);
			this.carObstacleOppositePathArr[i + 3] = carObstacleArrIndexoppositive;
			int porscheCarArrIndexX = carObstacleArrIndexoppositive.getX();
			int porscheCarArrIndexY = carObstacleArrIndexoppositive.getY();

			  rectangleObstacleArrIndexoppositive = new RectangleObstacleOppositePath(porscheCarArrIndexX + 5,
					porscheCarArrIndexY + 25, 105, 233, Color.blue);
			this.rectangleObstacleOppositePathArr[i + 3] = rectangleObstacleArrIndexoppositive;
			ycaroppositive = ycaroppositive - 700;
		}
		Font myDeafaultFont = new Font("Arial",Font.BOLD,30);

		nameTextField = new JTextField();
		nameTextField.setBackground(Color.RED);
		nameTextField.setForeground(Color.blue);
		nameTextField.setFont(myDeafaultFont);
		nameTextField.setBounds(0, 0, 150, 30);
		this.add(nameTextField);
		nameTextField.setText(String.valueOf(counter));

		this.mainGameLoop();
		this.moveCars();
	}


	public void moveCars() {
		 Thread t = new Thread(() -> {
			 double oppositiveSpeed = 0.7;
				double speed = 0.4;   
			 int counter = 0;
		        int checkCounter = 0;
	        	while(true) {
	        	try {
	        		for (int i = 0; i < carObstacleOppositePathArr.length; i++) {
	        			counter ++;
	        			if(counter > checkCounter + 3)
	        			{
	        				oppositiveSpeed = oppositiveSpeed + 0.00000002;
	        				speed = speed + 0.00000002; 
		        			checkCounter = counter;
	        			}
	        		carObstacleOppositePathArr[i].moveDown(oppositiveSpeed);
	        		rectangleObstacleOppositePathArr[i].moveDown(oppositiveSpeed);  		
	        		carObstacleArr[i].moveDown(speed);
	        		rectangleObstacleArr[i].moveDown(speed);
	        		}
					Thread.sleep(1) ;
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
	        	}
	        });t.start();
	}
	
	public static int getRandom(int[] arr) {
		int rnd = new Random().nextInt(arr.length);
		return arr[rnd];
	}

	public void limits() {
		if (this.rectangle.getX() < 210 || this.car1.getX() < 210) {
			this.rectangle.setX(210);
			this.car1.setX(210);
		}

		if (this.rectangle.getX() > 670 || this.car1.getX() > 670) {
			this.rectangle.setX(670);
			this.car1.setX(670);
		}

		if (this.rectangle.getY() < 0 || this.car1.getY() < 0) {
			this.rectangle.setY(0);
			this.car1.setY(0);
		}

		if (this.rectangle.getY() > 490 || this.car1.getY() > 490) {
			this.rectangle.setY(490);
			this.car1.setY(490);
		}
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (int i = 0; i < carObstacleArr.length; i++) {
			this.rectangleObstacleArr[i].paint(g);
			this.rectangleObstacleOppositePathArr[i].paint(g);
			this.rectangle.paint(g);

		}
		this.roadBackgroung.paintIcon(this, g, 0, 0);
		this.car1.paint(g);
		

		for (int i = 0; i < carObstacleArr.length; i++) {
			{
				this.carObstacleArr[i].paint(g);
				this.carObstacleOppositePathArr[i].paint(g);
			}
		}
	}

	public void mainGameLoop() {
		Thread thred = new Thread(() -> {
			PlayerMovement playerMovement = new PlayerMovement(this.car1, this.rectangle);
			this.setFocusable(true);
			this.requestFocus();
			this.addKeyListener(playerMovement);
			first :
			while (true) {
				try {
					for (int i = 0; i < rectangleObstacleOppositePathArr.length; i++) {
						if (rectangle.checkColision1(rectangleObstacleOppositePathArr[i])) {
							EndPanel panel = new EndPanel();
							this.add(panel);
							break first ;
						}
					}
					for (int i = 0; i < rectangleObstacleArr.length; i++) {
						if(rectangle.checkColision2(rectangleObstacleArr[i])) {
							EndPanel panel = new EndPanel();
							this.add(panel);
							break first ;
						}
					}
					//this.moveTheCars();
				}catch(Exception e) {
					e.printStackTrace();
				}
				try {

					Thread.sleep(1);
					this.counter++;
					nameTextField.setText(String.valueOf(counter));
					repaint();
					this.limits();
					for (int i = 0; i < carObstacleArr.length; i++) {

					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		thred.start();
	}

}
