package final_project;

import java.io.IOException;

public class DLLNode<T> extends menu2{
	
    protected DLLNode<T> Link;
	protected DLLNode<T> Back;
	protected T info;
	
	
	
	
	public DLLNode(T info)
	{
		this.info =info;
		this.Link = null;
		this.Back=null;	
	}
	@Override
	public String toString() {
		return " [info=" + info + "]";
	}
	public void set_Link(DLLNode<T> Link)
	{
		this.Link = Link;
	}
	
	public void set_Back(DLLNode<T> Back)
	{
		this.Back = Back;
	}
	
	public DLLNode<T> get_Link()
	{
		return this.Link;
	}
	
	public DLLNode<T> get_Back()
	{
		return this.Back;
	}
	public T get_info()
	{
		return this.info;
	}



	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     menu2.menu2();
     for(int i = 0;i<gradelist.size();i++)
     {
    	 DLLNode<String> node = new DLLNode<String>(gradelist.get(i).get_fisrt_name());
    	 System.out.println(node);
     }
	}
	

	
	

}
