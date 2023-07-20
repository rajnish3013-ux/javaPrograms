
//(x+(5)^2)/1+2 + (x+(25)^2)/2+3 + --------+n
import java.util.*;
public class Airthmetic_Series9 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n;
        double sum = 0;

        System.out.print("Enter Value: ");

        n = sc.nextInt();

        System.out.print("Enter Value of x: ");

        int x = sc.nextInt();

        for(int i=1, a=5, b=3; i<=n; i++, a*=5, b+=2){

            sum = sum+(x*Math.pow(a,2))/b;
        }

        System.out.print("Sum: "+sum);
    }
    
}
