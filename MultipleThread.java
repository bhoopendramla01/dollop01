class MultipleThread 
{
	public static void main(String[] args) 
	{
		Check c=new Check();
		c.start();
		for(int j=0;j<=5;j++)
		{
			BSP.output.println("Main Thread: "+j);
		}
	}
}

class Check extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			BSP.output.println("Check Thread: "+(Thread.currentThread().getName()));
		}
	}
}

class CheckPriority
{
	public static void main(String[] args) 
	{
		Check c=new Check();
		c.start();
		BSP.output.println(Thread.currentThread().getPriority());
		for(int j=0;j<=5;j++)
		{
			BSP.output.println("Main Thread: "+j);
		}
	}
}

class GetThreadName
{
	public static void main(String[] args) 
	{
		Check c=new Check();
		c.start();
		for(int i=0;i<=5;i++)
		{
			BSP.output.println("Thread Name: "+(Thread.currentThread().getName()));
		}

	}
}


class YieldMethod extends Thread
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			BSP.output.println((Thread.currentThread().getName())+" Control");
		}
	}
	public static void main(String[] args) 
	{
		YieldMethod ym=new YieldMethod();
		YieldMethod ym1=new YieldMethod();
		ym.start();
		ym1.start();
		for(int i=0;i<=5;i++)
		{
			ym.yield();
			BSP.output.println((Thread.currentThread().getName())+" Control");
		}
	}
}

class OddEvenThread extends Thread
{
	public void run()
	{
		for(int i=5;i<=20;i++)
		{
			if(i%2==0)
			{
				BSP.output.println("Given Number is even: "+i);
			}
		}
	}
	public static void main(String[] args) 
	{
		OddEvenThread oet=new OddEvenThread();
		oet.start();
		for(int i=5;i<=20;i++)
		{
			oet.yield();
			if(i%2!=0)
			{
				BSP.output.println("Given Number is odd: "+i);
			}
		}
	}
}

class SetNameMethod extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			BSP.output.println((Thread.currentThread().getName())+" Control");
		}
	}
	public static void main(String[] args) 
	{
		SetNameMethod snm=new SetNameMethod();
		SetNameMethod snm1=new SetNameMethod();
		snm.start();
		snm1.start();
		snm.setName("Second");
		snm1.setName("Third");
		for(int i=0;i<=5;i++)
		{
			snm.yield();
			BSP.output.println((Thread.currentThread().getName())+" Control");
		}
	}
}

class IsAlive extends Thread
{
	public void run()
	{
		for (int i=0;i<=5;i++) 
		{
			BSP.output.println("Run: Thread");
		}
	}
	public static void main(String[] args) 
	{
		IsAlive is=new IsAlive();
		is.start();
		BSP.output.println(is.isAlive());
		for(int i=0;i<=10;i++)
		{
			BSP.output.println("Main: Thread");
		}
	}
}

class ThreadPriority extends Thread
{
	public static void main(String[] args) 
	{
		BSP.output.println("minimum: "+MIN_PRIORITY);
		BSP.output.println("normal: "+NORM_PRIORITY);
		BSP.output.println("maximum: "+MAX_PRIORITY);
	}
}

class SetPriority extends Thread
{
	public void run() 
	{
		for(int i=0;i<=5;i++)
		{
			BSP.output.println("Run Thread priority: "+Thread.currentThread().getPriority());
		}
	}
	public static void main(String[] args) 
	{
		SetPriority sp=new SetPriority();
		sp.setPriority(7);
		sp.start();
		for(int i=0;i<=5;i++)
		{
			BSP.output.println("main priority: "+Thread.currentThread().getPriority());
		}
	}
}

class SuspendThread extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			try
			{
				sleep(500);
				BSP.output.println(Thread.currentThread().getName());
			}
			catch(Exception e)
			{
				BSP.output.println(e);
			}
			BSP.output.println(i);
		}		
	}
	public static void main(String[] args) throws Exception
	{
		SuspendThread st=new SuspendThread();
		SuspendThread st1=new SuspendThread();
		SuspendThread st2=new SuspendThread();
		st.start();
		st1.start();

		for(int i=0;i<=5;i++)
		{
			BSP.output.println(Thread.currentThread().getName());
		}
	}
}

class JoinThread extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			BSP.output.println(Thread.currentThread().getName()+":"+i);
		}
	}
	public static void main(String[] args) 
	{
		JoinThread jt=new JoinThread();
		
		jt.start();
		try
		{
			jt.join();
		}
		catch(InterruptedException ie)
		{
			BSP.output.println("got interrupted");
		}
		for(int j=0;j<=6;j++)
		{
			BSP.output.println(Thread.currentThread().getName()+":"+j);
		}
	}
}

