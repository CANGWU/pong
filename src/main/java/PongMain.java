import javax.swing.JFrame;
import java.awt.*;

public class PongMain {

	public static void main(String[] args) {
		JFrame window = new JFrame("Pong Panel");
		window.setSize(600, 400);
		window.setLocation(100, 200);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Panel pongPanel = new Panel();
		ScorePanel scorePanel = new ScorePanel(pongPanel);
		pongPanel.addPongBallListener(scorePanel);
		window.setResizable(false);
		new PanelListener(pongPanel);
		window.setLayout(new BorderLayout());
		window.add(BorderLayout.CENTER, pongPanel);
		window.add(BorderLayout.NORTH, scorePanel);
		window.setVisible(true);
		// set panel to get the focus of input
		pongPanel.requestFocus();

		
	}
}