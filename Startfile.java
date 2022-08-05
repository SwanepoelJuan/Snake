import javax.swing.*;

public class Startfile extends JFrame {
    public static void main(String[] args) {
        Snakepit game = new Snakepit();
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setSize(500, 500);
        game.setLocationRelativeTo(null);
        game.getContentPane();
        game.setVisible(true);
    }
}