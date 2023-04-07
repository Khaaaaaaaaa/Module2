package ss4_lop_va_doi_tuong.stop_watch;

import java.util.Scanner;

public class StopWatchMain {
    public static void main(String[] args) {
        StopWatch result = new StopWatch();
        result.start();
        long count = 0;
        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < 1000; j++) {
                for (int k = 0; k < 1000; k++) {
                    if (i % 2 == 0) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
        result.stop();
        System.out.println(result.getElapsedTime());
    }
}
