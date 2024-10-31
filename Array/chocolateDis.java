package Array;
//Chocolate Distribution Problem
// Given an array arr[] of n integers where arr[i] represents the number of chocolates in ith packet. Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets such that: 

import java.util.Arrays;

// Each student gets exactly one packet.
// The difference between the maximum and minimum number of chocolates in the packets given to the students is minimized.
// Examples:

// Input: arr[] = {7, 3, 2, 4, 9, 12, 56}, m = 3 
// Output: 2 
// Explanation: If we distribute chocolate packets {3, 2, 4}, we will get the minimum difference, that is 2. 


// Input: arr[] = {7, 3, 2, 4, 9, 12, 56}, m = 5 
// Output: 7
// Explanation: If we distribute chocolate packets {3, 2, 4, 9, 7}, we will get the minimum difference, that is 9 – 2 = 7. 


public class choclateDis {
    static int findMinDiff(int[] arr, int m) {
        int len = arr.length;
        int ans = Integer.MAX_VALUE;
        int currmin = 0;
         Arrays.sort(arr);//2,3,4,7,9,12,56
        for(int i = 0;i<=len-m;i++){
            currmin = arr[m+i-1]-arr[i];    
            ans = Math.min(ans, currmin);            
        }        
        return ans;
    }
    public static void main(String[] args) {
        int arr[] ={7, 3, 2, 4, 9, 12, 56};
       System.out.println(findMinDiff(arr, 5));
    }
    
}
