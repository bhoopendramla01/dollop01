import java.util.Scanner;
import java.io.*;
class Student{
	int rollNo;
	String name,className,mobileNo;
	Student(int rollNo,String name,String className,String mobileNo){
		this.rollNo=rollNo;
		this.name=name;
		this.className=className;
		this.mobileNo=mobileNo;
	}
	public String toString(){
		return "Roll Number: "+rollNo+" Name: "+name+" Class Name: "+className+" Mobile Number: "+mobileNo;
	}
	public int getRollNo(){
		return this.rollNo;
	}
	public String getName(){
		return this.name;
	}
	public String getMobileNo(){
		return this.mobileNo;
	}
	public String getClassName(){
		return this.className;
	}
	public void setName(String n){
		this.name=n;
	}
	public void setClassName(String c){
		this.className=c;
	}
	public void setMobileNo(String m){
		this.mobileNo=m;
	}
}

class School{
	int seat;
	int totalStd;
	Student students[];
	School(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter avaliable seat counting");
		seat=sc.nextInt();
		totalStd=-1;
		students = new Student[seat];
	}
	public void increseSheat(){
		seat+=5;
		Student s[]=new Student[seat];
		for(int i=0;i<=totalStd;i++){
			s[i]=students[i];
		}
		students=s;
	}
	public void newStudent(){
		int r;
		String n,c,m;
		Scanner sc=new Scanner(System.in);
		if(totalStd==seat-1){
			increseSheat();
		}
		System.out.println("enter student roll Number: ");
		r=sc.nextInt();
		for(int i=0;i<=totalStd;i++){
			if(r==students[i].getRollNo())
			{
				System.out.println("Student roll Number already exist");
				return;
			}
		}
		sc.nextLine();
		System.out.println("enter student name: ");
		n=sc.nextLine();
		System.out.println("enter student class: ");
		c=sc.nextLine();
		System.out.println("enter student mobileNo: ");
		m=sc.nextLine();
		for(int j=0;j<=totalStd;j++){
			if(m==students[j].getMobileNo())
			{
				System.out.println("Student mobileNo already exist");
				return;
			}
		}
		totalStd++;
		students[totalStd]=new Student(r,n,c,m);
	}
	public void show(){
		if(totalStd==-1){
			System.out.println("Student details not avaliable");
			return;
		}
		for(int i=0;i<=totalStd;i++){
			System.out.println(students[i]);
		}
	}
	public void delete(){
		int ch;
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("1-> Student details delete By Roll Number\n2-> Student details delete By Name\n3-> Student details delete By Mobile Number\n4-> Return main menu");
			System.out.println("Please Enter your Choice...");			
			ch=sc.nextInt();
			switch(ch){
				case 1:
					deleteByRollNo();
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
	public Student deleteByRollNo(){
		int rollNo,k=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter roll Number: ");
		rollNo=sc.nextInt();
		for(int i=0;i<=totalStd;i++){
			if(rollNo==students[i].getRollNo())
			{
				k=1;
				Student s=students[i];
				for(int j=i;j<totalStd;j++){
					students[j]=students[j+1];
				}
				students[totalStd--]=null;
				return s;
			}
		}
		if(k==0){
			System.out.println("rollNo not exist");
		}
		return null;
	}
	public Student deleteByName(){
		int k=0;
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter name: ");
		name=sc.nextLine();
		for(int i=0;i<=totalStd;i++){
			if(name.equals(students[i].getName()))
			{
				k=1;
				Student s=students[i];
				for(int j=i;j<totalStd;j++){
					students[j]=students[j+1];
				}
				students[totalStd--]=null;
				return s;
			}
		}
		if(k==0){
			System.out.println("Name not exist");
		}
		return null;
	}
	public Student deleteByMobileNo(){
		int k=0;
		String mobileNo;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter mobileNo: ");
		mobileNo=sc.nextLine();
		for(int i=0;i<=totalStd;i++){
			if(mobileNo.equals(students[i].getMobileNo()))
			{
				k=1;
				Student s=students[i];
				for(int j=i;j<totalStd;j++){
					students[j]=students[j+1];
				}
				students[totalStd--]=null;
				return s;
			}
		}
		if(k==0){
			System.out.println("MobileNo not exist");
		}
		return null;
	}
	public void update(){
		int ch;
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("1-> Student details update By Roll Number\n2-> Student details update By Name\n3-> Student details update By Mobile Number\n4-> Return main menu");
			System.out.println("Please Enter your Choice...");			
			ch=sc.nextInt();
			switch(ch){
				case 1:
					updateByRollNo();
					break;
				case 2:
					updateByName();
					break;
				case 3:
					updateByMobileNo();
					break;
				case 4:
					return;
			}
		}
	}
	public Student updateByRollNo(){
		int rollNo,k=0;
		String str="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter rollNo: ");
		rollNo=sc.nextInt();
		for(int i=0;i<=totalStd;i++){
			if(rollNo==students[i].getRollNo())
			{
				k=1;
				Student s=students[i];
				while(true){
					int ch;
					System.out.println("1-> Update Name\n2-> Update Class\n3-> Update Mobile Number\n4-> Return Update menu");
					System.out.println("Please Enter your Choice...");
					ch=sc.nextInt();
					switch(ch){
						case 1:
							sc.nextLine();
							System.out.println("Please Enter new name: ");
							str=sc.nextLine();
							s.setName(str);
							break;
						case 2:
							sc.nextLine();
							System.out.println("Please Enter class: ");
							str=sc.nextLine();
							s.setClassName(str);
							break;
						case 3:
							sc.nextLine();
							System.out.println("Please Enter new Mobile Number: ");
							str=sc.nextLine();
							s.setMobileNo(str);
							break;
						case 4:
							return null;
					}
				}
		
			}
		}
		if(k==0){
			System.out.println("rollNo not exist");
		}
		return null;
	}
	public Student updateByName(){
		int k=0;
		String name;
		String str="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Name: ");
		name=sc.nextLine();
		for(int i=0;i<=totalStd;i++){
			if(name.equals(students[i].getName()))
			{
				k=1;
				Student s=students[i];
				while(true){
					int ch;
					System.out.println("1-> Update Name\n2-> Update Class\n3-> Update Mobile Number\n4-> Return Update menu");
					System.out.println("Please Enter your Choice...");
					ch=sc.nextInt();
					switch(ch){
						case 1:
							sc.nextLine();
							System.out.println("Please Enter new name: ");
							str=sc.nextLine();
							s.setName(str);
							break;
						case 2:
							sc.nextLine();
							System.out.println("Please Enter class: ");
							str=sc.nextLine();
							s.setClassName(str);
							break;
						case 3:
							sc.nextLine();
							System.out.println("Please Enter new Mobile Number: ");
							str=sc.nextLine();
							s.setMobileNo(str);
							break;
						case 4:
							return null;
					}
				}
		
			}
		}
		if(k==0){
			System.out.println("Name not exist");
		}
		return null;
	}
	public Student updateByMobileNo(){
		int k=0;
		String mobileNo;
		String str="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter mobileNo: ");
		mobileNo=sc.nextLine();
		for(int i=0;i<=totalStd;i++){
			if(mobileNo.equals(students[i].getMobileNo()))
			{
				k=1;
				Student s=students[i];
				while(true){
					int ch;
					System.out.println("1-> Update Name\n2-> Update Class\n3-> Update Mobile Number\n4-> Return Update menu");
					System.out.println("Please Enter your Choice...");
					ch=sc.nextInt();
					switch(ch){
						case 1:
							sc.nextLine();
							System.out.println("Please Enter new name: ");
							str=sc.nextLine();
							s.setName(str);
							break;
						case 2:
							sc.nextLine();
							System.out.println("Please Enter class: ");
							str=sc.nextLine();
							s.setClassName(str);
							break;
						case 3:
							sc.nextLine();
							System.out.println("Please Enter new Mobile Number: ");
							str=sc.nextLine();
							s.setMobileNo(str);
							break;
						case 4:
							return null;
					}
				}
		
			}
		}
		if(k==0){
			System.out.println("MobileNo not exist");
		}
		return null;
	}
}

class Bhoopendra{
	public static void main(String[] args) {
		System.out.println("\n");
		System.out.println("***** Student Project By: Bhoopendra Singh Dollop*****");
		System.out.println("\n");
		int ch;
		School school=new School();
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("1-> Admission\n2-> Show All Student Information\n3-> Delete Student Information\n4-> Update Student Information\n5-> Exit");
			System.out.println("Please Enter your Choice...");
			ch=sc.nextInt();
			switch(ch){
			case 1:
				school.newStudent();
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
				System.out.println("****Thank You Visit My Project****");
				System.exit(1);
			default:
				System.out.println("your choice are wrong");
			}
		}
	}
}