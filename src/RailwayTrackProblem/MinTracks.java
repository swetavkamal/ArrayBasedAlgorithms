package RailwayTrackProblem;

import java.util.ArrayList;

public class MinTracks {
	
	
	public static ArrayList<Schedules> trains= new ArrayList<>();
	public static void main(String args[])
	{
	 
	//	trains.add(new Schedules(1, 8));
		trains.add(new Schedules(2, 4));
		trains.add(new Schedules(3, 6));
		trains.add(new Schedules(7, 8));
		trains.add(new Schedules(6, 7));
		trains.add(new Schedules(4, 6));
		
		FindMinTracks obj = new FindMinTracks();
		obj.FindTracks();
	}

}
