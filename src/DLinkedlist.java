package final_project;

import java.io.IOException;

public class DLinkedlist<T> extends menu2{
	
	protected DLLNode<T> headnode;
	protected DLLNode<T> endnode;
	protected DLLNode<T> current_node;
	protected int num_elements;
	
	
	
	public DLinkedlist()
	{
		num_elements=0;
	}
	
	public boolean isempty()
	{
		return(num_elements==0);
	}
	public int get_size()
	{
		return num_elements;
	}
	public void set_current(DLLNode<T> node)
	{
		current_node = node;
	}
	public DLLNode<T> get_current()
	{
		return current_node ;
	}
	
	public DLLNode<T> get_headnode()
	{
		return this.headnode;
	}
	
   
	

	public void add(T element)
	{
		DLLNode<T> newnode = new DLLNode<T>(element);
		if(endnode==null)
		{
			headnode = newnode;
		}
		else
		{
			endnode.set_Link(newnode);
			newnode.set_Back(endnode);
		}
		endnode=newnode;
		num_elements++;
	}
	
    
	
//	public T move() throws Exception
//	{
//		if(isempty())
//			throw new Exception();
//		else
//		{
//			T element;
//			element = endnode.get_info();
//			endnode = endnode.get_Back();
//			if(endnode == null)
//				headnode = null;
//			num_elements--;
//			return element;		
//		}
//		
//	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       menu2.menu2();
       DLinkedlist<String> list1 = new DLinkedlist<String>();
//       System.out.println(gradelist);
       
       for(int i=0;i<gradelist.size();i++)
       {
    	  list1.add(gradelist.get(i).get_last_name());
    	 
    	  
     
       }
       System.out.println(list1);
	}

	@Override
	public String toString() {
		return "DLinkedlist [headnode=" + headnode + ", endnode=" + endnode + ", num_elements=" + num_elements + "]";
	}

	
	
	
	

}
