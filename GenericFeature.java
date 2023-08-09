import java.util.*;
class Test
{
	public static void main(String[] args) 
	{
		ArrayList<Integer>ma=new ArrayList<Integer>();

		ma.add(10);
		ma.add(20);
		ma.add(30);

		BSP.output.println(ma);
	}
}

class Test1
{
	public static void main(String[] args) 
	{
		ArrayList<String>al=new ArrayList<String>();	

		al.add("Bhoopendra");
		al.add("Singh");
		al.add("Patel");

		BSP.output.println(al);
	}
}

class Test2
{
	public static void main(String[] args) 
	{
		ArrayList<Integer>al=new ArrayList<Integer>();

		//al.add("Bhoopendra");			//String cannot converted to Integer
		al.add(2610);

		BSP.output.println(al);
	}
}

class MyGen<T>
{  
	T obj;  
	void add(T obj)
	{
		this.obj=obj;
	}  
	T get()
	{
		return obj;
	}  
}  

class Test3
{
	public static void main(String[] args) 
	{
		MyGen<Integer>m=new MyGen<Integer>();

		m.add(10);
		BSP.output.println(m.get());
	}
}

class Test4
{
	public static void main(String[] args) 
	{
		MyGen<String>s=new MyGen<String>();

		s.add("Bhoopendra Singh Patel");

		BSP.output.println(s.get());
	}
}

class Test5
{
	public static void main(String[] args) 
	{
		MyGen<Character>c=new MyGen<Character>();

		c.add('A');

		BSP.output.println(c.get());
	}
}

