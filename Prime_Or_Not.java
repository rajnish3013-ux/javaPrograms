
// //  Write a program to check if a given number is prime.
// import java.util.*;
// public class PrimeOrNot {

//     public static void main(String[] args){

//         Scanner sc  = new Scanner(System.in);

//         int temp = 0;

//         System.out.print("Enter an integer Value: ");

//         int n = sc.nextInt();

//         for(int i=2; i<=n-1; i++){

//             if(n%i==0){

//                 temp = temp+1;
//             }

            
//         }

//         if(temp>0){

//             System.out.println("Non Prime Number.");
//         }

//         else{

//             System.out.println("Prime Number.");
//         }


//     }
    
// }

// Prime OR Not Using While loop

import java.util.*;

public class Prime_Or_Not{

public static void main(String[] args){

    Scanner sc  = new Scanner(System.in);

    int count = 0, j = 1;

    System.out.print("Enter integer Value: ");

    int n = sc.nextInt();

    while(j<=n){

        if(n%j==0)

            count++;
        

    j++;

    }

    if(count==2){

        System.out.print("Prime Number");
    }

    else{

        System.out.print("Non Prime.");
    }
}
}