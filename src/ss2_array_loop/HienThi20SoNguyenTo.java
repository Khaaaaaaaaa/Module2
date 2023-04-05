package ss2_array_loop;

import java.util.Scanner;

public class HienThi20SoNguyenTo {

    public static void main(String[] args) {
        System.out.println("20 S0 Nguyen To Dau Tien La  là: ");
        for (int i = 0; i <= 20; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }


    public static boolean isPrimeNumber(int n) {

        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

            

