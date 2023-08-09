class Node
{
	private Object data;
	private Node next;
	private int size;
	Node(Object data)
	{
		this.data=data;
	}
	public void setData(Object data)
	{
		this.data=data;
	}
	public void setNext(Node next)
	{
		this.next=next;
	}
	public Object getData()
	{
		return data;
	}
	public Node getNext()
	{
		return next;
	}
}

class LinkList
{
	Node start,last;
	int size;
	LinkList()
	{
		start=last=null;
		size=0;
	}

	public void addFirst(Object val)
	{
		Node n=new Node(val);
		if(start==null)
		{
			start=last=n;
		}
		else 
		{
			n.setNext(start);
			start=n;
		}
		size++;
	}

	public void addLast(Object val)
	{
		Node n=new Node(val);
		if(start==null)
		{
			start=last=n;
		}
		else 
		{
			last.setNext(n);
			last=n;
		}
		size++;
	}

	public Object getFirst()
	{
		if(start==null)
			return "[]";
		return start.getData();
		
	}

	public Object getLast()
	{
		if(last==null)
			return "[]";
		return last.getData();		
	}

	public void removeLast()
	{
		Node t=start;
		while(t.getNext().getNext()!=null)
		{
			t=t.getNext();
		}
		t.setNext(null);
		last=t;
	}

	public void removeFirst()
	{
		start=start.getNext();
	}

	public Object get(int index)
	{
		if(index<0||index>=size)
		{
			return "[]";
		}
		Node t =start;
		while(index!=0)
		{	
			t=t.getNext();	
			index--;
		}
		return  t.getData();		
	}

	public void set(int index,Object obj)
	{
		if(index<0||index>=size+1)
		{
			return;
		}
		Node t =start;
		while(index!=0)
		{	
			t=t.getNext();	
			index--;
		}
		t.setData(obj);		
	}

	public void remove(int index)
	{
		if(index<0||index>=size)
		{
			return;
		}
		if(index==0)
		{
			removeFirst();
			return;
		}
		Node t =start;
		while((index-1)!=0)
		{	
			t=t.getNext();
			index--;
		}
		if(t.getNext()!=null)
		{
			t.setNext(t.getNext().getNext());
		}
	}

	public void add(int index,Object obj)
	{
		if(index<0||index>=size+1)
		{
			return;
		}
		if(index==0)
		{
			addFirst(obj);
			return;
		}
		Node t =start;
		Node n=new Node(obj);
		while(index-1!=0)
		{	
			t=t.getNext();	
			index--;
		}
		n.setNext(t.getNext());
		t.setNext(n);
	}

	public int lastIndexOf(Object obj)
	{
		Node t=start;
		int i=-1;
		int f=0;
		while (t!=null) 
		{
			i++;
			if(obj==t.getData())	
				f=i;
			t=t.getNext();
		}
		if(f!=0)
		{
			return f;
		}
		return i;
	}

	public boolean contains(Object obj)
	{
		Node t=start;
		while(t!=null)
		{
			if(obj==t.getData())
				return true;
			t=t.getNext();
		}
		return false;
	}

	public int indexOf(Object obj)
	{
		Node t=start;
		int i=-1;
		while (t!=null) 
		{
			i++;
			if(obj==t.getData())	
				return i;
			t=t.getNext();
		}
		return i;
	}

	public void clear()
	{
		start=last=null;
		size=0;
	}

	public void reverse()
	{
		Node curr=start,pre=null,next=null;

		while(curr!=null)
		{
			next=curr.getNext();
			curr.setNext(pre);
			pre=curr;
			curr=next;
		}
		start=last;
		last=pre;
	}

	public String toString()
	{
		if(start==null)
		{
			return "[]";
		}
		String s="";
		Node t=start;
		while(t!=null)
		{
			s=s+","+t.getData();
			t=t.getNext();
		}
		s="["+s.substring(1)+"]";
		return s;
	}
}

class TestB
{
	public static void main(String[] args) {
		LinkList l=new LinkList();
		l.addFirst(10);
		l.addFirst(20);
		l.addFirst(30);
		l.addFirst(40);
		l.addFirst(20);
		l.addFirst(20);
		l.addFirst(50);
		l.addFirst(30);

		l.reverse();
		BSP.output.println(l);
		// BSP.output.println(l.lastIndexOf(20));
		// BSP.output.println(l.getFirst());
		// BSP.output.println(l.getLast());
		// BSP.output.println(l);
	}
}