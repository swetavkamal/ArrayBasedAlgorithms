package LRUImplementation;

public class LRULinkedNode {

	int key;
	int value;
	Node header;
	
	//This will add the node at the END...
	public Node AddNodeAtEnd(int key, int value)
	{
		Node newNode= new Node(key,value);
		if(header==null)
			header=newNode;
		
		else
		{
			Node tmp=header;
			while(tmp.next!=null)
			{
				tmp=tmp.next;
			}
			tmp.next=newNode;
		}
		return newNode;
		
		
	}
	
	public int size_Linked_List()
	{
		int size=0;
		Node tmp= header;
		
		while(tmp != null)
		{
			size++;
			tmp=tmp.next;
		}
		
		return size;
		
	}
	
	
	
	public void remove(Node node)
	{
		Node tmp=header;
		
		
		while(tmp.next != null)
		{
			
			if(tmp.next==node)
				tmp.next=tmp.next.next;
			else
				tmp=tmp.next;
				
		}
		
	}
	
	public void removeFromStart()
	{
		
	//	Node tmp=header;
		
		header=header.next;
		
		//return to_return;
		
	}
	
	
	
	public void PrintNode()
	{
		Node tmp_node=header;
		
		while(tmp_node != null)
		{
			System.out.println(tmp_node.key+" --> "+tmp_node.value);
			tmp_node=tmp_node.next;
		}
	}
	
	
}


//Linked List node..
class Node{
	int key;
	int value;
	Node next;
	
	Node(int key, int value)
	{
		this.key=key;
		this.value=value;
		next=null;
		
	}
}
