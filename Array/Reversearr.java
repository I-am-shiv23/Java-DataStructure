package Array;

public class Reversearr {
public static void main(String[] args) {
    int arr[] = {1,6,3,8,7,9,67};
    
 
    for(int i = 0;i<arr.length/2;i++){
        int start = i;
        int end = arr.length-1-i;
        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;

    }
    for(int i = 0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
}    
}
