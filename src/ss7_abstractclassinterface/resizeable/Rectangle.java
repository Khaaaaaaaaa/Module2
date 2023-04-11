package ss7_abstractclassinterface.resizeable;

public class Rectangle extends Shape implements IResizeable {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }


    @Override
    public String toString() {
        return "Rectangle{" + "area = "+getArea()+
                "width=" + width +
                ", length=" + length +
                '}';
    }

    @Override
    public void resize(double percent) {
        setWidth(getWidth()+(getWidth()*percent/100));
        setLength(getLength()+(getLength()*percent/100));
    }
}



