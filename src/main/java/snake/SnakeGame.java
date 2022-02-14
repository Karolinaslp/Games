package snake;


import snake.codegym_classes.Color;
import snake.codegym_classes.Game;
import snake.codegym_classes.Snake;

public class SnakeGame extends Game {
    public static final int WIDTH = 15;
    public static final int HEIGHT = 15;
    private Snake snake;
    private int turnDelay;
    ;
    @Override
    public void initialize() {
        setScreenSize(WIDTH, HEIGHT);
        createGame();
    }

    private void createGame() {
        Snake snake1 = new Snake(WIDTH/2, HEIGHT/2);
        this.snake = snake1;
        snake1.draw(this);
        drawScene();
        turnDelay = 300;
        setTurnTimer(turnDelay);
    }

    private void drawScene() {
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                setCellColor(x, y, Color.DARKSEAGREEN);
            }
        }
        snake.draw(this);
    }

    @Override
    public void onTurn(int step) {
        snake.move();
        drawScene();
    }
}

