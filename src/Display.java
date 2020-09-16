
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Display extends JPanel {

    public Display() {
        setFocusable(true);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                Command.controlDirection(e);
                repaint();
            }
        });

    }

    @Override
    protected void paintComponent(Graphics g) {
        g.clearRect(0, 0, 400, 400);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                GameBoard.getBoard()[i][j].draw(g);
            }
        }
    }

}
