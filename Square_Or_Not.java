
import java.util.*;
public class Square_Or_Not {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int length, Breadth;

        System.out.print("Enter breadth: ");
        
        Breadth = sc.nextInt();

        System.out.print("Enter Length: ");

        length = sc.nextInt();

        if(length==Breadth){

            System.out.print("It is a Square.");
        }
        else{

            System.out.print("It is not Square.");
            
        }


    }
    
}
