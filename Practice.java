// // Program to check a number is prime or not.
// import java.util.*;
// public class Practice {

// public static void main(String[] args){

//     Scanner sc = new Scanner(System.in);

//     int n, count = 0;

//     System.out.print("Enter a number: ");

//     n =sc.nextInt();

//     for(int i=1; i<=n; i++){

//         if(n%i==0){

//             count = count + 1;
//         }
//     }

//     if(count==2){

//         System.out.print("Prime number");
//     }
//     else{

//         System.out.print("Non Prime");
//     }
// }
     
// }


/* ========================================================*/


// Program to find greatest among three numbers.

// import java.util.*;

// public class Practice{

//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int a, b, c;

//         System.out.print("Enter first number: ");

//         a = sc.nextInt();

//         System.out.print("Enter Second Number: ");

//         b = sc.nextInt();

//         System.out.print("Enter Third Number: ");

//         c = sc.nextInt();

//         if(a>b && a>c){

//             System.out.print(a+" is greatest.");
//         }

//         else if(b>c && b>a){

//             System.out.print(b+" is greatest.");
//         }

//         else{

//             System.out.print(c+" is greatest.");
//         }


//     }
// }

/*========================================================= */

/*Fabinacci series */

// import java.util.*;

// public class Practice{

//     public static void main(String[] args){

//         Scanner sc  = new Scanner(System.in);

//         int x=0, y=1, z=0;

//         System.out.print("Enter a value: ");

//         int n = sc.nextInt();

//         for(int i=0; i<=n; i++){

//             if(z<=n){

//                 System.out.println(z);

//                 x = y;
//                 y = z;
//                 z = x+y;
//             }
//         }
//     }
// }

// =========================================

// Reverse of a number

// import java.util.*;

// public class Practice{

//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int n, rev=0, rem;

//         System.out.print("Enter a number: ");

//         n = sc.nextInt();

//         while(n!=0){

//             rem = n%10;
//             rev = rev*10+rem;
//             n = n/10;
//         }

//         System.out.print(rev);
//     }
// }

/*========================================================== */

// Palindrome String

// import java.util.*;

// public class Practice{

//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         String rev = " ", word;

//         System.out.print("Enter a word: ");

//         word = sc.next();

//         for(int i=word.length()-1; i>=0; i-- ){

//             rev = rev+word.charAt(i);

//         }

//         System.out.print(rev);
//     }
// }

// ==============================================================

// import java.util.*;

// public class Practice{

//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Input Value: ");

//         int n = sc.nextInt();

//         for(int i=1; i<=n; i++){

//             for(int j=1; j<=i; j++){

//                 System.out.print(" * ");
//             }

//             System.out.println();
//         }
//     }
// }

//===============================================================

// import java.util.*;
// public class Practice{

//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int n;

//         System.out.print("Input Value: ");

//         n = sc.nextInt();

//         for(int i=1; i<=n; i++){

//             for(int j=n; j>=i; j--){

//                 System.out.print(" * ");
//             }

//             System.out.println();
//         }

        
//     }
// }

//=============================================================

// import java.util.*;
// public class Practice{

//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int n;

//         System.out.print("Enter Value: ");
//         n = sc.nextInt();

//         for(int i=1; i<=n; i++){

//             for(int j=n; j>=i; j--){

//                 System.out.print("   ");
//             }

//             for(int k=1; k<=i; k++){

//                 System.out.print(" * ");
//             }

//             System.out.println();
//         }
//     }
// }

//==============================================================

// import java.util.*;
// public class Practice{

//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int n;

//         System.out.print("Enter Value: ");

//         n = sc.nextInt();

//         for(int i=1; i<=n; i++){
//             for(int j=2; j<=i; j++){

//                 System.out.print("   ");
//             }

//             for(int k=n; k>=i; k--){

//                 System.out.print(" * ");
//             }

//             System.out.println();
//         }

        
//     }
// }

// import java.util.*;
// public class Practice{

//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int n;

//         System.out.print("Enter value for Rows and Columns: ");

//         n = sc.nextInt();

//         for(int i=1; i<=n; i++){
//             for(int j=n; j>=i; j--){

//                 System.out.print("   ");
//             }

//             for(int k=1; k<=i; k++){

//                 System.out.print(" * ");
//             }

//             System.out.println();
//         }

//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){

//                 System.out.print("   ");
//             }

//             for(int k=n; k>=i; k--){

//                 System.out.print(" * ");
//             }

//             System.out.println();
//         }
//     }
// }

// import java.util.*;
// public class Practice{

//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int n;

//         System.out.print("Enter value for Rows and Columns: ");
//         n = sc.nextInt();
//         for(int i=1; i<=n; i++){

//             for(int j=n; j>=i; j--){

//                 System.out.print("   ");
//             }

//             for(int k=1; k<=i; k++){

//                 System.out.print(" * ");
//             }

//             System.out.println();

//         }

//         for(int i=1; i<=n; i++){

//             for(int j=n; j>=i; j--){

//                 System.out.print(" * ");
//             }

//             for(int k=1; k<=i; k++){

//                 System.out.print("   ");
//             }

//             System.out.println();
//         }
//     }
// }

// import java.util.*;
// public class Practice{

//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int n;

//         System.out.print("Enter value for Rows and Columns: ");
//         n = sc.nextInt();

//         for(int i=1; i<=n; i++){

//             for(int j=1; j<=i; j++){

//                 System.out.print(" * ");
//             }

//             for(int k=n; k>=i; k--){

//                 System.out.print("   ");
//             }

//             System.out.println();
//         }

//         for(int i=1; i<=n; i++){

//             for(int j=1; j<=i; j++){

//                 System.out.print("   ");
//             }

//             for(int k=n; k>=i; k--){

//                 System.out.print(" * ");
//             }

//             System.out.println();
//         }
//     }
// }

// import java.util.*;
// public class Practice{

//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);

//         int day;

//         System.out.print("Enter any week day number: ");
//         day = sc.nextInt();

//         switch(day){

//             case 1:
//             System.out.print("Monday");
//             break;

//             case 2: 
//             System.out.print("Tuesday");
//             break;

//             case 3:
//             System.out.print("Wednesday");
//             break;

//             case 4:
//             System.out.print("Thrusday");
//             break;

//             case 5:
//             System.out.print("Friday");

//             case 6:
//             System.out.print("Saturday");

//             case 7:
//             System.out.print("Sunday");

//             default :

//             System.out.print("Invalid Input.");
//         }
//     }
// }

// import java.util.*;
// public class Practice{

//     public static void main(String[] args){

//         Scanner sc = new Scanner(System.in);
        
//         int r=1, c=0, n;

//         System.out.print("Enter values for Rows and Columns: ");
//         n = sc.nextInt();

//         while(r<=n){

//             while(c<=(r-1)){

//                 System.out.print(" *");
//                c++;
//             }

            

//             System.out.println();
//             c = 0;
//             r++;
//         }
//     }
// }

import java.util.*;
public class Practice{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter value for Rows and Columns: ");
        n = sc.nextInt();

        for(int i=1; i<=n; i++){

            for(int j=n; j>=i; j--){

                System.out.print("  ");
            }

            for(int k=1; k<=i; k++){

                System.out.print(" *");
            }

            for(int l=2; l<=i; l++){

                System.out.print(" *");
            }

            System.out.println();
        }
    }
}










