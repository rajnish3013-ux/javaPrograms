
//9^2+13^2+17^2+-----+n^2
import java.util.*;
public class Airthmetic_Series6 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n;
        double sum = 0;

        System.out.print("Enter Value: ");
        n = sc.nextInt();

        for(int i=1, a=9; i<=n; i++, a+=4){

            sum = sum+Math.pow(a,2);
        }

        System.out.print("Sum: "+sum);
    }
    
}
