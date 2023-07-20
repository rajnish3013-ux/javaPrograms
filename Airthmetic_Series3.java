
//2+4+6+.....+n
import java.util.*;
public class Airthmetic_Series3 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int sum = 0, n;

        System.out.print("Enter Value: ");
        n = sc.nextInt();

        for(int i=1, j=2; i<=n; i++, j+=2){

            sum = sum+j;
        }

        System.out.print("Sum: "+sum);
    }
    
}
