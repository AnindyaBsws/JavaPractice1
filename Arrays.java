//User defined array making

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        
        // int marks[] = new int[3];
        // marks[0] = 97;
        // marks[1] = 44;
        // marks[2] = 18;
        //  for(int i=0; i<3; i++){
        //     System.out.println(marks[i]);
        // }

        // int marko[] = {25,65,4};
        // for(int i=0; i<3; i++){
        //     System.out.println(marko[i]);
        // }

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        for(int i=0; i<size; i++){
            System.out.print(numbers[i]);
        }
    }
    
}
