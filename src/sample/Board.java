package sample;

/**
 *Holds variables that define the properties of the board.
 *
 * @author Daniel Borowski
 * @version 3.1
 */
public class Board {

    /**current score*/
    private int score;

    /**size of one rectangular field of the board*/
    private final int SQUARE;

    /**number of rectangular fields horizontally*/
    private final int X;

    /**number of rectangular fields vertically*/
    private final int Y;

    /**number of pixels vertically*/
    private final int HEIGHT;

    /**number of pixels horizontally*/
    private final int WIDTH;

    /**board array*/
    private int [][] COORDS;

    /**board singleton*/
    public static final Board INSTANCE = new Board();

    /**Constructor, constructs Board singleton*/
    private Board() {
        score = 0;
        SQUARE = 25;
        X = 10;
        Y = 24;
        HEIGHT = SQUARE * Y;
        WIDTH = SQUARE * X;
        COORDS = new int [10][24];

        if (INSTANCE != null) {
            throw new IllegalStateException("Singleton already constructed");
        }
    }

    /**
     * getter
     * @return returns current score
     */
    public int getScore() {
        return score;
    }

    /**
     * setter
     * @param score sets score to this value
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * getter
     * @return number of pixels horizontally
     */
    public int getX() {
        return X;
    }

    /**
     * getter
     * @return number of pixels vertically
     */
    public int getY() {
        return Y;
    }

    /**
     * getter
     * @param x index of an array
     * @param y index of an array
     * @return value in array of the given index
     */
    public int getCOORDS(int x, int y) {
        return COORDS[x][y];
    }

    /**
     * setter
     * @param x index of an array
     * @param y index of an array
     * @param value sets value in array in the given index
     */
    public void setCOORDS(int x, int y, int value) {
        this.COORDS[x][y] = value;
    }

    /**
     * getter
     * @return size of rectangular field building the board
     */
    public int getSQUARE() {
        return SQUARE;
    }

    /**
     * getter
     * @return height of the board in pixels
     */
    public int getHEIGHT() {
        return HEIGHT;
    }

    /**
     * getter
     * @return width of the board in pixels
     */
    public int getWIDTH() {
        return WIDTH;
    }

}
