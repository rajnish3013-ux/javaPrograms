
//10+9+8+-------+n
import java.util.*;
public class Airthmetic_Series {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n, sum = 0;

        System.out.print("Enter Value: ");

        n = sc.nextInt();

        for(int i=1, a=10; i<=n; i++, a--){

            sum = sum+a;
        }

        System.out.print("Sum: "+sum);
    }
    
}
