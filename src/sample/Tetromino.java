package sample;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

/**
 * The Model class represents four rectangles which will build all 7 tetromino shapes.
 *
 * @author Daniel Borowski
 * @version 3.1
 */
public class Tetromino {

    Board board = Board.INSTANCE;
    /**one of four rectangles building tetromino*/
    Rectangle a;
    /**one of four rectangles building tetromino*/
    Rectangle b;
    /**one of four rectangles building tetromino*/
    Rectangle c;
    /**one of four rectangles building tetromino*/
    Rectangle d;

    /**name of the tetromino shape*/
    char name;

    /**current rotation*/
    int currentRotation = 0;


    /**
     * Constructor, constructs new random tetromino object.
     */
    public Tetromino()
    {
        int randomized = (int) (Math.random() * 69);
        a = new Rectangle(24, 24);
        b = new Rectangle(24, 24);
        c = new Rectangle(24, 24);
        d = new Rectangle(24, 24);




        if(randomized <= 9) // T shape
        {
            a.setX(3 * board.getSQUARE());
            a.setY(0);
            b.setX(4 * board.getSQUARE());
            b.setY(0);
            c.setX(5 * board.getSQUARE());
            c.setY(0);
            d.setX(4 * board.getSQUARE());
            d.setY(board.getSQUARE());
            name = 'T';

            Image filling = new Image("file:purple.png");

            a.setFill(new ImagePattern(filling, 0, 0, 1, 1, true));
            b.setFill(new ImagePattern(filling, 0, 0, 1, 1, true));
            c.setFill(new ImagePattern(filling, 0, 0, 1, 1, true));
            d.setFill(new ImagePattern(filling, 0, 0, 1, 1, true));
        }
        else if(randomized <= 19) // I shape
        {
            a.setX(3 * board.getSQUARE());
            a.setY(0);
            b.setX(4 * board.getSQUARE());
            b.setY(0);
            c.setX(5 * board.getSQUARE());
            c.setY(0);
            d.setX(6 * board.getSQUARE());
            d.setY(0);
            name = 'I';

            Image filling = new Image("file:silver.png");

            a.setFill(new ImagePattern(filling, 0, 0, 1, 1, true));
            b.setFill(new ImagePattern(filling, 0, 0, 1, 1, true));
            c.setFill(new ImagePattern(filling, 0, 0, 1, 1, true));
            d.setFill(new ImagePattern(filling, 0, 0, 1, 1, true));
        }
        else if (randomized <= 29) // O shape
        {
            a.setX(4 * board.getSQUARE());
            a.setY(0);
            b.setX(5 * board.getSQUARE());
            b.setY(0);
            c.setX(4 * board.getSQUARE());
            c.setY(board.getSQUARE());
            d.setX(5 * board.getSQUARE());
            d.setY(board.getSQUARE());
            name = 'O';

            Image filling = new Image("file:gold.png");

            a.setFill(new ImagePattern(filling, 0, 0, 1, 1, true));
            b.setFill(new ImagePattern(filling, 0, 0, 1, 1, true));
            c.setFill(new ImagePattern(filling, 0, 0, 1, 1, true));
            d.setFill(new ImagePattern(filling, 0, 0, 1, 1, true));
        }
        else if(randomized <= 39) // J shape
        {
            a.setX(5 * board.getSQUARE());
            a.setY(0);
            b.setX(5 * board.getSQUARE());
            b.setY(board.getSQUARE());
            c.setX(5 * board.getSQUARE());
            c.setY(2 * board.getSQUARE());
            d.setX(4 * board.getSQUARE());
            d.setY(2 * board.getSQUARE());
            name = 'J';

            Image filling = new Image("file:blue.png");

            a.setFill(new ImagePattern(filling, 0, 0, 1, 1, true));
            b.setFill(new ImagePattern(filling, 0, 0, 1, 1, true));
            c.setFill(new ImagePattern(filling, 0, 0, 1, 1, true));
            d.setFill(new ImagePattern(filling, 0, 0, 1, 1, true));
        }
        else if(randomized <= 49) // L shape
        {
            a.setX(4 * board.getSQUARE());
            a.setY(0);
            b.setX(4 * board.getSQUARE());
            b.setY(board.getSQUARE());
            c.setX(4 * board.getSQUARE());
            c.setY(2 * board.getSQUARE());
            d.setX(5 * board.getSQUARE());
            d.setY(2 * board.getSQUARE());
            name = 'L';

            Image filling = new Image("file:pink.png");

            a.setFill(new ImagePattern(filling, 0, 0, 1, 1, true));
            b.setFill(new ImagePattern(filling, 0, 0, 1, 1, true));
            c.setFill(new ImagePattern(filling, 0, 0, 1, 1, true));
            d.setFill(new ImagePattern(filling, 0, 0, 1, 1, true));
        }
        else if(randomized <= 59) // S shape
        {
            a.setX(5 * board.getSQUARE());
            a.setY(0);
            b.setX(4 * board.getSQUARE());
            b.setY(0);
            c.setX(4 * board.getSQUARE());
            c.setY(board.getSQUARE());
            d.setX(3 * board.getSQUARE());
            d.setY(board.getSQUARE());
            name = 'S';

            Image filling = new Image("file:green.png");

            a.setFill(new ImagePattern(filling, 0, 0, 1, 1, true));
            b.setFill(new ImagePattern(filling, 0, 0, 1, 1, true));
            c.setFill(new ImagePattern(filling, 0, 0, 1, 1, true));
            d.setFill(new ImagePattern(filling, 0, 0, 1, 1, true));
        }
        else // Z shape
        {
            a.setX(4 * board.getSQUARE());
            a.setY(0);
            b.setX(5 * board.getSQUARE());
            b.setY(0);
            c.setX(5 * board.getSQUARE());
            c.setY(board.getSQUARE());
            d.setX(6 * board.getSQUARE());
            d.setY(board.getSQUARE());
            name = 'Z';

            Image filling = new Image("file:red.png");

            a.setFill(new ImagePattern(filling, 0, 0, 1, 1, true));
            b.setFill(new ImagePattern(filling, 0, 0, 1, 1, true));
            c.setFill(new ImagePattern(filling, 0, 0, 1, 1, true));
            d.setFill(new ImagePattern(filling, 0, 0, 1, 1, true));
        }


        a.setArcWidth(10);
        a.setArcHeight(10);
        b.setArcWidth(10);
        b.setArcHeight(10);
        c.setArcWidth(10);
        c.setArcHeight(10);
        d.setArcWidth(10);
        d.setArcHeight(10);

    }

