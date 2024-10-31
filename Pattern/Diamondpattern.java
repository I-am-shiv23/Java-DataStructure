package Pattern;

import java.util.Scanner;

public class Diamondpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i =1;i<=num;i++){
            for(int j =1;j<=num-i;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=(i*2)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0;i<num;i++){
            for(int j = 0;j<i;j++){
                System.out.print(" ");
            }
            for(int j = (num*2-1-i);j>i;j--){
                System.out.print("*");
                
            }
            System.out.println();
        }
       
    }
    
}
