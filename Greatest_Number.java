
// Take two int values from user and print greatest among them.
import java.util.*;
public class Greatest_Number {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your First Integer: ");
        int num1 = sc.nextInt();
        System.err.print("Enter your second integer: ");
        int num2 = sc.nextInt();

        if(num1>num2){

            System.out.print(num1+" is greatest.");

        }
        else{
            System.out.print(num2+" is graetest.");
        }
    }

    
}