    /**
     * changes currentRotation value
     */
    public void rotate()
    {
        if(currentRotation == 3)
            currentRotation = 0;
        else
            currentRotation++;

    }

    /**
     * getter
     * @return name of the tetromino
     */
    public char getName() {
        return name;
    }

    /**
     * getter
     * @return currentRotation
     */
    public int getCurrentRotation() {
        return currentRotation;
    }


    /**
     * Rotates the tetromino object. Each tetromino shape can be rotated to four different states.
     */
    public void rotation()
    {
        switch(name)
        {
            case 'T':
                if(getCurrentRotation() == 0 && rectangleChangePosition(a, 1, -1) == 1
                        && rectangleChangePosition(d, -1, -1) == 1 && rectangleChangePosition(c, -1, 1) == 1)
                {
                    a.setX(a.getX() + board.getSQUARE());
                    a.setY(a.getY() - board.getSQUARE());
                    d.setX(d.getX() - board.getSQUARE());
                    d.setY(d.getY() - board.getSQUARE());
                    c.setX(c.getX() - board.getSQUARE());
                    c.setY(c.getY() + board.getSQUARE());
                    rotate();
                }
                else if(getCurrentRotation() == 1 && rectangleChangePosition(a, 1, 1) == 1
                        && rectangleChangePosition(d, 1, -1) == 1 && rectangleChangePosition(c, -1, -1) == 1)
                {
                    a.setX(a.getX() + board.getSQUARE());
                    a.setY(a.getY() + board.getSQUARE());
                    d.setX(d.getX() + board.getSQUARE());
                    d.setY(d.getY() - board.getSQUARE());
                    c.setX(c.getX() - board.getSQUARE());
                    c.setY(c.getY() - board.getSQUARE());
                    rotate();
                }
                else if(getCurrentRotation() == 2 && rectangleChangePosition(a, -1, 1) == 1
                        && rectangleChangePosition(d, 1, 1) == 1 && rectangleChangePosition(c, 1, -1) == 1)
                {
                    a.setX(a.getX() - board.getSQUARE());
                    a.setY(a.getY() + board.getSQUARE());
                    d.setX(d.getX() + board.getSQUARE());
                    d.setY(d.getY() + board.getSQUARE());
                    c.setX(c.getX() + board.getSQUARE());
                    c.setY(c.getY() - board.getSQUARE());
                    rotate();
                }
                else if(getCurrentRotation() == 3 && rectangleChangePosition(a, -1, -1) == 1
                        && rectangleChangePosition(d, -1, 1) == 1 && rectangleChangePosition(c, 1, 1) == 1)
                {
                    a.setX(a.getX() - board.getSQUARE());
                    a.setY(a.getY() - board.getSQUARE());
                    d.setX(d.getX() - board.getSQUARE());
                    d.setY(d.getY() + board.getSQUARE());
                    c.setX(c.getX() + board.getSQUARE());
                    c.setY(c.getY() + board.getSQUARE());
                    rotate();
                }
                break;
            case 'I':
                if((getCurrentRotation() == 0 || getCurrentRotation() == 2) && rectangleChangePosition(a, 1, -1) == 1
                        && rectangleChangePosition(c, -1, 1) == 1 && rectangleChangePosition(d, -2, 2) == 1)
                {
                    a.setX(a.getX() + board.getSQUARE());
                    a.setY(a.getY() - board.getSQUARE());
                    c.setX(c.getX() - board.getSQUARE());
                    c.setY(c.getY() + board.getSQUARE());
                    d.setX(d.getX() - 2 * board.getSQUARE());
                    d.setY(d.getY() + 2 * board.getSQUARE());
                    rotate();
                }
                else if((getCurrentRotation() == 1 || getCurrentRotation() == 3) && rectangleChangePosition(a, -1, 1) == 1
                        && rectangleChangePosition(c, 1, -1) == 1 && rectangleChangePosition(d, 2, -2) == 1)
                {
                    a.setX(a.getX() - board.getSQUARE());
                    a.setY(a.getY() + board.getSQUARE());
                    c.setX(c.getX() + board.getSQUARE());
                    c.setY(c.getY() - board.getSQUARE());
                    d.setX(d.getX() + 2 * board.getSQUARE());
                    d.setY(d.getY() - 2 * board.getSQUARE());
                    rotate();
                }
                break;
            case 'Z':
                if((getCurrentRotation() == 0 || getCurrentRotation() == 2) && rectangleChangePosition(c, -1, 0) == 1
                        && rectangleChangePosition(d, -1, -2) == 1)
                {
                    c.setX(c.getX() - board.getSQUARE());
                    c.setY(c.getY());
                    d.setX(d.getX() - board.getSQUARE());
                    d.setY(d.getY() - 2 * board.getSQUARE());

                    rotate();
                }
                else if((getCurrentRotation() == 1 || getCurrentRotation() == 3) && rectangleChangePosition(c, 1, 0) == 1
                        && rectangleChangePosition(d, 1, 2) == 1)
                {
                    c.setX(c.getX() + board.getSQUARE());
                    c.setY(c.getY());
                    d.setX(d.getX() + board.getSQUARE());
                    d.setY(d.getY() + 2 * board.getSQUARE());

                    rotate();
                }
                break;
            case 'S':
                if((getCurrentRotation() == 0 || getCurrentRotation() == 2) && rectangleChangePosition(a, -2, -1) == 1
                        && rectangleChangePosition(d, 0, -1) == 1)
                {
                    a.setX(a.getX() - 2 * board.getSQUARE());
                    a.setY(a.getY() - board.getSQUARE());
                    d.setX(d.getX());
                    d.setY(d.getY() - board.getSQUARE());

                    rotate();
                }
                else if((getCurrentRotation() == 1 || getCurrentRotation() == 3) && rectangleChangePosition(a, 2, 1) == 1
                        && rectangleChangePosition(d, 0, 2) == 1)
                {
                    a.setX(a.getX() + 2 * board.getSQUARE());
                    a.setY(a.getY() + board.getSQUARE());
                    d.setX(d.getX());
                    d.setY(d.getY() + board.getSQUARE());

                    rotate();
                }
                break;
            case 'J':
                if(getCurrentRotation() == 0 && rectangleChangePosition(a, -1, 0) == 1
                        && rectangleChangePosition(b, 0, -1) == 1 && rectangleChangePosition(c, 1, -2) == 1
                        && rectangleChangePosition(d, 2, -1) == 1)
                {
                    a.setX(a.getX() - board.getSQUARE());
                    a.setY(a.getY());
                    b.setX(b.getX());
                    b.setY(b.getY() - board.getSQUARE());
                    c.setX(c.getX() + board.getSQUARE());
                    c.setY(c.getY() - 2 * board.getSQUARE());
                    d.setX(d.getX() + 2 * board.getSQUARE());
                    d.setY(d.getY() - board.getSQUARE());

                    rotate();
                }
                else if(getCurrentRotation() == 1 && rectangleChangePosition(a, 0, 2) == 1
                        && rectangleChangePosition(b, -1, 1) == 1 && rectangleChangePosition(c, -2, 0) == 1
                        && rectangleChangePosition(d, -1, -1) == 1)
                {
                    a.setX(a.getX());
                    a.setY(a.getY() + 2 * board.getSQUARE());
                    b.setX(b.getX() - board.getSQUARE());
                    b.setY(b.getY() + board.getSQUARE());
                    c.setX(c.getX() - 2 * board.getSQUARE());
                    c.setY(c.getY());
                    d.setX(d.getX() - board.getSQUARE());
                    d.setY(d.getY() - board.getSQUARE());

                    rotate();
                }
                else if(getCurrentRotation() == 2 && rectangleChangePosition(a, 2, -1) == 1
                        && rectangleChangePosition(b, 1, 0) == 1 && rectangleChangePosition(c, 0, 1) == 1
                        && rectangleChangePosition(d, -1, 0) == 1)
                {
                    a.setX(a.getX() + 2 * board.getSQUARE());
                    a.setY(a.getY() - board.getSQUARE());
                    b.setX(b.getX() + board.getSQUARE());
                    b.setY(b.getY());
                    c.setX(c.getX());
                    c.setY(c.getY() + board.getSQUARE());
                    d.setX(d.getX() - board.getSQUARE());
                    d.setY(d.getY());

                    rotate();
                }
                else if(getCurrentRotation() == 3 && rectangleChangePosition(a, -1, -1) == 1
                        && rectangleChangePosition(c, 1, 1) == 1 && rectangleChangePosition(d, 0, 2) == 1)
                {
                    a.setX(a.getX() - board.getSQUARE());
                    a.setY(a.getY() - board.getSQUARE());
                    c.setX(c.getX() + board.getSQUARE());
                    c.setY(c.getY() + board.getSQUARE());
                    d.setX(d.getX());
                    d.setY(d.getY() + 2 * board.getSQUARE());

                    rotate();
                }
                break;
            case 'L':
                if(getCurrentRotation() == 0 && rectangleChangePosition(b, 1, 0) == 1
                        && rectangleChangePosition(a, 0, 1) == 1 && rectangleChangePosition(c, 2, -1) == 1
                        && rectangleChangePosition(d, 1, -2) == 1)
                {
                    b.setX(b.getX() + board.getSQUARE());
                    b.setY(b.getY());
                    a.setX(a.getX());
                    a.setY(a.getY() + board.getSQUARE());
                    c.setX(c.getX() + 2 * board.getSQUARE());
                    c.setY(c.getY() - board.getSQUARE());
                    d.setX(d.getX() + board.getSQUARE());
                    d.setY(d.getY() - 2 * board.getSQUARE());

                    rotate();
                }
                else if(getCurrentRotation() == 1 && rectangleChangePosition(a, 1, 1) == 1
                        && rectangleChangePosition(c, -1, -1) == 1 && rectangleChangePosition(d, -2, 0) == 1)
                {
                    a.setX(a.getX() + board.getSQUARE());
                    a.setY(a.getY() + board.getSQUARE());
                    c.setX(c.getX() - board.getSQUARE());
                    c.setY(c.getY() - board.getSQUARE());
                    d.setX(d.getX() - 2 * board.getSQUARE());
                    d.setY(d.getY());

                    rotate();
                }
                else if(getCurrentRotation() == 2 && rectangleChangePosition(a, 1, -2) == 1
                        && rectangleChangePosition(d, 0, 1) == 1 && rectangleChangePosition(c, -1, 0) == 1
                        && rectangleChangePosition(b, 0, -1) == 1)
                {
                    a.setX(a.getX() + board.getSQUARE());
                    a.setY(a.getY() - 2 * board.getSQUARE());
                    d.setX(d.getX());
                    d.setY(d.getY() + board.getSQUARE());
                    c.setX(c.getX() - board.getSQUARE());
                    c.setY(c.getY());
                    b.setX(b.getX());
                    b.setY(b.getY() - board.getSQUARE());


                    rotate();
                }
                else if(getCurrentRotation() == 3 && rectangleChangePosition(d, 1, 1) == 1
                        && rectangleChangePosition(c, 0, 2) == 1 && rectangleChangePosition(b, -1, 1) == 1
                        && rectangleChangePosition(a, -2, 0) == 1)
                {
                    d.setX(d.getX() + board.getSQUARE());
                    d.setY(d.getY() + board.getSQUARE());
                    c.setX(c.getX());
                    c.setY(c.getY() + 2 * board.getSQUARE());
                    b.setX(b.getX() - board.getSQUARE());
                    b.setY(b.getY() + board.getSQUARE());
                    a.setX(a.getX() - 2 * board.getSQUARE());
                    a.setY(a.getY());

                    rotate();
                }
                break;
            case 'O':
                break;


        }
    }

