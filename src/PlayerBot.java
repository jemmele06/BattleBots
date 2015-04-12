/**
 *
 */
class PlayerBot implements Bot {

    private World world;

    public PlayerBot(World _world) {
        world = _world;
    }

    public void step() {

    }

    public boolean isAlive() {
        return false;
    }

    public boolean isDead() {
        return !isAlive();
    }
}
