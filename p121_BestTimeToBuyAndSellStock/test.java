package p121_BestTimeToBuyAndSellStock;

public class test {

	public static void main(String[] args) {
		int[] prices=new int[]{7,1,5,3,6,4};
		BruteForce bruteForce=new BruteForce();
		Optimized optimized=new Optimized();
		System.out.println("BruteForce: " + bruteForce.maxProfit(prices));
		System.out.println("Optimized: " + optimized.maxProfit(prices));
		
	}
}
