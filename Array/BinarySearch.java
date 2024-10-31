package Array;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int seraching(int arr[],int key){
    Arrays.sort(arr);
    int start = 0,end = arr.length-1;
    while(start<=end){
        int mid = (start + end)/2;
        if(arr[mid] == key){
            return mid;
        }else if(arr[mid]<key){
            start= mid+1;
        }else{
            end = mid-1;
        }
    }
    return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,6,36,2,8,9,4,7,1,5};
        System.out.println("arr[] = {2,6,36,2,8,9,4,7,1,5}");
        int key = sc.nextInt();
        int ans = seraching(arr, key);
        if( ans != -1){
            System.out.println("index of number is : "+ans);
        }else{
            System.out.println("number is missing in array");
        }
        

    }
    
}
