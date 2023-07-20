
//  Write a program to find the sum of all even numbers between 1 and 100.
import java.util.*;
public class Sum_Even_Numbers {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a, sum = 0, n = 1, m = 100;

        for(int i=n; i<=m; i++){

            if(i%2==0){
                System.out.println(i);
                sum = sum+i;
            }
                                    
        }

        System.out.print(sum);

    }
    
}
