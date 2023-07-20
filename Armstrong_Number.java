
// ONLY FOR THREE DIGIT NUMBERS.
import java.util.*;
public class Armstrong_Number {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
      
        int n, temp, sum=0, rem;

        System.out.print("Enter a number: ");

        n = sc.nextInt();

        temp = n;

        while(n!=0){

          rem = n%10;

          sum = sum+(rem*rem*rem);

          n = n/10;
                 
        }

        if(temp==sum){

          System.out.print("Armstrong Number.");

        }
        else{

          System.out.print("Not an Armstrong Number.");
        }

      }
    
}
