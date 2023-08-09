class Outer
{
	class Inner
	{
		public void inner()
		{
			BSP.output.println("Hello Inner");
		}
	}
	public static void main(String[] args) 
	{
		 Outer o=new Outer();
		 Inner i=o.new Inner();
		 i.inner();
	}
}

class Outer1
{
	public void fun()
	{
		BSP.output.println("Hello outer1");
	}
	public static void main(String[] args) 
	{
		new Outer(){
			public void fun()
			{
				BSP.output.println("Hello annonymous1");
			}
		}.fun();
	}
}

class Outer2
{
	public void fun()
	{
		BSP.output.println("Hello outer2");
	}
	public static void main(String[] args) 
	{
		Outer2 o=new Outer2(){
			public void fun()
			{
				BSP.output.println("Hello annonymous2");
			}
		};
		o.fun();
	}
}

class Chinese
{
	public void noodles()
	{
		BSP.output.println("Normal Test");
	}
}

class Outer3
{
	public static void main(String[] args) 
	{
		Chinese c=new Chinese(){
			public void noodles()
			{
				BSP.output.println("Spicy Test");
			}
		};

		c.noodles();
	}
}

class Outer4 extends Thread
{
	public static void main(String[] args) 
	{
		new Thread(){
			public void run()
			{
				for(int i=0;i<=5;i++)
					BSP.output.println(Thread.currentThread().getName());
			}
		}.start();

		for(int i=0;i<=5;i++)
		{
			try{
				Thread.sleep(500);
			}catch(InterruptedException ie)
			{

			}				
			BSP.output.println(Thread.currentThread().getName());
		}
	}
}

class Outer5 extends Thread
{
	public static void main(String[] args) 
	{
		new Thread(new Runnable(){
			public void run(){
				for(int i=0;i<=5;i++)
				{
					BSP.output.println(Thread.currentThread().getName()+":"+i);
				}
			}
		}).start();

		for(int i=0;i<=5;i++)
		{
			BSP.output.println(Thread.currentThread().getName()+":"+i);
		}
	}
}

class Outer6
{
	class Inner2
	{
		public void message()
		{
			BSP.output.println("message from inner class");
		}
	}
}

class Test2
{
	public static void main(String[] args) 
	{
		Outer6 o=new Outer6();
		Outer6.Inner2 i=o.new Inner2();
		i.message();
	}
}

class Outer7
{
	static class Inner3
	{
		public void message()
		{
			BSP.output.println("message from inner class: non static method");
		}

		public static void messageStatic()
		{
			BSP.output.println("message from inner class: static method");
		}
	}
}

class Test3
{
	public static void main(String[] args) 
	{
		Outer7.Inner3 oi=new Outer7.Inner3();
		//new Outer7.Inner3().message();
		oi.messageStatic();
	}
}

class Outer8
{
	private class Inner4
	{
		public void fun()
		{
			BSP.output.println("Hello private inner class");
		}
	}
	public static void main(String[] args) 
	{
		Outer8 o=new Outer8();
		Inner4 i=o.new Inner4();
		i.fun();
	}

}

// class Test4
// {												//private can not access other class
// 	public static void main(String[] args) 
// 	{
// 		Outer8 o=new Outer8();
// 		Outer8.Inner4 i=o.new Inner4();
// 		i.fun();	
// 	}
// }

class Outer9
{
	abstract class Inner5
	{
		abstract void fun();
	}
	public static void main(String[] args) 
	{
		Outer9 o=new Outer9();
		Inner5 i=o.new Inner5(){
			public void fun()
			{
				BSP.output.println("Hello abstract inner class");
			}
		};

		i.fun();
	}
}

class Outer10
{
	protected class Inner6
	{
		protected void fun()
		{
			BSP.output.println("Hello protected inner class");
		}
	}
	public static void main(String[] args) 
	{
		Outer10 o=new Outer10();
		Inner6 i=o.new Inner6();

		i.fun();
	}
}

class Outer11
{
	abstract class Inner7
	{
		abstract void message();
	}
}

class Test5
{
	public static void main(String[] args) 
	{
		Outer11 o=new Outer11();
		Outer11.Inner7 i=o.new Inner7(){
			public void message()
			{
				BSP.output.println("Hello abstract overwrite");
			}
		};
		i.message();
	}
}