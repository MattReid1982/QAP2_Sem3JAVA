package Problem2;

public class MyPoint {
    private int x;
    private int y;


    // Default constructor (0, 0)
    public MyPoint() {
        this(0, 0);
    }

    // Constructor with coordinates
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters 
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Setters 
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Set both x and y
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Return coordinates as an array
    public int[] getXY() {
        return new int[] {x, y};
    }

    // Distance to another point
    public double distance(MyPoint another) {
        int dx = x - another.x;
        int dy = y - another.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double distance(int x, int y) {
        int dx = this.x - x;
        int dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Distance from origin
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

     @Override
    public String toString() {
        return"(" + x + "," + y + ")";
    }

}
