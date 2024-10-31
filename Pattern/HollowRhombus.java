package Pattern;

import java.util.Scanner;

//HOLLOW RHOMBUS
public class HollowRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0;i<num;i++){
            for(int j = 0;j<num-i;j++){
                System.out.print(" ");
            }
            for(int j = 0;j<num;j++){
                if(j==0||i==0||j == num-1||i==num-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