    /**
     * Checks if tetromino in the current state can rotate.
     * @param rectangle  rectangle to check
     * @param horizontally rectangle changes position by this amount of fields horizontally
     * @param vertically rectangle changes position by this amount of fields vertically
     * @return used to check if tetromino touched other brick or surface
     */
    public int rectangleChangePosition(Rectangle rectangle, int horizontally, int vertically)
    {
        int h = 0;
        int v = 0;

        if(horizontally >= 0 && ((rectangle.getX() + horizontally * board.getSQUARE()) <= (board.getWIDTH() - board.getSQUARE()))) {

            if(board.getCOORDS((int) (rectangle.getX() + horizontally * board.getSQUARE()) / board.getSQUARE(), ((int) rectangle.getY() / board.getSQUARE())) == 0)
                h = 1;
        }
        else if(horizontally < 0 && ((rectangle.getX() + horizontally * board.getSQUARE()) >= 0)) {

            if(board.getCOORDS((int) (rectangle.getX() + horizontally * board.getSQUARE()) / board.getSQUARE(), ((int) rectangle.getY() / board.getSQUARE())) == 0)
                h = 1;
        }

        if(vertically < 0 && ((rectangle.getY() + vertically * board.getSQUARE()) >= 0)) {

            if(board.getCOORDS((int) rectangle.getX() / board.getSQUARE(), (int) (rectangle.getY() + vertically * board.getSQUARE()) / board.getSQUARE()) == 0)
                v = 1;
        }
        else if(vertically >= 0 && ((rectangle.getY() + vertically * board.getSQUARE()) <= board.getHEIGHT() - board.getSQUARE())) {

            if(board.getCOORDS((int) rectangle.getX() / board.getSQUARE(), (int) (rectangle.getY() + vertically * board.getSQUARE()) / board.getSQUARE()) == 0)
                v = 1;
        }

        if(h == v && v == 1)
            return 1;


        return -1;

    }

