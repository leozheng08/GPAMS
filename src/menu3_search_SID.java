package final_project;

import java.io.IOException;
import java.util.ArrayList;

public class menu3_search_SID extends menu2 {
	
	static String SID;
	public static ArrayList<grade> tem_list = new ArrayList<grade>();
	static grade tem_grade = new grade(null,null,null,null,null,null,null,null,null);
	
	
	public static  ArrayList<grade> menu3_search_SID(String newSID) throws IOException
	{
		menu2.menu2();
		SID = newSID;
		int count=0;
		for(int i=0;i<gradelist.size();i++)
		   {
			   if((gradelist.get(i).get_SID()).equals(SID))
			   {
				   count++;
				   tem_list.add(gradelist.get(i));  
			   }
			   
		   }
		if(count==0)
		   {
			  System.out.println("no result"); 
		   }
		else if(count>0)
		{
			for(int i = 0;i<tem_list.size();i++)
			   {
				  for(int j =i+1;j<tem_list.size();j++)
				  {
					  if(tem_list.get(i).get_site().compareTo(tem_list.get(j).get_site())>0)
						 {
							 tem_grade = tem_list.get(j);
							  tem_list.set(j, tem_list.get(i));
							  tem_list.set(i, tem_grade);
						 }
					  else if(tem_list.get(i).get_site().compareTo(tem_list.get(j).get_site())==0)
					  {
						;  
					  }
					  else
					  {
						 ; 
					  }
		          }
			   }
		}
		return(tem_list);
		
		
		
		
		
		
		
		
		
		
	}

	public static void main(String[] args) throws IOException {
		String aa = "9991234566";
		System.out.println(menu3_search_SID.menu3_search_SID(aa));
		
	}
}
