package Pattern;
import java.util.Scanner;
//0-1 Triangle Pattern
public class Trianglepattern01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 1;
        for(int i = 0;i<num;i++){
            for(int j = 0;j<i;j++){
            System.out.print(count + " ");
            count = (count == 1)?0:1;
            }
            System.out.println();
        }
    }
    
}
