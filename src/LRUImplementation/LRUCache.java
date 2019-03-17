package LRUImplementation;

import java.util.HashMap;
import java.util.Set;

public class LRUCache {

	public static HashMap<Integer, Node> hm= new HashMap<>();
	
	int capacity=0;
	
	//Setting the capacity of the cache..
	public void setcapacity(int capacity)
	{
		this.capacity=capacity;
	}
	
	
	/**This will set the value in the cache
	 * That means it will add the value at the end of the linked List..
	 * @param data
	 */
	
	public static LRULinkedNode obj = new LRULinkedNode();
	public void set(int key, int value)
	{
		

		
		if(obj.size_Linked_List() < capacity && !hm.containsKey(key))
		{
			
		Node endNode =obj.AddNodeAtEnd(key,value);

		
		hm.put(key, endNode);
		
		}
		
		else
		{
			
			if((obj.size_Linked_List() <= capacity )
					&& hm.containsKey(key))
			{
				
				
				Node oldNode= hm.get(key);
				obj.remove(oldNode);
				Node newNode=obj.AddNodeAtEnd(oldNode.key,value);
				hm.replace(oldNode.key,oldNode, newNode);
			}
			else
			{
				
				if( !hm.containsKey(key) &&obj.size_Linked_List() < capacity)
				{
					
					hm.remove(obj.header.key);
				
					obj.removeFromStart();
					Node tmp=obj.AddNodeAtEnd(key, value);
					
					hm.put(key, tmp);
					
					
				}
		
				 
				if( (!hm.containsKey(key)) && (obj.size_Linked_List() >= capacity))
				{
					
					
					hm.remove(obj.header.key);
					
					obj.removeFromStart();
					Node tmp=obj.AddNodeAtEnd(key, value);
					hm.put(key, tmp);
					
				}
				if((hm.containsKey(key)) && (obj.size_Linked_List() >= capacity))
				{
					
					Node tm=hm.get(key);
					obj.remove(tm);
					obj.AddNodeAtEnd(key, tm.value);
					hm.put(key, tm);
				}
			}
			
		}
		
		System.out.println(hm.keySet());
		
	}
	
	
	/**
	 * This will get the value of the key from the cache..
	 * if key not found return -1
	 * @param key
	 */
	
	public void get(int key)
	{
		if(!hm.containsKey(key))
			System.out.println("-1");
		else
		{
			
			Node found_node= hm.get(key);
			LRUCache obj1 = new LRUCache();
			System.out.println("KEy "+key);
			obj1.set(key, found_node.value);

		}
		
	}
	
	public void Print()
	{
		obj.PrintNode();
	}

}
