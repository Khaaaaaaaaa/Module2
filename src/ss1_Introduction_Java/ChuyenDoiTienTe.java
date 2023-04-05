package ss1_Introduction_Java;

import java.util.Scanner;

public class bt_ung_dung_chuyen_doi_tien_te {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời Bạn Nhập ");
        usd = sc.nextDouble();
        double quydoi = usd * 23000;
        System.out.println("Giá Trị Hiện Tại" + quydoi);

    }
}
