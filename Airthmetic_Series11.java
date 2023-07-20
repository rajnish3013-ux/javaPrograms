
// (2/10) + (4/9) + (6/8) + -------- + N 
import java.util.*;
public class Airthmetic_Series11 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n;
        double sum = 0;

        System.out.print("Enter Value of n: ");
        n = sc.nextInt();

        for(int i=1, a=2, b=10; i<=n; i++, a+=2, b--){

            sum = sum+(a/b);
        }

        System.out.print("Sum: "+sum);
    }
    
}
