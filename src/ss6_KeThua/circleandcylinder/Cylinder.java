package ss6_KeThua.circleandcylinder;

import ss6_KeThua.circleandcylinder.Circle;

public class Cylinder extends Circle {
    protected double height;
    protected double volume;

    public Cylinder(double radius, String color, double height, double volume) {
        super(radius, color);
        this.height = height;
        this.volume = volume;
    }

    public Cylinder(double height, double volume) {
        this.height = height;
        this.volume = volume;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return volume;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", volume=" + volume +
                '}';
    }
}
