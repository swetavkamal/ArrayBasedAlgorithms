package arrayOperations2;

import java.util.HashMap;

/**
 * 
 * Find the length of Maximum subarray which has the sum equal to K
 * We will traverse through the array and if keep on summing the elements
 * If sum does not exist we will add the sum value and it's corresponding i value in MAP
 * If (sum-K) exists in the map, that means from that index to current value has the 
 * subarray which we require and if current length is greater than the length of current sequece which is 
 * i-hm.get(sum-K) we will set the current index as end of sub array and the start as the element(sum) 
 * which is found in map..
 * 
 * @author swetavk
 *
 */



public class FindMaxLengthSubarrayWithSumK {
	
	
	public static void main(String args[])
	{
		HashMap<Integer, Integer> hm = new HashMap<>();
		int[] arr  = {1,2,3,4,5};
		int   sum  = 0;
		int   K    = 9;
		int   len = 0;
		
		int end_index=0;
		for(int i=0;i<arr.length;i++)
		{
			sum= sum+arr[i];
			
			if(!hm.containsKey(sum))
			{
				hm.put(sum, i);
			}
			
			
			 if (hm.containsKey(sum-K) && len < (i-hm.get(sum-K)))
			{
				len=i-hm.get(sum-K);
				
				end_index=i;
				
				
				
				
			}
			
			 
			
		}
		
		for(int j=(end_index-len+1);j<=end_index;j++)
			System.out.print(arr[j]+" ");
	
		System.out.println("\nMax length is .."+len);
		
		
	}

}
