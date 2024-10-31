package Array;

import java.util.Scanner;

public class Linearsearch {
    public static void main(String[] args) {
        int arr[] = {2,8,3,7,9,1};
        System.out.println("arr[] = {2,8,3,7,9,1}");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number for find her index");
        int n = sc.nextInt();
        boolean find = false;
        int ans = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == n){
                find = true;
                ans = i;
                break;
            }
        }
        if(find){
            System.out.println("number found in array");
            System.out.println("Index of number in array : "+ans);
        }else{
            System.out.println("Not found");
        }
    }
    
}
