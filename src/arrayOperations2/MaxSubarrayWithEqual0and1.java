package arrayOperations2;

import java.util.HashMap;

/**
 * 
 * Below class will find the maximum subarray such as we have equal number of 0s and 1s
 * We will replace 0s with -1 and find the maximum subarray with sum=0
 * This is because let us assume we have 0,1 and we replace it with -1,1 as it sum is 0 that means 
 * One of this is 0 and other is 1 as they have one as 1 so other has to be 0
 * 
 * Then iterate through loop and keep on adding the sum and i to hash map until you find the sum..
 * @author swetavk
 *
 */

public class MaxSubarrayWithEqual0and1 {

	public static void main(String args[])
	{
		HashMap<Integer,Integer> hm = new HashMap<>();
		int[] arr= {0,0,1,0,1,0,0};
		
		

		int sum=0;
		int len=0;
		int j=0;
		int end_index=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+((arr[i]==0)?-1:1);
			
			if(hm.containsKey(sum) && len<(i-(hm.get(sum))))
			{
				len=i-(hm.get(sum));
				 j=hm.get(sum);
				 end_index=i;
				 
			
				 
			}
			else
			hm.put(sum, i);
		}
		
		for(int k=j+1;k<=end_index;k++)
			System.out.print(arr[k]);
	//	 System.out.println("J "+j + "end_index "+end_index);
		
		
	}
	
}
