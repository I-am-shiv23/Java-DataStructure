package Pattern;

import java.util.Scanner;
//Butternfly Pattern
public class Butteryflypattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1;i<=num;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
                }
            for(int j = 1;j<=2*(num-i);j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

                        }
        for(int i = 0;i<num;i++){
            for(int j = num-i;j>0;j--){
                System.out.print("*");
            }
            for(int j = 2*(num-i);j<2*num;j++){
                System.out.print(" ");
            }
            for(int j = num;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        }






    }

