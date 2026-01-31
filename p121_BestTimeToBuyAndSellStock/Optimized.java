package p121_BestTimeToBuyAndSellStock;

public class Optimized { // 一次遍歷最佳化 O(n)
    public int maxProfit(int[] prices) {
        int minPrice = prices[0]; // 歷史最低買入價
        int maxProfit = 0;        // 最大利潤
        
        for (int price : prices) {
            if (price < minPrice) minPrice = price;         // 更新最低價
            int profit = price - minPrice;                 // 計算當前利潤
            if (profit > maxProfit) maxProfit = profit;    // 更新最大利潤
        }
        
        return maxProfit;
    }
}