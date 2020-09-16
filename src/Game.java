/**
 * CIS 120 Game HW
 * (c) University of Pennsylvania
 * @version 2.1, Apr 2017
 */

// imports necessary libraries for Java swing
import java.awt.*;

import javax.swing.*;

/**
 * Game Main class that specifies the frame and widgets of the GUI
 */
public class Game implements Runnable {
    private static GameBoard game = new GameBoard();
    private static JLabel scoreLabel;
    
    public static GameBoard getGame() {
        return game;
    }
    public static JLabel getScoreLabel() {
        return scoreLabel;
    }
    
    
    public void run() {

        JOptionPane.showMessageDialog(null, 
                "use left right up down arrows " + "on your keyboard to control!");
        final JFrame frame = new JFrame("2048");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Main playing area
        final Display dp = new Display();
        frame.add(dp, BorderLayout.CENTER);

        frame.setSize(350, 400);
        frame.setVisible(true);
        frame.setLocation(300, 300);

        scoreLabel = new JLabel();
        frame.add(scoreLabel, BorderLayout.NORTH);
    }

    /**
     * Main method run to start and run the game. Initializes the GUI elements
     * specified in Game and runs it. IMPORTANT: Do NOT delete! You MUST include
     * this in your final submission.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Game());
    }
}