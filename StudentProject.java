import java.util.*;
import java.io.*;
class Student implements Serializable
{
	int rollNo;
	String name,fatherName,motherName,dateOfBirth,address,mobileNo,className;

	Student(int rollNo,String name,String fatherName,String motherName,String dateOfBirth,String className,String address,String mobileNo)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.fatherName=fatherName;
		this.motherName=motherName;
		this.dateOfBirth=dateOfBirth;
		this.className=className;
		this.address=address;
		this.mobileNo=mobileNo;
	}

	public String toString()
	{
		return rollNo+", "+name+", "+fatherName+", "+motherName+", "+dateOfBirth+", "+className+", "+address+", "+mobileNo;
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

	public void setFatherName(String fatherName)
	{
		this.fatherName=fatherName;
	}

	public void setMotherName(String motherName)
	{
		this.motherName=motherName;
	}

	public void setDateOfBirth(String dateOfBirth)
	{
		this.dateOfBirth=dateOfBirth;
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

	public String getFatherName()
	{
		return fatherName;
	}

	public String getMotherName()
	{
		return motherName;
	}

	public String getDateOfBirth()
	{
		return dateOfBirth;
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
	
	static int count=11000;
	public void school()
	{
		Scanner sc=new Scanner(System.in);
		while(true)	
		{
			BSP.output.println("1-> About\n2-> History\n3-> Faculty\n4-> Return Main Menu");
			BSP.output.print("Please Enter Your Choice:  ");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					about();
					break;
				case 2:
					//history();
					break;
				case 3:
					//faculty();
					break;
				case 4:
					return;
			}
		}
	}
	public void about()
	{
		BSP.output.println("Dollop is a community of learners including students, parents and staff who are dedicated to creating an academically rigorous, culturally caring and inclusive learning environment.\n\nWe are Reaching Excellence in Academics and Changing History! Together, we are champions of knowledge, our communities, the environment and of our futures.\n\nDollop Achievers are goal-oriented, critical thinkers and community leaders who are dedicated to achieving the highest level of integrity and academic success.\n\nThe administration and staff are committed to providing a challenging and supportive learning environment where all students can succeed and reach their full potential.\n\nEvery member participates in cycles of continuous learning and improvement that includes establishing high expectations, goal setting, planning, action and reflection.\n\nWe develop a culture of excellence that includes a robust instructional program aligned to the Common Core State Standards (CCSS) with a focus on implementing Balanced Literacy through Reading and Writing Workshop, as well as by building language, literacy and competency across all subject areas.\n\nThis includes the integration of science, technology, engineering and math (STEM) into the curriculum and by establishing a strong culture and climate.\n\nTo this end, we seek to develop well-rounded students who exemplify health, wellness and character development using our core schoolwide expectations and values (Be Safe, Be Respectful, Be Responsible and Be Mindful).\n\nThrough discovery, exploration, innovation, and creative expression through Arts integration and after school enrichment opportunities, students receive rich, extended learning opportunities while building a positive school culture where every member feels valued and respected.\n\nThrough coaching, collaboration and building professional learning communities, we offer staff professional development training to build teachers capacity to improve instructional practices and to accelerate student achievement.\n\nFinally, we support a community schools approach that organizes and maximizes resources from the school and community based partnerships to ensure every student thrives and to support student success in alignment with the school priorities.");
	}

	public void contact()
	{
		BSP.output.println("Dollop\nSukhmani Apartment Above Union Bank\nAB Road, Bhawarkuan, Indore\nMadhya Pradesh-452014\nPhone: 8889196987");
	}

	public void feeStructure()
	{
		int fee=1200;
		for(int i=1;i<=5;i++)
		{
			BSP.output.println("Class: "+i+" ,Total Fee: "+ fee+" Quarterly EMI: "+(fee/4));
			fee=fee+400;
		}
	}
	
	public Student admission()
	{
		String n,f,mom,dob,c,add,m,password;
		Scanner sc=new Scanner(System.in);
		BSP.output.print("Please Enter Administrator Password :");
		password=sc.nextLine();
		if(checkPassword(password))
		{
			BSP.output.println("enter student name: ");
			n=sc.nextLine();
			BSP.output.println("enter father name: ");
			f=sc.nextLine();
			BSP.output.println("enter mother name: ");
			mom=sc.nextLine();
			BSP.output.println("enter student dateOfBirth: ");
			dob=sc.nextLine();
			BSP.output.println("enter student class: ");
			c=sc.nextLine();
			BSP.output.println("enter student address: ");
			add=sc.nextLine();
			BSP.output.println("enter student mobileNo: ");
			m=sc.nextLine();
			Student s=new Student(count++,n,f,mom,dob,c,add,m);
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
		FileOutputStream fos=new FileOutputStream("std.pro");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(al);
		oos.close();
	}

	public void addData(ArrayList al) throws Exception
	{
		FileOutputStream fos=new FileOutputStream("std.pro");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(al);
		oos.close();
	}

	public ArrayList readData() 
	{
		try
		{
			FileInputStream fis=new FileInputStream("std.pro");
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
			BSP.output.println("1-> Update Name\n2-> Update Class Name\n3-> Update Mobile Number\n4-> Return Update menu");
			BSP.output.println("Please Enter your Choice...");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					sc.nextLine();
					BSP.output.println("Please Enter new name: ");
					str=sc.nextLine();
					s.setName(str);
					ArrayList al=readData();
					int index=al.indexOf(s);
					al.set(index,s);
					addData(al);
					break;
				case 2:
					sc.nextLine();
					BSP.output.println("Please Enter Class Name: ");
					str=sc.nextLine();
					s.setClassName(str);
					al=readData();
					index=al.indexOf(s);
					al.set(index,s);
					addData(al);
					break;
				case 3:
					sc.nextLine();
					BSP.output.println("Please Enter new Mobile Number: ");
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

class StudentProject
{
	public static void main(String[] args) throws Exception
	{
		School school=new School();
		Scanner sc=new Scanner(System.in);
		while(true)	
		{
			BSP.output.println("1-> School\n2-> Show Student Information\n3-> Admission\n4-> Update Student Information\n5-> Delete Student Information\n6-> Fee Structure\n7-> News\n8-> Contact\n9-> Exit");
			BSP.output.print("Please Enter Your Choice:  ");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					school.school();
					break;
				case 2:
					school.show();
					break;
				case 3:
					Student s=school.admission();
					if(s!=null)
					   school.addData(s);
					break;
				case 4:
					school.update();
					break;
				case 5:
					school.delete();
					break;
				case 6:
					school.feeStructure();
					break;
				case 7:
					//news();
					break;
				case 8:
					school.contact();
					break;
				case 9:
					BSP.output.println("***** Thank You for Visit My Student Project *****");
					System.exit(10);
				default:
					BSP.output.println("Your Choice is wrong...");

			}
		}
	}
}