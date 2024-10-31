package Array;

//Kadane's Algorithm 
// This is most Important Algorithm
public class Kadanesalogformaxsubarr {
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE; 
           
        for(int i = 0;i<arr.length;i++){
            currsum = currsum + arr[i];
            if(currsum < 0){
                currsum = 0;
            }
            maxsum = Math.max(maxsum, currsum);
        }
        System.out.println(maxsum);
    }
    
}
