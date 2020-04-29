package sample;

import javafx.application.Application;
import javafx.stage.Stage;




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
