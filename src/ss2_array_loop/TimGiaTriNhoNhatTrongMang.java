package ss2_array_loop;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài mảng : ");
        int size = Integer.parseInt(sc.nextLine());
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ : " + (i + 1));
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
    }
}