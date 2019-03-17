package arrayOperations2;

public class MergeSort {

	public double[] partition(double[] arr)
	{
		
		if(arr.length <=1)
			return arr;
		int mid=arr.length/2;
		
		double[] first= new double[mid];
		double[] end;
		if(arr.length % 2 ==0)
			end= new double[mid];
		else
			end= new double[mid+1];
		
		for(int i=0;i<mid;i++)
		{
			first[i]=arr[i];
		}
		
		int x=0;
		for(int i=mid;i<arr.length;i++)
		{
			end[x]=arr[i];
			x++;
		}
		
		first=partition(first);
		end=partition(end);
			
		double[] result= new double[arr.length];
		
		return result= merge(first,end);
		
		
	}
	
	
	
	
	public double[] merge(double[] arr1, double[] arr2)
	{
		int result_length=arr1.length+arr2.length;
		
		double[] result= new double[result_length];
		
		int indexL=0;
		int indexR=0;
		int indexRes=0;
		
		while(indexL<arr1.length || indexR<arr2.length)
		{
			if(indexL<arr1.length && indexR<arr2.length)
			{
				if(arr1[indexL]<arr2[indexR])
				{
					result[indexRes]=arr1[indexL];
					indexL++;
					indexRes++;
				}
				
				else
				{
					result[indexRes]=arr2[indexR];
					indexR++;
					indexRes++;
				}
			}
			
			else
				if(indexL<arr1.length)
				{
					result[indexRes]=arr1[indexL];
					indexL++;
					indexRes++;
				}
				else
				{
					result[indexRes]=arr2[indexR];
					indexR++;
					indexRes++;
				}
			
		}
		
		return result;
		
		
		
		
	}
	
	
	
	
}
