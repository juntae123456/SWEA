//D2 백만장자 프로젝트
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            int[] c = new int[b];
            for (int j = 0; j < b; j++) {
                c[j] = sc.nextInt();
            }

            long sum3 = 0;
            int max = c[b - 1];

            for (int j = b - 2; j >= 0; j--) {
                if (c[j] < max) {
                    sum3 += (max - c[j]);
                } else {
                    max = c[j];
                }
            }
            System.out.printf("#%d %d\n", i + 1, sum3);
        }
    }
}