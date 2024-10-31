//D2 +=
import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        long[][] b= new long[a][3];
        for (int i=0;i<a;i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j]=sc.nextLong();
            }
        }
        long count = 0;
        for (int i=0;i<a;i++) {
            while (b[i][1]<=b[i][2]&&b[i][0]<=b[i][2]){
                if(b[i][0]>b[i][1]) {
                    b[i][1] += b[i][0];
                } else {
                    b[i][0] += b[i][1];
                }
                ++count;
            }
            System.out.printf("%d\n",count);
            count=0;
        }
    }
}
