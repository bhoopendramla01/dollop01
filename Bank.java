class Customer extends Thread
{
	ServicePoint sp;

	Customer(ServicePoint obj)
	{
		this.sp=obj;
	}
	public void run()
	{
		try 
		{
			sp.debitBalance();
		}
		catch(Exception e){}
	}
}

class Bank 
{
	public static void main(String[] args) {
		ServicePoint sp=new ServicePoint();
		Customer c=new Customer(sp);
		Customer c1=new Customer(sp);

		c.start();
		c1.start();	
	}
}

class ServicePoint
{
	synchronized static void debitBalance() throws Exception
	{
		if(checkUser())
		{
			
		}
	}

	public boolean checkUser()
	{
		while()
	}
}
