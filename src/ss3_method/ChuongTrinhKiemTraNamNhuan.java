package ss3_method;

import com.sun.org.apache.xpath.internal.functions.FuncFalse;

import java.util.Scanner;

public class ChuongTrinhKiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập vào năm bạn cần kiểm tra:");
        int year = scan.nextInt();

        boolean isLeap = false;
        if (year % 4 == 0)
        {
            if (year % 100 == 0)
            {
                if (year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            } else
                isLeap = true;
        } else {
            isLeap = false;
        }
        if (isLeap == true)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
