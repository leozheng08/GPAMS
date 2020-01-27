package final_project;

import java.util.ArrayList;

public class finalgrade {
	
	public String first_name;
	public String last_name;
	public String  SID;
	public String class_number;
	public String site;
	public int[] HW;
	public String project;
	public String midterm;
	public String finalterm;
	public int HW_average=0;
    public double total_score;
    public String grade;
    public ArrayList<weight> weightlist = new ArrayList<weight>();
	
	public finalgrade(String first_name, String last_name, String SID, String class_number, String site,int[] HW, String project, String midterm,
			String finalterm,ArrayList<weight> weightlist) 
	{
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.SID = SID;
		this.class_number = class_number;
		this.site = site;
		this.HW =HW;
		this.project = project;
		this.midterm = midterm;
		this.finalterm = finalterm;
		this.weightlist = weightlist;
		for(int i=0;i<this.HW.length;i++)
		{
			this.HW_average = this.HW_average+HW[i];
		}
		this.HW_average=this.HW_average/HW.length;
	    this.total_score = 
	    (Integer.parseInt(this.finalterm)/100.00)
	    		*this.weightlist.get(0).getvalue()
	    		+(Integer.parseInt(this.midterm)/100.00)*this.weightlist.get(1).getvalue()
	    		+(Integer.parseInt(this.project)/20.00)*this.weightlist.get(2).getvalue()
	    		+(this.HW_average/10.00)*this.weightlist.get(3).getvalue();
	    
		if(this.total_score>=90)
		{
			this.grade = "A";
		}
		else if(this.total_score<90&&this.total_score>=80)
		{
			this.grade="B";
		}
		else if(this.total_score<80&&this.total_score>=70)
		{
			this.grade = "C";
		}
		else
		{
			this.grade ="E";
		}
	
	}
	
	public double get_total_score()
	{
		return this.total_score;
	}
	public int get_HW_average()
	{
		return this.HW_average;
	}
	public int get_project()
	{
		return Integer.parseInt(this.project);
	}
	public void set_total_score(double total_score)
	{
		this.total_score = total_score;
	}
	public void set_HW_average(int HW_average)
	{
		this.HW_average=HW_average;
	}
	public void set_project(int project)
	{
		this.project = Integer.toString(project);
	}
	

	@Override
	public String toString() {
		return "finalgrade [last_name=" + last_name + ", first_name=" + first_name + ", SID=" + SID + "\n"
				+ ", site=" + site + ", homeworkaverage=" + HW_average +", project=" + project + "\n"
				+ ", midterm=" + midterm + ", finalterm="+ finalterm + ", total_score=" + total_score + "\n"
						+ ", grade=" + grade + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
     
	}

}
