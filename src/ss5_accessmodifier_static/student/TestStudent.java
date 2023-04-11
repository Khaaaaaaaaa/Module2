package ss5_accessmodifier_static.student;

import ss5_accessmodifier_static.student.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
//        student.setClasses("Kha");
//        student.setName("Teo");
        System.out.println("Tên Là " + student.getName() + " Lớp :" + student.getClasses());

    }
}
