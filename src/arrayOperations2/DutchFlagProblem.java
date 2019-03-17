package arrayOperations2;

/**
 * Below class takes an array which has 0,1,2 we need to sort in order such that you have 0 then 1 
 * and then 2
 * 
 * We will use three way parition to achieve this. The idea is to keep all 2's at end and all 0's at left
 * we will start three pointers two at 0 and one at end of array
 * If mid element =2 swap it with end and reduce end by 1
 * If mid element =0 swap it with start and increase start and mid by 1 and 
 * If mid is one simply increase mid by 1
 * 
 * We need to do this until mid <= end
 * @author swetavk
 *
 */




public class DutchFlagProblem {
	
	
	public static void main(String args[])
	{
		int[] arr= { 0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0 };
	//	int[] arr= {0,1,2,0,1,2};
		int pivot=1;
		int s=0;
		int mid=0;
		int e=arr.length-1;
		
		
		while(mid<=e)
		{
			if(arr[mid]==0)
			{
			  int tmp=arr[s];
			  arr[s]=arr[mid];
			  arr[mid]=tmp;
			  s++;
			  mid++;
			}
			
			else if(arr[mid]==2)
			{
				int tmp= arr[e];
				arr[e]=arr[mid];
				arr[mid]=tmp;
				e--;
			}
			
			else
				mid++;
		}
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		
	}

}
