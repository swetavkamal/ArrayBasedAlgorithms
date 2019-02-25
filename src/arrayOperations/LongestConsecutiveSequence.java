package arrayOperations;

import java.util.HashSet;

/**
 * This class will find the length of the maximum subsequence such as in 
 * 36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42
 * Max is : 5 { 32, 33, 34, 35, 36}
 * 
 * First of all, push all the elements in a hash set..
 * We need to find the start of the sequence because other will be covered in starts
 * so arr[i] is start if hashset does not contain element before it.  arr[i]-1
 * Then keep on increasing the len till you keep on finding the next element in hash set 
 * 
 * if current length > older, replace it
 * 
 * @author swetavk
 *
 */

public class LongestConsecutiveSequence {

	public static void main(String args[])
	{
		int[] arr= {36, 41, 56, 35, 44, 33, 34, 92, 43, 32, 42};
		
		HashSet<Integer> hs= new HashSet<>();
		
		for(int i=0;i<arr.length;i++)
		{
			hs.add(arr[i]);
		}
		
		int len=1;
		int tmp=0;
		for(int i=0;i<arr.length;i++)
		{
			if(!hs.contains(arr[i]-1))
			{
				int s= arr[i];
				while(hs.contains(s+1))
				{
					len++;
					s=s+1;
				}
				
				if(len>tmp)
				{
					tmp=len;
				}
				len=1;
			}
		}
		
		System.out.println("the longest sequence is .."+tmp);
	}
	
}
