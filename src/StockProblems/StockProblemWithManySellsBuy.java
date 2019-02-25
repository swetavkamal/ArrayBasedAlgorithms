package StockProblems;

import java.util.ArrayList;
import java.util.List;

/**
 * This class will find all sets of buy and see so that we get maximum profit
 * We need to traverse through the array till last index e > start index s
 * and find the local minima and local maxima and keep storing it
 * if current value is less than last value that means this is the last value was maxima 
 * and current value is minima
 * 
 * like 40 is less than 310 so 310 is maxima and 40 is local minima
 * {100, 180, 260, 310, 40, 535, 695};
 * @author swetavk
 *
 */


class Interval
{
	int Buy;
	int Sell;
}

public class StockProblemWithManySellsBuy {

	
	
	

	static ArrayList<Interval> sol = new ArrayList<Interval>();

	
	public static List<Interval> BuySell(int[] arr)
	{
		
		int i=0;
		int n=arr.length-1;
		while(i<n)
		{
			while(i<n-1 && arr[i+1]<arr[i])
			{
				i++;
			}
			if(i==n)
				break;
			
		Interval e= new Interval();
			e.Buy=i;
			i++;
			while(i<=n && arr[i]>arr[i-1])
			{
				i++;
			}
			e.Sell=i-1;
			
			sol.add(e);
		}
		
		
		
		 return sol;
		
	}
	
	
	public static void main(String args[])
	{
		int[] arr= {100, 180, 260, 310, 40, 535, 695};
		StockProblemWithManySellsBuy obj = new StockProblemWithManySellsBuy();
		obj.BuySell(arr);
		
		for(int i=0;i<sol.size();i++)
		{
			System.out.println(sol.get(i).Buy +" "+sol.get(i).Sell);
		}
		
		
	}
	
}
