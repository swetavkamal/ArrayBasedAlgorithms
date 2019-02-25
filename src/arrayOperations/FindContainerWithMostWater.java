package arrayOperations;

/**
 * 
 * @author swetavk
 * Problem :
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). 
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, 
 * which together with x-axis forms a container, such that the container contains the most water.
 * Note: You may not slant the container and n is at least 2.
 *
 */


public class FindContainerWithMostWater {
	
	
	/**
	 * 
	 * Solution : We need to start two pointers.. One pointer will be at start and other at end
	 * Now we need to find the max vertical length and max difference between them
	 * And Out of two heights smaller pole's height would be accepted
	 * Noe find area = (smaller of two length)* difference between them
	 * Then increase start or end based on which is smaller..
	 * 
	 * If new area is bigger ..set the new area as bigger area..
	 * @param args
	 * @throws Exception
	 */
	
	
	 public static void main(String args[] ) throws Exception {
		    
		    int[] arr= {1,8,6,2,5,4,9,3,6,10};
		    
		    
		    int s=0;
		    int e=arr.length-1;
		    int max_area=0;
		    	while(s<e)
		    	{
		    		int diff=(e-s);
		    		
		    		int tmp_area=0;
		    		if(arr[s]<arr[e])
		    		{
		    			tmp_area=diff*arr[s];
		    			s++;
		    		}
		    		else
		    		{
		    			tmp_area=diff*arr[e];
		    			e--;
		    		}
		    		if(tmp_area>max_area)
		    		{	
		    			System.out.println("S is "+s +" E is "+e);
		    			max_area=tmp_area;
			  
		    		}
			  
		    	}
		    	
		    	System.out.println("Max area is .."+max_area);
		 
		    
		 
		    
		  }}
