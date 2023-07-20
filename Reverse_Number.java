
import java.util.*;
public class Reverse_Number {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n;
        int rev = 0;
        System.out.print("Enter a number: ");

        n = sc.nextInt();

        while(n!=0){
           int rem = n%10;
            rev = rev*10+rem;
            n = n/10;


        }

        System.out.print(rev);
    }
    
}
