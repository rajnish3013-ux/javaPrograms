
import java.util.*;
public class Pattern_TriangleStar {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter value for Rows and Columns: ");

        n = sc.nextInt();

        for(int i=1; i<=n; i++){

            for(int j=n; j>=i; j--){

                System.out.print(" ");
            }

            for(int k=1; k<=i; k++){

                System.out.print(" *");
            }

            System.out.println();
        }
    }
    
}
