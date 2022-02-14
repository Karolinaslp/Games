package snake.codegym_classes;

import java.util.ArrayList;
import java.util.List;

public class Snake {
    private List<GameObject> snakeParts = new ArrayList<>();
    private static final String HEAD_SIGN = "\uD83D\uDC7E";
    private static final String BODY_SIGN = "\u26AB";
    public boolean isAlive = true;

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    private Direction direction = Direction.LEFT;
    public Snake(int x, int y) {
        GameObject first = new GameObject(x, y);
        GameObject second = new GameObject(x + 1, y);
        GameObject third = new GameObject(x + 2, y);


        snakeParts.add(first);
        snakeParts.add(second);
        snakeParts.add(third);
    }

    public void draw(Game game) {
        for (int i = 0;i < snakeParts.size(); i++) {
            if (i == 0) {
                if (isAlive) {
                    game.setCellValueEx(snakeParts.get(0).x, snakeParts.get(0).y, Color.NONE, HEAD_SIGN, Color.BLACK,75);
                } else {
                    game.setCellValueEx(snakeParts.get(0).x, snakeParts.get(0).y, Color.NONE, HEAD_SIGN, Color.RED,75);
                }
            } else {
                if (isAlive) {
                    game.setCellValueEx(snakeParts.get(i).x, snakeParts.get(i).y, Color.NONE, BODY_SIGN, Color.BLACK,75);
                } else {
                    game.setCellValueEx(snakeParts.get(i).x, snakeParts.get(i).y, Color.NONE, BODY_SIGN, Color.RED,75);
                }
            }

        }

    }

    public void move() {

    }
}