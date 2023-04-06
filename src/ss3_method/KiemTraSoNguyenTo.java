package ss3_method;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số ");
        int number = sc.nextInt();
        System.out.println(KiemTraSoNguyenTo(number));
    }
    public static boolean KiemTraSoNguyenTo(int number) {
        if (number < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }

    }
}
