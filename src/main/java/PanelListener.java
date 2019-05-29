import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class PanelListener implements KeyListener, ActionListener{
	private Panel panel;
	int startX, starY;
	
	public PanelListener(Panel p) {
		panel = p;
		panel.addKeyListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		char ch = e.getKeyChar();  // The character typed.

        if (ch == 'W') {
            panel.shiftDirection(ch);
             // Redraw panel with new color.
        }
        else if (ch == 'S') {
            panel.shiftDirection(ch);
        }
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		if(code == KeyEvent.VK_UP ||code == KeyEvent.VK_DOWN) {
			panel.shiftDirection(code);
		}
		panel.repaint();
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


}
