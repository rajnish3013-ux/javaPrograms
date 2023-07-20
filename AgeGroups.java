import java.util.*;
public class AgeGroups {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int age;

        System.out.print("Enter your age: ");

        age = sc.nextInt();

        if(age>=18){

            System.out.print("Adult");
        }

        else if(age<12){

            System.out.print("Child");
        }

        else{

            System.out.print("Teenager");      
        }
    }
    
}
