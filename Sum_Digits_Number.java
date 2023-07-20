
// Write a program to find the sum of all digits of a given number
import java.util.*;
public class Sum_Digits_Number {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n, sum = 0, rem;

        System.out.print("Enter a Number: ");

        n = sc.nextInt();

        while(n!=0){

            rem = n%10;
            sum = sum+rem;
            n = n/10;

        }

        System.out.print(sum);
    }
    
}
