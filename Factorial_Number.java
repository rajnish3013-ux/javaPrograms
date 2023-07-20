
//  Write a program to find the factorial of a given number.
import java.util.*;
public class Factorial_Number {

    public static void main(String[] args){

        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter a number: ");

        int num = sc.nextInt();

        int fact = 1;

        for(int i = 1; i<=num; i++){

            fact = fact*i;
        }

        System.out.println("Factorial of entered number: "+fact);
    }
    
}
