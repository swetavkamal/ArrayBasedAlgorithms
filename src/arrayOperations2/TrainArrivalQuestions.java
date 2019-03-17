package arrayOperations2;

/*
 * In this class we have two train arrival and departure timings..
 * One Array contains their arrival while other contains their departure
 * We will sort the arrival and departure array first
 * 
 * One sorted..
 * We will start comparing the values of arrival and departure 
 * If arrival is less than departure we will increase count by 1 and take the max of current platforms and 
 * count
 * If arrival is not less than departure than we will move pointer to next in departure and decrease 
 * the count
 * as we are starting fresh
 */

public class TrainArrivalQuestions {
	
	
	
	
	public static void main(String args[])
	{
		double[] arrival= {2.00,2.10,3.00,3.20,3.50,5.00};
		double[] departure= {2.30,3.40,3.20,4.30,4.00,5.20};
		
		MergeSort obj = new MergeSort();
		double[] sorted_arrival= new double[arrival.length];
		double[] sorted_departure= new double[departure.length];
		
		sorted_arrival=obj.partition(arrival);
		sorted_departure=obj.partition(departure);
		
		for(int i=0;i<sorted_arrival.length;i++)
			System.out.print(sorted_arrival[i]+" ");
		
		System.out.println("\n");
		for(int i=0;i<sorted_departure.length;i++)
			System.out.print(sorted_departure[i]+" ");
		
		int count=0;
		int platforms=0;
		int j=0;
		int i=0;
		while(i<sorted_arrival.length)
		{
			if(sorted_arrival[i]<sorted_departure[j])
			{
				count++;
				platforms=Integer.max(platforms, count);
				i++;
				
			}
			else
			{
				count--;
				j++;
				
			}
			
		}
		
		System.out.println("MIN PLATFORMS REQUIRED .. "+platforms);
	
	}

}
