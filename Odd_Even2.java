
// Write a program to check if a given number is even or odd.
import java.util.*;
public class Odd_Even2 {

    public static void main(String[] args){

        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter a number: ");

        int a = sc.nextInt();

        if(a%2==0){

            System.out.println("Even");
        }
        else{

            System.out.println("Odd");
        }
    }
    
}

