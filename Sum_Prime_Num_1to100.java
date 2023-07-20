
//Write a program to find the sum of all prime numbers between 1 and 100.
import java.util.*;
public class Sum_Prime_Num_1to100 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = 2;
        int m = 100;
        int sum = 0;
        int temp = 0;

        for(int i=n; i<=m; i++){
  
            for(int j=2; j<=i-1; j++){

                if(i%j==0){

                    temp = temp+1;
                }
            }

            if(temp==0){

                sum = sum+i;
                System.out.println(i);

            }

            else{

            temp = 0;
            }
        }

        System.out.print(sum);

    }
    
}
