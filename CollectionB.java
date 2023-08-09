import java.util.*;
class Test
{
	public static void main(String[] args) 
	{
		Stack al=new Stack();
		al.push(10);
		al.push(20);
		al.push(30);
		al.push(40);
		al.push(50);
		al.push(60);

		Enumeration e=al.elements();
		while(e.hasMoreElements())
		{
			BSP.output.println(e.nextElement());
		}
	}
}

