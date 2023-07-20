
import java.util.*;
public class Sum_Divisible {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter an Integer number: ");
        n = sc.nextInt();

        for(int i=1; i<=n; i++){

            if(i%3==0 || i%5==0){

                System.out.println(i);
            }
        }
    }
    
}
