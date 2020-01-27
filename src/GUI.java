package final_project;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;











public class GUI extends JFrame{
	private JPanel contentPane;
	private JTextField CourseName;
	private JTextField SiteNum;
	private JTextField Size;
	private JTextField AsgNum;
	private JPanel GradeInput;
	private JButton Next1;
	private JPanel RosterCreation;
	private JPanel RecordSearch;
	private JPanel ShowList;
	private JTextField PrjNum;
	private JTextField ExamNum;
	private JTextField FName;
	private JTextField LName;
	private JTextField SID;
	private JTextField ClsNum;
	private JTextField Site;
	private JTextField Hw;
	private JTextField Prj;
	private JTextField Mid;
	private JTextField Fnl;
	private JButton InputGrade;
	private JButton Previous1;
	private JButton Next2;
	private JTextArea listArea;
	private JTextField searchField;
	private JTextArea rankArea;
	private JTextField weightHw;
	private JTextField weightPrj;
	private JTextField weightMid;
	private JTextField weightFnl;
	
	//Variables to memory the user-input weight of all parts of a course's score.
	private int hwWeight;
	private int prjWeight;
	private int midWeight;
	private int fnlWeight;
	private JButton Default;
	private JLabel lblNewLabel_3;
	
	

	/**
	 * Create the frame.
	 */
	public GUI() {
		//Content Pane's attributes.
		setTitle("GPA Management System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 578, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(1, 1, 1, 1));
		setContentPane(contentPane);
//		contentPane.setLayout(new CardLayout(0, 0));
		final CardLayout c1 = new CardLayout(0,0);
		contentPane.setLayout(c1);
		
//      First panel(menu1).
		RosterCreation = new JPanel();
		RosterCreation.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Roster Creation", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(RosterCreation);
		RosterCreation.setLayout(null);
		CourseName = new JTextField();
		CourseName.setBounds(60, 48, 86, 24);
		CourseName.setToolTipText("Course Name");
		RosterCreation.add(CourseName);
		CourseName.setColumns(10);
		
		SiteNum = new JTextField();
		SiteNum.setBounds(160, 48, 86, 24);
		SiteNum.setToolTipText("Site Number");
		RosterCreation.add(SiteNum);
		SiteNum.setColumns(10);
		
		Size = new JTextField();
		Size.setBounds(266, 48, 86, 24);
		Size.setToolTipText("Course Size");
		RosterCreation.add(Size);
		Size.setColumns(10);
		
		AsgNum = new JTextField();
		AsgNum.setBounds(60, 116, 86, 24);
		AsgNum.setToolTipText("Assignment Number");
		RosterCreation.add(AsgNum);
		AsgNum.setColumns(10);
		
		PrjNum = new JTextField();
		PrjNum.setBounds(160, 116, 86, 24);
		PrjNum.setToolTipText("Project Number");
		RosterCreation.add(PrjNum);
		PrjNum.setColumns(10);
		
		ExamNum = new JTextField();
		ExamNum.setBounds(266, 116, 86, 24);
		ExamNum.setToolTipText("Exam Number");
		RosterCreation.add(ExamNum);
		ExamNum.setColumns(10);
		
		//Main method for Menu1, users type in textField to input data and click the button to call write(Course c)function. 
		JButton InputData = new JButton("Input Data");
		InputData.setBounds(61, 177, 109, 27);
		InputData.setFont(new Font("Calibri", Font.BOLD, 15));
		InputData.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				course c = new course(CourseName.getText(),SiteNum.getText(),Integer.parseInt(Size.getText()),Integer.parseInt(AsgNum.getText()),Integer.parseInt(PrjNum.getText()),Integer.parseInt(ExamNum.getText()));
				function f = new function();
				try {
					f.write(c);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		RosterCreation.add(InputData);
		
		Next1 = new JButton("Next Page");
		Next1.setBounds(430, 177, 109, 27);
		Next1.setFont(new Font("Calibri", Font.BOLD, 15));
		Next1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				c1.next(contentPane);
			}
		});
		RosterCreation.add(Next1);
		//Forget default setting at beginning, add this button after debug process. 
		//Users use default data of Menu1, directly assignment.
		Default = new JButton("Default Data");
		Default.setBounds(240, 177, 120, 27);
		Default.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				course c = new course("CS401","3",20,10,1,2);
				function f = new function();
				try {
					f.write(c);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		Default.setFont(new Font("Calibri", Font.BOLD, 14));
		RosterCreation.add(Default);
	
		
		JLabel lblNewLabel = new JLabel("Page1 of 4");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 15));
		lblNewLabel.setBounds(464, 13, 120, 18);
		RosterCreation.add(lblNewLabel);
	
	
	//Second panel(menu2).
			GradeInput = new JPanel();
			GradeInput.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Grade Input", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			contentPane.add(GradeInput);
			GradeInput.setLayout(null);
			
			FName = new JTextField();
			FName.setBounds(39, 45, 86, 24);
			FName.setToolTipText("First Name");
			GradeInput.add(FName);
			FName.setColumns(10);
			
			LName = new JTextField();
			LName.setBounds(148, 45, 86, 24);
			LName.setToolTipText("Last Name");
			GradeInput.add(LName);
			LName.setColumns(10);
			
			SID = new JTextField();
			SID.setBounds(248, 45, 86, 24);
			SID.setToolTipText("Student ID");
			GradeInput.add(SID);
			SID.setColumns(10);
			
			ClsNum = new JTextField();
			ClsNum.setBounds(39, 94, 86, 24);
			ClsNum.setToolTipText("Class Number");
			GradeInput.add(ClsNum);
			ClsNum.setColumns(10);
			
			Site = new JTextField();
			Site.setBounds(148, 94, 86, 24);
			Site.setToolTipText("Site");
			GradeInput.add(Site);
			Site.setColumns(10);
			
			Hw = new JTextField();
			Hw.setBounds(248, 94, 86, 24);
			Hw.setToolTipText("Homework");
			GradeInput.add(Hw);
			Hw.setColumns(10);
			
			Prj = new JTextField();
			Prj.setBounds(39, 142, 86, 24);
			Prj.setToolTipText("Project");
			GradeInput.add(Prj);
			Prj.setColumns(10);
			
			Mid = new JTextField();
			Mid.setBounds(148, 142, 86, 24);
			Mid.setToolTipText("Midterm");
			GradeInput.add(Mid);
			Mid.setColumns(10);
			
			Fnl = new JTextField();
			Fnl.setBounds(248, 142, 86, 24);
			Fnl.setToolTipText("Final");
			GradeInput.add(Fnl);
			Fnl.setColumns(10);
			
			//Main method for menu2, users type-in students' information and use a button to call write(Student g) function to input data. 
			InputGrade = new JButton("Input Grade");
			InputGrade.setBounds(417, 73, 130, 27);
			InputGrade.setFont(new Font("Calibri", Font.BOLD, 14));
			InputGrade.addMouseListener(new MouseAdapter() {
		
				public void mouseClicked(MouseEvent e) {
					grade g = new grade(FName.getText(),LName.getText(),SID.getText(),ClsNum.getText(),Site.getText(),Hw.getText().split(","),Prj.getText(),Mid.getText(),Fnl.getText());
					function f = new function();
					try {
						f.write(g);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
			GradeInput.add(InputGrade);
			//Jump page button, all like this.
			Previous1 = new JButton("Previous Page");
			Previous1.setBounds(39, 203, 150, 27);
			Previous1.setFont(new Font("Calibri", Font.BOLD, 14));
			Previous1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					c1.previous(contentPane);
				}
			});
			GradeInput.add(Previous1);
			
			Next2 = new JButton("Next Page");
			Next2.setBounds(405, 203, 119, 27);
			Next2.setFont(new Font("Calibri", Font.BOLD, 15));
			Next2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					c1.next(contentPane);
				}
			});
			GradeInput.add(Next2);
			
			JLabel lblNewLabel_1 = new JLabel("Page2 of 4");
			lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 15));
			lblNewLabel_1.setBounds(464, 13, 130, 18);
			GradeInput.add(lblNewLabel_1);
			
			//Third panel(menu3).
			RecordSearch = new JPanel();
			RecordSearch.setBorder(new TitledBorder(null, "Record Search", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
			contentPane.add(RecordSearch);
			RecordSearch.setLayout(null);
			
			searchField = new JTextField();
			searchField.setToolTipText("search field");
			searchField.setBounds(258, 12, 152, 27);
			RecordSearch.add(searchField);
			searchField.setColumns(10);
			
			listArea = new JTextArea();
			listArea.setBounds(139, 52, 397, 158);
			Font font = new Font("Calibri", Font.BOLD, 7);
			listArea.setFont(font);
			RecordSearch.add(listArea);
			
			//Search by first name method. Used equals to compare different variables.
			//list all results which can match the input key.
			JButton Search1 = new JButton("FName Search");
			Search1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					function f = new function();
					try {
						f.readFile();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					String search_first_name;
					 ArrayList<grade> tem_list = new ArrayList<grade>();
					 grade tem_grade = new grade(null,null,null,null,null,null,null,null,null);
					 
					String firstname = searchField.getText();
					search_first_name = firstname;
					int count = 0;
//						System.out.println(gradelist.size());
   for(int i=0;i<f.gradelist.size();i++)
   {
					   if((f.gradelist.get(i).get_fisrt_name()).equals(search_first_name))
					   {
						   count++;
						   tem_list.add(f.gradelist.get(i));  
					   }
					   
   }
//					   System.out.println(tem_list);
//					   System.out.println(tem_list.size());
   if(count==0)
   {
					  System.out.println("no result"); 
   }
   else if(count==1)
   {
					   listArea.append(tem_list.toString());
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
					   listArea.append(tem_list.toString());
   }


					
           
				}
			});
			Search1.setToolTipText("Search by First Name");
			Search1.setFont(new Font("Calibri", Font.BOLD, 13));
			Search1.setBounds(14, 50, 130, 27);
			RecordSearch.add(Search1);
			
			//Just like above one. And following several method are familiar.
			JButton Search2 = new JButton("LName Search");
			Search2.setToolTipText("Search by Last Name");
			Search2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					     function f = new function();
					     try {
							f.readFile();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					     String search_last_name;
					 	 ArrayList<grade> tem_list = new ArrayList<grade>();
					 	 grade tem_grade = new grade(null,null,null,null,null,null,null,null,null);
					 	search_last_name = searchField.getText();
					 	int count=0;
						for(int i=0;i<f.gradelist.size();i++)
						   {
							   if((f.gradelist.get(i).get_last_name()).equals(search_last_name))
							   {
								   count++;
								   tem_list.add(f.gradelist.get(i));  
							   }
							   
						   }
						if(count==0)
						   {
							  System.out.println("no result"); 
						   }
						else if(count==1)
						   {
							   listArea.append(tem_list.toString());
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
							   listArea.append(tem_list.toString());
						   }
						
					}
				
			});
			Search2.setFont(new Font("Calibri", Font.BOLD, 13));
			Search2.setBounds(14, 90, 130, 27);
			RecordSearch.add(Search2);
			
			JButton Search3 = new JButton("SID Search");
			Search3.setToolTipText("Search by Student ID");
			Search3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					function f = new function();
					try {
						f.readFile();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				    String SID;
				    ArrayList<grade> tem_list = new ArrayList<grade>();
				    grade tem_grade = new grade(null,null,null,null,null,null,null,null,null);
					SID = searchField.getText();
					int count=0;
					for(int i=0;i<f.gradelist.size();i++)
					   {
						   if((f.gradelist.get(i).get_SID()).equals(SID))
						   {
							   count++;
							   tem_list.add(f.gradelist.get(i));  
						   }
						   
					   }
					if(count==0)
					   {
						  listArea.append("no result"); 
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
						listArea.append(tem_list.toString());
						
					}
					
				}
			});
			Search3.setFont(new Font("Calibri", Font.BOLD, 14));
			Search3.setBounds(12, 130, 113, 27);
			RecordSearch.add(Search3);
			
			JButton Showlist = new JButton("traveling List");
			Showlist.setToolTipText("traveling students' list");
			Showlist.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					function f = new function();
					try {
						f.readFile();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					 int newnumber;
					 String neworientation;
					 
					 String[] array =searchField.getText().split(",");
					 ArrayList<full_name> namelist = new ArrayList<full_name>();
					 DLinkedlist<full_name> namelist1 = new DLinkedlist<full_name>();
					 ArrayList<full_name> namerestore = new ArrayList<full_name>();
					 newnumber = Integer.parseInt(array[4]);
					 neworientation = array[3];
					 full_name full_name=new full_name(array[0],array[1],array[2]);
					 
						for(int i=0;i<f.gradelist.size();i++)
						{
							full_name  fullname= new full_name(f.gradelist.get(i).get_fisrt_name(),f.gradelist.get(i).get_last_name(),f.gradelist.get(i).get_site()); 
						    namelist1.add(fullname);
						}
						namelist1.set_current(namelist1.get_headnode());
						
						
						int count=0;
						int index=0;
						
						if(neworientation.compareTo("+")==0)
						{
							for(int i=0;i<namelist1.get_size();i++)
							{
								
								if(full_name.toString().compareTo(namelist1.get_current().get_info().toString())==0)
								{
									count = namelist1.get_size()-(index+1);
									i=namelist1.get_size();
								}
								else
								{
									namelist1.set_current(namelist1.get_current().get_Link());
									index++;
								}
							}
							System.out.println(count);
							if(newnumber<=count)
							{
							 for(int j=0;j<=newnumber;j++)
							 {
								namerestore.add(namelist1.get_current().get_info());
								namelist1.set_current(namelist1.get_current().get_Link());
							 }
							}
							else 
							{
								for(int j=0;j<=count;j++)
								 {
									namerestore.add(namelist1.get_current().get_info());
									namelist1.set_current(namelist1.get_current().get_Link());
								 }
								listArea.append("can't go that far,but \n"+namerestore.get(namerestore.size()-1)+"is the last member of the list\n");
							}
								
							listArea.append(namerestore.toString()+"\n");
							
							
						}
						
						if(neworientation.compareTo("-")==0)
						{
							for(int i=0;i<namelist1.get_size();i++)
							{
								
								if(full_name.toString().compareTo(namelist1.get_current().get_info().toString())==0)
								{
									count = index;
									i=namelist1.get_size();
								}
								else
								{
									namelist1.set_current(namelist1.get_current().get_Link());
									index++;
								}
							}
							System.out.println(count);
							if(newnumber<=count)
							{
							 for(int j=0;j<=newnumber;j++)
							 {
								namerestore.add(namelist1.get_current().get_info());
								namelist1.set_current(namelist1.get_current().get_Back());
							 }
							}
							else 
							{
								for(int j=0;j<=count;j++)
								 {
									namerestore.add(namelist1.get_current().get_info());
									namelist1.set_current(namelist1.get_current().get_Back());
								 }
								listArea.append("it's beyond the scope,\n"+namerestore.get(namerestore.size()-1)+"is the first element of the list\n");
							}
								
							
								listArea.append(namerestore.toString()+"\n");
							
									
							
							
						}
				}
			});
			Showlist.setFont(new Font("Calibri", Font.BOLD, 14));
			Showlist.setBounds(12, 175, 130, 27);
			RecordSearch.add(Showlist);
			
			JButton Previous2 = new JButton("Previous Page");
			Previous2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					c1.previous(contentPane);
					listArea.setText(null);
					searchField.setText(null);
				}
			});
			Previous2.setFont(new Font("Calibri", Font.BOLD, 13));
			Previous2.setBounds(190, 215, 150, 27);
			RecordSearch.add(Previous2);
			
			JButton Next3 = new JButton("Next Page");
			Next3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					c1.next(contentPane);
				}
			});
			Next3.setFont(new Font("Calibri", Font.BOLD, 13));
			Next3.setBounds(369, 215, 113, 27);
			RecordSearch.add(Next3);
			
			JLabel lblNewLabel_2 = new JLabel("Page3 of 4");
			lblNewLabel_2.setFont(new Font("Calibri", Font.BOLD, 15));
			lblNewLabel_2.setBounds(464, 16, 120, 18);
			RecordSearch.add(lblNewLabel_2);
			
			//Fourth and the last panel(menu4).
			ShowList = new JPanel();
			ShowList.setBorder(new TitledBorder(null, "Show List", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
			contentPane.add(ShowList, "name_725292036459490");
			ShowList.setLayout(null);
			
			rankArea = new JTextArea();
			rankArea.setBounds(185, 62, 359, 174);
			rankArea.setFont(font);
			ShowList.add(rankArea);
			
			//input weight of all parts' scores into local variables, will used following.
			weightHw = new JTextField();
			weightHw.setToolTipText("Please weight homework");
			weightHw.setBounds(292, 25, 57, 24);
			ShowList.add(weightHw);
			weightHw.setColumns(10);
			
			weightPrj = new JTextField();
			weightPrj.setToolTipText("Please weight project");
			weightPrj.setBounds(358, 25, 57, 24);
			ShowList.add(weightPrj);
			weightPrj.setColumns(10);
			
			weightMid = new JTextField();
			weightMid.setToolTipText("Please weight midterm");
			weightMid.setBounds(423, 25, 57, 24);
			ShowList.add(weightMid);
			weightMid.setColumns(10);
			
			weightFnl = new JTextField();
			weightFnl.setToolTipText("Please weight final");
			weightFnl.setBounds(487, 25, 57, 24);
			ShowList.add(weightFnl);
			weightFnl.setColumns(10);
			
			
			final ArrayList<weight> category =new ArrayList<weight>();
			JButton ScoreWt = new JButton("Score Weight");
			ScoreWt.setToolTipText("Set Score Weight");
			
			ScoreWt.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					hwWeight = Integer.parseInt(weightHw.getText());
					prjWeight = Integer.parseInt(weightPrj.getText());
					midWeight = Integer.parseInt(weightMid.getText());
					fnlWeight = Integer.parseInt(weightFnl.getText());
					weight Hw = new weight("HW",hwWeight);
				    weight Prj = new weight("PRJ",prjWeight);
				    weight Mid = new weight("HW",midWeight);
				    weight fnl = new weight("HW",fnlWeight);
				    category.add(Hw);
				    category.add(Prj);
				    category.add(Mid);
				    category.add(fnl);
				}
			});
			ScoreWt.setFont(new Font("Calibri", Font.BOLD, 13));
			ScoreWt.setBounds(170, 25,130, 24);
			ShowList.add(ScoreWt);
			
			

			JButton List = new JButton("finalgrade List");
			List.setToolTipText("List by final_grade");
			List.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					final ArrayList<finalgrade> finalgradelist = new ArrayList<finalgrade>();
				    
				    BufferedReader inn = null;
					try {
						inn = new BufferedReader(
								new InputStreamReader(new FileInputStream(
										"/Users/zhengleo/Desktop/CS401/projectleo/grade.txt")));
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					String line;
					
					try {
						while((line = inn.readLine())!=null)
						{
							
							String[] aa =line.split(" ");
//						for(int i = 0;i<a.length;i++)
//						{
//						System.out.println(a[i]);
//						}
							int[] aaa = new int[aa.length-8];
//						for(int i = 0;i<a.length-8;i++)
//							{
//							System.out.println(aaa[i]);
//							}
//						System.out.println("-------------------");
//						
							for(int i=5,j=0;j<aa.length-8;i++,j++)
							{
								aaa[j] = Integer.parseInt(aa[i]);
							}
							
							finalgrade grade1 = new finalgrade(aa[0], aa[1], aa[2], aa[3],aa[4],aaa, aa[aa.length-3], aa[aa.length-2],
									aa[aa.length-1],category);
							finalgradelist.add(grade1);
							
						}
						for(finalgrade i : finalgradelist)
						{
							rankArea.append(i.toString()+"\n");
							System.out.println(i);
						}
					} catch (NumberFormatException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
						}
				
			});
			List.setFont(new Font("Calibri", Font.BOLD, 15));
			List.setBounds(29, 61, 150, 27);
			ShowList.add(List);
			
			JButton Rank1 = new JButton("Rank by TS");
			Rank1.setToolTipText("Rank by total score");
			Rank1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
				 final ArrayList<finalgrade> finalgradelist = new ArrayList<finalgrade>();
				    BufferedReader inn = null;
					try {
						inn = new BufferedReader(
								new InputStreamReader(new FileInputStream(
										"/Users/zhengleo/Desktop/CS401/projectleo/grade.txt")));
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					String line;
					
				
						
							try {
								while((line = inn.readLine())!=null)
								{
									
									String[] aa =line.split(" ");
//						
									int[] aaa = new int[aa.length-8];
//						
//						
									for(int i=5,j=0;j<aa.length-8;i++,j++)
									{
										aaa[j] = Integer.parseInt(aa[i]);
									}
									
									finalgrade grade1 = new finalgrade(aa[0], aa[1], aa[2], aa[3],aa[4],aaa, aa[aa.length-3], aa[aa.length-2],
											aa[aa.length-1],category);
									finalgradelist.add(grade1);
									
								}
							} catch (NumberFormatException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							System.out.println(finalgradelist.toString());
						 
						
				    
					finalgrade temp=null;
					
					 
				     for(int i=0;i<finalgradelist.size();i++)
				     {
				    	
				    		 for(int j=i+1;j<finalgradelist.size();j++)
				    		 {
				    			
				    			 if(finalgradelist.get(i).get_total_score()<finalgradelist.get(j).get_total_score())
				    			 {
//				    				 System.out.println(finalgradelist.get(i).get_total_score()<finalgradelist.get(j).get_total_score());
				    				 temp = finalgradelist.get(i);
				    				
				    				 finalgradelist.set(i, finalgradelist.get(j));
				    				 
				    				 finalgradelist.set(j,temp);
				    			 }
				    		 }
				     }
				     
				     for(int i=0;i<finalgradelist.size();i++)
				     { 
				    	 for(int j=i+1;j<finalgradelist.size();j++)
				    	 {
				    		  if(finalgradelist.get(i).get_total_score()==finalgradelist.get(j).get_total_score())
				    		 {
//				    			  System.out.println(test.finalgradelist.get(i).site.compareTo(test.finalgradelist.get(j).site));
				    			 if(finalgradelist.get(i).site.compareTo(finalgradelist.get(j).site)>0)
				    			 {
				    				 temp = finalgradelist.get(i);
					    				
				    				 finalgradelist.set(i, finalgradelist.get(j));
				    				 
				    				finalgradelist.set(j,temp);
				    			 }
				    			 
				    		 
				    		   }
				    	  }
				     }
				     for(int i=0;i<finalgradelist.size();i++)
				     { 
				    	 for(int j=i+1;j<finalgradelist.size();j++)
				    	 {
				    		  if(finalgradelist.get(i).get_total_score()==finalgradelist.get(j).get_total_score())
				    		 {
				    			 
				    			 if(finalgradelist.get(i).site.compareTo(finalgradelist.get(j).site)==0)
				    			 {
				    				 if(finalgradelist.get(i).last_name.compareTo(finalgradelist.get(j).last_name)>0)
				    				 {
				    				 temp = finalgradelist.get(i);
					    				
				    				 finalgradelist.set(i, finalgradelist.get(j));
				    				 
				    				 finalgradelist.set(j,temp);
				    				 }
				    			 }
				    			 
				    		 
				    		   }
				    	  }
				     }
				     
				     for(int a=0;a<finalgradelist.size();a++)
				     {
				    	 rankArea.append("lastname:"+finalgradelist.get(a).last_name+" firstname:"+finalgradelist.get(a).first_name+
				    			 " site:"+finalgradelist.get(a).site+" total score:"+finalgradelist.get(a).get_total_score()+"\n");
				    	 System.out.println("lastname:"+finalgradelist.get(a).last_name+" firstname:"+finalgradelist.get(a).first_name+
				    			 " site:"+finalgradelist.get(a).site+" total score:"+finalgradelist.get(a).get_total_score());
				     }
					}
				
			
					
				
					});
			Rank1.setFont(new Font("Calibri", Font.BOLD, 15));
			Rank1.setBounds(29, 98, 113, 27);
			ShowList.add(Rank1);
			
			JButton Rank2 = new JButton("Rank by HA");
			Rank2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			Rank2.setToolTipText("Rank by homework average");
			Rank2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					final ArrayList<finalgrade> finalgradelist = new ArrayList<finalgrade>();
					BufferedReader inn = null;
					try {
						inn = new BufferedReader(
								new InputStreamReader(new FileInputStream(
										"/Users/zhengleo/Desktop/CS401/projectleo/grade.txt")));
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					String line;
					
				
						
							try {
								while((line = inn.readLine())!=null)
								{
									
									String[] aa =line.split(" ");
//						
									int[] aaa = new int[aa.length-8];
//						
//						
									for(int i=5,j=0;j<aa.length-8;i++,j++)
									{
										aaa[j] = Integer.parseInt(aa[i]);
									}
									
									finalgrade grade1 = new finalgrade(aa[0], aa[1], aa[2], aa[3],aa[4],aaa, aa[aa.length-3], aa[aa.length-2],
											aa[aa.length-1],category);
									finalgradelist.add(grade1);
									
								}
							} catch (NumberFormatException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							System.out.println(finalgradelist.toString());
							
							finalgrade temp = null;
							
						     for(int i=0;i<finalgradelist.size();i++)
						     {
						    	 for(int j=i+1;j<finalgradelist.size();j++)
						    	 {
						    		 if(finalgradelist.get(i).get_HW_average()<finalgradelist.get(j).get_HW_average())
						    		 {
						    			 temp = finalgradelist.get(i);
						    				
					    				 finalgradelist.set(i, finalgradelist.get(j));
					    				 
					    				 finalgradelist.set(j,temp);
						    		 }
						    		 
						    	 }
						     }
//						     for(int a=0;a<test.finalgradelist.size();a++)
//						     {
//						    	 System.out.println("lastname:"+test.finalgradelist.get(a).last_name+" firstname:"+test.finalgradelist.get(a).first_name+
//						    			 " site:"+test.finalgradelist.get(a).site+" Homework Average:"+test.finalgradelist.get(a).get_HW_average());
//						     }
						
						     for(int i=0;i<finalgradelist.size();i++)
						     { 
						    	 for(int j=i+1;j<finalgradelist.size();j++)
						    	 {
						    		  if(finalgradelist.get(i).get_HW_average()==finalgradelist.get(j).get_HW_average())
						    		 {
//						    			  System.out.println(test.finalgradelist.get(i).site.compareTo(test.finalgradelist.get(j).site));
						    			 if(finalgradelist.get(i).site.compareTo(finalgradelist.get(j).site)>0)
						    			 {
						    				 temp = finalgradelist.get(i);
							    				
						    				 finalgradelist.set(i, finalgradelist.get(j));
						    				 
						    				 finalgradelist.set(j,temp);
						    			 }
						    			 
						    		 
						    		   }
						    	  }
						     }
//						     for(int a=0;a<test.finalgradelist.size();a++)
//						     {
//						    	 System.out.println("lastname:"+test.finalgradelist.get(a).last_name+" firstname:"+test.finalgradelist.get(a).first_name+
//						    			 " site:"+test.finalgradelist.get(a).site+" Homework Average:"+test.finalgradelist.get(a).get_HW_average());
//						     }
						     
						     for(int i=0;i<finalgradelist.size();i++)
						     { 
						    	 for(int j=i+1;j<finalgradelist.size();j++)
						    	 {
						    		  if(finalgradelist.get(i).get_HW_average()==finalgradelist.get(j).get_HW_average())
						    		 {
						    			 
						    			 if(finalgradelist.get(i).site.compareTo(finalgradelist.get(j).site)==0)
						    			 {
						    				 if(finalgradelist.get(i).last_name.compareTo(finalgradelist.get(j).last_name)>0)
						    				 {
						    				 temp = finalgradelist.get(i);
							    				
						    				 finalgradelist.set(i, finalgradelist.get(j));
						    				 
						    				finalgradelist.set(j,temp);
						    				 }
						    			 }
						    			 
						    		 
						    		   }
						    	  }
						     }
						     
						     for(int a=0;a<finalgradelist.size();a++)
						     {
						    	rankArea.append("lastname:"+finalgradelist.get(a).last_name+" firstname:"+finalgradelist.get(a).first_name+
						    			 " site:"+finalgradelist.get(a).site+" Homework Average:"+finalgradelist.get(a).get_HW_average()+"\n");
						     }
						}

						 
						
				
				
			});
			Rank2.setFont(new Font("Calibri", Font.BOLD, 15));
			Rank2.setBounds(29, 135, 130, 27);
			ShowList.add(Rank2);
			
			JButton Rank3 = new JButton("Rank by PS");
			Rank3.setToolTipText("Rank by project score");
			Rank3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					final ArrayList<finalgrade> finalgradelist = new ArrayList<finalgrade>();
					BufferedReader inn = null;
					try {
						inn = new BufferedReader(
								new InputStreamReader(new FileInputStream(
										"/Users/zhengleo/Desktop/CS401/projectleo/grade.txt")));
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					String line;
					
				
						
							try {
								while((line = inn.readLine())!=null)
								{
									
									String[] aa =line.split(" ");
//						
									int[] aaa = new int[aa.length-8];
//						
//						
									for(int i=5,j=0;j<aa.length-8;i++,j++)
									{
										aaa[j] = Integer.parseInt(aa[i]);
									}
									
									finalgrade grade1 = new finalgrade(aa[0], aa[1], aa[2], aa[3],aa[4],aaa, aa[aa.length-3], aa[aa.length-2],
											aa[aa.length-1],category);
									finalgradelist.add(grade1);
									
								}
							} catch (NumberFormatException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							System.out.println(finalgradelist.toString());
							
							finalgrade temp = null;
							for(int i=0;i<finalgradelist.size();i++)
						     {
						    	 for(int j=i+1;j<finalgradelist.size();j++)
						    	 {
						    		 if(finalgradelist.get(i).get_project()<finalgradelist.get(j).get_project())
						    		 {
						    			 temp = finalgradelist.get(i);
						    				
					    				 finalgradelist.set(i, finalgradelist.get(j));
					    				 
					    				finalgradelist.set(j,temp);
						    		 }
						    		 
						    	 }
						     }
						     for(int i=0;i<finalgradelist.size();i++)
						     { 
						    	 for(int j=i+1;j<finalgradelist.size();j++)
						    	 {
						    		  if(finalgradelist.get(i).get_project()==finalgradelist.get(j).get_project())
						    		 {
//						    			  System.out.println(test.finalgradelist.get(i).site.compareTo(test.finalgradelist.get(j).site));
						    			 if(finalgradelist.get(i).site.compareTo(finalgradelist.get(j).site)>0)
						    			 {
						    				 temp = finalgradelist.get(i);
							    				
						    				 finalgradelist.set(i, finalgradelist.get(j));
						    				 
						    				 finalgradelist.set(j,temp);
						    			 }
						    			 
						    		 
						    		   }
						    	  }
						     }
						     for(int i=0;i<finalgradelist.size();i++)
						     { 
						    	 for(int j=i+1;j<finalgradelist.size();j++)
						    	 {
						    		  if(finalgradelist.get(i).get_project()==finalgradelist.get(j).get_project())
						    		 {
						    			 
						    			 if(finalgradelist.get(i).site.compareTo(finalgradelist.get(j).site)==0)
						    			 {
						    				 if(finalgradelist.get(i).last_name.compareTo(finalgradelist.get(j).last_name)>0)
						    				 {
						    				 temp = finalgradelist.get(i);
							    				
						    				 finalgradelist.set(i, finalgradelist.get(j));
						    				 
						    				 finalgradelist.set(j,temp);
						    				 }
						    			 }
						    			 
						    		 
						    		   }
						    	  }
						     }
						     for(int a=0;a<finalgradelist.size();a++)
						     {
						    	 rankArea.append("lastname:"+finalgradelist.get(a).last_name+" firstname:"+finalgradelist.get(a).first_name+
						    			 " site:"+finalgradelist.get(a).site+" Project:"+finalgradelist.get(a).get_project()+"\n");
						     }

					
				}
			});
			Rank3.setFont(new Font("Calibri", Font.BOLD, 15));
			Rank3.setBounds(29, 172, 112, 27);
			ShowList.add(Rank3);
			
			JButton Previous3 = new JButton("Previous Page");
			Previous3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					c1.previous(contentPane);
					rankArea.setText("null");
					
				}
			});
			Previous3.setFont(new Font("Calibri", Font.BOLD, 13));
			Previous3.setBounds(29, 24, 150, 27);
			ShowList.add(Previous3);
			
			lblNewLabel_3 = new JLabel("Page4 of 4");
			lblNewLabel_3.setFont(new Font("Calibri", Font.BOLD, 15));
			lblNewLabel_3.setBounds(472, 5, 100, 18);
			ShowList.add(lblNewLabel_3);
				
			
			
			
			
}
			
	
	
		

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
}

	



