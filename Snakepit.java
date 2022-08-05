import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;
import java.awt.*;

public class Snakepit {

    // GLOBAL VARIABLES
    private static int CURRENT_FRUIT_ROW;
    private static int CURRENT_FRUIT_COL;
    private static int ROWS = 30;
    private static int COLS = 12;

    private boolean UP_MOVEMENT = false;
    private boolean DOWN_MOVEMENT = false;
    private boolean RIGHT_MOVEMENT = false;
    private boolean LEFT_MOVEMENT = false;
    private boolean inGame = false;

    private JLabel labels[][] = new JLabel[ROWS][COLS];
    private SnakeCell cells[][] = new SnakeCell[ROWS][COLS];

    private Timer timer = new Timer();
    private JPanel panel = new JPanel();
    private GridLayout gridLayout = new GridLayout(ROWS, COLS);
    private GridBagConstraints gbc = new GridBagConstraints();

    public Snakepit() {
        // super("Snake!");
        createView();
    }

    public void createView() {

    }

    public static void main(String[] args) {
        new Snakepit();
    }
}
