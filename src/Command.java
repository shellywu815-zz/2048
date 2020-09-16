import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;

public class Command {
    public static void controlDirection(KeyEvent key) {

        if (key.getKeyCode() == KeyEvent.VK_UP) {
            Game.getGame().up();
        } else if (key.getKeyCode() == KeyEvent.VK_DOWN) {
            Game.getGame().down();
        } else if (key.getKeyCode() == KeyEvent.VK_LEFT) {
            Game.getGame().left();
        } else if (key.getKeyCode() == KeyEvent.VK_RIGHT) {
            Game.getGame().right();
        } else {
            return;
        }

        Game.getScoreLabel().setText("Scores: " + GameBoard.getScores());

        // checks if the game is over everytime after a key is pressed.
        GameBoard.generate();
        if (GameBoard.shouldGameOver()) {
            GameBoard.reset();
            JOptionPane.showMessageDialog(null, "you lost!");
        }
    }

}
