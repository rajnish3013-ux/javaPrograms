
//Write a program to check if a given year is a leap year.
import java.util.*;
public class Leap_Year {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter Year: ");
        n = sc.nextInt();

        if(n%400==0 || n%4==0){

            System.out.print("Leap Year");
        }

        else{

            System.out.print("Not a Leap Year");
        }
    }

}

