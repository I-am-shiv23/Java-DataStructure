package Array;
//Brute force approach
public class Maxsubarrsum {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                int sum = 0;
                for(int a = i;a<=j;a++){
                   sum += arr[a];
                }
                maxsum = (maxsum > sum)?maxsum:sum;
               
            }
        }
        System.out.print(maxsum);
    }
    
}
