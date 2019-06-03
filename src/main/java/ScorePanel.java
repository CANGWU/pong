import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

/**
 * ScorePanle
 *
 * @author xuan
 * @date 2019-05-31
 */
public class ScorePanel extends JPanel implements Observer {
    private int p1Score;
    private int p2Score;
    private JLabel scoreLabel;



    public ScorePanel(int p1Score, int p2Score){
        this.p1Score = p1Score;
        this.p2Score = p2Score;
        scoreLabel = new JLabel(p1Score + " : " + p2Score);
        this.add(scoreLabel);

    }


    @Override
    public void update(Observable o, Object arg) {
        // reset the score panel
        if(o instanceof PongBall){
            PongBall pongBall = (PongBall) o;
            p1Score = pongBall.getP1().getPoint();
            p2Score = pongBall.getP2().getPoint();
            scoreLabel.setText(p1Score + " : " + p2Score);
        }
    }
}
