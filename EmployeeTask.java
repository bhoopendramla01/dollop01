import java.util.Scanner;
class Employee{
	int id,salary;
	String name,designation,company,mobileNo;
	Employee(int id,String n,String c,String d,String m,int s){
		this.id=id;
		name=n;
		company=c;
		designation=d;
		salary=s;
		mobileNo=m;
	}
	 
	public int getIdNo(){
		return this.id;
	}
	public String getName(){
		return this.name;
	}
	public String getMobileNo(){
		return this.mobileNo;
	}
	public void setName(String n){
		this.name=n;
	}
	public void setDesignation(String d){
		this.designation=d;
	}
	public void setMobileNo(String m){
		this.mobileNo=m;
	}
	public void setSalary(int s){
		this.salary=s;
	}
	public void setCompanyName(String c){
		this.company=c;
	}
	public String toString(){
		return "ID: "+id+" Name: "+name+" ,Company: "+company+" ,Designation: "+designation+" ,Mobile Number: "+mobileNo+" ,Salary: "+salary;
	}
}
class Company{
	int vacancy,count=11000;
	int totalEmp;
	Employee employee[];
	Company(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter avaliable vacancy counting");
		vacancy=sc.nextInt();
		totalEmp=-1;
		employee = new Employee[vacancy];
	}
	public void increseVacancy(){
		vacancy+=5;
		Employee e[]=new Employee[vacancy];
		for(int i=0;i<=totalEmp;i++){
			e[i]=employee[i];
		}
		employee=e;
	}
	public void newRecruitment(){
		int s;
		String n,d,c,m;
		Scanner sc=new Scanner(System.in);
		if(totalEmp==vacancy-1){
			increseVacancy();
		}
		System.out.println("Enter Employee name: ");
		n=sc.nextLine();
		System.out.println("Enter Employee Company: ");
		c=sc.nextLine();
		System.out.println("Enter Employee mobileNo: ");
		m=sc.nextLine();
		System.out.println("Enter Employee Designation: ");
		d=sc.nextLine();
		System.out.println("Enter Employee Salary: ");
		s=sc.nextInt();
		totalEmp++;
		employee[totalEmp]=new Employee(count++,n,c,d,m,s);
	}
	public void show(){
		if(totalEmp==-1){
			System.out.println("Employee details not avaliable");
			return;
		}
		for(int i=0;i<=totalEmp;i++){
			System.out.println(employee[i]);
		}
	}
	public void delete(){
		int ch;
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("1-> Employee details delete By ID Number\n2-> Employee details delete By Name\n3-> Employee details delete By Mobile Number\n4-> Return main menu");
			System.out.println("Please Enter your Choice...");			
			ch=sc.nextInt();
			switch(ch){
				case 1:
					deleteByIdNo();
					break;
				case 2:
					deleteByName();
					break;
				case 3:
					deleteByMobileNo();
					break;
				case 4:
					return;
			}
		}
	}
	public Employee deleteByIdNo(){
		int i=searchById();
		if(i!=-1)
		{
			Employee e=employee[i];
			for(int j=i;j<totalEmp;j++){
				employee[j]=employee[j+1];
			}
			employee[totalEmp--]=null;
				return e;
		}
		else{
			System.out.println("Employee ID not exist");
			return null;
		}
	}
	public Employee deleteByName(){
		int i=searchByName();
		if(i!=-1)
		{
			Employee e=employee[i];
			for(int j=i;j<totalEmp;j++){
				employee[j]=employee[j+1];
			}
			employee[totalEmp--]=null;
				return e;
		}
		else{
			System.out.println("Employee Name not exist");
			return null;
		}
	}
	public Employee deleteByMobileNo(){
		int i=searchByMobileNo();
		if(i!=-1)
		{
			Employee e=employee[i];
			for(int j=i;j<totalEmp;j++){
				employee[j]=employee[j+1];
			}
			employee[totalEmp--]=null;
				return e;
		}
		else{
			System.out.println("Employee Mobile Number not exist");
			return null;
		}
	}
	public int searchById(){
		int id,k=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Employee ID Number: ");
		id=sc.nextInt();
		for(int i=0;i<=totalEmp;i++){
			if(id==employee[i].getIdNo())
			{
				k=1;
				return i;
			}
		}
		return -1;
	}
	public int searchByName(){
		int k=0;
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Employee Name: ");
		name=sc.nextLine();
		for(int i=0;i<=totalEmp;i++){
			if(name.equals(employee[i].getName()))
			{
				k=1;
				return i;
			}
		}
		return -1;
	}
	public int searchByMobileNo(){
		int k=0;
		String mobileNo;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Employee Mobile Number: ");
		mobileNo=sc.nextLine();
		for(int i=0;i<=totalEmp;i++){
			if(mobileNo.equals(employee[i].getMobileNo()))
			{
				k=1;
				return i;
			}
		}
		return -1;
	}
	public void update(){
		int ch,i;
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("1-> Employee details update By ID Number\n2-> Employee details update By Name\n3-> Employee details update By Mobile Number\n4-> Return main menu");
			System.out.println("Please Enter your Choice...");			
			ch=sc.nextInt();
			switch(ch){
				case 1:
					i=searchById();
					if(i!=-1)
					{
						updateEmployeeInformation(i);
					}
					System.out.println("Employee ID not exist");
					break;
				case 2:
					i=searchByName();
					if(i!=-1)
					{
						updateEmployeeInformation(i);
					}
					System.out.println("Employee Name not exist");
					break;
				case 3:
					i=searchByMobileNo();
					if(i!=-1)
					{
						updateEmployeeInformation(i);
					}
					System.out.println("Employee Mobile Number not exist");
					break;
				case 4:
					return;
			}
		}
	}
	public void updateEmployeeInformation(int i){
		Employee e=employee[i];
		String str="";
		Scanner sc=new Scanner(System.in);
		while(true){
			int ch,s;
			System.out.println("1-> Update Name\n2-> Update Company Name\n3-> Update Mobile Number\n4-> Update Designation\n5-> Update Salary\n6-> Return Update menu");
			System.out.println("Please Enter your Choice...");
			ch=sc.nextInt();
			switch(ch){
				case 1:
					sc.nextLine();
					System.out.println("Please Enter new name: ");
					str=sc.nextLine();
					e.setName(str);
					break;
				case 2:
					sc.nextLine();
					System.out.println("Please Enter Company Name: ");
					str=sc.nextLine();
					e.setCompanyName(str);
					break;
				case 3:
					sc.nextLine();
					System.out.println("Please Enter new Mobile Number: ");
					str=sc.nextLine();
					e.setMobileNo(str);
					break;
				case 4:
					sc.nextLine();
					System.out.println("Please Enter Employee Designation: ");
					str=sc.nextLine();
					e.setDesignation(str);
					break;
				case 5:
					sc.nextLine();
					System.out.println("Please Enter Employee Salary: ");
					s=sc.nextInt();
					e.setSalary(s);
					break;
				case 6:
					return;
			}
		}
	}
}

class EmployeeTask{
	public static void main(String[] args) {
		// Employee emp=new Employee(" Bhoopendra Singh","Dollop","CEO","8889196987",56789);
		System.out.println("\n");
		System.out.println("***** Employee Project By: Bhoopendra Singh Dollop *****");
		int ch;
		Company cmp=new Company();
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("1-> New Employee Recruitment\n2-> Show All Employee Information\n3-> Delete Employee Information\n4-> Update Employee Information\n5-> Exit");
			System.out.println("Please Enter your Choice...");
			ch=sc.nextInt();
			switch(ch){
			case 1:
				cmp.newRecruitment();
				break;
			case 2:
				cmp.show();
				break;
			case 3:
				cmp.delete();
				break;
			case 4:
				cmp.update();
				break;
			case 5:
				System.out.println("***** Thank You Visit My Project *****");
				System.exit(1);
			default:
				System.out.println("your choice are wrong");
			}
		}
	}
}



