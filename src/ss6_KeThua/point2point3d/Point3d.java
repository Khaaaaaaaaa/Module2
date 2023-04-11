package ss6_KeThua.point2point3d;

public class Point3d extends Point2d {
    protected float z = 0.0f;

    public float getZ() {
        return z;
    }

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3d() {
    }

    @Override
    public String toString() {
        return "Point3d{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
