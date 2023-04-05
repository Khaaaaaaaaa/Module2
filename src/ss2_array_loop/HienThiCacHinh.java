package ss2_array_loop;

import java.util.Scanner;

public class HienThiCacHinh {
    public static void main(String[] args) {
        int menu = -1;
        Scanner input = new Scanner(System.in);
        while (menu != 0) {
            System.out.println("1. Hình Chữ Nhật");
            System.out.println("2. In hình tam giác vuông, có cạnh góc vuông ở botton-left");
            System.out.println("3. In hình tam giác vuông, có cạnh góc vuông ở top-left     ");
            System.out.println("4. Tam Giác Cân");
            System.out.println("5. exit");
            menu = input.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Hình Chữ Nhật");
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < 5; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    } break;
                case 2:
                    System.out.println(" Tam giác vuông, có cạnh góc vuông ở botton-left");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");

                    }break;
                case 3:
                    System.out.println(" Hình tam giác vuông, có cạnh góc vuông ở top-left    ");
                    for (int i = 5; i > 0; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");

                    }break;
                case 4:
                    System.out.println("Tam Giác Cân");
                    for (int i = 1; i < 5; i++) {
                        for (int j = 1; j < 5 - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("Thoát");
            }
        }
    }
}