package ss7_abstractclassinterface.colorable;

public class TestColorable {
    public static void main(String[] args) {
        Shape s1 = new Square(true, 6);
        Shape s2 = new Rectangle(7.0, 8.9);
        Shape s3 = new Circle(3.0);
        Shape[] array = new Shape[3];
        array[0] = s1;
        array[1] = s2;
        array[2] = s3;
        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Square) {
                System.out.println("Area : " + ((Square) array[i]).getArea());
            }
            if (array[i] instanceof IColorable) {
                ((IColorable) array[i]).howToColor();
            }
        }

    }
}