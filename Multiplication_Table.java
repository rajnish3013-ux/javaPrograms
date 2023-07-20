
//Write a program to print the multiplication table of a given number.
import java.util.*;
public class Multiplication_Table {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n, mul;

        System.out.print("Enter a number: ");

        n = sc.nextInt();

        for(int i=1; i<=10; i++){

            mul = n*i;
            
            System.out.println(n + " * " + i + " = "+ mul);
        }

        }
         
    }
    

