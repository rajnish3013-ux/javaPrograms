
import java.util.*;
public class Vowel_Consonent {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        char n;
        System.out.print("Enter any Alphabet: ");
        n = sc.next().charAt(0);

        if(n=='A'|| n=='E'|| n=='I'|| n=='O'|| n=='U'){

            System.out.print("Vowel");
        }

        else if(n=='a'|| n=='e'|| n=='i'|| n=='o'||  n=='u'){

            System.out.print("Vowel");
        }

        else{

            System.out.print("Consonent");
        }

    }
    
}
