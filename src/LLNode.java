package final_project;

public class LLNode<T> {
	
	protected T info;
	protected LLNode<T> link;
	
	
	public LLNode(T info)
	{
		this.info = info;
		link = null;
	}
	
	public void set_info(T info)
	{
		this.info = info;
	}
	
	public T get_info()
	{
		return info;
	}
	
	public void setlink(LLNode<T> link)
	{
		this.link =link;
	}
	public LLNode<T> get_link()
	{
		return this.link;
	}
	

	@Override
	public String toString() {
		return "LLNode [info=" + info + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
