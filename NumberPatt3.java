//User defined number pattern
import java.util.Scanner;

public class NumberPatt3 {
     public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int num = 1;

        for(int i=1; i<=m; i++){
            for(int j=1; j<=i; j++){
            System.out.print(num+" ");
            num++;
            }
            System.out.println();
        }
     }
}
