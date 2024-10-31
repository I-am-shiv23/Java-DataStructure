// package Loops;
// import  java.util.Scanner;

// public class primeornot {
// public static void main(String[] args) {
//   Scanner sc = new Scanner(System.in);
//   int num = sc.nextInt();

//   boolean isprime = true;
//   if(num == 2){
//     System.out.println("is prime number");
//   }else{
//   for(int i = 2;i<=num-1;i++){
//    if(num%i == 0){
//     isprime = false;
//    }
//   }
//   if(isprime){
//     System.out.println("is prime number");
//   }else{
//     System.out.println("is not prime number");
//   }
// }

// }

// }
package Loops;

import java.util.Scanner;

public class primeornot {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    boolean isprime = true;
    if (num == 2) {
      System.out.println("is prime number");
    } else {
      for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
          isprime = false;
        }
      }
      if (isprime) {
        System.out.println("is prime number");
      } else {
        System.out.println("is not prime number");
      }
    }

  }

}