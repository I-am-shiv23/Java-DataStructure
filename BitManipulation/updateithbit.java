package BitManipulation;

public class updateithbit {
    public static int ClearithBit(int n, int i){
        int bitmask = ~(1<<i);
        
        return n & bitmask;
        
    }
    public static int updateIth(int n, int i, int newbit){
        n = ClearithBit(n, i);
        int bitmask = newbit<<i;
        return n | bitmask;
    }
    public static void main(String[] args) {
        System.out.println(updateIth(10, 2, 1));
    }
}
