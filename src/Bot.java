/**
 *
 */
public interface Bot {
    void step();

    boolean isAlive();

    boolean isDead();

    int getX();

    int getY();
}
