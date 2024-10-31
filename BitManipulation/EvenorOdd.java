package BitManipulation;

public class EvenorOdd {
    public static void ifEvenorOdd(int num){
        int bitmask = 1;
        if((num & bitmask) == 1){
            System.out.println("Number is odd");
        }else{
            System.out.println("Number is even");
        }
    }
    public static void main(String[] args) {
        ifEvenorOdd(5);
        ifEvenorOdd(8);
        ifEvenorOdd(84);
    }
}
