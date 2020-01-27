package final_project;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class menu4 {
	
	public ArrayList<weight> category = new ArrayList<weight>();
	
	
	
	public void menu4() 
	{
		String newitem;
		int total = 0;
		int value = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("finalexam: ");
		value=in.nextInt();
		weight c1 = new weight("finalexam",value);
		total = total +value;
		
		System.out.println("midexam: ");
		value=in.nextInt();
		weight c2 = new weight("midexam",value);
		total = total +value;
		
		System.out.println("project: ");
		value=in.nextInt();
		weight c3 = new weight("project",value);
		total = total +value;
		
		System.out.println("homework: ");
		value=in.nextInt();
		weight c4 = new weight("fhomework",value);
		total = total +value;
		
		category.add(c1);
		category.add(c2);
		category.add(c3);
		category.add(c4);
		while(total<100)
		{
			System.out.println("extra item: ");
			newitem = in.next();
			value = in.nextInt();
			total = total+value;
			weight cn = new weight(newitem,value);
			category.add(cn);
		}
		System.out.println(category);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	}

}
