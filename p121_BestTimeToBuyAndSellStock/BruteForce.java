package p121_BestTimeToBuyAndSellStock;

public class BruteForce {//最大利潤
    public int maxProfit(int[] prices) {
        int num_first,num_second,profit=0;
        for(int i=0;i<prices.length;i++) {
        	for(int j=i+1;j<prices.length;j++) {
        		num_first=prices[i];
        		num_second=prices[j];
        		if( profit<(num_second-num_first)) {
        			profit=num_second-num_first;
        		}
        	}
        }
        return profit;
    }
}