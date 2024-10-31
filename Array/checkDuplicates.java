package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class checkDuplicates {
    public static void main(String[] args) {
        int arr[] = {2,5,3,6,8,9};
        boolean ans = false;
        Arrays.sort(arr);
        for(int i = 1;i<arr.length;i++){
               if(arr[i] == arr[i-1]){
                ans = true;
               }
        }
        if(ans){
            System.out.println("duplicates exit in this array");
        }else{
            System.out.println("duplicates not exit in this array");
        }
    }
    
}
