
// Square Fill Pattern
import java.util.*;
public class Pattern_SquareFillPattern {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n, m;

        System.out.print("Enter Input For Row: ");

        n = sc.nextInt();

        System.out.print("Enter Input For Column: ");

        m = sc.nextInt();

        for(int i=1; i<=n; i++){

            for(int j=1; j<=m; j++){

                System.out.print(" * ");
            }

            System.out.println();
        }
    }
    
}