    /**
     * Moving right tetromino by one field
     */
    public void moveRight( ) {

        int checkA = -1;
        int checkB = -1;
        int checkC = -1;
        int checkD = -1;

        // sprawdzanko czy mozna w lewo sie przesunac i nie blokuje nas krawedz mapki
        if (((a.getX() + board.getSQUARE()) <= (board.getWIDTH() - board.getSQUARE())) && ((b.getX() + board.getSQUARE()) <= (board.getWIDTH() - board.getSQUARE()))
                && ((c.getX() + board.getSQUARE()) <= (board.getWIDTH() - board.getSQUARE())) && ((d.getX() + board.getSQUARE()) <= (board.getWIDTH() - board.getSQUARE()))) {
            checkA = board.getCOORDS(((int) a.getX() / board.getSQUARE()) + 1, ((int) a.getY() / board.getSQUARE()));
            checkB = board.getCOORDS(((int) b.getX() / board.getSQUARE()) + 1, ((int) b.getY() / board.getSQUARE()));
            checkC = board.getCOORDS(((int) c.getX() / board.getSQUARE()) + 1, ((int) c.getY() / board.getSQUARE()));
            checkD = board.getCOORDS(((int) d.getX() / board.getSQUARE()) + 1, ((int) d.getY() / board.getSQUARE()));
        }
        if(checkA == checkB && checkC == checkD && checkA == checkC && checkC == 0)
        {
            a.setX( a.getX() + board.getSQUARE());
            b.setX( b.getX() + board.getSQUARE());
            c.setX( c.getX() + board.getSQUARE());
            d.setX( d.getX() + board.getSQUARE());
        }


    }
    /**
     * Moving left tetromino by one field
     */
    public void moveLeft() {

        int checkA = -1;
        int checkB = -1;
        int checkC = -1;
        int checkD = -1;


        if (a.getX() - board.getSQUARE() >= 0 && b.getX() - board.getSQUARE() >= 0
                && c.getX() - board.getSQUARE() >= 0 && d.getX() - board.getSQUARE() >= 0) {
            checkA = board.getCOORDS(((int) a.getX() / board.getSQUARE()) - 1, ((int) a.getY() / board.getSQUARE()));
            checkB = board.getCOORDS(((int) b.getX() / board.getSQUARE()) - 1, ((int) b.getY() / board.getSQUARE()));
            checkC = board.getCOORDS(((int) c.getX() / board.getSQUARE()) - 1, ((int) c.getY() / board.getSQUARE()));
            checkD = board.getCOORDS(((int) d.getX() / board.getSQUARE()) - 1, ((int) d.getY() / board.getSQUARE()));
        }
        if(checkA == checkB && checkC == checkD && checkA == checkC && checkC == 0)
        {
            a.setX( a.getX() - board.getSQUARE());
            b.setX( b.getX() - board.getSQUARE());
            c.setX( c.getX() - board.getSQUARE());
            d.setX( d.getX() - board.getSQUARE());
        }

    }

