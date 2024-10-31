package BitManipulation;

public class clearbit {
    public static int ClearithBit(int n, int i){
        int bitmask = ~(1<<i);
        
        return n & bitmask;
        
    }
    public static void main(String[] args) {
        System.out.println(ClearithBit(10, 2));
    }
    
}
