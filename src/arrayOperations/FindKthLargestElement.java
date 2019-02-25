package arrayOperations;

import java.util.PriorityQueue;

/**
 * Below class will find the Kth largest element
 * We will be using MinHeap with the implementation of priority queue to achieve the same. 
 * In mean heap the parent element is always smaller than the child elements
 * So we will add all the elemets to Priority queue and then poll one by one elements till arr.length-K
 * The element we will get will be the Kth largest element.
 * @author swetavk
 *
 */

public class FindKthLargestElement {
	
	
	
	
	public static PriorityQueue<Integer> pq= new PriorityQueue<>();
	
	public static void main(String args[])
	{
		int output = 0;
		int[] arr= {21,24,20,13,8,5,6};
		int K=3;
		for(int i=0;i<arr.length;i++)
		{
			pq.add(arr[i]);
		}
		
		for(int i=0;i<arr.length-K;i++)
		{
			output=pq.poll();
			
		}
		
		System.out.println(pq.poll());
		
		
	}
	
}
