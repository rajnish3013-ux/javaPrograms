
//2-6+18-54+------ -+n
import java.util.*;
public class Airthmetic_Series10 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n;
        double sum = 0;

        System.out.print("Enter Value of N: ");
        n = sc.nextInt();

        for(int i=1, a=2; i<=n; i++, a*=3){

            if(i%2==0){

                sum = sum-a;

            }

            else{

                sum = sum+a;
            }
        }

        System.out.print("Sum: "+sum);
    }
    
}
