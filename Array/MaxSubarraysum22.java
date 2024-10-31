package Array;
//prefix sum approach
public class MaxSubarraysum22 {
public static void main(String[] args){
    int arr[] = {2,4,6,8,10};
    int maxsum = Integer.MIN_VALUE;
    int prefix[] = new int[arr.length];
    int sum = 0;
    prefix[0] = arr[0];
    for(int i = 1;i<prefix.length;i++){
       
      prefix[i] = prefix[i-1] + arr[i];
    }
    for(int i = 0;i<arr.length;i++){
        int start = i;
        for(int j = i;j<arr.length;j++){
            int end = j;
            sum = start == 0?prefix[end]:prefix[end]-prefix[start-1];
            
            maxsum = (maxsum > sum)?maxsum:sum;
           
        }
    }
    System.out.print(maxsum);
}
}
