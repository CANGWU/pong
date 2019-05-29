import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class PongBall  {
	private int x;
	private int y;
	private int radius;
	private Color color;
	
	public PongBall(int x, int y, int radius, Color color) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		
		this.color = color;
	}
	public void draw(Graphics g) {
		g.setColor(color); 
		g.fillOval(x, y, radius, radius);
		g.setColor(Color.WHITE);
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
	
	
	
	

}
	

