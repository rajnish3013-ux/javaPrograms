
import java.util.*;
public class Pattern__DiagonalStar {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter value for Rows and Columns: ");
        n = sc.nextInt();

        for(int i=1; i<=n; i++){

            for(int j=1; j<=i; j++){

                if(i>=2 && j<=i-1){

                    System.out.print(" ");
                }

                else{

                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
    
}
