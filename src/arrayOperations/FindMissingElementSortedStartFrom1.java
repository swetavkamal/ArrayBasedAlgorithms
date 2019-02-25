package arrayOperations;

/**
 * Below class has the method which will find the missing element in O(logn)
 * 
 * @author swetavk
 *
 */


public class FindMissingElementSortedStartFrom1 {
	
//	{1,2,4,5,6,7};
	
	/**
	 * Using Binary search version to achieve the same
	 * First of all find the mid element by (s+end_element)/2  .. Note s is 0 at start
	 * 
	 * Now need to check whether the one element less than mid is equal to mid .. for example, if you have last element of array as 7
	 * mid =(7+0)/2 =3
	 * that means 3rd element(which is 0,1, 2nd element) should be equal to 3, if it is, that means we do not need to worry about that half and move s to mid element, so 
	 * that we will check second half
	 * If 2nd pos element(which is 3rd ) is not equal to 3, something is missing and we need to look into that part and move your end to mid..
	 * 
	 * Base condition is.. if we have reached to a position where current element +2 = next element than current element +1 is missing
	 * For example, we will reach to 2,4 so arr[s]+2=arr[s+1]
	 * so 3 is missing
	 * 
	 * 
	 */
	
	
	
	
	
	public static int missing_elem=0;
	public int findMissing(int[] arr, int s, int e)
	{

		int mid=(s+e)/2;
		
		
		
		
		
		if(arr[s+1] == arr[s]+2)
		{

			missing_elem=arr[s]+1;
			return arr[s]+1;

			
		}
		
		if(arr[mid-1]==mid)
		{
			s=mid;
		}
		if(arr[mid-1]>mid)
		{
			
			e=arr[mid-1];
		//	System.out.println("e is "+e);
		}
		
		
		 findMissing(arr,s,e-1);
		
		
		
		return missing_elem;
		
	}
	
	
	public static void main(String args[])
	{
		int[] arr= {1,2,3,4,5,7};
		int e= arr[arr.length-1];
		
		
		if(arr[arr.length-1]==arr.length)
			System.out.println("There is no missing element");
		else
		{
			int final_missing_element =new FindMissingElementSortedStartFrom1().findMissing(arr,0,e);
			System.out.println("The missing element is "+final_missing_element);
		}
			
		
	
		
	}

}
