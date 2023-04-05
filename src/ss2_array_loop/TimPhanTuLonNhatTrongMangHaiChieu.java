package ss2_array_loop;

import java.util.Scanner;

public class TimPhanTuLonNhatTrongMangHaiChieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Số Hàng");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập Số Cột");
        int m = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println(i + "," + j);
                arr[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}