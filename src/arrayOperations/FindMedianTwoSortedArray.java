package arrayOperations;

public class FindMedianTwoSortedArray {

	/*
	 * int arr1[] = {1, 12, 15, 26, 38}; int arr2[] = {2, 13, 17, 30, 45};
	 * 
	 * To find the median we will keep on splitting the array and compare whose mid element is greater
	 * We will take the left part of the array whose mid is greater than other 
	 * And the right part of array whose mid element is smaller
	 * When we have just two elements left in both the array..
	 * We will formula (Math.max(arr1[0], arr2[0])+Math.min(arr1[1], arr2[1]))/2 
	 * to get the median
	 * 
	 */

	int a=0;
	public int FindMedianMergedArray(int[] arr1, int[] arr2)
	{
		
		int median1=arr1[(arr1.length/2)];
		int median2=arr2[(arr2.length/2)];
		
		int mid_index1= (arr1.length/2);
		int mid_index2=(arr2.length/2);
		
		if(arr1.length==2 && arr2.length==2)
		{
			
		System.out.println(arr1[0]+" "+arr1[1]+" "+arr2[0]+" "+arr2[1]);
			a=(Math.max(arr1[0], arr2[0])+Math.min(arr1[1], arr2[1]))/2;
			return a;
		}
		
		if(median2>median1)
		{
			int[] tmp_arr2= new int[mid_index2+1];
			for(int i=0;i<mid_index2+1;i++)
			{
				tmp_arr2[i]=arr2[i];
			//	System.out.print(tmp_arr2[i]+" ");
			}
			arr2=tmp_arr2;
			int x=0;
			int[] tmp_arr1= new int[arr1.length-mid_index1];
			for(int i=mid_index1;i<arr1.length;i++)
			{
				tmp_arr1[x]=arr1[i];
				x++;
			}
			arr1=tmp_arr1;
		}
		else
		{
			int[] tmp_arr1= new int[mid_index1+1];
			for(int i=0;i<mid_index1+1;i++)
			{
				tmp_arr1[i]=arr1[i];
			}
			arr1=tmp_arr1;
			
			int x=0;
			int[] tmp_arr2= new int[arr2.length-mid_index2];
			for(int i=mid_index2;i<arr2.length;i++)
			{
				
				tmp_arr2[x]=arr2[i];
			//	System.out.print(" A "+tmp_arr2[x]+" ");
				x++;
				
			}
			arr2=tmp_arr2;
			
		}
		
		
		
		
		FindMedianMergedArray(arr1,arr2);
		
		
		
		
		return a;
		

		

	}
	
		

	

	public static void main(String args[]) {
		int arr1[] = { 1, 12, 15, 26, 38 };
		int arr2[] = { 2, 13, 17, 30, 45 };

		

		FindMedianTwoSortedArray obj = new FindMedianTwoSortedArray();
		System.out.println(obj.FindMedianMergedArray(arr1, arr2));
		
		
		
		
		

	}
}
