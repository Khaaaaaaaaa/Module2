package ss3_method;

import java.util.Scanner;

public class ChuongTrinhKiemTraSoChanLe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số:");
        int number = Integer.parseInt(sc.nextLine());
            if (number % 2 == 1) {
                System.out.println("True");
            }else {
                System.out.println("False");
            }

        }
    }

