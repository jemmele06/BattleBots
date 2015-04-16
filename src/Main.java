import java.util.ArrayList;

/**
 * Entry point. Calls game loop.
 */
public class Main {

    private final boolean DEBUG = true;

    public static void main(String[] args) {
        Main main = new Main();
        main.init();
    }

    public int init() {
        int WORLD_HEIGHT;
        int WORLD_WIDTH;
        if (DEBUG) {
            WORLD_WIDTH = 100;
            WORLD_HEIGHT = 100;
        } else {
            System.out.println("Customizable world width and height is not implemented.");
            return -1;
        }


        World world = new RectWorld(WORLD_WIDTH, WORLD_HEIGHT);
        ArrayList<Bot> botList = new ArrayList<Bot>();
        botList.add(new PlayerBot(world, 0, 0));

        Game game = new Game(world, botList);
        game.run();

        return 0;
    }
}
