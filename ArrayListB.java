import java.util.*;

class ArrayListB
{
	Object array[];
	int size;
	int capacity;
	boolean isUnique=false;

	ArrayListB()
	{
		this(5);
	}

	ArrayListB(int capacity)
	{
		this.capacity=capacity;
		this.size=-1;
		array=new Object[capacity];
	}

	ArrayListB(ArrayListB ab)
	{
		this();
		addAll(ab);
	}

	ArrayListB(boolean isUnique)
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
		for(int i=0;i<=size;i++)
		{
			val[i]=array[i];
		}
		array=val;
	}

	public int indexOf(Object obj)
	{
		for(int i=0;i<=size;i++)
		{
			if(obj.equals(array[i]))
				return i;
		}
		return -1;
	}

	public int getCapacity()
	{
		return capacity;
	}

	public int size()
	{
		return size+1;
	}

	public void set(int index,Object obj)
	{
		if(index<0 || index>size)
		{
			return;
		}
		else
		{
			array[index]=obj;
		}
	}

	public Object get(int index)
	{
		if(index<0 || index>size)
		{
			return null;
		}
		for(int i=0;i<=size;i++)
		{
			if(i==index)
				return array[i];
		}
		return null;
	}

	public boolean contains(Object obj)
	{
		for(int i=0;i<=size;i++)
		{
			if(indexOf(obj)!=-1)
				return true;
		}
		return false;
	}

	public boolean containAll(ArrayListB ab)
	{
		for(int i=0;i<ab.size();i++)
		{
			Object obj=ab.get(i);
			if(indexOf(obj)==-1)
				return false;
		}
		return true;
	}

	public boolean retainAll(ArrayListB ab)
	{
		for(int i=0;i<ab.size();i++)
		{
			Object obj=ab.get(i);
			if(indexOf(obj)==-1)
				remove(obj);
		}
		return true;
	}

	public boolean retain(Object obj)
	{
		for(int i=0;i<=size;i++)
		{
			if(indexOf(obj)==-1)
				return true;
		}
		return false;
	}

	public int LastIndexOf(Object obj)
	{
		for(int i=size;i>=0;i--)
		{
			if(obj.equals(array[i]))
				return i;
		}
		return -1;
	}

	public void addAll(ArrayListB al)
	{
		int val=al.size();
		for(int i=0;i<val;i++)
		{
			Object obj=al.get(i);
			add(obj);
		}
	}

	public void add(int index,Object obj)
	{
		if(index>=0&&index<=size)
		{
			size++;
			capacity++;
			for(int i=size+1;i>=index;i--)
			{
				if(i!=0)
					array[i]=array[i-1];
			}
			set(index,obj);
		}
		else if(index==size+1)
		{
			capacity++;
			array[++size]=obj;
		}
	}

	public void remove(Object obj)
	{
		int i=indexOf(obj);
		if(i!=-1)
		{
			removeIndex(i);
		}
	}

	public void removeIndex(int index)
	{
		if(index>=0 && index<=size)
		{
			for(int j=index;j<=size;j++)
			{
				array[j]=array[j+1];
			}
			size--;
		}
	}

	public String toString()
	{
		if(size==-1)
		{
			return "[]";
		}
		String s="";
		for(int i=0;i<=size;i++)
		{
			s+=","+array[i];
		}
		return "["+s.substring(1)+"]";
	}
}

class TestB
{
	public static void main(String[] args) 
	{
		ArrayListB al=new ArrayListB(true);
		ArrayListB m=new ArrayListB();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(80);
		al.add(90);

		m.add(100);
		m.addAll(al);
		BSP.output.println(al.retainAll(m));
		al.remove(40);
		BSP.output.println(al);
	}
}