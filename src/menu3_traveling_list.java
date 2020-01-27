package final_project;

import java.io.IOException;
import java.util.ArrayList;

public class menu3_traveling_list extends menu2{
	
	public static int newnumber;
	public static String neworientation;
	
	public ArrayList<full_name> namelist = new ArrayList<full_name>();
	public static DLinkedlist<full_name> namelist1 = new DLinkedlist<full_name>();
	public static ArrayList<full_name> namerestore = new ArrayList<full_name>();

	
	
	public static void menu3_traveling_list(String orientation,full_name target, int number) throws IOException
	{
		menu2.menu2();
//		full_name location =namelist1.headnode.get_info(); 
		for(int i=0;i<gradelist.size();i++)
		{
			full_name  fullname= new full_name(gradelist.get(i).get_fisrt_name(),gradelist.get(i).get_last_name(),gradelist.get(i).get_site()); 
		    namelist1.add(fullname);
		}
		namelist1.set_current(namelist1.get_headnode());
		
		neworientation = orientation;
		newnumber = number;
		int count=0;
		
		if(orientation.compareTo("+")==0)
		{
			for(int i=0;i<namelist1.get_size();i++)
			{
				
				if(target.toString().compareTo(namelist1.get_current().get_info().toString())==0)
				{
					count = namelist1.get_size()-count-1;
					i=namelist1.get_size();
				}
				else
				{
					namelist1.set_current(namelist1.get_current().get_Link());
					count++;
				}
			}
			System.out.println(count);
			if(number<=count)
			{
			 for(int j=0;j<number;j++)
			 {
				namerestore.add(namelist1.get_current().get_info());
				namelist1.set_current(namelist1.get_current().get_Link());
			 }
			}
			else 
			{
				for(int j=0;j<count;j++)
				 {
					namerestore.add(namelist1.get_current().get_info());
					namelist1.set_current(namelist1.get_current().get_Link());
				 }
				System.out.println("can't go that far,but"+namerestore.get(namerestore.size()-1)+"is the last member of the list");
			}
				
			System.out.println(namerestore);
			
			
		}
		
		if(orientation.compareTo("-")==0)
		{
			for(int i=0;i<namelist1.get_size();i++)
			{
				
				if(target.toString().compareTo(namelist1.get_current().get_info().toString())==0)
				{
					count = namelist1.get_size()-count;
					i=namelist1.get_size();
				}
				else
				{
					namelist1.set_current(namelist1.get_current().get_Link());
					count++;
				}
			}
			System.out.println(count);
			if(number<=count)
			{
			 for(int j=0;j<number;j++)
			 {
				namerestore.add(namelist1.get_current().get_info());
				namelist1.set_current(namelist1.get_current().get_Back());
			 }
			}
			else 
			{
				for(int j=0;j<count;j++)
				 {
					namerestore.add(namelist1.get_current().get_info());
					namelist1.set_current(namelist1.get_current().get_Back());
				 }
				System.out.println("it's beyond the scope,"+namerestore.get(namerestore.size()-1)+"is the first element of the list");
			}
				
			
				System.out.print(namerestore);
			
					
			
			
		}
		
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		full_name name = new full_name("Leo", "Shen","02");
		menu3_traveling_list("+",name,2);
	}

}
