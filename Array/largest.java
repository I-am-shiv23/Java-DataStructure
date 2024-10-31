package Array;


//find largest in array
public class largest {
    public static void main(String[] args) {
        int arr[] = {2, 5, 10, 8, 7, 1};
        int max = arr[0]; // Assume first element is the largest initially

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i]; // Update max if the current element is larger
            }
        }

        System.out.println("The largest element is: " + max);
           
    }
    
}
