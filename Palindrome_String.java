
//  Write a program to check if a given string is a palindrome.
import java.util.*;
public class Palindrome_String {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String rev = "", word;

        System.out.print("Enter a word: ");

        word = sc.next();

        for(int i=word.length()-1; i>=0; i--){

            rev = rev+word.charAt(i);
        }

        if(word.equals(rev)){

            System.out.print("Entered String is a Palindrome.");
        }

        else{

            System.out.print("Entered String is not a Palindrome");
        }
    }
    
}
