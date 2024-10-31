package Arrays2D;

public class Diagonalsum {
    public static void Diagonalsumofmatrix(int matrix[][]) {
        int sum = 0;
        // Brute Force approach
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[0].length; j++) {
        //         if (i == j) {
        //             sum += matrix[i][j];
        //         } else if (i + j == matrix.length - 1) {
        //             sum += matrix[i][j];
        //         }
        //     }
        // }
        for(int i =0;i<matrix.length;i++){
            sum += matrix[i][i];
           if (i != matrix.length-i-1) {
            sum+=matrix[i][matrix.length-i-1];
           }
               
            
        }
        System.out.println(sum);

    }

    public static void main(String[] args) {
        int matrix[][] = { { 22, 58, 38, 59 },
                { 48, 95, 28, 55 },
                { 58, 37, 57, 47 },
                { 65, 87, 45, 78 }};
        Diagonalsumofmatrix(matrix);
    }

}
