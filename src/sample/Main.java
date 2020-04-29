package sample;

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
 * Initializes MainController class.
 */
public class Main extends Application {


    /**
     *
     * @param primaryStage stage for application
     * @throws Exception Exception.
     */
    @Override
    public void start(Stage primaryStage) throws Exception{

        MainController mainController = MainController.INSTANCE;
        mainController.window = primaryStage;
        mainController.tetromino = new Tetromino();
        mainController.initGame();
    }

    /**
     * Main method of Main class.
     * @param args used to create application
     */
    public static void main(String[] args) {
        launch(args);
    }
}
