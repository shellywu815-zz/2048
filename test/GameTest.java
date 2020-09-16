import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

/**
 * You can use this file (and others) to test your implementation.
 */

public class GameTest {

    @Test
    public void testGenerate() {
        GameBoard board = new GameBoard();
        // it's static so points to the same thing
        // and this is for initialization

        ArrayList<Square> before = new ArrayList<Square>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (GameBoard.getBoard()[i][j].getValue() != 0) {
                    before.add(GameBoard.getBoard()[i][j]);
                }
            }
        }
        ArrayList<Square> after = new ArrayList<Square>();
        GameBoard.generate();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (GameBoard.getBoard()[i][j].getValue() != 0) {
                    after.add(GameBoard.getBoard()[i][j]);
                }
            }
        }
        if (before.size() == 16) {
            assert (after.size() == 16);
        } else {
            assert (after.size() == before.size() + 1);
        }

    }

    /**
     * I could not really test the functions Up Down Left Right specifically since I
     * don't know what the board looks like at every second. But what I did here was
     * to check that before and after the operations, the sum of the squares do not
     * change. I used the printBoard function in GameBoard to make sure that my
     * functions were working.
     */
    @Test
    public void testUp() {
        GameBoard gb = new GameBoard(); 
        // it's static so points to the 
        //same thing and this is for initialization
        int beforeSum = 0;
        int beforeIndex = 0;
        ArrayList<Square> before = new ArrayList<Square>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                before.add(GameBoard.getBoard()[i][j]);
                beforeSum += before.get(beforeIndex).getValue();
                beforeIndex++;
            }
        }

        Game.getGame().up();
        int afterSum = 0;
        int afterIndex = 0;
        ArrayList<Square> after = new ArrayList<Square>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                after.add(GameBoard.getBoard()[i][j]);
                afterSum += after.get(afterIndex).getValue();
                afterIndex++;
            }
        }

        assertEquals(beforeSum, afterSum);
    }

    @Test
    public void testDown() {
        GameBoard gb = new GameBoard(); 
        // it's static so points to the 
        //same thing and this is for initialization
        int beforeSum = 0;
        int beforeIndex = 0;
        ArrayList<Square> before = new ArrayList<Square>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                before.add(GameBoard.getBoard()[i][j]);
                beforeSum += before.get(beforeIndex).getValue();
                beforeIndex++;
            }
        }

        Game.getGame().down();
        int afterSum = 0;
        int afterIndex = 0;
        ArrayList<Square> after = new ArrayList<Square>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                after.add(GameBoard.getBoard()[i][j]);
                afterSum += after.get(afterIndex).getValue();
                afterIndex++;
            }
        }

        assertEquals(beforeSum, afterSum);
    }

    @Test
    public void testLeft() {
        GameBoard gb = new GameBoard(); 
        // it's static so points to the same 
        //thing and this is for initialization
        int beforeSum = 0;
        int beforeIndex = 0;
        ArrayList<Square> before = new ArrayList<Square>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                before.add(GameBoard.getBoard()[i][j]);
                beforeSum += before.get(beforeIndex).getValue();
                beforeIndex++;
            }
        }

        Game.getGame().left();
        int afterSum = 0;
        int afterIndex = 0;
        ArrayList<Square> after = new ArrayList<Square>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                after.add(GameBoard.getBoard()[i][j]);
                afterSum += after.get(afterIndex).getValue();
                afterIndex++;
            }
        }

        assertEquals(beforeSum, afterSum);
    }

    @Test
    public void testRight() {
        GameBoard gb = new GameBoard();
        // it's static so points to the same
        // thing and this is for initialization
        int beforeSum = 0;
        int beforeIndex = 0;
        ArrayList<Square> before = new ArrayList<Square>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                before.add(GameBoard.getBoard()[i][j]);
                beforeSum += before.get(beforeIndex).getValue();
                beforeIndex++;
            }
        }

        Game.getGame().right();
        int afterSum = 0;
        int afterIndex = 0;
        ArrayList<Square> after = new ArrayList<Square>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                after.add(GameBoard.getBoard()[i][j]);
                afterSum += after.get(afterIndex).getValue();
                afterIndex++;
            }
        }

        assertEquals(beforeSum, afterSum);
    }

}
