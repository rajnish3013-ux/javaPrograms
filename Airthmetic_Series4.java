
//1+3+5+------+n
import java.util.*;
public class Airthmetic_Series4 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int sum = 0, n;

        System.out.print("Enter Value: ");
        n = sc.nextInt();

        for(int i=1, a=1; i<=n; i++, a+=2){

            sum = sum+a;
        }

        System.out.print("Sum: "+sum);
    }
    
}
