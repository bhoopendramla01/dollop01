import java.util.*;
import java.io.*;

class Employee implements Serializable
{
	int idNo,salary;
	String name,designation,company,mobileNo;
	Employee(int idNo,String n,String c,String d,String m,int s)
	{
		this.idNo=idNo;
		name=n;
		company=c;
		designation=d;
		salary=s;
		mobileNo=m;
	}
	public boolean equals(Object obj)
	{
		Employee emp=(Employee)obj;
		return idNo==emp.idNo;
	}
	 
	public int getIdNo()
	{
		return this.idNo;
	}
	public String getName()
	{
		return this.name;
	}
	public String getMobileNo()
	{
		return this.mobileNo;
	}
	public void setName(String n)
	{
		this.name=n;
	}
	public void setDesignation(String d)
	{
		this.designation=d;
	}
	public void setMobileNo(String m)
	{
		this.mobileNo=m;
	}
	public void setSalary(int s)
	{
		this.salary=s;
	}
	public void setCompanyName(String c)
	{
		this.company=c;
	}
	public String toString()
	{
		return "ID: "+idNo+" ,Name: "+name+" ,Company: "+company+" ,Designation: "+designation+" ,Mobile Number: "+mobileNo+" ,Salary: "+salary;
	}
}

class Company
{
	static int count=111000;
	public Employee newRecruitment()
	{
		String n,c,d,m,password;
		int s;
		Scanner sc=new Scanner(System.in);
		BSP.output.print("Please Enter Administrator Password :");
		password=sc.nextLine();
		if(checkPassword(password))
		{
			BSP.output.println("enter Employee name: ");
			n=sc.nextLine();
			BSP.output.println("enter Employee company: ");
			c=sc.nextLine();
			BSP.output.println("enter Employee designation: ");
			d=sc.nextLine();
			BSP.output.println("enter Employee mobileNo: ");
			m=sc.nextLine();
			BSP.output.println("enter Employee salary: ");
			s=sc.nextInt();
			Employee emp=new Employee(count++,n,c,d,m,s);
			return emp;
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
	 		BSP.output.println("Employee Information not Available");
	 	}
	 	else 
	 	{
	 		for(int i=0;i<al.size();i++)
	 		{
	 			BSP.output.println(al.get(i));
	 		}
	 	}
	}
	public void addData(Employee emp) throws Exception
	{
		ArrayList al=readData();
		if(al==null)
		{
			al=new ArrayList();
		}
		al.add(emp);
		FileOutputStream fos=new FileOutputStream("emp.obj");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(al);
		oos.close();
	}
	public void addData(ArrayList al) throws Exception
	{
		FileOutputStream fos=new FileOutputStream("emp.obj");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(al);
		oos.close();
	}

	public ArrayList readData() 
	{
		try
		{
			FileInputStream fis=new FileInputStream("emp.obj");
			ObjectInputStream ois=new ObjectInputStream(fis);
			ArrayList al=(ArrayList)ois.readObject();
			return al;
		}
		catch(Exception e)
		{
			return null;
		}
	}
	public Employee search(int idNo)
	{
		ArrayList al=readData();
		for(int i=0;i<al.size();i++)
		{
			Employee emp1=(Employee)al.get(i);
			if(emp1.getIdNo()==idNo)
			{
				return emp1;
			}
		}
		return null;
	}

	public Employee searchByName(String name)
	{
		ArrayList al=readData();
		for(int i=0;i<al.size();i++)
		{
			Employee emp1=(Employee)al.get(i);
			if((emp1.getName()).equals(name));
			{
				return emp1;
			}
		}
		return null;
	}
	
	public Employee searchByMobileNo(String mobileNo)
	{
		ArrayList al=readData();
		for(int i=0;i<al.size();i++)
		{
			Employee emp1=(Employee)al.get(i);
			if((emp1.getMobileNo()).equals(mobileNo));
			{
				return emp1;
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
			BSP.output.println("1-> Employee details delete By id Number\n2-> Employee details delete By Name\n3-> Employee details delete By Mobile Number\n4-> Return main menu");
			BSP.output.println("Please Enter your Choice...");			
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					deleteByidNo();
					BSP.output.println("Employee Information Successfully Delete");
					break;
				case 2:
					//deleteByName();
					BSP.output.println("Employee Information Successfully Delete");
					break;
				case 3:
					//deleteByMobileNo();
					BSP.output.println("Employee Information Successfully Delete");
					break;
				case 4:
					return;
			}
		}
	}

