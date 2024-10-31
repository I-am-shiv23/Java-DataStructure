package Pattern;

import java.util.Scanner;
//Floyd's Triangle
public class floydtrianglepattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        int count = 1;
        for(int i = 0;i<line;i++){
            for(int j = 0;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    
}
