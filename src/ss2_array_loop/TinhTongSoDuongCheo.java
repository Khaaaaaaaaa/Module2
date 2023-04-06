package ss2_array_loop;

public class TinhTongSoDuongCheo {
    public static void main(String[] args) {
        int[][] array2d = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        int sum = 0;
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d.length; j++) {
                if (i == j) {
                    sum += array2d[i][j];
                }

            }

        }
        int sum1 = 0;
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d.length; j++) {
                if (j == array2d.length - 1 - i) {
                    sum1 += array2d[i][j];

                }

            }

        }
        System.out.println("Tổng Các Đường Chéo Trong Ma TRận Là : " + (sum + sum1));
    }
}
