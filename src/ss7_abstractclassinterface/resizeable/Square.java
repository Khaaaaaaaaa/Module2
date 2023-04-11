package ss7_abstractclassinterface.resizeable;

import ss7_abstractclassinterface.resizeable.IResizeable;
import ss7_abstractclassinterface.resizeable.Shape;

public class Square extends Shape implements IResizeable {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public void resize(double percent) {
        setSide(getSide() + (getSide() * percent / 100));
    }
}
