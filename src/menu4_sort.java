package final_project;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class menu4_sort {
	 
	public ArrayList<finalgrade> finalgradelist = new ArrayList<finalgrade>();
	
	public void menu4_sort() throws NumberFormatException, IOException
	{
		menu4 a = new menu4();
	    a.menu4();
		BufferedReader inn = new BufferedReader(
				new InputStreamReader(new FileInputStream(
						"/Users/zhengleo/Desktop/CS401/projectleo/grade.txt")));
		String line;
		
		while((line = inn.readLine())!=null)
		{
			
			String[] aa =line.split(" ");
//			for(int i = 0;i<a.length;i++)
//			{
//			System.out.println(a[i]);
//			}
			int[] aaa = new int[aa.length-8];
//			for(int i = 0;i<a.length-8;i++)
//				{
//				System.out.println(aaa[i]);
//				}
//			System.out.println("-------------------");
//			
			for(int i=5,j=0;i<=aa.length-1-3;i++,j++)
			{
				aaa[j] = Integer.parseInt(aa[i]);
			}
			
			finalgrade grade1 = new finalgrade(aa[0], aa[1], aa[2], aa[3],aa[4],aaa, aa[aa.length-3], aa[aa.length-2],
					aa[aa.length-1],a.category);
			finalgradelist.add(grade1);
		}
		for(finalgrade i : finalgradelist)
		{
			System.out.println(i);
		}
		

			
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
     menu4_sort test = new menu4_sort();
     test.menu4_sort();
	}

}
