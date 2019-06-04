import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

/**
 * ScorePanle
 *
 * @author xuan
 * @date 2019-05-31
 */
public class ScorePanel extends JPanel implements Observer {
    private int p1Score = 0;
    private int p2Score = 0;
    private JLabel scoreLabel;
    private JButton closeButton;
    private Panel pongPanel;
    private final static String padding = "                                   ";



    public ScorePanel(Panel panel){
        this.pongPanel = panel;
        scoreLabel = new JLabel(padding + p1Score + " : " + p2Score, JLabel.CENTER);
        closeButton = new JButton("End the game");
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               endGame();
            }
        });
        this.setLayout(new BorderLayout());

        this.add(BorderLayout.CENTER, scoreLabel);
        this.add(BorderLayout.EAST, closeButton);

    }




    @Override
    public void update(Observable o, Object arg) {
        // reset the score panel
        if(o instanceof PongBall){
            PongBall pongBall = (PongBall) o;
            p1Score = pongBall.getP1().getPoint();
            p2Score = pongBall.getP2().getPoint();
            scoreLabel.setText(padding + p1Score + " : " + p2Score);
            if(p1Score >= 5 || p2Score >= 5){
                endGame();
            }
        }
    }


    private  void endGame(){
        pongPanel.closeGame();
        String dialogue;
        if(p1Score > p2Score){
            dialogue = "Congratulations! P1(on the left) won this game!";
        }else if(p2Score > p1Score){
            dialogue = "Congratulations! P2(on the right) won this game!";
        }else {
            dialogue = "This game is drew.";
        }
        JOptionPane.showMessageDialog(getParent(), "Current score is "+ p1Score + " : " + p2Score + ".\n" + dialogue, "Game Over!", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
