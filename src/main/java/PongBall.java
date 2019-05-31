import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Objects;
import java.util.Random;

public class PongBall  {
	private int x;
	private int y;
	private int radius;
	private Color color;
	/**
	 * the moving speed of x
	 */
	private int speedX;

	/**
	 * the moving speed of y
	 */
	private int speedY;


	private Panel pongPanel;
	private PongPlayer p1;
	private PongPlayer p2;

	private PongPlayer lastHitPlayer;

	
	public PongBall(int x, int y, int speedX, int speedY,  int radius, Color color, Panel pongPanel, PongPlayer p1, PongPlayer p2) {
		this.x = x;
		this.y = y;
		this.speedX = speedX;
		this.speedY = speedY;
		this.radius = radius;
		this.color = color;
		this.pongPanel = pongPanel;
		this.p1 = p1;
		this.p2 = p2;
	}
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillOval(x, y, radius, radius);
		g.drawOval(x, y, radius,radius);
	}
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
 	}
	
	public int getRadisu() {
		return radius;
	}
	
	
	
	public Color getColor() {
		return color;
	}
	
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) { 
		this.y = y;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	

	public void setColor(Color color) {
		this.color = color;
	}


	/**
	 * the action of moving
	 */
	public void move(){

		// 边界与碰撞判断
		if(x <= 0 || x + radius >= pongPanel.getWidth()) {
			speedX = -speedX;
		}

		if(y <= 0 || y + radius >= pongPanel.getHeight()) {
			speedY = -speedY;
		}

		// if the player hit the ball or the ball is out of bound
		if(p1.isHitBall(x, y)){
			lastHitPlayer = p1;
			speedX = -speedX;
		}else if(p2.isHitBall(x, y)){
			lastHitPlayer = p2;
			speedX = -speedX;
		}else if(x <= 30 || x >= 550){
			if (Objects.nonNull(lastHitPlayer)) {
				lastHitPlayer.updatePoint();
			}
			resetLocation();
		}

		x += speedX;
		y += speedY;

		pongPanel.repaint();

	}

	/**
	 * reset the location of the ball before a new game
	 */
	public void resetLocation(){
		Random random = new Random(System.currentTimeMillis());

		do {
			x = random.nextInt(pongPanel.getWidth());
		} while (x <= 200 || x >= 380);
		y = random.nextInt(pongPanel.getHeight());
		if(random.nextBoolean()){
			speedX = -speedX;
		}
		if(random.nextBoolean()){
			speedY = -speedY;
		}

		lastHitPlayer = null;


	}

	

}
	

