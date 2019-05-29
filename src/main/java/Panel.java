import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel extends JPanel {
	private PongPlayer[] pongPlayers = new PongPlayer[2];
	private int playerUp, playerLeft, player2Up, player2Right;
	private Color playerColor;
	private PongPlayer player1= new PongPlayer(getWidth()+30,getHeight()+50,15,80, Color.WHITE);
	private PongPlayer player2 = new PongPlayer(getWidth()+550,getHeight()+50,15,80, Color.WHITE);
	private PongBall ball = new PongBall(getWidth()+200, getHeight()+50, 10, Color.WHITE);

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);	
		int width = 10;
		int height = 30;

		g.setColor(Color.WHITE);
		g.fillRect(getWidth()/2,getHeight()/2+150,width,height);
		g.fillRect(getWidth()/2,getHeight()/2+100,width,height);
		g.fillRect(getWidth()/2,getHeight()/2+50,width,height);
		g.fillRect(getWidth()/2,getHeight()/2,width,height);
		g.fillRect(getWidth()/2,getHeight()/2-50,width,height);
		g.fillRect(getWidth()/2,getHeight()/2-100,width,height);
		g.fillRect(getWidth()/2,getHeight()/2-150,width,height);
		
		
		ball.draw(g);
		player1.draw(g);
		player2.draw(g);
		
	
		
	}
	public Panel() {
		playerUp = 100;
		playerLeft = 100;
		playerColor = Color.WHITE;
		
		
		this.setBackground(Color.BLACK);
	}
	
	public void shiftDirection(int code) {
    	if (code == KeyEvent.VK_UP) {
    		player2.setY(player2.getY()-10);
    	} else if (code == KeyEvent.VK_DOWN) {
    		player2.setY(player2.getY()+10);
    	} 
    }
	public void shiftDirection(char code) {
		if (code == 'W' || code == 'w') {
			player1.setY(player1.getY()-10);
    	} else if (code == 'S' || code == 's') {
    		player1.setY(player1.getY()+10);
    	} 
	}
}
