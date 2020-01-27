package final_project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class grade {
	
public String first_name;
public String last_name;
public String  SID;
public String class_number;
public String site;
//public ArrayList<HashMap> list = new ArrayList<HashMap>();
public String[] HW;
public String project;
public String midterm;
public String finalterm;



public grade(String first_name, String last_name, String SID, String class_number, String site,String[] HW, String project, String midterm,
		String finalterm) 
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

	
}

public String get_fisrt_name()
{
	return first_name;
	
}

public String get_last_name()
{
	return last_name;
}

public String get_SID()
{
	return SID;
}

public String get_site()
{
	return site;
}

@Override
public String toString() {
	return  first_name + "," + last_name + "," + SID + ","+ class_number + "," + site + ",\n" 
            +Arrays.toString(HW) +","+ project + ","+ midterm + "," + finalterm +"\n";
}





//@Override
//public String toString() {
//	return "Data Field              Data Max. Length (Byte)               Value\n"
//		+ "------------------------------------------------------------------------\n"
//		+ "first_name=             "+"       20                           "+first_name+" \n" 
//		+ "last_name=              "+"       20                           "+last_name+" \n" 
//		+ "SID=                    "+"       10                           "+SID+" \n"
//		+ "class_number=           "+"       5                            "+class_number+" \n"
//		+ "site=                   "+"       3                            "+site+" \n" 
//		+ "HW1...HWN               "+"       INT                          "+Arrays.toString(HW)+" \n" 
//		+ "project                 "+"       Float                        "+project+" \n" 
//		+ "midterm                 "+"       INT                          "+midterm+" \n"
//		+ "finalterm               "+"       INT                          "+finalterm+"\n";
//}











}

	

