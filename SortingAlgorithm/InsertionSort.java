package SortingAlgorithm;

public class InsertionSort {
    public static void Insersort(int arr[]){
        for(int i = 1;i<arr.length;i++){
            int prev = i-1;
            int curr = arr[i];
           
                while(prev >= 0 && arr[prev]>curr){
                    arr[prev+1] = arr[prev];
                    prev--;
                }
                arr[prev+1] = curr;

        }
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {24, 3, 5, 3, 6, 4};
        Insersort(arr);
        
    }
    
}
