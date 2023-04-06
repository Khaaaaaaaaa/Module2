package ss2_array_loop;

import java.util.Scanner;

public class TinhTongCacSoOMotCot {
    public static void main(String[] args) {
        int a, b;
       Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số dòng của ma trận :");
        a = sc.nextInt();
        System.out.println("Nhập số cột của ma trận");
        b = sc.nextInt();
        int array[][] = new int[a][b];
        System.out.println("Nhập phần tử cho ma trận ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println("Nhập phần tử [" + i + "]" + "[" + j + "]" + " :");
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Nhập cột muốn tính tổng");
        int index = sc.nextInt();
        int sum=0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (index == j) {
                    sum +=array[i][index];
                }
            }

        }
        System.out.println("Tổng của cột thứ "+index+" :"+sum);
    }
}
