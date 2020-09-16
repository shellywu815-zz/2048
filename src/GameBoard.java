
import java.util.LinkedList;

public class GameBoard {

    private static Square[][] board;
    private static LinkedList<Square> vacantSpots;
    private static int scores;
    
    public static Square[][] getBoard() {
        return board;
    }
    
    public static LinkedList<Square> getVacantSpots() {
        return vacantSpots;
    }
    
    public static int getScores() {
        return scores;
    }

    public GameBoard() {
        board = new Square[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                board[i][j] = new Square(i, j, 1, 1, 0);
            }
        }
        // at the beginning there should be only one square
        generate();
    }

    public void printBoard() {
        for (int i = 0; i < 4; i++) {
            System.out.println(board[i][0].getValue() + " " 
                    + board[i][1].getValue() + " " + board[i][2].getValue()
                    + " " + board[i][3].getValue() + " ");
        }
    }

    public void up() {

        for (int i = 0; i < 4; i++) {

            // for checking where there is a vacant and can be moved to
            for (int j = 1; j < 4; j++) {
                // the block to the up of Board[i][j] is Board[i][k]
                int k = j - 1;
                // if this square is already vacant, then there's no further operation that
                // needs to be done
                if (board[i][k].getValue() != 0) {
                    continue;
                }
                //
                while (k >= 0 && board[i][k].getValue() == 0) {
                    k--;
                }
                k++;
                board[i][k].setValue(board[i][j].getValue());
                board[i][j].setValue(0);
            }

            // merging part
            for (int j = 1; j < 4; j++) {
                if (board[i][j - 1].getValue() == board[i][j].getValue() 
                        && board[i][j - 1].getValue() != 0) {
                    board[i][j].setValue(0);
                    board[i][j - 1].setValue(board[i][j - 1].getValue() * 2);
                    scores += board[i][j - 1].getValue();
                }
            }

            for (int j = 1; j < 4; j++) {
                // the block to the up of Board[i][j] is Board[i][k]
                int k = j - 1;
                // if this square is already vacant, then there's no further operation that
                // needs to be done
                if (board[i][k].getValue() != 0) {
                    continue;
                }
                //
                while (k >= 0 && board[i][k].getValue() == 0) {
                    k--;
                }
                k++;
                board[i][k].setValue(board[i][j].getValue());
                board[i][j].setValue(0);
            }

        }

    }

    public void down() {
        for (int i = 0; i < 4; i++) {

            // for checking where there is a vacant and can be moved to
            for (int j = 2; j >= 0; j--) {
                // the block to the up of Board[i][j] is Board[i][k]
                int k = j + 1;
                // if this square is already vacant, then there's no further operation that
                // needs to be done
                if (board[i][k].getValue() != 0) {
                    continue;
                }
                
                while (k < 4 && board[i][k].getValue() == 0) {
                    k++;
                }
                k--;
                board[i][k].setValue(board[i][j].getValue());
                board[i][j].setValue(0);
            }

            // merging part
            for (int j = 2; j >= 0; j--) {
                if (board[i][j + 1].getValue() == board[i][j].getValue() 
                        && board[i][j + 1].getValue() != 0) {
                    board[i][j].setValue(0);
                    board[i][j + 1].setValue(board[i][j + 1].getValue() * 2);
                    scores += board[i][j + 1].getValue();
                }
            }

            for (int j = 2; j >= 0; j--) {
                // the block to the up of Board[i][j] is Board[i][k]
                int k = j + 1;
                // if this square is already vacant, then there's no further operation that
                // needs to be done
                if (board[i][k].getValue() != 0) {
                    continue;
                }
                //
                while (k < 4 && board[i][k].getValue() == 0) {
                    k++;
                }
                k--;
                board[i][k].setValue(board[i][j].getValue());
                board[i][j].setValue(0);
            }

        }

    }

    public void left() {
        for (int i = 0; i < 4; i++) {

            // for checking where there is a vacant and can be moved to
            for (int j = 1; j < 4; j++) {
                // the block to the up of Board[i][j] is Board[i][k]
                int k = j - 1;
                // if this square is already vacant, then there's no further operation that
                // needs to be done
                if (board[k][i].getValue() != 0) {
                    continue;
                }
                //
                while (k >= 0 && board[k][i].getValue() == 0) {
                    k--;
                }
                k++;
                board[k][i].setValue(board[j][i].getValue());
                board[j][i].setValue(0);
            }

            // merging part
            for (int j = 1; j < 4; j++) {
                if (board[j - 1][i].getValue() == board[j][i].getValue() 
                        && board[j - 1][i].getValue() != 0) {
                    board[j][i].setValue(0);
                    board[j - 1][i].setValue(board[j - 1][i].getValue() * 2);
                    scores += board[j - 1][i].getValue();
                }
            }

            for (int j = 1; j < 4; j++) {
                // the block to the up of Board[i][j] is Board[i][k]
                int k = j - 1;
                // if this square is already vacant, then there's no further operation that
                // needs to be done
                if (board[k][i].getValue() != 0) {
                    continue;
                }
                //
                while (k >= 0 && board[k][i].getValue() == 0) {
                    k--;
                }
                k++;
                board[k][i].setValue(board[j][i].getValue());
                board[j][i].setValue(0);
            }

        }

    }

    public void right() {
        for (int i = 0; i < 4; i++) {

            // for checking where there is a vacant and can be moved to
            for (int j = 2; j >= 0; j--) {
                // the block to the up of Board[i][j] is Board[i][k]
                int k = j + 1;
                // if this square is already vacant, then there's no further operation that
                // needs to be done
                if (board[k][i].getValue() != 0) {
                    continue;
                }
                while (k < 4 && board[k][i].getValue() == 0) {
                    k++;
                }
                k--;
                board[k][i].setValue(board[j][i].getValue());
                board[j][i].setValue(0);
            }

            // merging part
            for (int j = 2; j >= 0; j--) {
                if (board[j + 1][i].getValue() == board[j][i].getValue() 
                        && board[j + 1][i].getValue() != 0) {
                    board[j][i].setValue(0);
                    board[j + 1][i].setValue(board[j + 1][i].getValue() * 2);
                    scores += board[j + 1][i].getValue();
                }
            }

            for (int j = 2; j >= 0; j--) {
                // the block to the up of Board[i][j] is Board[i][k]
                int k = j + 1;
                // if this square is already vacant, then there's no further operation that
                // needs to be done
                if (board[k][i].getValue() != 0) {
                    continue;
                }
                //
                while (k < 4 && board[k][i].getValue() == 0) {
                    k++;
                }
                k--;
                board[k][i].setValue(board[j][i].getValue());
                board[j][i].setValue(0);
            }

        }
    }

    public static void generate() {
        vacantSpots = new LinkedList<Square>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (board[i][j].getValue() == 0) {
                    vacantSpots.add(board[i][j]);
                }
            }
        }
        if (vacantSpots.size() == 0) {
            return;
        } else {
            int squareToInsert = (int) (Math.random() * vacantSpots.size());
            int value = 4;
            if (Math.random() > 0.333) {
                value = 2;
            }

            vacantSpots.get(squareToInsert).setValue(value);

        }

    }

    public static boolean shouldGameOver() {
        if (vacantSpots.size() == 0) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (i != 3 && j != 3) {
                        if (board[i][j + 1].getValue() == board[i][j].getValue()
                                || board[i + 1][j].getValue() == board[i][j].getValue()) {
                            return false;
                        }

                    } else if (i == 3 && j != 3) {
                        if (board[i][j + 1].getValue() == board[i][j].getValue()) {
                            return false;
                        }
                    } else if (i != 3 && j == 3) {
                        if (board[i + 1][j].getValue() == board[i][j].getValue()) {
                            return false;
                        }
                    }

                }
            }
            return true;
        }
        return false;

    }

    public static void reset() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                board[i][j].setValue(0);
            }
        }
        generate();
    }

}
