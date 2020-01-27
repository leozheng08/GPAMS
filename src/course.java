package final_project;

public class course {
	private String cname;
	private String site;
	private int size;
	private int assignment;
	private int project;
	private int exam;
	
	public course(String name, String site, int size, int asg, int prj, int exam) 
	{
		this.cname = name;
		this.site = site;
		this.size = size;
		this.assignment = asg;
		this.project = prj;
		this.exam = exam;
	}
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getAssignment() {
		return assignment;
	}
	public void setAssignment(int assignment) {
		this.assignment = assignment;
	}
	public int getProject() {
		return project;
	}
	public void setProject(int project) {
		this.project = project;
	}
	public int getExam() {
		return exam;
	}
	public void setExam(int exam) {
		this.exam = exam;
	}
	

	@Override
	public String toString() {
		return "course [cname=" + cname + ", site=" + site + ", size=" + size + ", assignment=" + assignment
				+ ", project=" + project + ", exam=" + exam + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
