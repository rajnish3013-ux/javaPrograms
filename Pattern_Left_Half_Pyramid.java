
import java.util.*;
public class Pattern_Left_Half_Pyramid {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter Value of Row and Column: ");

        n= sc.nextInt();

        for(int i=1; i<=n; i++){

            for(int j=n; j>=i; j--){

                System.out.print("   ");

            }

            for(int k=1; k<=i; k++){

                System.out.print(" * ");
            }

            System.out.println();
        }

        
    }
    
}
