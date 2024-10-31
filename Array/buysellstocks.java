package Array;

public class buysellstocks {
    public static int buyandsell(int prices[]){
     int buyprice = Integer.MAX_VALUE;
     int maxproft = 0;
     for(int i = 0;i<prices.length;i++){
        if(buyprice<prices[i]){
            int profit = prices[i] - buyprice;
            maxproft = Math.max(profit, maxproft);
        }else{
            buyprice = prices[i];
        }
     }
     return maxproft;
    }
    public static void main(String[] args) {
       int prices[] = {7,1,5,3,6,4};
       System.out.println(buyandsell(prices));

        
    }
}
