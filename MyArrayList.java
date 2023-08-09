public class MyArrayList
{	
	private Object array[];
	private int size;
	private int capacity;
	private boolean isUnique=false;
	MyArrayList()
	{
		this(5);
	}
	MyArrayList(int capacity)
	{
		this.size=-1;
		this.capacity=capacity;
		array=new Object[capacity];
	}

	MyArrayList(MyArrayList al)
	{
		this();
		addAll(al);
	}

	MyArrayList(boolean isUnique)
	{
		this();
		this.isUnique=isUnique;
	}

	public void add(Object obj)
	{
		if(isUnique && indexOf(obj)!=-1)
		{
			return;
		}
		else 
		{
			if(size==capacity-1)
			{
				capacity+=5;
				increase(capacity);
			}
			array[++size]=obj;
		}
	}

	public void increase(int capacity)
	{
		Object val[]=new Object[capacity];
		for (int i=0;i<=size;i++) 
		{
			val[i]=array[i];
		}
		array=val;		
	}

	public int size()
	{
		return size+1;
	}

	public int getCapacity()
	{
		return capacity;
	}

	public Object get(int index)
	{
		if(index>=0&&index<=size)
		{
			return array[index];
		}
		return null;
	}

	public void addAll(MyArrayList ob)
	{
		int val=ob.size();
		for(int i=0;i<val;i++)
		{
			Object obj=ob.get(i);
			add(obj);
		}
	}

	public int indexOf(Object val)
	{
		for(int i=0;i<=size;i++)
		{
			if(val.equals(array[i]))
			{
				return i;
			}
		}
		return -1;
	}

	public int lastIndexOf(Object val)
	{
		for(int i=size;i>=0;i--)
		{
			if(val.equals(array[i]))
			{
				return i;
			}
		}
		return -1;
	}

	public boolean contains(Object obj)
	{
		return indexOf(obj)!=-1;
	}

	public MyArrayList iscontainsAll(MyArrayList m1)
	{
		int val=m1.size();
		int j=0;
		MyArrayList ma=new MyArrayList();
		for(int i=0;i<val;i++)
		{
			Object obj=m1.get(i);
			if(indexOf(obj)!=-1)
			{
				ma.add(obj);
			}
		}
		return ma;
	}

	public boolean containsAll(MyArrayList m1)
	{
		int val=m1.size();
		int j=0;
		for(int i=0;i<val;i++)
		{
			Object obj=m1.get(i);
			if(indexOf(obj)==-1)
			{
				return false;
			}
		}
		return true;
	}

	public boolean retains(Object obj)
	{
		return indexOf(obj)==-1;
	}

	public MyArrayList isretainAll(MyArrayList m1)
	{
		int val=m1.size();
		int j=0;
		MyArrayList ma=new MyArrayList();
		for(int i=0;i<val;i++)
		{
			Object obj=m1.get(i);
			if(indexOf(obj)==-1)
			{
				ma.add(obj);
			}
		}
		return ma;
	}

	public boolean retainAll(MyArrayList m1)
	{
		int val=m1.size();
		for(int i=0;i<val;i++)
		{
			Object obj=m1.get(i);
			if(indexOf(obj)==-1)
			{
				for(int j=i;j<=size;j++)
				{
					array[j]=array[j+1];
				}
				size--;
			}
		}
		return true;
	}

	public void clear()
	{
		capacity=5;
		array=new Object[capacity];
		size=-1;
	}

	public void add(int index,Object obj)
	{
		if(index>=0&&index<=size)
		{
			for(int i=0;i<=size;i++)
			{
				if(index==i)
				{
					capacity+=5;
					increase(capacity);
					size++;
					for(int j=size+1;j>=i;j--)
					{
						if(j!=0){
							array[j]=array[j-1];
						}
					}
					array[i]=obj;
				}
			}
		}
		else
		{
			if(index==size+1)
			{
				capacity+=5;
				increase(capacity);
				array[++size]=obj;
			}
		}
	}

	public void set(int index,Object obj)
	{
		if(index>=0&&index<=size)
		{
			for(int i=0;i<=size;i++)
			{
				if(index==i)
				{	
					array[i]=obj;
				}
			}
		}
	}

	public MyArrayList clone()
	{
		MyArrayList m2=new MyArrayList();

		for(int i=0;i<=size;i++)
		{
			m2.add(array[i]);
		}
		return m2;
	}

	public void remove(Object obj)
	{
		for(int i=0;i<=size;i++)
		{
			if(obj.equals(array[i]))
			{
				for(int j=i;j<=size;j++)
				{
					array[j]=array[j+1];
				}
				i--;size--;
			}
		}
	}

	public void removeIndex(int index)
	{
		if(index>=0&&index<=size)
		{
			for(int j=index;j<=size;j++)
			{
				array[j]=array[j+1];
			}
			size--;
		}
	}

	public MyArrayList trim(int index)
	{
		MyArrayList m3=new MyArrayList();
		if(index>=0&&index<=size)
		{
			for(int i=index;i<=size;i++)
			{
				m3.add(array[i]);
			}
		}
		return m3;
	}

	public MyArrayList trim(int startIndex,int lastIndex)
	{
		MyArrayList m4=new MyArrayList();
		if(startIndex>=0&&lastIndex<=size)
		{
			for(int i=startIndex;i<=lastIndex;i++)
			{
				m4.add(array[i]);
			}
		}
		return m4;
	}

	public String toString()
	{
		String s="";
		for(int i=0;i<=size;i++)
		{
			s=s+", "+array[i];
		}
		if(size==-1)
			return "[]";

		return "["+s.substring(2)+"]";
	}
}

class TestB
{
	public static void main(String[] args) 
	{
		BSP.output.println("*** MyArrayList Class created by: Bhoopendra Singh Dollop ***\n");
		BSP.output.println("*************************************************************\n");
		
		MyArrayList m=new MyArrayList();
		m.add(10);
		m.add(20);
		m.add(30);
		m.add(40);
		m.add(50);
		m.add(60);

		m.remove(60);
		m.removeIndex(3);

		BSP.output.println(m);
	}
}