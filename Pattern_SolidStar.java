
import java.util.*;
public class Pattern_SolidStar{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your input: ");

        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){

                System.out.print("* ");
            }

            System.out.println();
        }

    }
}