	public void deleteByidNo()throws Exception
	{
		Scanner sc=new Scanner(System.in);
		BSP.output.print("enter Employee idNo: ");
		int idNo=sc.nextInt();
		Employee emp=search(idNo);
		if(emp==null)
		{
			BSP.output.println("Employee Information not Available");
		}
		else
		{
			ArrayList al=readData();
			al.remove(al.indexOf(emp));
			addData(al);
		}
	}
	public void update() throws Exception
	{
		int ch,i;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			BSP.output.println("1-> Employee details update By id Number\n2-> Employee details update By Name\n3-> Employee details update By Mobile Number\n4-> Return main menu");
			BSP.output.println("Please Enter your Choice...");			
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					BSP.output.print("enter Employee rollNo: ");
					int idNo=sc.nextInt();
					Employee emp=search(idNo);
					if(emp!=null)
					{
						updateEmployeeInformation(emp);
						BSP.output.println("Employee Information Successfully Update");
					}
					else 
					   BSP.output.println("Employee idNo not exist");
					break;
				case 2:
					sc.nextLine();
					BSP.output.print("enter Employee Name: ");
					String name=sc.nextLine();
					emp=searchByName(name);
					if(emp!=null)
					{
					 	updateEmployeeInformation(emp);
					 	BSP.output.println("Employee Information Successfully Update");
					}
					else 
					   BSP.output.println("Employee Name not exist");
					break;
				case 3:
					sc.nextLine();
					BSP.output.print("enter Employee mobileNo: ");
					String mobileNo=sc.nextLine();
					emp=searchByMobileNo(mobileNo);
					if(emp!=null)
					{
					 	updateEmployeeInformation(emp);
					 	BSP.output.println("Employee Information Successfully Update");
					}
					else 
					   BSP.output.println("Employee Mobile Number not exist");
					break;
				case 4:
					return;
			}
		}
	}
	public void updateEmployeeInformation(Employee emp) throws Exception
	{
		String str="";
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			int ch;
			System.out.println("1-> Update Name\n2-> Update Company Name\n3-> Update Mobile Number\n4-> Return Update menu");
			System.out.println("Please Enter your Choice...");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					sc.nextLine();
					System.out.println("Please Enter new name: ");
					str=sc.nextLine();
					emp.setName(str);
					ArrayList al=readData();
					int index=al.indexOf(emp);
					al.set(index,emp);
					addData(al);
					break;
				case 2:
					sc.nextLine();
					System.out.println("Please Enter Company Name: ");
					str=sc.nextLine();
					emp.setCompanyName(str);
					al=readData();
					index=al.indexOf(emp);
					al.set(index,emp);
					addData(al);
					break;
				case 3:
					sc.nextLine();
					System.out.println("Please Enter new Mobile Number: ");
					str=sc.nextLine();
					emp.setMobileNo(str);
					al=readData();
					index=al.indexOf(emp);
					al.set(index,emp);
					addData(al);
					break;
				case 4:
					return;
			}
		}
	}
}

class EmployeeTask1
{
	public static void main(String[] args) throws Exception{
		BSP.output.println("\n");
		BSP.output.println("***** Employee Project By: Bhoopendra Singh Dollop*****");
		BSP.output.println("\n");
		int ch;
		Company company=new Company();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			BSP.output.println("1-> New Employee Recruitment\n2-> Show All Employee Information\n3-> Delete Employee Information\n4-> Update Employee Information\n5-> Exit");
			BSP.output.println("Please Enter your Choice...");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					Employee emp=company.newRecruitment();
					if(emp!=null)
					   company.addData(emp);
					break;
				case 2:
					company.show();
					break;
				case 3:
					company.delete();
					break;
				case 4:
					company.update();
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