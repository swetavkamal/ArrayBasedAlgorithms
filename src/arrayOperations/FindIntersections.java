package arrayOperations;


/**
 * This class will take two arrays with touples we need to find the intersection points of the two arrays
 * We need to check different conditions such as if first element of first array is less than
 * First element of second array and second element of first is less than second element of second array
 * range will start from first element of second array to second element of first array and so on..
 * 
 * @author swetavk
 *
 */

public class FindIntersections {

	
	static int A[][]= {{0,2},{5,10},{13,23},{24,25}};
	static int B[][]= {{1,5},{8,12},{15,24},{25,26}};
	
	
	static int[][] output = new int[6][6];
	
	public static void main(String args[])
	{
		FindIntersections obj = new FindIntersections();
		obj.func(A,B);
	}
	
	
	
	
	public static void func(int[][] A, int[][] B)
	{
		int A_length=0;
		int x=0;
		for(int i=0;i<A.length;i++)
		{
			if((A[i][0]<B[i][0]) && (A[i][1]<B[i][1]))
			{
				output[x][0]= B[i][0];
				output[x][1]=A[i][1];
				x++;
			}
			
			if(A_length< A.length-1) {
			if(B[i][0]== A[i+1][0] && A[i+1][1]>B[i][1] )
			{
				output[x][0]=A[i+1][0];
				output[x][1]=A[i+1][0];
				x++;
			}
			
			if((B[i][0]<A[i+1][0])&&(B[i][1]== A[i+1][0]))
			{
				output[x][0]=A[i+1][0];
				output[x][1]=A[i+1][0];
				x++;
			}
			}
			A_length++;
		}
		
		for(int i=0;i<output.length;i++)
		{
			System.out.print(output[i][0]+" "+output[i][1]+" ");
			System.out.println(" ");
		}
		
		
	}
	
}



