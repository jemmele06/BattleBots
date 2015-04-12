import java.util.List;

/**
 * Game class tracks the entire game state including the world and actors.
 */
public class Game {

    private World world;
    private List<Bot> botList;
    private boolean finished = false;

    public Game(World _world, List<Bot> _botList) {
        world = _world;
        botList = _botList;
    }

    public void run() {
        while (!finished) {
            int aliveCount = 0;

            for (Bot bot : botList) {
                bot.step();
                if (bot.isAlive()) {
                    aliveCount++;
                }
            }

            if (aliveCount <= 1) {
                finished = true;
            }
        }
    }
}
