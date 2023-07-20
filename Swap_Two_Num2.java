
import java.util.*;
public class Swap_Two_Num2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.println("Enter your first input: ");

        a = sc.nextInt();

        System.out.println("Enter your second input: ");

        b = sc.nextInt();

        System.out.println("Before swapping: " + " a = " + a + " b = " + b);

        a = a - b;
        b = a + b;
        a = b - a;

        System.out.println("After Swappping: " + " a = " + a + " b = " + b);


    }


    
}
