// import java.util.*;
// public class first{
//     public static void main(String args[]){
//         // System.out.println("* * * * *");
//         // System.out.println("* * * *");
//         // System.out.println("* * *");
//         // System.out.println("* *");
//         // System.out.println("*");
//         Scanner sc = new Scanner (System.in);
//         // int n = sc.nextInt();
//         // System.out.println(n);
//         // short n = sc.nextShort();
//         // System.out.println(n);
//         int a =10;
//         int b = --a;
//         b=a++;
//         System.out.println(a);
//         System.out.println(b);
//     }
// }   

// import java.util.*;
// public class first{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         int n = sc.nextInt();   
//         int isprime=0;
//         for(int i = 2 ;i<=Math.sqrt(n);i++){
//             if(n%i==0){
//                 isprime=1;
//                 break;
//             }
//         }
//         if(isprime==1){
//             System.out.println("Enter number is not a prime number");
//         }
//         else{
//             System.out.println("Enter number is prime number ");
//         }
//     }
// }

// public class first{
//     public static void main(String arg[]){
//         int n =5;
//         for( int i =0; i<5; i++ ){
//             for(int j = 1; j<=i; j++){
//                 System.out.print(A+j);
//             }
//             System.out.println();
//         }
//     }
// }

// public class first{
//     public static void main(String arg[]){
//         int n =5;
//         char ch='A';
//         for( int i =0; i<5; i++ ){
//             for(int j = 1; j<=i; j++){
//                 System.out.print(ch );
//                 ch++;
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;
// public class first{
//     public static int Factorial(int a){
//         int fact=1;
//         for(int i = 1; i<=a; i++){
//             fact=fact*i;
//         }
//         return fact;
//     }
//     public static int Bionmial(int a, int b){
//         int a_fact = Factorial(a);
//         int b_fact = Factorial(b);
//         int hh=Factorial(a-b);
//         int c=a_fact/(b_fact*hh);
//         return c;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         System.out.print(Bionmial(a,b));
//     }
// }

// import java.util.*;

// public class first{
//     public static void BinToDec(int bin){
//         int dec=0;
//         int pow=0;
//         while(bin!=0){
//             int lastdigit = bin%10;
//             dec=dec+(lastdigit*(int)Math.pow(2,pow));
//             pow++;
//             bin/=10;
//         }
//         System.out.println(dec);
//     }
//     public static void DecToBin(int dec){
//         int bin=0,pow=0;
//         while (dec!=0){
//             int rem = dec%2;
//             bin = bin+(rem*(int)Math.pow(10,pow));
//             pow++;
//             dec/=2;
//         }
//         System.out.println(bin);
//     }
//     public static void main(String args[]){
//         DecToBin(5);
//     }
// }

// public class first{
//     public static void main(String args[]){
//         for (int i=1;i<=4;i++){
//             for(int j = 1; j<=5; j++){
//                 if(i==1|| i==4|| j==1|| j==5){
//                 System.out.print("*");
//                 }
//             else{
//                 System.out.print(" ");
//             }
//             }
//             System.out.println();
//         }
//     }
// }

// public class first{
//     public static void main(String args[]){
//         for(int i = 1; i<=4; i++){
//             for(int j = 1; j<=4-i; j++){
//                 System.out.print(" ");
//             }
//             for (int k = 1; k<=i; k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// public class first{
//     public static void main(String args[]){
//         for(int i = 1; i<=4; i++){
//             for (int j=1; j<=5-i; j++){
//                 System.out.print(j);
//             }
//             System.out.println();

//         }
//     }
// }

// public class first{
//     public static void main(String args[]){
//         int num =1;
//         for(int i = 1; i<=5; i++){
//             for (int j=1; j<=i; j++){

//                 System.out.print(" "+num);
//                 num++;
//             }
//             System.out.println();

//         }
//     }
// }

// public class first{
//     public static void main(String args[]){
//         int num = 1;
//         for (int i =1; i<=5; i++){
//             for(int j= 1; j<=i; j++){
//                 if ((i+j)%2==0){
//                     System.out.print("1");
//                 }
//                 else{
//                     System.out.print("0");
//                 }
//                 num++;
//             }
//             System.out.println();
//         }
//     }
// }

//Butterfly pattern 

// public class first {
//     public static void main(String srgs[]){
//         for(int i =1; i<=4; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             for (int j =1; j<=2*(4-i); j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//         }
//         System.out.println();
//     }
//         for(int i =4; i>=1; i--){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             for (int j =1; j<=2*(4-i); j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//         }
//         System.out.println();
//     }

// }
// }

