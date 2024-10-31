package BitManipulation;
//count set bits in number.
public class countset {
    public static int checkcount(int n){
       int count = 0;
        while(n>0){
            if((n & 1) != 0){
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(checkcount(15));
    }
}
