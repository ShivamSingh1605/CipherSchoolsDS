package LinkedLists;
 class Node
{
	int data;
	Node ref;
	Node(int data)
	{
		this.data=data;
		this.ref=null;
	}
}
 class LinkedListMethods
{
	Node start_node;
	LinkedListMethods()
	{
		this.start_node=null;
	}
	public void traverse_list()
	{
		if(start_node==null)
		{
			System.out.println("List is empty");
			return;
		}
		Node n=this.start_node;
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.ref;
		}
		
	}
	public void insert_at_start(int data)
	{
		Node new_node=new Node(data);
		new_node.ref=this.start_node;
		this.start_node=new_node;
	}
	public void insert_at_end(int data)
	{
		Node new_node=new Node(data);
		if(this.start_node==null)
		{
			this.start_node=new_node;
			return;
		}
		Node n=this.start_node;
		while(n.ref!=null)
		{
			n=n.ref;
		}
		n.ref=new_node;
	}
	public void insert_after_item(int data,int item)
	{
		Node n=this.start_node;
		while(n!=null)
		{ if(n.data==item)
			break;
			n=n.ref;
		}
		if(n==null)
		{
			System.out.println("item not in list");
			return;
		}
		Node new_node=new Node(data);
		new_node.ref=n.ref;
		n.ref=new_node;
	}
	public void insert_before_item(int data,int item)
	{
		if(this.start_node==null)
		{
			System.out.println("list is empty");
			return;
		}
		if(item==this.start_node.data)
		{
			Node new_node=new Node(data);
			new_node.ref=start_node;
			start_node=new_node;
					return;
		}
		Node n=this.start_node;
		while(n.ref!=null)
		{if(n.ref.data==item)
			break;
			n=n.ref;
		}
		if(n.ref==null)
		{
			System.out.println("item not in list");
			return;
		}
		Node new_node=new Node(data);
		new_node.ref=n.ref;
		n.ref=new_node;
	}
	public void insert_at_index(int data,int index)
	{
		
		if(index==1)
		{
			Node new_node=new Node(data);
			new_node.ref=start_node;
			start_node=new_node;
			return;
		}
		int i=1;
		Node n=this.start_node;
		while(i<index-1 && n!=null)
		{
			n=n.ref;
			i++;
			
		}
		if(n==null)
		{
			System.out.println("PLESE ENTER VALID INDEX");
			return;
		}
		Node new_node=new Node(data);
		new_node.ref=n.ref;
		n.ref=new_node;
	}
	public int count()
	{
		if(this.start_node==null)
		{
			return 0;
		}
		int count=0;
		Node n=this.start_node;
		while(n!=null)
		{
			count++;
			n=n.ref;
			
		}
		return count;
	}
	public void reverselist()
	{
		
	}
	
}
public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListMethods ll=new LinkedListMethods();
		ll.insert_at_start(23);
		ll.insert_at_end(34);
		ll.insert_at_end(98);
		ll.insert_at_index(67, 1);
		ll.insert_at_index(998, 5);
		
		
		
		
		ll.traverse_list();
		System.out.println(ll.count());
		
		
		

	}

}
