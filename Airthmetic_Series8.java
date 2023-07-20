
//(1)^3/x + (3)^3/x + (5)^3/x + ----- + n
import java.util.*;
public class Airthmetic_Series8 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n;
        double sum = 0;

        System.out.print("Enter Value: ");

        n = sc.nextInt();

        System.out.print("Enter Value of denominator: ");

        int x = sc.nextInt();

        for(int i=1, a=1; i<=n; i++, a+=2){

            sum = sum+(Math.pow(a,3))/x;
        }

        System.out.print("Sum: "+sum);
    }
    
}
