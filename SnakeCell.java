import java.awt.Color;

public class SnakeCell {
    private boolean fruit;
    private boolean snake;
    private boolean edge;

    public SnakeCell() {
        this.fruit = false;
        this.snake = false;
        this.edge = false;
    }

    public SnakeCell(boolean fruit, boolean snake, boolean edge) {
        setSnake(snake);
        setFruit(fruit);
        setEdge(edge);
    }

    public void setFruit(boolean fruit) {
        this.fruit = fruit;
    }

    public boolean isFruit() {
        return this.fruit;
    }

    public void setSnake(boolean snake) {
        this.snake = snake;
    }

    public boolean isSnake() {
        return this.snake;
    }

    public void setEdge(boolean edge) {
        this.edge = edge;
    }

    public boolean isEdge() {
        return this.edge;
    }

    public Color getColor() {
        if (this.fruit) {
            return Color.RED;
        } else if (this.snake) {
            return Color.BLACK;
        } else {
            return Color.WHITE;
        }
    }
}
