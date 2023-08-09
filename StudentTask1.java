import java.util.*;
import java.io.*;

class Student implements Serializable
{
	int rollNo;
	String name;
	String className;
	String mobileNo;

	Student(int r,String n,String c,String m)
	{
		this.rollNo=r;
		this.name=n;
		this.className=c;
		this.mobileNo=m;
	}
	public String toString()
	{
		return rollNo+", "+name+", "+className+", "+mobileNo;
	}
	public boolean equals(Object obj)
	{
		Student s=(Student)obj;
		return rollNo==s.rollNo;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setClassName(String className)
	{
		this.className=className;
	}
	public void setMobileNo(String mobileNo)
	{
		this.mobileNo=mobileNo;
	}
	public int getRollNo()
	{
		return rollNo;
	}
	public String getName()
	{
		return name;
	}
	public String getClassName()
	{
		return className;
	}
	public String getMobileNo()
	{
		return mobileNo;
	}
}

class School
{
	static int count=111000;
	public Student addmission()
	{
		String n,c,m,password;
		Scanner sc=new Scanner(System.in);
		BSP.output.print("Please Enter Administrator Password :");
		password=sc.nextLine();
		if(checkPassword(password))
		{
			BSP.output.println("enter student name: ");
			n=sc.nextLine();
			BSP.output.println("enter student class: ");
			c=sc.nextLine();
			BSP.output.println("enter student mobileNo: ");
			m=sc.nextLine();
			Student s=new Student(count++,n,c,m);
			return s;
		}
		else
			BSP.output.println("Wrong Password");
		return null;
	}
	public boolean checkPassword(String password)
	{
		String checkPassword="Mla@1234";
		if(checkPassword.equals(password))
			return true;
		else
			return false;
	}
	public void show()
	{
		ArrayList al=readData();
	 	if(al==null)
	 	{
	 		BSP.output.println("Student Information not Available");
	 	}
	 	else 
	 	{
	 		for(int i=0;i<al.size();i++)
	 		{
	 			BSP.output.println(al.get(i));
	 		}
	 	}
	}
	public void addData(Student s) throws Exception
	{
		ArrayList al=readData();
		if(al==null)
		{
			al=new ArrayList();
		}
		al.add(s);
		FileOutputStream fos=new FileOutputStream("std.obj");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(al);
		oos.close();
	}
	public void addData(ArrayList al) throws Exception
	{
		FileOutputStream fos=new FileOutputStream("std.obj");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(al);
		oos.close();
	}

	public ArrayList readData() 
	{
		try
		{
			FileInputStream fis=new FileInputStream("std.obj");
			ObjectInputStream ois=new ObjectInputStream(fis);
			ArrayList al=(ArrayList)ois.readObject();
			return al;
		}
		catch(Exception e)
		{
			return null;
		}
	}
	public Student search(int rollNo)
	{
		ArrayList al=readData();
		for(int i=0;i<al.size();i++)
		{
			Student s1=(Student)al.get(i);
			if(s1.getRollNo()==rollNo)
			{
				return s1;
			}
		}
		return null;
	}

	public Student searchByName(String name)
	{
		ArrayList al=readData();
		for(int i=0;i<al.size();i++)
		{
			Student s1=(Student)al.get(i);
			if((s1.getName()).equals(name));
			{
				return s1;
			}
		}
		return null;
	}
	
