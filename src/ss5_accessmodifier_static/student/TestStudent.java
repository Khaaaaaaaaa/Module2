package ss5_accessmodifier_static.circle.student;

import ss5_accessmodifier_static.circle.student.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
//        student.setClasses("Kha");
//        student.setName("Teo");
        System.out.println(student.getClasses());
        System.out.println(student.getName());
    }
}
