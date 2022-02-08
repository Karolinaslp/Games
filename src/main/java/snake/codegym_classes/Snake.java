package snake.codegym_classes;

import java.util.ArrayList;
import java.util.List;

public class Snake {
    private List<GameObject> snakeParts = new ArrayList<>();
    private static final String HEAD_SIGN = "\uD83D\uDC7E";
    private static final String BODY_SIGN = "\u26AB";
    public Snake(int x, int y) {
        GameObject first = new GameObject(x, y);
        GameObject second = new GameObject(x +1, y);
        GameObject third = new GameObject(x + 2, y);


        snakeParts.add(first);
        snakeParts.add(second);
        snakeParts.add(third);
    }
    public void draw(Game game) {
        for (GameObject snakePart : snakeParts) {
            if (snakeParts.indexOf(snakePart) == 0) {
                game.setCellValue(snakeParts.get(0).x, snakeParts.get(0).y, HEAD_SIGN);
            }else{
                game.setCellValue(snakePart.x, snakePart.y, BODY_SIGN);
            }
        }

    }

}
