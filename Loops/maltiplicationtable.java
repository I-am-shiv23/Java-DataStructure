package Loops;

import java.util.Scanner;

//Write a program to print the multiplication table of a number N, entered by the user.
public class maltiplicationtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "x" + i + "=" + num * i);
        }
    }
}