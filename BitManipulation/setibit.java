package BitManipulation;

public class setibit {
    public static int SetIthBit(int n, int i){
        int bitmask = 1<<i;
        return n|1<<i;
    }
    public static void main(String[] args) {
        System.out.println(SetIthBit(10, 2));
    }
    
}
