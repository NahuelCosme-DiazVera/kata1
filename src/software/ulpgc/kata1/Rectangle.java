package software.ulpgc.kata1;

public class Rectangle {
    private final long length;
    private final long width;

    public Rectangle(long length, long width) {
        this.length = length;
        this.width = width;
    }

    public long getLength() {
        return length;
    }

    public long getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
