package final_project;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class menu2 {
	
	public ArrayList<String[]> al = new ArrayList<String[]>();
	public static ArrayList<grade> gradelist = new ArrayList<grade>();
	
	
	
	
	public static void menu2() throws IOException
	{
		BufferedReader inn = new BufferedReader(
				new InputStreamReader(new FileInputStream(
						"/Users/zhengleo/Desktop/CS401/projectleo/grade.txt")));
		String line;
		
		while((line = inn.readLine())!=null)
		{
			
			String[] a =line.split(" ");
//			for(int i = 0;i<a.length;i++)
//			{
//			System.out.println(a[i]);
//			}
			String[] aaa = new String[a.length-8];
//			for(int i = 0;i<a.length-8;i++)
//				{
//				System.out.println(aaa[i]);
//				}
//			System.out.println("-------------------");
//			
			for(int i=5,j=0;i<=a.length-1-3;i++,j++)
			{
				aaa[j] = a[i];

			}
			
			
			grade grade1 = new grade(a[0], a[1], a[2], a[3],a[4],aaa, a[a.length-3], a[a.length-2],
					a[a.length-1]);
//			System.out.println(grade1);
			gradelist.add(grade1);
			
		}
		System.out.println(gradelist);
		
	}

	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       menu2.menu2();
	}

}
