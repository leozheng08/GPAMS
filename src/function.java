package final_project;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;







public class function {
	
	public  ArrayList<grade> gradelist = new ArrayList<grade>();
	public void write(course c) throws IOException 
	{
		FileWriter fw;
		fw = new FileWriter("/Users/zhengleo/Desktop/CS401/projectleo/course.txt",true);
		fw.write("\r\n");
		fw.write(c.getCname()+","+c.getSite()+","+c.getSize()+","+c.getAssignment()+","+c.getProject()+","+c.getExam());
		fw.flush();
		fw.close();
	}
	
	public void write(grade g) throws IOException
	{
		
		for(int i=0;i<g.HW.length;i++)
		{
			
		}
		FileWriter fw;
		fw = new FileWriter("/Users/zhengleo/Desktop/CS401/projectleo/grade.txt",true);
		fw.write("\r\n");
		fw.write(g.first_name+" "+g.last_name+" "+g.SID+" "+g.class_number+" "+g.site+" ");
		for(int i=0;i<g.HW.length;i++)
		{
			fw.write(g.HW[i]+" ");
		}
		fw.write(g.project+" "+g.midterm+" "+g.finalterm);
		fw.flush();
		fw.close();
	}
	
	
	
	public void readFile() throws IOException 
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
		
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
function f = new function();
f.readFile();
System.out.println(f.gradelist);
	}

}
