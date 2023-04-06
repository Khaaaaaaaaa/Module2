package ss2_array_loop;

import java.util.Scanner;

public class DemSoLanXuatHienTrongChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập một chuỗi bất kì :");
        String string = sc.nextLine();
        char a = 'a';
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == a) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện kí tự " + a + " trong chuỗi " + string + " là : " + count);
    }
}