    /**
     * Moving down tetromino by one field
     */
    public int moveDown()
    {
        int checkA = -1;
        int checkB = -1;
        int checkC = -1;
        int checkD = -1;

        int endMove = -1;

        int nextA = -1;
        int nextB = -1;
        int nextC = -1;
        int nextD = -1;

        if((int) a.getY() == board.getHEIGHT() - board.getSQUARE() || (int) b.getY() == board.getHEIGHT() - board.getSQUARE() ||
                (int) c.getY() == board.getHEIGHT() - board.getSQUARE() || (int) d.getY() == board.getHEIGHT() - board.getSQUARE()) // sprawdzenie czy koniec planszy
        {
            board.setCOORDS((int) a.getX() / board.getSQUARE(), (int) a.getY() / board.getSQUARE(), 1);
            board.setCOORDS((int) b.getX() / board.getSQUARE(), (int) b.getY() / board.getSQUARE(), 1);
            board.setCOORDS((int) c.getX() / board.getSQUARE(), (int) c.getY() / board.getSQUARE(), 1);
            board.setCOORDS((int) d.getX() / board.getSQUARE(), (int) d.getY() / board.getSQUARE(), 1);


            endMove = 0;


        }
        else // zeby nie wychodzilo poza tablice sprawdzajac Y: (aktualna pozycja + 1)
        {
            nextA = board.getCOORDS((int) a.getX() / board.getSQUARE(), ((int) a.getY() / board.getSQUARE()) + 1);
            nextB = board.getCOORDS((int) b.getX() / board.getSQUARE(), ((int) b.getY() / board.getSQUARE()) + 1);
            nextC = board.getCOORDS((int) c.getX() / board.getSQUARE(), ((int) c.getY() / board.getSQUARE()) + 1);
            nextD = board.getCOORDS((int) d.getX() / board.getSQUARE(), ((int) d.getY() / board.getSQUARE()) + 1);

            if(nextA == 1 || nextB == 1 || nextC == 1 || nextD == 1) // sprawdzenie czy napotkalismy klocek i koniec ruchu
            {
                board.setCOORDS((int) a.getX() / board.getSQUARE(), (int) a.getY() / board.getSQUARE(), 1);
                board.setCOORDS((int) b.getX() / board.getSQUARE(), (int) b.getY() / board.getSQUARE(), 1);
                board.setCOORDS((int) c.getX() / board.getSQUARE(), (int) c.getY() / board.getSQUARE(), 1);
                board.setCOORDS((int) d.getX() / board.getSQUARE(), (int) d.getY() / board.getSQUARE(), 1);

                endMove = 0;
            }
        }



        if (((a.getY() + board.getSQUARE()) <= (board.getHEIGHT() - board.getSQUARE())) && ((b.getY() + board.getSQUARE()) <= (board.getHEIGHT() - board.getSQUARE()))
                && ((c.getY() + board.getSQUARE()) <= (board.getHEIGHT() - board.getSQUARE())) && ((d.getY() + board.getSQUARE()) <= (board.getHEIGHT() - board.getSQUARE()))) {
            checkA = board.getCOORDS((int) a.getX() / board.getSQUARE(), ((int) a.getY() / board.getSQUARE()) + 1);
            checkB = board.getCOORDS((int) b.getX() / board.getSQUARE(), ((int) b.getY() / board.getSQUARE()) + 1);
            checkC = board.getCOORDS((int) c.getX() / board.getSQUARE(), ((int) c.getY() / board.getSQUARE()) + 1);
            checkD = board.getCOORDS((int) d.getX() / board.getSQUARE(), ((int) d.getY() / board.getSQUARE()) + 1);
        }
        if(checkA == checkB && checkC == checkD && checkA == checkC && checkC == 0)
        {
            a.setY( a.getY() + board.getSQUARE());
            b.setY( b.getY() + board.getSQUARE());
            c.setY( c.getY() + board.getSQUARE());
            d.setY( d.getY() + board.getSQUARE());
        }
        return endMove;
    }


}