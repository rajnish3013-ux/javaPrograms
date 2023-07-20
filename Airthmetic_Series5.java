
//x1+x2+x3+-----+n
import java.util.*;

public class Airthmetic_Series5 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n, x;
        double sum = 0;

        System.out.print("Enter Value: ");
        n = sc.nextInt();
        System.out.print("Enter Base Value: ");
        x = sc.nextInt();

        for(int i=1, a=1; i<=n; i++, a++){

            sum = sum+ Math.pow(x,a);
        }

        System.out.print("Sum: "+sum);
    }
    
}
