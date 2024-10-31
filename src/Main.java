//D1 홀수만 더하기
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int[][] b= new int[a][10];
        int sum = 0;
        for (int i=0;i<a;i++) {
            for (int j = 0; j < 10; j++) {
                b[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<a;i++) {
            for (int j = 0; j < 10; j++) {
                if((b[i][j]%2)==1){
                    sum+=b[i][j];
                }
            }
            System.out.printf("#%d %d\n",i+1,sum);
            sum=0;
        }
    }
}