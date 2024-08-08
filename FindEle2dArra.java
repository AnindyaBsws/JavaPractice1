//BUILD A 2D ARRAY AND FIND THE ELEMENT OF A PARTICULAR INDEX NUMBER

import java.util.Scanner;

public class FindEle2dArra {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the row size");
        int row = sc.nextInt();
        System.out.println("Type the col size");
        int col = sc.nextInt();
        int numbers[][] = new int[row][col];
        
        System.out.println("Enter the elements");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("The array is given below");
    
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(numbers[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Type the row number of which element you want to know ");
        int r = sc.nextInt();
        System.out.println("Type the col number of which element you want to know ");
        int c = sc.nextInt();


        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++)
        if( i == r && j == c){
           System.out.println("The element of array for index number["+i+"]["+j+"] is "+ numbers[i][j]);
          }
        }

    }
}
