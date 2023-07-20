
import java.util.*;
public class Com_Two_Num {

    public static void main(String[] args){

        Scanner sc =  new Scanner(System.in);

        int num1, num2;

        System.out.print("Enter your first number: ");

        num1 = sc.nextInt();

        System.out.print("Enter your second number: ");

        num2 = sc.nextInt();

        if(num1>num2){
            System.out.printf("%d>%d\n", num1, num2);
        }
        if(num1<num2){
            System.out.printf("%d<%d\n", num1, num2);
        }
        if(num1==num2){
            System.out.printf("%d==%d\n", num1, num2);
        }
        if(num1<=num2){
            System.out.printf("%d<=%d\n", num1, num2);
        }
        if(num1>=num2){
            System.out.printf("%d>=%d\n", num1, num2);
        }
        if(num1!=num2){
            System.out.printf("%d!=%d\n", num1, num2);
        }

    }
    
}