// public class first{
//     public static void main(String args[]){
//         for(int i =1; i<=5; i++){
//             for (int j =1;j<=5-i+1; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=5; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// public class first{
//     public static void main(String args[]){
//         for(int i =1; i<=5; i++){
//             for (int j =1;j<=5-i+1; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j<=5; j++){
//                 if(i==1|| i==5|| j==1|| j==5){
//                 System.out.print("*");
//                 }
//             else{
//                 System.out.print(" ");
//             }
//         }
//             System.out.println();
//     }
// }
// }

// public class first{
//     public static void main(String args[]){
//         for(int i = 0; i<=3; i++){
//             for(int j=i; j<=4;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=(2*i)+1;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i = 3; i>=0; i--){
//             for(int j=i; j<=4;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=(2*i)+1;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }

// public class first {
//     public static void Linearsearch(int number[],int key){
//         for(int i = 0; i<number.length; i++){
//             if(number[i]==key){
//                 System.out.println("match found");
//             }
//             else{
//                 System.out.println("No match found");
//             }
//         }
//     }
//     public static int maxval(int number[]){
//         int max=Integer.MIN_VALUE;
//         for(int i = 1; i<number.length; i++){
//             if(max<number[i]){
//                 max=number[i];
//             }
//         }
//         return max;
//     }
//     public static int binarysearch(int number [],int key){
//         int start = 0;
//         int end = number.length-1;
//         while(start<=end){
//             int mid = (start + end) / 2;
//             if (number[mid]==key){
//                 return mid;
//             }
//             if(number[mid]<key){
//                 start=mid + 1;
//             }
//             else{
//                 end=mid-1;
//             }
//         }
//         return -1;
//     }
//     public static void reverse(int number[]){
//         for (int i = 0; i<number.length/2; i++){
//             int temp = number[i];
//             number[i] = number[number.length-1-i];
//             number[number.length-1-i] = temp;
//         }

//     }
//     public static void  pair(int number[]){
//         for(int i = 0; i<number.length;i++){
//             for(int j = i+1; j<number.length; j++){
//                 System.out.print("("+number[i] + "," + number[j] + ")");
//             }
//             System.out.println();
//         }
//     }
//     public static void subarray(int number[]){
//         for(int i = 0; i < number.length; i++){
//             for(int j = i; j<number.length; j++ ){
//                 for (int k = i; k <= j; k++) {
//                 System.out.print( number[k] + " ");
//                 }
//             System.out.println();
//             }
//             System.out.println();
//         }
//     }

//     public static void subarraysum(int number[]) {
//         int sum = 0;
//         int max = Integer.MIN_VALUE;

//         for (int i = 0; i < number.length; i++) {
//             for (int j = i; j < number.length; j++) {
//                 sum = 0;
//                 for (int k = i; k <= j; k++) {
//                     sum += number[k];
//                 }
//                 if (max < sum) {
//                     max = sum;
//                 }
//             }
//         }
//     }

//     public static void subarraykadanes(int number[]) {
//         int sum = 0;
//         int max = Integer.MIN_VALUE;
//         for (int i = 0; i < number.length; i++){
//             sum += number[i];  
//             if(sum < 0){
//                 sum = 0;
//             }
//             max = Math.max(max, sum);
//         }
//         System.out.println(max);
//     }
// // }
// public class first{
//     public static void main(String args[]){
//         int arr[]= {4,2,0,6,4,3,0,5};
//         int n = arr.length;
//         int rightmax[] = new int[n];
//         int leftmax[] = new int[n];
//         leftmax[0] = arr[0];
//         for (int i = 1; i < n; i++) {
//             leftmax[i] = Math.max(leftmax[i - 1], arr[i]);
//         }

//         rightmax[n - 1] = arr[n - 1];
//         for (int i = n - 2; i >= 0; i--) {
//             rightmax[i] = Math.max(rightmax[i + 1], arr[i]);
//         }
//         for(int i = 0; i< arr.length; i++){
//             System.out.print(rightmax[i]+" ");
//         }
//         System.out.println();
//         for(int i = 0; i< arr.length; i++){
//             System.out.print(leftmax[i]+" ");
//         }
//     }
// }

// import java.util.*;
// public class first{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int sum = 0;
//         int temp = num*num;
//         while (temp!=0) {
//             int A= temp%10;
//             sum +=A;
//             temp/=10;
//         }
//         if(num==sum){
//             System.out.println("yes");
//         }
//         else{
//             System.out.println("no");
//         }
//     }
// }

