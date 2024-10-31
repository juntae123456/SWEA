//D1 평균구하기
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        float[][] b= new float[a][10];
        float sum = 0;
        int count = 0;
        for (int i=0;i<a;i++) {
            for (int j = 0; j < 10; j++) {
                b[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<a;i++) {
            for (int j = 0; j < 10; j++) {
                sum+=b[i][j];
            }
            sum/=10;
            count = Math.round(sum);
            System.out.printf("#%d %d\n",i+1,count);
            sum=0;
        }
    }
}
