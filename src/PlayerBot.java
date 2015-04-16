/**
 *
 */
class PlayerBot implements Bot {

    private World world;
    private int x;
    private int y;

    public PlayerBot(World _world, int _x, int _y) {
        world = _world;
        x = _x;
        y = _y;
    }

    public void step() {

    }

    public boolean isAlive() {
        return false;
    }

    public boolean isDead() {
        return !isAlive();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
