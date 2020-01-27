package final_project;

public class rank_totalscore {
	private String first_name;
	private String last_name;
	private String site;
	private double total_score;
	private int HW_average;
	private int project;
	
	
	public rank_totalscore(String last_name, String first_name, String site,double total_score,int HW_average,int project)
	{
		this.last_name = last_name;
		this.first_name = first_name;
		this.site = site;
		this.total_score = total_score;
		this.HW_average = HW_average;
		this.project = project;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
