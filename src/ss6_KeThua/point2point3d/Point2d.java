package ss6_KeThua.point2point3d;

public class Point2d {
    protected float x = 0.0f;
    protected float y = 0.0f;

    public Point2d(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2d() {
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2d{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
