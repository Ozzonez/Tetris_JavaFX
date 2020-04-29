package sample;

import javafx.application.Platform;
import javafx.scene.shape.Rectangle;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;

import java.util.Timer;
import java.util.TimerTask;

/**
 * One of the two controller classes.
 * Controls model and view. Implements timer which
 * is responsible for making the tetromino drop down
 * at constant rate.
 *
 * @author Daniel Borowski
 * @version 3.1
 *
 */
public class MainController {

    public static final MainController INSTANCE = new MainController();

    private MainController() {


        if (INSTANCE != null) {
            throw new IllegalStateException("Singleton already constructed");
        }
    }

    Controller controller = Controller.INSTANCE;
    Renderer renderer = Renderer.INSTANCE;
    Board board = Board.INSTANCE;
    /**reference to primaryStage*/
    Stage window;

    /**helps to define if the game has ended*/
    private int stuck = -1;

    /**reference to current tetromino being controlled by the user*/
    Tetromino tetromino;

    /**timer for the second thread which controlls the drop of the tetromino*/
    Timer T = new Timer(true);

    /**Timertask for the second thread which controlls the drop of the tetromino*/
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            Platform.runLater(new Runnable() {
                public void run() {

                    if(tetromino.a.getY() == 0 || tetromino.b.getY() == 0 ||tetromino.c.getY() == 0 ||tetromino.d.getY() == 0)
                        stuck++;
                    else
                        stuck=-1;

                    if(stuck == 3)
                    {
                        renderer.gameOver();
                    }

                    if(stuck < 1)
                        controller.moveDown(tetromino);
                }
            });
        }
    };


    /**
     * Starts new timer thread which makes tetromino drop down at certain rate.
     * Calls Renderer method initializeView.
     * @throws Exception Exception.
     */
    public void initGame() throws Exception
    {
        renderer.initializeView(window, tetromino);
        T.schedule(task, 0, 170);
    }

    /**
     * @param stuck Setter.
     */
    public void setStuck(int stuck) {
        this.stuck = stuck;
    }
}