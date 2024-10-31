//D1 큰수구하기
import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int[][] b= new int[a][2];

        for (int i=0;i<a;i++) {
            for (int j = 0; j < 2; j++) {
                b[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<a;i++) {
            if(b[i][0]==b[i][1]){
                System.out.printf("#%d =\n",i+1);
            }
            if(b[i][0]<b[i][1]){
                System.out.printf("#%d <\n",i+1);
            }
            if(b[i][0]>b[i][1]){
                System.out.printf("#%d >\n",i+1);
            }
        }
    }
}
