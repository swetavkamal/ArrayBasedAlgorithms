package LRUImplementation;

public class LRURunner {

	public static void main(String args[])
	{
//		LRU obj = new LRU(3);
		
//		obj.set(1, 1);
//		obj.set(2, 2);
//		System.out.println(obj.getKey(1));
//		obj.set(3, 3);
//		
//		obj.set(4, 4);
//		
		
//		obj.PrintLinkedHash();
		
	
//		obj.AddNodeAtEnd(1,5);
//		obj.AddNodeAtEnd(2,10);
//		obj.AddNodeAtEnd(3,15);
//		obj.AddNodeAtEnd(4,20);
//		
//		obj.PrintNode();
	//	System.out.println(obj.size_Linked_List());
		
		LRUCache obj1 = new LRUCache();
		obj1.setcapacity(5);
		obj1.set(1, 5);
		obj1.set(2, 10);
		obj1.set(3, 15);
		obj1.set(4, 20);
		obj1.set(5, 25);
 //   	obj1.set(6, 30);
//		obj1.set(7, 35);
//		obj1.get(3);
//		obj1.get(4);
//		obj1.get(5);
//		obj1.set(8, 40);
//		obj1.set(9, 45);
//		obj1.set(10,50);
//		
		
		
	obj1.get(2);
	obj1.get(3);
	obj1.set(6, 30);
		
	
		
		

	obj1.Print();
		
		
		
		
	}
	
	
}
