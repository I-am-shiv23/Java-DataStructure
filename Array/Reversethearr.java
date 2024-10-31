import java.lang.reflect.Array;
import java.util.*;
public class Reversethearr {
    public static void main(String[] args) {
        int arr[] ={3,58,3,9,289,47};
   
         int n = arr.length;
        for(int i = 0;i<arr.length/2;i++){
            int temp = arr[i];
            int temp2 = arr[n-i-1];
            arr[i] = temp2;
            arr[n-i-1] = temp; 
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
     }
    
}
