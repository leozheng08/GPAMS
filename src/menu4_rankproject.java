package final_project;

import java.io.IOException;

public class menu4_rankproject {
	
	public void menu4_rankproject() throws NumberFormatException, IOException
	{
		finalgrade temp = null;
		menu4_sort test = new menu4_sort();
	     test.menu4_sort();
	     for(int i=0;i<test.finalgradelist.size();i++)
	     {
	    	 for(int j=i+1;j<test.finalgradelist.size();j++)
	    	 {
	    		 if(test.finalgradelist.get(i).get_project()<test.finalgradelist.get(j).get_project())
	    		 {
	    			 temp = test.finalgradelist.get(i);
	    				
    				 test.finalgradelist.set(i, test.finalgradelist.get(j));
    				 
    				 test.finalgradelist.set(j,temp);
	    		 }
	    		 
	    	 }
	     }
	     for(int i=0;i<test.finalgradelist.size();i++)
	     { 
	    	 for(int j=i+1;j<test.finalgradelist.size();j++)
	    	 {
	    		  if(test.finalgradelist.get(i).get_project()==test.finalgradelist.get(j).get_project())
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
	     for(int i=0;i<test.finalgradelist.size();i++)
	     { 
	    	 for(int j=i+1;j<test.finalgradelist.size();j++)
	    	 {
	    		  if(test.finalgradelist.get(i).get_project()==test.finalgradelist.get(j).get_project())
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
	    			 " site:"+test.finalgradelist.get(a).site+" Project:"+test.finalgradelist.get(a).get_project());
	     }
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		menu4_rankproject test = new menu4_rankproject();
		test.menu4_rankproject();
		
	}

}
