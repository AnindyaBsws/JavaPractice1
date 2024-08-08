import java.util.Scanner;

public class FindElem {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
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
        System.out.println("Type the index number of which element you want to know ");
        int index = sc.nextInt();

        for(int i=0; i<size; i++){
        if( index == i){
           System.out.println("The element of array for index number "+ i +" is "+ numbers[i]);
          }
        }

    }
}
