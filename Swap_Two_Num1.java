
import java.util.*;
public class Swap_Two_Num1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a, b, temp;

        a = 45;
        b = 34;

        System.out.println("Before swapping: "+" a = " + a + " b = " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: "+" a = " + a + " b = " + b);

    }
    
}
