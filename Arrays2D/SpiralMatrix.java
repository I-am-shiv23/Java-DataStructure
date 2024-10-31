package Arrays2D;

public class SpiralMatrix {

    public static void traversematrix(int matrix[][]){
        int rowstart = 0;//++
        int rowend = matrix.length-1;//--
        int colstart = 0;//++
        int colend = matrix[0].length-1;//--

        while(rowstart<=rowend&&colstart<=colend){
            for(int j = colstart;j<=colend;j++){
                System.out.print(matrix[rowstart][j]+" ");
            }
            for(int i = rowstart+1;i<=rowend;i++){
                  System.out.print(matrix[i][colend]+" ");
            }
            for(int j = colend-1;j>=colstart;j--){
                if(rowstart==rowend){
                    break;
                }
                System.out.print(matrix[rowend][j]+" ");
            }
            for(int i = rowend-1;i>=rowstart+1;i--){
                if(colstart == colend){
                    break;
                }
                System.out.print(matrix[i][colstart]+" ");
            }
            rowstart++;
            rowend--;
            colstart++;
            colend--;
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{22,58,38,59},
                          {48,95,28,55},
                          {58,37,57,47},
                          {65,87,45,78},
                          {78,97,45,76}};
          
                          traversematrix(matrix);
    }
    
}
