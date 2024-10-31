package BitManipulation;

public class clearithbit {
    public static int clearIthBitAtlast(int n,int i){
        int bitmask = (-1)<<i;//(~0)<<i
        return n & bitmask;

    }
    public static void main(String[] args) {
     System.out.println(clearIthBitAtlast(15, 2));
    }
    
}
