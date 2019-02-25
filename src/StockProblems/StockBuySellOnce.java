package StockProblems;
/**
 * This class will find the maximum profit that you can make if you can buy and sell the stock just once
 * @author swetavk
 * 
 * We will initialize minima wiht Integer.MAX
 * And traverse through array if current value < minima set it as minima
 * else
 * subtract the current value from minima and find the profit
 * If profit is greater than earlier set it up as profit
 *
 */


public class StockBuySellOnce {

	
	public static void main(String args[])
	{
		int[] arr= {7,1,5,3,6,4};
		
		int minima=Integer.MAX_VALUE;
		int profit=0;
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<minima)
				minima=arr[i];
			else
				if((arr[i]-minima)>profit)
					profit=(arr[i]-minima);
		}
		
		System.out.println(profit);
		
		
		
		
	}
}


