//______Square or rectangular shape____

// public class SquarePat {
//     public static void main(String args[]) {
//         for(int i=1; i<=4 ; i++) {
//             for(int j=1; j<=5; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
    
// }



// _____Hollow pattern for square____

// public class SquarePat {
//     public static void main(String args[]) {
//         int n = 6;
//         int m = 6;
//         for(int i=1; i<=n ; i++) {
//             for(int j=1; j<=m; j++) {
//                 if (i == n/2 & j == m/2 || i == n/2 & j == m/2+1 || i == n/2+1 & j == m/2 || i == n/2+1 & j == m/2+1 ) {
//                     System.out.print(" ");
//                 }
//                 else{
//                     System.out.print("*");
//                 }
//             }
//             System.out.println();
//         }
//     }
    
// }



// _____Hollow pattern for rectangular shape____


public class SquarePat {
    public static void main(String args[]) {
        int n = 6;
        int m = 13;
        for(int i=1; i<=n ; i++) {
            for(int j=1; j<=m; j++) {
                if (i == 3 & j == 6 || i == 3 & j == 7 || i == 3 & j == 8 || i == 4 & j == 6 || i == 4 & j == 7 || i == 4 & j == 8 ) {
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    
}



