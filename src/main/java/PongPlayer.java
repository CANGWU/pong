import java.awt.*;
public class PongPlayer {
	private String name;
	private int x;
	private int y;
	private int width;
	private int height;
	private Color color;
	private int point;

	public PongPlayer(String name, int x, int y, int width, int height, int point, Color color) {
		this.name = name;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = color;
		this.point = point;
	}
	public void draw(Graphics g) {
		g.setColor(color); 
		g.fillRect(x, y, width, height);
		g.drawRect(x, y, width, height);
	}

	/**
	 * if the player hit the ball
	 * @param x the location x of ball
	 * @param y the location y of ball
	 * @return
	 */
	public boolean isHitBall(int x, int y){
		if(y >= this.y && y <= this.y + this.height &&
				x >= this.x - this.width && x <= this.x + this.width){
			return true;
		}
		return false;
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


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}


	public void updatePoint(){
		this.point++;
	}
}
