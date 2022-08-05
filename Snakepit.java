import javax.swing.border.Border;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Snakepit extends JFrame implements KeyListener {

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
        initializeCells();
        createView();
    }

    public void initializeCells() {

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if ((i == 0 || i == ROWS - 1) || (j == 0 || j == COLS - 1)) {
                    cells[i][j] = new SnakeCell(false, false, true);
                } else {
                    cells[i][j] = new SnakeCell(false, false, false);
                }
            }
        }
    }

    public void createView() {
        panel.setLayout(gridLayout);

        Border border = BorderFactory.createLineBorder(Color.GRAY, 1);

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {

                labels[i][j] = new JLabel();
                gbc.gridx = i;
                gbc.gridy = j;

                labels[i][j].setBorder(border);
                labels[i][j].setOpaque(true);
                labels[i][j].setBackground(Color.WHITE);
                panel.add(labels[i][j], gbc);
            }
        }
        // this.placeFruit();
        // this.startingPosition();

        this.add(panel);
        this.addKeyListener(this);
    }

    public static void main(String[] args) {
        new Snakepit();
    }

    public void keyPressed(KeyEvent event) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }
}
