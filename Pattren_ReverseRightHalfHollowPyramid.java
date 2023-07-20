
import java.util.*;
public class Pattren_ReverseRightHalfHollowPyramid {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter value for Rows and Columns: ");
        n = sc.nextInt();

        for(int i=1; i<=n; i++){

            for(int j=n; j>=i; j--){

                if(i==1|| j==n|| i==j){

                    System.out.print(" * ");
                }

                else{

                    System.out.print("   ");
                }
            }

            System.out.println();
        }
    }
    
}