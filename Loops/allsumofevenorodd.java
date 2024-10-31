package Loops;

import java.util.Scanner;

public class allsumofevenorodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        int temp;
        do {
            System.out.println("enter number who either even nor odd : ");
            int num = sc.nextInt();
            if (num % 2 == 0) {
                even += num;
            } else {
                odd += num;
            }
            System.out.print("Do you want entered any more number so enter 1 for YES and 0 for NO ");
            temp = sc.nextInt();
        } while (temp == 1);
        System.out.println("total sum of your entered even numbers are: " + even);
        System.out.println("total sum of your entered odd numbers are: " + odd);
    }

}
