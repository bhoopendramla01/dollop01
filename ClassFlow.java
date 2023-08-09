import java.util.Scanner;
class ClassFlow{
	int a=10;
	static{
		System.out.println("Hello Static");
	}
	ClassFlow(){
		System.out.println(this.a);
		System.out.println("Hello Constructor");
	}
	{
		System.out.println("Hello Non Static");
	}
	public static void main(String[] args) {
		ClassFlow cf1=new ClassFlow();
		System.out.println("Hello main");
		Run r=new Run();
		ClassFlow cf=new ClassFlow();
		System.out.println(r.b);
	}
}
class Run extends ClassFlow{
	int b=20;
	Run(){
		int c=50;
		System.out.println("Hello Run Constructor");
	}
}


class Test extends Abs{
	 public void m2(){
	 	System.out.println("Hello Abstract");
	 }
	 public void m3(){
	 	System.out.println("Hello m3");
	 }
	 Test(){
	 	super();
	 	System.out.println("Hello Test Constructor");
	 }
	 public static void main(String[] args) {
	 	Test t=new Test();
	 	t.m2();
	 	t.m1();
	 	t.m3();
	 }
}
abstract class Abs{
	public void m1(){
		System.out.println("Hello m1");
	}
	Abs(){
		System.out.println("Hello Abs Constructor");
	}
	abstract public void m2();
	abstract public void m3();
}

class A extends B{
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println(sum(a,b));
		int c=30;
		int d=10;
		System.out.println(sub(c,d));
		int e=30;
		int f=10;
		System.out.println(div(e,f));	
	}
}
class B extends C{
	public static int sum(int a,int b){
		return a+b;
	}
}

class C extends D{
	public  static int sub(int c,int d){
		return c-d;
	}

}
class D{
	public  static int div(int e,int f){
		return e/f;
	}
}

class Ab{
	public  static  int sum(int i,int j){
		return i+j;
	}
}

class Bc extends Ab{
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println(sum(a,b));
	}
}

class Cd extends Ab{
	public static void main(String[] args) {
		int c=30;
		int d=40;
		System.out.println(sum(c,d));
	}
}

class Student{
	int roll_number;
	String name;
	String father_name;
	Student(int r,String n,String f){
		roll_number=r;
		name=n;
		father_name=f;
	}
	void display(){
		System.out.println(roll_number+" "+name+" "+father_name);
	}
	public static void main(String[] args) {
		Student std=new Student(100,"Bhoopendra Singh","Raj Narayan Singh");
		Student std1=new Student(200,"Aman Pratap Singh","Shri Ram Chandra");
		std.display();
		std1.display();
	}
}

class Employee
{
	int id;
	String name;
	String company;
	String designation;
	Employee(int i,String n,String c,String d)
	{
		id=i;
		name=n;
		company=c;
		designation=d;
	}
	void display()
	{
		//System.out.println(id+" "+name+" "+company+" "+designation+" ");
		System.out.print(id+" ");
		System.out.print(name+" ");
		System.out.print(company+" ");
		System.out.print(designation+" ");
		System.out.print("\n");

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee emp[]=new Employee[3];
		int i;
		String n,c,d;
		for(int k=0;k<emp.length;k++){
			System.out.println("Please enter id no");
			i=sc.nextInt();
			sc.nextLine();
			System.out.println("Please enter employee name");
			n=sc.nextLine();
			System.out.println("Please enter company name");
			c=sc.nextLine();
			System.out.println("Please enter designation");
			d=sc.nextLine();
			emp[k]=new Employee(i,n,c,d);
		}

		// Employee emp2=new Employee(i,n,c,d);
		// Employee emp3=new Employee(i,n,c,d);
		for(int j=0;j<emp.length;j++){
			emp[j].display();
			// emp2.display();
			// emp3.display();
		}
	}
}


interface Animal{
	public void eat();
}
class Dog implements Animal{
	public void eat(){
		System.out.println("Interface Method Emplements");
	}
	public static void main(String[] args) {
		Animal a=new Dog();
		a.eat();
	}
}

interface First{
	public void first();	
}
interface Second{
	public void second();
}
class Third implements First,Second{
	public  void first(){
		System.out.println("First interface");
	}
	public void second(){
		System.out.println("Second interface");
	}
	public static void main(String[] args) {
		Third t=new Third();
		t.first();
		t.second();
	}
}


abstract class Father{
	abstract void order();
}
class Child extends Father{
	public void order(){
		System.out.println("You can go out");
	}
	public static void main(String[] args) {
		Father f=new Child();
		f.order();
	}
}


// final  class PitaJi{
// 	final void order();
// }
// class BetaJi extends PitaJi{
// 	public void order(){
// 			System.out.println("Change Order");
// 	}
// 	public static void main(String[] args) {
// 		BetaJi b=new BetaJi();
// 		b.order();
// 	}
// }


class P{
	public void m1(){
		System.out.println("P m1");
	}
	public void m2(){
		System.out.println("P m2");
	}
}
class Ch extends P{
	public void m1(){
		System.out.println("C m1");
	}
	public void m3(){
		System.out.println("C m3");
	}
	public static void main(String[] args) {
		Ch c=new Ch();
		c.m1();
		c.m2();
		c.m3();
	}
}

class Parent{
	public void m1(){
		System.out.println("Parent m1");
	}
	public void m2(){
		System.out.println("Parent m2");
	}
}
class Be extends Parent{
	public void m1(){
		System.out.println("Be m1");
	}
	public void m3(){
		System.out.println("Be m3");
	}
	public static void main(String[] args) {
		Parent p=new Be();
		p.m1();
		p.m2();
		((Be)p).m3();
	}
}


class Method{
	// public static void m(int i){
	// 	System.out.println("int");
	// }
	public static void m(float i){
		System.out.println("float");
	}
	public static void m(short i){
		System.out.println("short");
	}
	public static void m(Number i){
		System.out.println("Number");
	}
	public static void main(String[] args) {
		m((byte)10.0);
	}
}