class SleepThread extends Thread
{
	public void run()
	{
		for (int i=0;i<=5;i++)
		{
			try 
			{
				Thread.sleep(500);
			}
			catch(InterruptedException ie)
			{}
			BSP.output.println(Thread.currentThread().getName()+":"+i);
		}
	}
	public static void main(String[] args) throws Exception
	{
		SleepThread st=new SleepThread();

		st.start();		

		for (int i=0;i<=5;i++)
		{
			try
			{
				st.interrupt();
			}
			catch(Exception e)
			{
				BSP.output.println("interrupted");
			}
			BSP.output.println(Thread.currentThread().getName()+":"+i);
		}
	}
}

class MultiJoinThread extends Thread
{
	public void run()
	{
		for (int i=0;i<=3;i++) 
		{
			BSP.output.println(Thread.currentThread().getName()+":"+i);
		}
	}
	public static void main(String[] args) 
	{
		MultiJoinThread mt=new MultiJoinThread();
		MultiJoinThread mt1=new MultiJoinThread();
		MultiJoinThread mt2=new MultiJoinThread();

		mt2.start();

		try 
		{
			BSP.output.println(Thread.currentThread().getName()+":");
			mt2.join();
		}
		catch(Exception e)
		{

		}

		mt1.start();

		try 
		{
			BSP.output.println(Thread.currentThread().getName()+":");
			mt.join();
		}
		catch(Exception e)
		{

		}

		mt.start();

		try 
		{
			mt.sleep(500);
			BSP.output.println(Thread.currentThread().getName()+":");
			mt1.join();
		}
		catch(Exception e)
		{

		}

	}
}

class MultipleJoinThread extends Thread
{	
	static Thread t;
	public void run()
	{
		for (int i=0;i<=5;i++) 
		{
			try 
			{
				t.join();
				//BSP.output.println(Thread.currentThread().getName()+":"+i);
			}	
			catch(Exception e)
			{

			}
			BSP.output.println(Thread.currentThread().getName()+":"+i);
		}
	}
	public static void main(String[] args) throws Exception
	{
		MultipleJoinThread mjt=new MultipleJoinThread();
		MultipleJoinThread mjt1=new MultipleJoinThread();

		mjt.start();
		MultipleJoinThread.t=Thread.currentThread();

		for(int i=0;i<=7;i++)
		{
			BSP.output.println(Thread.currentThread().getName()+":"+i);
		}
	}
}

class DeadLockThread extends Thread
{
	static Thread t;
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			try 
			{
				t.join();
				BSP.output.println(Thread.currentThread().getName()+":"+i);
			}	
			catch(Exception e)
			{

			}
			BSP.output.println(Thread.currentThread().getName()+":"+i);
		}
	}
	public static void main(String[] args) throws Exception
	{
		DeadLockThread dlt=new DeadLockThread();

		dlt.start();
		DeadLockThread.t=Thread.currentThread();

		for(int i=0;i<=5;i++)
		{
			BSP.output.println(Thread.currentThread().getName()+":"+i);
			dlt.join();
		}
	}
}

class DaemonThread extends Thread
{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			BSP.output.println("Daemon Thread work");
		}
		else 
		{
			BSP.output.println("User Thread work");
		}
	}
	public static void main(String[] args) throws Exception
	{
		DaemonThread dt=new DaemonThread();
		DaemonThread dt1=new DaemonThread();

		dt.setDaemon(true);

		dt.start();
		dt1.start();
	}
}

class MainClass 
{
    public static void main(String args[]) 
    {
        MyThread myThread = new MyThread();   
        myThread.setDaemon(true);
        myThread.start();
        
        try 
        {
            Thread.sleep(5000);
        } catch (InterruptedException ignored) 
        {

        }
        System.out.println("Main thread finished");
    }
}
    
class MyThread extends Thread
{
    public void run() 
    {
        while (true) 
        {
        	System.out.println("Daemon thread is running");
        	try 
        	{
               Thread.sleep(500);
            } 
            catch (InterruptedException ignored) 
            {

            }
        }
    }
}


class Synchronization 
{
	public static void main(String[] args) {
		Task t=new Task();
		MyThreadTask m=new MyThreadTask(t,"Vikas");
		MyThreadTask m1=new MyThreadTask(t,"Bhoopendra");

		m1.start();
		m.start();
		//m1.start();     //IllegalThreadStateException
	}
}

class MyThreadTask extends Thread
{
	String name;
	Task t;

	MyThreadTask(Task t,String name)
	{
		this.name=name;
		this.t=t;
	}

	public void run()
	{
		try{
			t.doTask(name);
		}catch(Exception e){}
	}
}

class Task
{
	synchronized static void doTask(String name) throws Exception
	{
		for(int i=0;i<=5;i++)
		{
			BSP.output.println(Thread.currentThread().getName()+":" +name);
		}
	}
}