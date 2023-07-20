//Program to check a number is divisible by 3 OR 5.
import java.util.*;
public class Divisible_OR {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter an Integer Number: ");
        n = sc.nextInt();

        if(n%3==0 || n%5==0){

            System.out.print("True");
        }

        else{

            System.out.print("False");
        }
    }
    
}

