interface Printable
{ 
	abstract void print();
}

class Test implements Printable
{
	public void print()
	{
		for(int i=0;i<=5;i++)
		{
			BSP.output.println("Be Happy");
		}
	}
	public static void main(String[] args) 
	{
		Test t=new Test();
		t.print();
	}
}

interface Drawable
{
	abstract void draw();
}

class Test1 implements Drawable
{
	public void draw()
	{
		for(int i=0;i<=5;i++)
		{
			BSP.output.println("I'm very Happy");
		}
	}
	public static void main(String[] args) 
	{
		Test1 t=new Test1();
		t.draw();
	}
}

class Test2 implements Printable,Drawable
{
	public void draw()
	{
		for(int i=0;i<=5;i++)
		{
			BSP.output.println("I'm Drawable Interface");
		}
		BSP.output.println();
		BSP.output.println();
	}

	public void print()
	{
		for(int i=0;i<=5;i++)
		{
			BSP.output.println("I'm Printable Interface");
		}
	}

	public static void main(String[] args) 
	{
		Test2 t=new Test2();
		t.draw();
		t.print();
	}
}

interface Manageable extends Printable
{
	abstract void manage();
}

class Test3 implements Manageable
{
	public void manage()
	{
		for(int i=0;i<=5;i++)
		{
			BSP.output.println("I'm Manageable");
		}
		BSP.output.println();
	}

	public void print()
	{
		for(int i=0;i<=5;i++)
		{
			BSP.output.println("I'm Printable");
		}
	}
	public static void main(String[] args) 
	{
		Test3 t=new Test3();			
		t.manage();
		t.print();
	}
}

class Test4 extends Test1
{
	public void print()
	{
		BSP.output.println("Be Happy");
	}
	public static void main(String[] args) 
	{
		Test4 t=new Test4();
		t.print();
		t.draw();
	}
}

interface Checkable
{
	public static final int MIN=5;
	public static final int MAX=10;
	public abstract void check();
}

class Test5 implements Checkable
{
	public void check()
	{
		for(int i=0;i<=5;i++)
		{
			BSP.output.println("I'm Checkable");
		}
	}

	public void print()
	{
		BSP.output.println(MIN);
	}

	public void draw()
	{
		BSP.output.println(MAX);
	}
	public static void main(String[] args) 
	{
		Test5 t=new Test5();
		t.check();
		t.print();
		t.draw();
	}
}

interface MultiInterface
{
	public abstract void multi();
}

class Test6 implements MultiInterface
{
	public void multi()
	{
		BSP.output.println("Hello Test6");
	}
}

class Test7 implements MultiInterface
{
	public void multi()
	{
		BSP.output.println("Hello Test7");
	}
}

class Test8
{
	public static void main(String[] args) 
	{
		MultiInterface m=new Test7();
		m.multi();
	}
}

interface Bank
{  
	public abstract float rateOfInterest();  
}

class SBI implements Bank
{  
	public float rateOfInterest()
	{
		return 9.15f;
	}  
} 

class PNB implements Bank
{  
	public float rateOfInterest()
	{
		return 9.7f;
	}  
} 

class HDFC implements Bank
{  
	public float rateOfInterest()
	{
		return 9.2f;
	}  
} 

class Test9
{  
	public static void main(String[] args)
	{  
		Bank b=new SBI();  
		System.out.println("ROI: "+b.rateOfInterest());  
	}
}  

interface DefaultMethod
{
	public abstract void main();
 	default void defaultB()
 	{
 		BSP.output.println("Hello default");
 	}
}

class Test10 implements DefaultMethod
{
	public void main()
	{
		BSP.output.println("Hello main");
	}
	public static void main(String[] args) 
	{
		DefaultMethod dm=new Test10();
		dm.main();
		dm.defaultB();
	}
}

interface StaticMethod
{
	public abstract void main();
	default void defaultB()
 	{
 		BSP.output.println("Hello default");
 	}

 	static void staticB()
 	{
 		BSP.output.println("Hello Static");
 	}
}

class Test11 implements StaticMethod
{
	public void main()
	{
		BSP.output.println("Hello main");
	}
	public static void main(String[] args) 
	{
		StaticMethod st=new Test11();
		st.main();
		st.defaultB();
		StaticMethod.staticB();
	}
}

