
//Program to check number is divisible by 3 and is even number.
import java.util.*;
public class Even_Divisible {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter an Integer Number: ");
        n= sc.nextInt();

        if(n%2==0 && n%3==0){

            System.out.print("True");
        }

        else{

            System.out.print("False");
        }
    }
    
}
