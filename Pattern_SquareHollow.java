
// Hollow Rectangle Pattern
import java.util.*;
public class Pattern_SquareHollow {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter input for Row: ");

        int a = sc.nextInt();

        System.out.print("Enter Input for Column: ");

        int b = sc.nextInt();

        for(int i=1; i<=a; i++){

            for(int j=1; j<=b; j++){

                if(i==1 || j==1 || i==a || j==b){

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