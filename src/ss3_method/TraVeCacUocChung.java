package ss3_method;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TraVeCacUocChung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một số: ");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println(Arrays.toString(timUoc(number)));

    }

    public static int[] timUoc(int numb) {

        int count = 0;
        int array[] = new int[numb];
        for (int i = 1; i <= numb; i++) {
            if (numb % i == 0) {
                array[count] = i;
                count++;
            }
        }

        int newArray[] = new int[count];
        for (int i = 0; i < count; i++) {
            newArray[i] = array[i];
        }
        return newArray;

    }
    }

