
//Program to check average of given numbers
// import java.util.*;
// public class Average_Even_Number {

//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         float n, sum=0, i=1;
//         float avg = 0;

//         System.out.print("Enter a Number: ");
//         n = sc.nextInt();

//         while(i<=n){

//             sum = sum+i;
            
//         i++;
        
//         }
//          System.out.println("Average of given Numbers is: "+(avg+(sum/n)));

        
//     }
    
// }

//===============================================================================

// Write a program to find the average of all even numbers between 1 and 100.


import java.util.*;
public class Average_Even_Number{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        float n, sum=0, i=1, count = 0;

        System.out.print("Enter an Integer Number: ");
        n = sc.nextInt();

        while(i<=n){

            if(i%2==0){

                sum = sum+i;
                count++;
            }
        i++;
        }

        System.out.println("Average of given numbers: "+sum/count);
    }
}