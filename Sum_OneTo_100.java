
// Write a program to find the sum of all numbers from 1 to 100.
import java.util.*;
public class Sum_OneTo_100 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int sum = 0;

        for(int i=1; i<=100; i++){

            sum = sum+i;
        }

        System.out.println("Sum: "+sum);

    }
    
}
