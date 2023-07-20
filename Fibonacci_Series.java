
//Write a program to print the Fibonacci series up to a given number.
// import java.util.*;
// public class Fibonacci_Series {

//     public static void main(String[] args){

//         int x = 0, y = 1, z = 0;
     
//         Scanner sc  =  new Scanner(System.in);

//         System.out.print("Enter a number: ");

//         int n = sc.nextInt();

//         while(z<=n){

//             System.out.println(z);

//             x = y;
//             y = z;
//             z = x + y;
//         }


//     }
    
// }

// Fabonacci Series using for loop

import java.util.*;
public class Fibonacci_Series {

    public static void main(String[] args){

        Scanner sc =  new Scanner(System.in);

        int x = 0, y = 1, z = 0;

        System.out.print("Enter integer value: ");

        int n = sc.nextInt();

        for(int i=0; i<=n; i++){

            if(z<=n){

                System.out.println(z);

                x = y;
                y = z;
                z = x + y;
            }
        }
    }
}