// import java.util.*;
// public class first{
//     public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
// int N = sc.nextInt();
//         int temp = N;
//         int length = 0;
//         int sum = 0;
//         while (N != 0) {
//             N /= 10;
//             length++;
//         }
//         N=temp;
//         while(N != 0){
//             int digit = N % 10;
//             sum += Math.pow(digit, length);
//             N = N / 10;
//         }

//         if(temp == sum){
//             System.out.println("yes");
//         }
//         else{
//             System.out.println("no");
//         }
//     }
// }


// public class first {
//     public void moveZeroes(int[] arr) {
//                 int left = 0;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] != 0) {

//                 if (i != left) {
//                     int temp = arr[i];
//                     arr[i] = arr[left];
//                     arr[left] = temp;
//                 }
//                 left++;
//     }
// }
// }
// }

// import java.util.Scanner;

// public class first {
// public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
// int n =sc.nextInt();
// int arr[] = new int [n];
// for(int i =0 ;i<n; i++){
// arr[i] = sc.nextInt();
// }
// int target = sc.nextInt();

// int left = 0;
// int right = arr.length-1;

// int mid = left + (right-left)/2;

// if(arr[mid]==target)
// {
// System.out.println("EQUAL");
// }
// else if(arr[mid]<target)
// {
// System.out.println("RIGHT HALF");
// }
// else
// {
// System.out.println("LEFT HALF");
// }

// }
// }

// <----------OOP---------->

// public class first{
//     public static void main (String args[]){
//         Home home = new Home();
//         home.gestrooms=7;
//         home.ringbell();
        
//     }
// }
// class Home {
//     int rooms;
//     int washrooms;
//     int kitchin;
//     int gestrooms; 
//     void ringbell()
//     {
//         System.out.println("Ding Dong...");
//     }  
// }


// linkedlist


// class Node
// {
//     int data;
//     Node next;
    
//     Node(int data)
//     {
//         this.data = data;
//     }
// }


// class LinkedList
// {
//     Node head;
    
//     void add(int data)
//     {
//         if(head==null)
//         {
//             Node n = new Node(data);
//             head = n;
//         }
//         else
//         {
//            Node ptr = head; //ptr to head
           
//            while(ptr.next!=null) //ptr to last node
//            {
//                ptr=ptr.next;
//            }
           
//            Node n = new Node(data); //create new node
           
//            ptr.next = n; //attach last node with new node
//         }
//     }
    
    //print data of list
//     void printlist()
//     {
//         Node ptr = head;
        
//         while(ptr!=null)
//         {
//             System.out.println(ptr.data);
//             ptr=ptr.next;
//         }
//     }
    
// }

// class Main {
//     public static void main(String[] args) {
     
//      //End Goal...
     
//      LinkedList list = new LinkedList();
     
//      list.add(10);
//      list.add(20);
//      list.add(45);
     
//      list.printlist();
     
     
//     }
// }

// class node {  // Node (object) ka blude print
// 	int data;
// 	node next; // nxt reference var. hai jo dusare node object ke taraf point karega 
// 	node(int var){
// 		data = var;
// 	}
// }

// public class first {
// 	public static void main (String args[]){
// 		node n1 = new node(20);// creation of object
// 		node head = n1;
// 		node n2 = new node(30);
// 		node n3 = new node(50);

// 		//linking

// 		n1.next = n2;
// 		n2.next = n3;
// 		n3.next = null;
// 		node ptr = head;
// 		while (ptr != null) {
// 		System.out.println(ptr.data);
// 		ptr = ptr.next;
// 		}

// 	}
// }


// class Node{
// 	int data;
// 	Node next;
// 	Node(int data){
// 		this.data = data;
// 	}

// }

// class Linkedlist{
// 	Node head;

// 	void add(int data)
// 	{
// 		if (head==null) 
// 		{
// 			Node n = new Node(data);
// 			head = n;
// 		}
// 		else
// 		{
// 			Node ptr = head;
// 			while(ptr.next!=null)
// 			{
// 				ptr=ptr.next;
// 			}
// 			Node n = new Node(data);

// 			ptr.next = n;

// 		}
// 	}
// 	void printlist()
// 	{
// 		Node ptr = head;
// 		while (ptr != null) 
// 		{
// 			System.out.println(ptr.data);
// 			ptr = ptr.next;
// 		}
// 	}
// }

// public class first{
// 	public static void main(String args[]){
// 		Linkedlist list = new Linkedlist();
// 		list.add(34);
// 		list.add(23);
// 		list.add(544);
// 		list.add(65);
// 		list.add(54);

// 		list.printlist();

public class first{
	public static void main(String args[]){
		System.out.println("Hello World");
	}
} 