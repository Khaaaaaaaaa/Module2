package ss3_method;

import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.Scanner;

public class InDayFibonacciNhoHon100 {
    public static void main(String[] args) {
        System.out.println("10 số đầu tiên của dãy số fibonacci: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacci(i) +"" );
        }
    }


    public static int fibonacci(int n) {
        int a = 0;
        int b = 1;
        int c = 1;

        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                a = b;
                b = c;
                c = a + b;
            }
        }
        return c;
    }
}



