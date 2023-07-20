
import java.util.*;
public class Pattern_K {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter Value of Row And Column: ");
        n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){

                System.out.print(" * ");
            }

           

            System.out.println();
        }

        for(int i=2; i<=n; i++){
            for(int j=2; j<=i; j++){

                System.out.print(" * ");
            }

            System.out.println();
        }
    }
    
}

