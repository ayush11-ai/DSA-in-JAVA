import java.util.*;

class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0] ;
        int maxProfit=0;
        for(int i=0 ; i<prices.length ; i++){
            if(prices[i]<min){
                min = prices[i];
            }

           int profit = prices[i]-min;

           if(profit>maxProfit){
            maxProfit = profit ;
           }
        
         
        }
        return maxProfit;
        
        
    }
    

    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        Solution obj = new Solution();
        System.out.println(obj.maxProfit(prices));
    }
}