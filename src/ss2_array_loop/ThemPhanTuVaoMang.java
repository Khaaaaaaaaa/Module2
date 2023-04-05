package ss2_array_loop;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        String[] arr = {"1,2,3,4,5"};
        System.out.println("Mảng Ban Đầu Là :" + Arrays.toString(arr));
        int n = arr.length;
        arr = Arrays.copyOf(arr, n + 1);
        arr[n] = "6";
        System.out.println("Mảng Mới Là:"
                + Arrays.toString(arr));
    }
}

