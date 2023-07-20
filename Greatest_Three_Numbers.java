
// //  Write a program to find the largest number among three numbers.
// import java.util.*;
// public class Greatest_Three_Numbers {

//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int x, y, z;

//         System.out.print("Enter first input: ");

//         x = sc.nextInt();

//         System.out.print("Enter second Input: ");

//         y = sc.nextInt();

//         System.out.print("Enter third Input: ");

//         z = sc.nextInt();

//             if(x>y){

//                 if(x>z){

//                     System.out.print(x+" is greatest.");

//                 }

//                 else{

//                     System.out.print(z+" is greatest.");
//                 }

//             }
//             else if(y>z){

//                 System.out.print(y+" is greatest.");
//             }

//             else{

//                 System.out.print(z+" is greatest.");
//             }
//     }
    
// }


import java.util.*;

public class Greatest_Three_Numbers{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int x, y, z;

        System.out.print("Enter first number: ");

        x = sc.nextInt();

        System.out.print("Enter second number: ");

        y = sc.nextInt();

        System.out.print("Enter third number: ");

        z = sc.nextInt();

        if(x>y && x>z){

            System.out.print(x+" is greatest.");
        }

        else if(y>x && y>z){

            System.out.print(y+" is greatest.");
        }

        else{

            System.out.print(z+" is greatest.");
        }
    }
}