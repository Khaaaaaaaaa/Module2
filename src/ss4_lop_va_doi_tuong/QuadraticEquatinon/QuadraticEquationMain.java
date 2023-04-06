package ss4_lop_va_doi_tuong;

import java.util.Scanner;

public class QuadraticEquationMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap So A");
        double a = input.nextDouble();
        System.out.println("Nhap So B ");
        double b = input.nextDouble();
        System.out.println("Nhap So C");
        double c = input.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.println("Discriminant = " + quadraticEquation.getDiscrimiant());
        if (quadraticEquation.getDiscrimiant() >0) {
            System.out.println("Nghiem Thu Nhat Cua Phuong Trinh " + quadraticEquation.getRoot1());
            System.out.println("Nghiem Thu Hai Cua Phuong Trinh" + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscrimiant() == 0) {
            System.out.println("Phuong Trinh co 1 nghiem duy nhat " +quadraticEquation.getRoot1());
        } else {
            System.out.println("phuong trinh vo nghiem" + quadraticEquation);
        }
    }
}
