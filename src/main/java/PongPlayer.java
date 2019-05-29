import java.awt.*;
public class PongPlayer {
	private int x;
	private int y;
	private int width;
	private int height;
	private Color color;
	
	public PongPlayer(int x, int y, int width, int height, Color color) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
	}
	public void draw(Graphics g) {
		g.setColor(color); 
		g.fillRect(x, y, width, height);
		g.drawRect(x, y, width, height);
	}
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
 	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
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
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}


}
