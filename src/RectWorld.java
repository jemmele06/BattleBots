/**
 *
 */
public class RectWorld implements World {

    private int width;
    private int height;

    public RectWorld(int _width, int _height) {
        width = _width;
        height = _height;
    }

    public boolean contains(Bot bot) {
        return bot.getX() >= 0 && bot.getX() < getWidth() &&
                bot.getY() >= 0 && bot.getY() < getHeight();

    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
