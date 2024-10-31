package BitManipulation; 
//check if a number is power of 2 or not
public class checkpower {
    public static boolean isPowerOftwo(int n){
        return (n&(n-1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOftwo(15));
    }

    
}
