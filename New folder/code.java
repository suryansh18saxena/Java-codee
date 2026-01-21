// import java.util.*;
// public class Codeton {
//     public static void reverse(int[] arr, int l, int r){
//         while (l<r) {
//             int t  =arr[l]; arr[l] = arr [r]; arr[r] = t;

//             l++;r--;

//         }
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i = 0; i < n; i++)
//             arr [i] = sc.nextInt();
//             int k = sc.nextInt();
//             k= k%n;
//             if (k<0) k+=n;
//             if (k!=0){
//                 reverse(arr, 0, n-1);
//                 reverse(arr, 0, k-1);
//                 reverse(arr, k, n-1);
//         }
//         System.out.print(Arrays.toString(arr));
//     }
// }


// import java.util.*;
// public class Codeton{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[] =  new int[n];
//         for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
//         int j = 0;
//         for(int i = 0; i<n; i++){
//             if(arr[i] != 0){
//                 arr[j++] = arr[i];
//             }
//         }
//         while (j<n) {
//             arr[j++] = 0;            
//         }
//         // System.out.print(Arrays.toString(arr));
//     }
// }

// import java.util.*;
// public class code{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int lastdigit = n%10;
//         int power = 1;
//         int firstdigit = n;
//         while( firstdigit>=10){
//             firstdigit/=10;
//             power *=10;
//         }
//         int middle = n%power;
//         middle = middle/10;
//         System.out.println((lastdigit*power)+(middle*10)+(firstdigit));
//     }
    
// }

// import java.util.*;
// public class code{
//     public static String reverseEach(String input){
//         String[] word = input.split("\\s+");
//         StringBuilder result = new StringBuilder ();
//         for(String words : word){
//             result.append(new StringBuilder(words).reverse().toString());
//             result.append(" ");

//         }
//         return result.toString().trim();
//     }
//     public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//          String input = sc.nextLine();
//          String output = reverseEach(input);
//          System.out.println(output);
//     }
// }

import java.util.*;
class code{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.nextLine();
        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0 ; i < n ; i++){
            System.out.println(arr[i] + " ");
        }

        if(n==2){
            System.out.println("35");
        }
    }
}

public class Innercode {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s == s){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}


public class Innercode_1 {

    public static void main(String[] args) {
        
    }
}