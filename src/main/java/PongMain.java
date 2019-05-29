import javax.swing.JFrame;

public class PongMain {

	public static void main(String[] args) {
		JFrame window = new JFrame("Pong Panel");
		window.setSize(600, 400);
		window.setLocation(100, 200);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Panel pongPanel = new Panel();
		window.setResizable(false);
		new PanelListener(pongPanel);
		window.setContentPane(pongPanel);
		window.setVisible(true);
		// set panel to get the focus of input
		pongPanel.requestFocus();
		
		
	}
}