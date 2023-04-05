package ss2_array_loop;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Vao Do Dai Cua Mang");
        int size = Integer.parseInt(sc.nextLine());
        int [] number = new int [size];
        for (int i = 0; i < number.length ; i++) {
            System.out.println("Nhap Vao Phan Tu Thu" + (i+1));
            number[i] = Integer.parseInt(sc.nextLine());
            System.out.println(Arrays.toString(number));
            System.out.println(number.toString());


        }
    }
}
