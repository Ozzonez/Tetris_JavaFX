package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.*;
import javafx.stage.Stage;

import javafx.scene.input.KeyCode;

import java.io.FileInputStream;
import java.util.Vector;

/**
 * Class responsible for the rendering of the application
 *
 * @author Daniel Borowski
 * @version 3.1
 */
public class Renderer {


    public static final Renderer INSTANCE = new Renderer();

    Controller controller = Controller.INSTANCE;

    Board board = Board.INSTANCE;
    /** reference to a currently controlled tetromino*/
    private Tetromino tetromino;
    /** layout*/
    private Pane group = new Pane();
    /** scene*/
    private Scene scene = new Scene(group, board.getWIDTH() + 170, board.getHEIGHT());
    /** text field for displaying last reward*/
    Text lastReward = new Text(260, 300, "Last reward");
    /** text field for displaying the score*/
    Text score = new Text(260, 120, "Score: ");
    /** text field for displaying game over information*/
    Text gameOver = new Text(5, 300, "GAME OVER!");


    private Renderer() {


        if (INSTANCE != null) {
            throw new IllegalStateException("Singleton already constructed");
        }
    }
    /**
     * Adds new tetromino to the stage
     *
      * @param tetromino adds this to the stage
     */
    public void addToStage(Tetromino tetromino)
    {
        group.getChildren().addAll(tetromino.a, tetromino.b, tetromino.c, tetromino.d);

    }

    /**
     * Initializes the view. Renders all essential textfields, shapes and backgrounds.
     *
     * @param stage stage to used for displaying
     * @param passedTetromino first tetromino to render
     * @throws Exception Exception.
     */
    public void initializeView(Stage stage, Tetromino passedTetromino) throws Exception{

        tetromino = passedTetromino;


        Image image = new Image(new FileInputStream("dddd.png"));
        ImageView imageView = new ImageView(image);
        imageView.setX(250);
        imageView.setY(0);
        group.getChildren().add(imageView);


        score.setFont(new Font("Book Antiqua", 30));
        score.setFill(Color.GOLDENROD);
        group.getChildren().add(score);
        score.setText("Score: " + board.getScore());


        lastReward.setFont(new Font("Book Antiqua", 30));
        lastReward.setFill(Color.GOLDENROD);
        group.getChildren().add(lastReward);


        BackgroundImage myBI= new BackgroundImage(new Image("file:gh.png",board.getWIDTH() ,board.getHEIGHT(),false,true),
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        group.setBackground(new Background(myBI));

        group.getChildren().addAll(tetromino.a, tetromino.b, tetromino.c, tetromino.d);
        stage.setScene(scene);
        stage.setTitle("Tetris");
        stage.show();
        stage.setOnCloseRequest(windowEvent -> System.out.println("najs aleganckie wyjscie")); // aleganckie wyjscie, zakancza wszystkie thready ktorych nie zakonczyloby wyjscie z samego windowa (timer)

        scene.setOnKeyPressed(event -> {
            if(event.getCode() == KeyCode.LEFT) {
                controller.moveLeft(tetromino); // bierze aktualny static tetromino, aktualizowany w moveDown
            }
            else if(event.getCode() == KeyCode.RIGHT)
            {
                controller.moveRight(tetromino);
            }
            else if(event.getCode() == KeyCode.DOWN)
            {
                controller.moveDown(tetromino);
            }
            else if(event.getCode() == KeyCode.SPACE)
            {
                controller.rotate(tetromino);
            }
            else if(event.getCode() == KeyCode.X)
            {
                controller.newGame();
            }

        });
    }

    /**
     * Method used for removing full rows in the game of tetris.
     */
    public void removeRows() {
        Vector<Node> original = new Vector<Node>();
        Vector<Node> updated = new Vector<Node>();
        int[] linesToRemove = new int[4];
        int numRect = 0; // number of rectangles in one row
        int iterator = -1;


        for (int i = 0; i < board.getY(); i++) {
            for (int j = 0; j < board.getX(); j++) {
                if (board.getCOORDS(j, i) == 1)
                    numRect++;
            }
            if (numRect == board.getX()) {
                iterator++;
                linesToRemove[iterator] = i;
            }
            numRect = 0;
        }
        int iterator2 = 0;

        if(iterator == 3) {
            board.setScore(board.getScore() + 50);
            lastReward.setText("Last reward \n    TETRIS !");
            score.setText("Score: " + board.getScore());
        }
        else if(iterator == 2) {
            board.setScore(board.getScore() + 30);
            lastReward.setText("Last reward \n    x3 !");
            score.setText("Score: " + board.getScore());
        }
        else if(iterator == 1) {
            board.setScore(board.getScore() + 20);
            lastReward.setText("Last reward \n    x2 !");
            score.setText("Score: " + board.getScore());
        }
        else if(iterator == 0) {
            board.setScore(board.getScore() + 10);
            score.setText("Score: " + board.getScore());
            lastReward.setText("Last reward \n    x1 !");

        }



        if (iterator >= 0) {
            do {
                for(int i = 0; i < board.getX(); i++)
                    for(int j = 0; j < board.getY(); j++)
                        board.setCOORDS(i, j, 0);

                for (Node element : group.getChildren()) {
                    if (element instanceof Rectangle)
                        original.add(element);
                }

                for (Node element : original)
                {
                    Rectangle temp = (Rectangle) element;
                    if ((int) temp.getY() / board.getSQUARE() == linesToRemove[iterator2]) // do usuniecia
                    {
                        group.getChildren().remove(temp);
                    } else
                        updated.add(temp);
                }

                for (Node element : updated) {
                    Rectangle temp = (Rectangle) element;
                    if ((int) temp.getY() / board.getSQUARE() < linesToRemove[iterator2]) {
                        temp.setY(temp.getY() + board.getSQUARE());
                    }
                }


                original.clear();
                updated.clear();
                iterator2++;
                iterator--;

                for (Node element : group.getChildren())
                {
                    if (element instanceof Rectangle) {
                        Rectangle temp = (Rectangle) element;
                        board.setCOORDS((int) temp.getX() / board.getSQUARE(), (int) temp.getY() / board.getSQUARE(), 1);

                    }
                }

            } while (iterator >= 0);


        }
    }

    /**
     * Method used for clearing the game board.
     */
    public void clearBoard()
    {

        Vector<Node> v = new Vector<Node>();

        for (Node element : group.getChildren()) {
            if (element instanceof Rectangle)
                v.add(element);
        }

        for(int i = 0; i < board.getX(); i++)
            for(int j = 0; j < board.getY(); j++)
                board.setCOORDS(i, j, 0);

        for (Node element : v)
        {

            Rectangle temp = (Rectangle) element;
            group.getChildren().remove(temp);

        }

        group.getChildren().remove(gameOver);



    }

    /**
     * Method used for displaying a game over message.
     */
    public void gameOver()
    {
        gameOver.setFont(new Font("Book Antiqua", 38));
        gameOver.setFill(Color.RED);
        group.getChildren().add(gameOver);

    }

    /**
     * setter
     * @param tetromino new tetromino field reference
     */
    public void setTetromino(Tetromino tetromino) {
        this.tetromino = tetromino;
    }

}