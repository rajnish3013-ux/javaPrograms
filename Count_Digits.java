
import java.util.*;
public class Count_Digits {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your input: ");

        //In case of long input of digits use "long" data type to count digits

        long n = sc.nextLong();
        
        long count = 0;

        while(n>0){

            n = n/10;

            count++;

        }

        System.out.print("Number of digits: "+count);
    }
    
}
