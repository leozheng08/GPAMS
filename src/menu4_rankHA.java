package final_project;

import java.io.IOException;

public class menu4_rankHA {
	
	public void menu4_rankHA() throws NumberFormatException, IOException
	{
		finalgrade temp = null;
		menu4_sort test = new menu4_sort();
	     test.menu4_sort();
	     for(int i=0;i<test.finalgradelist.size();i++)
	     {
	    	 for(int j=i+1;j<test.finalgradelist.size();j++)
	    	 {
	    		 if(test.finalgradelist.get(i).get_HW_average()<test.finalgradelist.get(j).get_HW_average())
	    		 {
	    			 temp = test.finalgradelist.get(i);
	    				
    				 test.finalgradelist.set(i, test.finalgradelist.get(j));
    				 
    				 test.finalgradelist.set(j,temp);
	    		 }
	    		 
	    	 }
	     }
//	     for(int a=0;a<test.finalgradelist.size();a++)
//	     {
//	    	 System.out.println("lastname:"+test.finalgradelist.get(a).last_name+" firstname:"+test.finalgradelist.get(a).first_name+
//	    			 " site:"+test.finalgradelist.get(a).site+" Homework Average:"+test.finalgradelist.get(a).get_HW_average());
//	     }
	
	     for(int i=0;i<test.finalgradelist.size();i++)
	     { 
	    	 for(int j=i+1;j<test.finalgradelist.size();j++)
	    	 {
	    		  if(test.finalgradelist.get(i).get_HW_average()==test.finalgradelist.get(j).get_HW_average())
	    		 {
//	    			  System.out.println(test.finalgradelist.get(i).site.compareTo(test.finalgradelist.get(j).site));
	    			 if(test.finalgradelist.get(i).site.compareTo(test.finalgradelist.get(j).site)>0)
	    			 {
	    				 temp = test.finalgradelist.get(i);
		    				
	    				 test.finalgradelist.set(i, test.finalgradelist.get(j));
	    				 
	    				 test.finalgradelist.set(j,temp);
	    			 }
	    			 
	    		 
	    		   }
	    	  }
	     }
//	     for(int a=0;a<test.finalgradelist.size();a++)
//	     {
//	    	 System.out.println("lastname:"+test.finalgradelist.get(a).last_name+" firstname:"+test.finalgradelist.get(a).first_name+
//	    			 " site:"+test.finalgradelist.get(a).site+" Homework Average:"+test.finalgradelist.get(a).get_HW_average());
//	     }
	     
	     for(int i=0;i<test.finalgradelist.size();i++)
	     { 
	    	 for(int j=i+1;j<test.finalgradelist.size();j++)
	    	 {
	    		  if(test.finalgradelist.get(i).get_HW_average()==test.finalgradelist.get(j).get_HW_average())
	    		 {
	    			 
	    			 if(test.finalgradelist.get(i).site.compareTo(test.finalgradelist.get(j).site)==0)
	    			 {
	    				 if(test.finalgradelist.get(i).last_name.compareTo(test.finalgradelist.get(j).last_name)>0)
	    				 {
	    				 temp = test.finalgradelist.get(i);
		    				
	    				 test.finalgradelist.set(i, test.finalgradelist.get(j));
	    				 
	    				 test.finalgradelist.set(j,temp);
	    				 }
	    			 }
	    			 
	    		 
	    		   }
	    	  }
	     }
	     
	     for(int a=0;a<test.finalgradelist.size();a++)
	     {
	    	 System.out.println("lastname:"+test.finalgradelist.get(a).last_name+" firstname:"+test.finalgradelist.get(a).first_name+
	    			 " site:"+test.finalgradelist.get(a).site+" Homework Average:"+test.finalgradelist.get(a).get_HW_average());
	     }
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
     menu4_rankHA test = new menu4_rankHA();
     test.menu4_rankHA();
	}

}
