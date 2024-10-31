package DivideAndConquer;
public class QuickSort {
    public static void printARR(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print( arr[i] +" ");
        }
    }
    public static void Sort(int arr[],int si,int ei){
       if(si>=ei){
        return;
       }
       int pidx = partition(arr,si,ei);
       Sort(arr, si, pidx-1);//left
       Sort(arr, pidx+1, ei);//right
    }
    public static int partition(int arr[],int si,int ei){
        int pivot = arr[ei];
        int i = si-1;//to make place for smaller pivot
        for(int j = si;j<ei;j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
          
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,8,2,5};
        Sort(arr, 0, arr.length-1);
        printARR(arr);
    }
    
}
