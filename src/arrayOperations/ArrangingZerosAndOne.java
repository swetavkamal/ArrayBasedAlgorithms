package arrayOperations;

/** 
 * Below class will arrange zeros and one in optimised way
 * We have to shift all the zeros to left and all the 1st to right
 * We will start two pointer one at start and one at end
 * If arr[s]==0 it's at right place move pointer
 * Similarly if arr[e]=1 move the right pointer towards s as it is at right place
 * If not replace the two elements
 * This will move till s<=e
 * 
 * @author swetavk
 *
 */



public class ArrangingZerosAndOne {

	
	
	public static int[] Implement_func(int[] arr)
	{
		//{0,0,1,0,0,1,1,0};
		
		int s=0;
		int e=arr.length-1;
		for(int  i=0;i<arr.length;i++)
		{
			while(s<=e)
			{
				if(arr[s]==1 && arr[e]==0)
				{
					int tmp=arr[s];
					 arr[s]=arr[e];
					 arr[e]=tmp;
					 s++;
					 e--;
					
				}
				
				if(arr[s] == 0)
					s++;
				if(arr[e]== 1)
					e--;
			}
			
		}
		return arr;
		
	}
	
	public static void main(String args[])
	{
		int[] arr= {0,0,1,0,0,1,1,0};
		ArrangingZerosAndOne obj = new ArrangingZerosAndOne();
		int[] result=obj.Implement_func(arr);
		for(int i=0;i<result.length;i++)
			System.out.print(result[i]+" ");
		
	}
	
}

