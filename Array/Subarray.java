package Array;

public class Subarray {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        for(int i = 0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                for(int a = i;a<=j;a++){
                    System.out.print(arr[a]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    
}
