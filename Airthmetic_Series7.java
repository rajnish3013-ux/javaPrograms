
//2^x+4^x+6^x+----+n^x
import java.util.*;
public class Airthmetic_Series7 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n, x;
        double  sum=0;

        System.out.print("Enter Value: ");
        n = sc.nextInt();
        System.out.print("Enter Power Value: ");
        x = sc.nextInt();

        for(int i=1, a=2; i<=n; i++, a+=2){

            sum = sum+Math.pow(a,x);
        }

        System.out.print("Sum: "+sum);
    }
    
}
