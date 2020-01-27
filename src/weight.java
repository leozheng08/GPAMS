package final_project;

public class weight {
	
	private String category;
	private int value;
	
public weight(String category,int value)
{
	this.category = category;
	this.value = value;
}
public String getcategory()
{
	return this.category ;
}
public int getvalue()
{
	return this.value ;
}

	@Override
public String toString() {
	return "weight [category=" + category + ", value=" + value + "]";
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
