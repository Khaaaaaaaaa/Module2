package ss7_abstractclassinterface.resizeable;

import ss7_abstractclassinterface.resizeable.Circle;
import ss7_abstractclassinterface.resizeable.Rectangle;
import ss7_abstractclassinterface.resizeable.Shape;
import ss7_abstractclassinterface.resizeable.Square;

import java.util.Arrays;

public class TestResizeable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        //Circle circle = new Circle(5);
        shapes[1] = new Rectangle(5, 5);
        //Rectangle rectangle = new Rectangle(5, 6);
        shapes[2] = new Square(10);
        //Square square = new Square(10);
        System.out.println(Arrays.toString(shapes));
        System.out.println("Sau Khi Thay Doi");
        for (Shape s : shapes) {
            s.resize(Math.random() * 100);
        }
        System.out.println(Arrays.toString(shapes));
    }
}

