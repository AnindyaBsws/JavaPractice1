//Find the index of a number of an user defined array
//EG- Take the following array and find the index number 45 from the array
//  12  65 77 45 21 36 98 22 


import java.util.Scanner;

public class FindNum {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Scanner ap= new Scanner(System.in);
        System.out.println("Type the arrray size");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.println("The array is given below");

        for(int i=0; i<size; i++){
            System.out.print(" "+numbers[i]);
        }
        System.out.println();
        System.out.println("Type the number u want to find");
        int num = ap.nextInt();

        for(int i=0; i<size; i++){
        if( num == numbers[i]){
            System.out.println("The index of array for "+ numbers[i] +" is "+ i);
            }
        }

    }
}
