package final_project;

public class full_name {

	public String firstname;
	public String lastname;
	public String site;
	
	public full_name(String firstname, String lastname,String site)
	{
		this.firstname = firstname;
		this.lastname= lastname;
		this.site = site;
	}
	
	@Override
	public String toString() {
		return   firstname + " " + lastname +" "+site+ ">>";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
