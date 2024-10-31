package Recursion;
public class Factorial{

    public static int printfact(int n){
        if(n == 0){
            return 1;
        }
        return n*printfact(n-1);
    }
    public static void main(String[] args) {
        System.out.println(printfact(5));
    
        
    }
}