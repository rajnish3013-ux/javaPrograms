
import java.util.*;
public class Number_Increasing_Pyramid {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter value for Rows and Columns: ");
        n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){

                System.out.print(" "+j);
            }

            System.out.println();
        }
    }
    
}
