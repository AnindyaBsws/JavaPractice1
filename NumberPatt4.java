//User defined Number pattern

import java.util.Scanner;

public class NumberPatt4 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for(int i=1; i<=m; i++){
            for(int j=1; j<=i; j++){
                int sum = i+j;
                if(sum%2==0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    
    
}
