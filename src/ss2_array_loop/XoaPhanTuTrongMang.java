package ss2_array_loop;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào độ dài của mảng");
        int size = Integer.parseInt(sc.nextLine());
        int [] number = new int[size];
        for (int i = 0; i <number.length ; i++) {
            System.out.println("Nhập vào phần tử thứ" + (i+1));
            number[i] = Integer.parseInt(sc.nextLine());
            
        }
        System.out.println(Arrays.toString(number));
        System.out.println(number.toString());
        for (int a :number) {
            System.out.println(a);
        }
        System.out.println("Nhập phần tử trong mảng bạn muốn xóa khỏi mảng");
        int a = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < number.length; i++) {
            if (a == number[i]) {
                for (int j = i; j < number.length - 1; j++) {
                    number[j] = number[j + 1];
                    if (number[j + 1] == a) {
                        i--;
                    } else {
                        continue;
                    }
                }
                number[number.length - 1] = 0;
            }
        }
        System.out.println(Arrays.toString(number));
    }

        }


