package arrayOperations2;

/**
 * This class will take the array and the number K
 * Now it will find the max average from the sub array of K elements
 * 
 * We will add K elements first and then 
 * we will proceed in the loop from k to n such that
 * we will keep on adding one element and remove last element from start and keep on comparing it with
 * current sum if sum is greater swap
 * One we find the max sum, we will simply divide it by K to get the max average..
 * @author swetavk
 *
 */


public class MaximumAverageSubArray {
	
	
	public static void main(String args[])
	{
		int[] arr= {1,12,-5,-6,50,3};
		int k=4;
		
		int sum=arr[0];
		
		for(int i=1;i<k;i++)
			sum=sum+arr[i];
		int max_sum=sum;
		for(int i=k;i<arr.length;i++)
		{
			max_sum=sum+arr[i]-arr[i-k];
			if(max_sum>sum) {
				sum=max_sum;
			//	max_sum=0;
			}
		}
		
		System.out.println("SUM IS "+sum);
		System.out.println("The average is .."+(sum/k));
		
	}

}
