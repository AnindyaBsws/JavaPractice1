import java.util.Scanner;

public class PercentMatch {

    public static int calcuLate(int p, int q, int z){
        
        int x = (10000*z - 100*q*z)/(30000+200*p-200*q-p*q);
        return x;

    }

    public static void main(String args[]){
        //y= a+b+c
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the percentage of which a person gets salary is greater than of b");
        int l = sc.nextInt();
        System.out.println("Type the percentage of which a person gets salary is smaller than of c");
        int m = sc.nextInt();
        System.out.println("Type the total summation of salary of a, b and c");
        int n = sc.nextInt();
        int j = calcuLate(l, m, n);
        int b = j;
        int a = j + l*j/100;
        int c = n - a - b;
        System.out.println("The salary of a is "+ a);
        System.out.println("The salary of b is "+ b);
        System.out.println("The salary of c is "+ c);

    }
}
