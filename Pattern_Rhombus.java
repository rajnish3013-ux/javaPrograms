
import java.util.*;
public class Pattern_Rhombus {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter value for Rows and Columns: ");
        n = sc.nextInt();

        for(int i=1; i<=n; i++){

            for(int j=1; j<=i; j++){

                System.out.print("  ");
            }

            for(int k=1; k<=n; k++){

                System.out.print("* ");
            }

            System.out.println();
        }
    }
    
}


// import java.util.*;
// public class Pattern_Rhombus{

//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);
        
//         int n;

//         System.out.print("Enter values for Rows and Columns: ");
//         n= sc.nextInt();

//         for(int i=1; i<=n; i++){

//             for(int j=n; j>=i; j--){

//                 System.out.print(" ");
//             }

//             for(int k=1; k<=n; k++){

//                 System.out.print("*");
//             }

//             System.out.println();
//         }
//     }

// }