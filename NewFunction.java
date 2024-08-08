import java.util.Scanner;

public class NewFunction {

    public static int calculateSum(int a, int b){
        int sum  = a + b;
        return sum;
    }

    public static int calculateMul(int g, int c){
        int mul  = g * c;
        return mul;
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int p = sc.nextInt();
        
        int summ = calculateSum(k,p);  
        System.out.println("Sum of the numbers is : "+ summ);  // This is a syntax of calling Functions

        System.out.println("Multiplication of the numbers ais : "+ calculateMul(k, p)); //This is another syntax of calling Functions
    }
    
}
