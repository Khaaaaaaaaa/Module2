package ss3_method;

import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.Arrays;
import java.util.Scanner;

public class InDayFibonacciNhoHon100 {
    public static void main(String[] args) {
        dayFibonacci();
    }

    public static void dayFibonacci() {
        int num1 = 0;
        int num2 = 0;
        int num3 = 1;
        while (num3 < 100) {
            System.out.println(num3);
            num1 = num2;
            num2 = num3;
            num3 = num1 + num2;
        }
    }

}



