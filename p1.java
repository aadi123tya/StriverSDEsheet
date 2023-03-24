public class p1 {
    public static void stockBuySell(int[] price, int n) {
        int buy = Integer.MAX_VALUE;
        int MaxSellProfit=0;
        for(int i=0;i<n;i++)
        {
            if(buy<price[i])
            {
                int SellProfit = price[i]-buy;
                MaxSellProfit =Math.max(MaxSellProfit,SellProfit);
                
            }
            else if(buy>price[i])
            {
                buy=price[i]; 
                
            }
        }

       
    }
    public static void main(String[] args) {
        int price[]={100 , 180 ,260 ,310 ,40 ,535, 695};
        int n =7;
        stockBuySell(price,n);

    }
}