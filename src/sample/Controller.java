package sample;


/**One of the two controller classes. Implements methods which are responsible for controlling
 * model and view and handling events.
 *
 * @author Daniel Borowski
 * @version 3.1
 */
public class Controller {

    /**Controller singleton*/
    public static final Controller INSTANCE = new Controller();

    /**reference to MainController singleton*/
    private MainController mainController;

    /**reference to Renderer singleton*/
    private Renderer renderer = Renderer.INSTANCE;

    /**reference to Board singleton*/
    private Board board = Board.INSTANCE;




    /**Constructonr, constructs Controller singleton*/
    private Controller() {


        if (INSTANCE != null) {
            throw new IllegalStateException("Singleton already constructed");
        }
    }


    /**
     * Used to handle key event LEFT, calls moveLeft method of the Tetromino class.
     *
     * @param tetromino This tetromino is being moved left.
     */
    public void moveLeft(Tetromino tetromino)
    {
        tetromino.moveLeft();
    }

    /**
     * Used to handle key event RIGHT, calls moveLeft method of the Tetromino class.
     *
     * @param tetromino This tetromino is being moved right.
     */
    public void moveRight(Tetromino tetromino)
    {
        tetromino.moveRight();
    }

    /**
     * Used to handle key event DOWN and, calls moveDown method of the Tetromino class,
     * checks if the tetromino has touched the end of the map or other brick. If yes
     * creates new tetromino at the top of the map and calls removeRows method of Renderer class.
     *
     * @param tetromino This tetromino is being moved down.
     */
    public void moveDown(Tetromino tetromino) {
        if (tetromino.moveDown() == 0) {

            mainController = MainController.INSTANCE;
            mainController.tetromino = new Tetromino();
            tetromino = mainController.tetromino;

            renderer.removeRows();

            renderer.setTetromino(tetromino);
            renderer.addToStage(tetromino);
        }

    }

    /**
     * Changes the rotation state of the tetromino.
     *
     * @param tetromino Tetromino to rotate.
     */
    public void rotate(Tetromino tetromino)
    {
        tetromino.rotation();
    }

    /**
     *Starts new game by calling Renderer and Board methods.
     */
    public void newGame()
    {
        renderer.clearBoard();
        board.setScore(0);
        renderer.score.setText("Score: " + board.getScore());
        renderer.lastReward.setText("Last reward");
        mainController.tetromino = new Tetromino();
        renderer.setTetromino(mainController.tetromino);
        renderer.addToStage(mainController.tetromino);
        mainController.setStuck(-1);

    }


}