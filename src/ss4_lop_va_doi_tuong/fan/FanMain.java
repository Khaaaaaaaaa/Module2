package ss4_lop_va_doi_tuong.fan;

public class FanMain {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(5);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);


        Fan fan2 = new Fan();
        fan2.getSpeed();
        fan2.getRadius();
        fan2.getColor();
        fan2.isOn();
        System.out.println("Fan is on " + fan1.toString());
        System.out.println("Fan is off " + fan2.toString());
    }
}
