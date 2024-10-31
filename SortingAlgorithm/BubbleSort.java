package SortingAlgorithm;
//BubbleSort
public class BubbleSort {
    public static void main(String[] args) {
         int arr[] = {10,3,2,7,4,6,9,8,4,9,8373,382,5837,36590,37875,377596,664,94,67,75,938,67394,359,384774,2374,546,654654,86432,12385674,56,81,864,579};
         for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
         }
         for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
         }


        
    }
    
}
