import java.util.*;
public class MyStack<T>
{
	private int top;
	private int cap;
	private Object stack[];

	public MyStack()
	{
		this(5);
	}

	public MyStack(int cap)
	{
		this.top=-1;
		this.cap=cap;
		stack=new Object[cap];
	}

	public void increase(int cap)
	{
		Object stk[]=new Object[cap];
		for (int i=0;i<=top;i++) 
		{
			stk[i]=stack[i];
		}
		stack=stk;		
	}

	public void push(T obj)
	{
		if(top==cap-1)
		{
			cap+=5;
			increase(cap);
		}
		stack[++top]=obj;
	}

	public Object peak()
	{
		if(top==-1)
			return null;
		return stack[top];
	}

	public Object pop()
	{
		if(top==-1)
			return null;
		return stack[top--];		
	}

	public void empty()
	{
		stack=null;
		top=-1;
		cap=5;
	}

	public void show()
	{
		for(int i=0;i<=top;i++)
		{
			BSP.output.print(stack[i]+" ");
		}
	}
}

class TestB
{
	public static void main(String[] args) {
		MyStack<Number> m=new MyStack<Number>();

		m.push(10);
		m.push(10);
		m.push(20.5);
		m.push(20);
		m.push(30);
		m.push(30.23314);
		m.push(50);

		BSP.output.println(m.peak());
		BSP.output.println(m.pop());
		m.push(60);
		m.push(70.5);
		BSP.output.println(m.peak());
		m.show();
	}
}