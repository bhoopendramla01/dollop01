class Node
{
	Object data;
	Node pre;

	Node(Object data)
	{
		this.data=data;
	}

	public Object getData()
	{
		return data;
	}

	public void setData(Object data)
	{
		this.data=data;
	}

	public void setPre(Node pre)
	{
		this.pre=pre;
	}

	public Node getPre()
	{
		return pre;
	}
}

class StackBK
{
	Node top;
	StackBK()
	{
		this.top=null;
	}

	public void push(Object obj)
	{
		Node n=new Node(obj);
		if(top==null)
		{
			top=n;
		}
		else 
		{
			n.setPre(top);
			top=n;
		}
	}

	public Object peak()
	{
		if(top==null)
		{
			return null;
		}
		return top.getData();
	}

	public Object pop()
	{
		if(top==null)
		{
			return null;
		}
		else
		{
			Object obj=top.getData();
			top=top.getPre();
			return obj;
		}
	}

	public void reverse()
	{
		Node curr=top,pre=null,next=null;
		while(curr!=null)
		{
			next=curr.getPre();
			curr.setPre(pre);
			pre=curr;
			curr=next;
		}
		top=pre;
	}

	public String toString()
	{
		if(top==null)
		{
			return null;
		}
		String s="";
		Node t=top;
		while(t!=null)
		{
			s=s+","+t.getData();
			t=t.getPre();
		}
		return "["+s.substring(1)+"]";
	}
}

class TestB
{
	public static void main(String[] args) 
	{
		StackBK s=new StackBK();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);

		// s.reverse();
		BSP.output.println(s);
	}
}