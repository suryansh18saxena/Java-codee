// public class patterns {
//     public static void main(String[] args) {
//         for(int i = 0; i <= 5; i++){
//             for(int j = 0; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// public class patterns {
//     public static void main(String[] args){
//         for(int i = 5; i>=0; i--){
//             int num = 1;
//             for(int j = 0; j<=i; j++){
//                 System.out.print(num);
//                 num ++;
//             }
//             System.err.println();
//         }
//     }
// }

// public class patterns{
//     public static void main(String[] args){
//         for(int i = 0; i<=4; i++){
//             int num = 1;
//             for(int j = i; j>=0; j--){
//                 System.out.print(num);
//                 num = num + 1;
//             }
//             System.out.println();
//         }
//     }
// }


//     1
//    212
//   32123
//  4321234
// 543212345
//  4321234
//   32123
//    212
//     1

// public class patterns{
//     public static void main(String[] args){
//         int n = 5;
//         for (int i = 1; i<=n; i++){
//             for(int j = n; j>=i; j--){
//                 System.out.print(" ");
//             }
//             int num = i;
//             for(int j = 1; j<=i; j++){
//                 System.out.print(num);
//                 num = num - 1;
//             }
//             for(int j = 1; j>=0; j--){
//             System.out.print(num);
//             num = num + 1;
//         }
//         System.out.println();
//     }
//     }
// }


// import java.util.*;

// public class Primecheck{
//     public static Boolean isprime(int n){
//         if (n <= 1) return false;
//         if (n <= 3) return true;
//         if (n % 2 == 0 || n % 3 == 0 ) return false;
//         for (int i = 5; i * i <= n; i+=2){
//             if ( n % i == 0 ) return false;
//         }
//         return true;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         System.out.println(isprime(num) ? "prime" : "Not a prime");  
//     }
// }

import java.util.*;


public class Armstrong{
    public static int isArmstrong(int n){
        int temp = n;
        int sum = 0;
        int length = 0;
        while (temp > 0){
            temp /= 10;
            length ++;
        }
        temp = n ;
        while (temp > 0) {
            int rem = temp % 10 ;
            sum += Math.pow(rem,length);
            temp /= 10;
        }
        return sum; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isArmstrong(num) == num ? "is armstrong " : " not a armstrong");
    }
}