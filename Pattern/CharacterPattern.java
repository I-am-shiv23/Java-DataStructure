package Pattern;

import java.util.Scanner;

public class CharacterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numline = sc.nextInt();
        char ch = 'A';
        for(int line = 1;line<=numline;line++){
            for(int chars = 1;chars<=line;chars++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }


    }
    
}