	public Student searchByMobileNo(String mobileNo)
	{
		ArrayList al=readData();
		for(int i=0;i<al.size();i++)
		{
			Student s1=(Student)al.get(i);
			if((s1.getMobileNo()).equals(mobileNo));
			{
				return s1;
			}
		}
		return null;
	}
	public void delete()throws Exception
	{
		int ch;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			BSP.output.println("1-> Student details delete By Roll Number\n2-> Student details delete By Name\n3-> Student details delete By Mobile Number\n4-> Return main menu");
			BSP.output.println("Please Enter your Choice...");			
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					deleteByRollNo();
					BSP.output.println("Student Information Successfully Delete");
					break;
				case 2:
					//deleteByName();
					BSP.output.println("Student Information Successfully Delete");
					break;
				case 3:
					//deleteByMobileNo();
					BSP.output.println("Student Information Successfully Delete");
					break;
				case 4:
					return;
			}
		}
	}

	public void deleteByRollNo()throws Exception
	{
		Scanner sc=new Scanner(System.in);
		BSP.output.print("enter student rollNo: ");
		int rollNo=sc.nextInt();
		Student s=search(rollNo);
		if(s==null)
		{
			BSP.output.println("Student Information not Available");
		}
		else
		{
			ArrayList al=readData();
			al.remove(al.indexOf(s));
			addData(al);
		}
	}
	public void update() throws Exception
	{
		int ch,i;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			BSP.output.println("1-> Student details update By Roll Number\n2-> Student details update By Name\n3-> Student details update By Mobile Number\n4-> Return main menu");
			BSP.output.println("Please Enter your Choice...");			
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					BSP.output.print("enter student rollNo: ");
					int rollNo=sc.nextInt();
					Student s=search(rollNo);
					if(s!=null)
					{
						updateStudentInformation(s);
						BSP.output.println("Student Information Successfully Update");
					}
					else 
					   BSP.output.println("Student rollNo not exist");
					break;
				case 2:
					sc.nextLine();
					BSP.output.print("enter student Name: ");
					String name=sc.nextLine();
					s=searchByName(name);
					if(s!=null)
					{
					 	updateStudentInformation(s);
					 	BSP.output.println("Student Information Successfully Update");
					}
					else 
					   BSP.output.println("Student Name not exist");
					break;
				case 3:
					sc.nextLine();
					BSP.output.print("enter student mobileNo: ");
					String mobileNo=sc.nextLine();
					s=searchByMobileNo(mobileNo);
					if(s!=null)
					{
					 	updateStudentInformation(s);
					 	BSP.output.println("Student Information Successfully Update");
					}
					else 
					   BSP.output.println("Student Mobile Number not exist");
					break;
				case 4:
					return;
			}
		}
	}
	public void updateStudentInformation(Student s) throws Exception
	{
		String str="";
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			int ch;
			System.out.println("1-> Update Name\n2-> Update Class Name\n3-> Update Mobile Number\n4-> Return Update menu");
			System.out.println("Please Enter your Choice...");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					sc.nextLine();
					System.out.println("Please Enter new name: ");
					str=sc.nextLine();
					s.setName(str);
					ArrayList al=readData();
					int index=al.indexOf(s);
					al.set(index,s);
					addData(al);
					break;
				case 2:
					sc.nextLine();
					System.out.println("Please Enter Class Name: ");
					str=sc.nextLine();
					s.setClassName(str);
					al=readData();
					index=al.indexOf(s);
					al.set(index,s);
					addData(al);
					break;
				case 3:
					sc.nextLine();
					System.out.println("Please Enter new Mobile Number: ");
					str=sc.nextLine();
					s.setMobileNo(str);
					al=readData();
					index=al.indexOf(s);
					al.set(index,s);
					addData(al);
					break;
				case 4:
					return;
			}
		}
	}
}

class StudentTask1
{
	public static void main(String[] args) throws Exception{
		BSP.output.println("\n");
		BSP.output.println("***** Student Project By: Bhoopendra Singh Dollop*****");
		BSP.output.println("\n");
		int ch;
		School school=new School();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			BSP.output.println("1-> Admission\n2-> Show All Student Information\n3-> Delete Student Information\n4-> Update Student Information\n5-> Exit");
			BSP.output.println("Please Enter your Choice...");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					Student s=school.addmission();
					if(s!=null)
					   school.addData(s);
					break;
				case 2:
					school.show();
					break;
				case 3:
					school.delete();
					break;
				case 4:
					school.update();
					break;
				case 5:
					BSP.output.println("****Thank You Visit My Project****");
					System.exit(1);
				default:
					BSP.output.println("your choice are wrong");
			}
		}
	}
}