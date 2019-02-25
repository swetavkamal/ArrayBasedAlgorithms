package RailwayTrackProblem;

import java.util.HashMap;

/**
 * There is schedule of trains with arrival and departure.
 * We need to find the minimum tracks for the train
 * We will normalize the interval, i.e if schedule is 1,4 then we will have 1,2,3,4 in hashmap
 * with key as 1,2,3,4 and its value will be 1
 * Now when we normalize next interval we will check whether the value exists in hashmap, if it exists
 * we will add one to the value of the key
 * Once the traversing is complete we will check the max value and that will be the minimum tracks required
 * 
 * @author swetavk
 *
 */


public class FindMinTracks {
	
	public static HashMap<Integer, Integer> train_hashMap= new HashMap<>();
	public static 	int max_value=1;
	public static void  FindTracks()
	{
		for(int i =0;i < MinTracks.trains.size();i++)
		{
			int arrival_time= MinTracks.trains.get(i).arrival;
			int departure_time=MinTracks.trains.get(i).departures;
			
			for(int j= arrival_time;j<=departure_time;j++)		
			{
				
				
				if(train_hashMap.containsKey(j))
				{
					train_hashMap.put(j, train_hashMap.get(j)+1);
				}
				else
					train_hashMap.put(j, 1);
				
			}
			
		}
		
		
		for (Integer name: train_hashMap.keySet()){

            String key =name.toString();
            String value = train_hashMap.get(name).toString();  
            System.out.println(key + " " + value);  
		}
		
	
		for(Integer name: train_hashMap.keySet())
		{
			int Key= name;
			int value=train_hashMap.get(name);
			
			
			if(value>max_value)
			{
				System.out.println("Value is .."+value+ "Max value "+max_value);
				max_value=value;
			}
			
		}
		System.out.println("Max value is .."+max_value);
		
		
	}

}
