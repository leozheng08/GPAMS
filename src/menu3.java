package final_project;

import java.io.IOException;
import java.util.ArrayList;

public class menu3 extends menu2 {
	
	static String search_first_name;
	public static ArrayList<grade> tem_list = new ArrayList<grade>();
	static grade tem_grade = new grade(null,null,null,null,null,null,null,null,null);
	
    
	
	public static ArrayList<grade> menu3_search_fistname(String firstname) throws IOException
	{
		menu2.menu2();
		search_first_name = firstname;
		int count = 0;
//		System.out.println(gradelist.size());
	   for(int i=0;i<gradelist.size();i++)
	   {
		   if((gradelist.get(i).get_fisrt_name()).equals(search_first_name))
		   {
			   count++;
			   tem_list.add(gradelist.get(i));  
		   }
		   
	   }
	  
//	   System.out.println(tem_list.size());
	   if(count==0)
	   {
		  System.out.println("no result"); 
	   }
	   else if(count==1)
	   {
		   return(tem_list);
	   }
	   else if(count>0)
	   {
		   
		   
		   for(int i = 0;i<tem_list.size();i++)
		   {
			  for(int j =i+1;j<tem_list.size();j++)
			  {
				  
				  if(tem_list.get(i).get_last_name().compareTo(tem_list.get(j).get_last_name())>0)
				  {

					  tem_grade = tem_list.get(j);
					  tem_list.set(j, tem_list.get(i));
					  tem_list.set(i, tem_grade);
					  
					  
				  }
				  else if(tem_list.get(i).get_last_name().compareTo(tem_list.get(j).get_last_name())==0)
				  {
					 if(tem_list.get(i).get_site().compareTo(tem_list.get(j).get_site())>0)
					 {
						 tem_grade = tem_list.get(j);
						  tem_list.set(j, tem_list.get(i));
						  tem_list.set(i, tem_grade);
					 }
					 else
					 {
						; 
					 }
				  }
				  else
				  {
					 ; 
				  }
			  }
		   }
	   }
//	   System.out.println(tem_list);
	   
	return (tem_list);
	
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      
      String aa = "Leo";
      System.out.print(menu3.menu3_search_fistname(aa));
	}

}
