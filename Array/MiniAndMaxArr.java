public class MiniAndMaxArr {
    public static void main(String[] args) {
        int arr [] = {13,483,23,84,8,48,97,12,16};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE; 

        for(int i = 0;i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
            if(max<arr[i]){
              max = arr[i];
            }
        }
        System.out.println("Maximum of array : "+max);
        System.out.println("Minimum of Array : "+min);
    }
    
}
