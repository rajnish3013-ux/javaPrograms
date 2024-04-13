
import java.util.*;
public class Pattern_RightHalfPyramid {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter Input For Row: ");

        n = sc.nextInt();
    
        for(int i = 1; i<=n; i++){

            for(int j = 1; j<=i; j++){

                System.out.print(" * ");
            }

            System.out.println();
        }
    }
    
}
