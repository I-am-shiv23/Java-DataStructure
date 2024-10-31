package DivideAndConquer;
public class mergesort{
    public static void divide(int arr[],int si,int ei){
        if(si >= ei){
            return;
        }
        int mid = si+(ei-si)/2;

        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        
        mergearr(arr,si,mid,ei);
        
    }
    public static void printARR(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
     public static void mergearr(int arr[],int si,int mid,int ei){
        int temp[] = new int[ei-si+1];
         int i = si;
         int j = mid+1;
         int k = 0;
           while(i<=mid && j<=ei){
            if(arr[i] < arr[j]){
            temp[k] = arr[i];
            i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
           }
           while(i<=mid){
            temp[k++] = arr[i++];
           }
           while(j<=ei){
            temp[k++] = arr[j++];
           }

           for(k =0,i = si;k<temp.length;i++,k++){
               arr[i] = temp[k];
           }
     }
    public static void main(String[] args) {
        int arr[] = {2,5,3,1,7,6};
        divide(arr, 0, arr.length-1);
        printARR(arr);
       
    }
}