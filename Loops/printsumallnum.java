package Loops;

import java.util.Scanner;

public class printsumallnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        System.out.println();
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        System.out.println("total sum of all natural number is : " + sum);
    }

}
