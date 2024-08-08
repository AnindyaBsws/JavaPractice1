import java.util.Scanner;

public class Factor {
    
    public static void printFactorail(int n){

        if(n < 0){
            System.out.println("THis is an invalid number to get factorial of a number");
            return;
        }
        int fact = 1;
        for(int i=n; i>=1; i--){
            fact = fact * i;
        }
        System.out.println(fact);
        
        return;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        printFactorail(p);
    }



}
