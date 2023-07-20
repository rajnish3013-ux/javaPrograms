
//1+2+3+4+......+n

import java.util.*;
public class Airthmetic_Series1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n, sum = 0;

        System.out.print("Enter an Integer Number: ");
        n = sc.nextInt();
        
        for(int i=1, a=1; i<=n; i++, a++){

            sum = sum+a;
        }

        System.out.print(sum);
    }
    
}
