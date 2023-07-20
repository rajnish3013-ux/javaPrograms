
import java.util.*;
public class Discount_Offer {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Qauantity: ");

        int n = sc.nextInt();

        int purchased_value = n * 100;
        
        if(purchased_value>=1000){
            System.out.println("Total Amount: "+purchased_value);
            int discount = (purchased_value*10)/100;
            System.out.println("Total Discount: "+discount);
            int total_cost = (purchased_value-discount);
            System.out.println("Total Payable Amount after discount: "+total_cost);
        }
        else{

            System.out.print("Total Payable Amount: "+purchased_value);
        }



    }
    
}

