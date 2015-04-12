import java.util.ArrayList;

/**
 * Entry point. Calls game loop.
 */
public class Main {

    private final boolean DEBUG = true;
    private boolean isOver = false;

    public static void main(String[] args) {

        World world = new RectWorld();
        ArrayList<Bot> botList = new ArrayList<Bot>();
        botList.add(new PlayerBot(world));

        Game game = new Game(world, botList);
        game.run();
    }
}
