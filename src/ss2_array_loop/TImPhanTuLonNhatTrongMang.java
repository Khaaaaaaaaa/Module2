package ss2_array_loop;

import java.util.Arrays;
import java.util.Scanner;

public class TImPhanTuLonNhatTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào độ dài của mảng");
        int size = Integer.parseInt(sc.nextLine());
        int[] number = new int[size];
        for (int i = 0; i < number.length; i++) {
            System.out.println("Nhập vào phần tử thứ " + (i + 1));
            number[i] = Integer.parseInt(sc.nextLine());
            System.out.println(Arrays.toString(number));
            System.out.println(number.toString());

        }
        int max = ;
        int index = 1;
        for (int i = 0; i < number.length; i++) {
            if (number > max) ;
            max = num;
        }
        System.out.println("Phần tử lớn nhất là : " + max + "Ở vị trí thứ :" + index);
    }
}
