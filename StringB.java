class AppendString
{
	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("Hello");

		sb.append(" World");	//do string ko add karna
		BSP.output.println(sb);
	}
}	

class LengthString
{
	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("Hello Dollop");

		BSP.output.println(sb.length());	//string ke total character
	}
}

class CapacityString
{
	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("Hello Dollop");

		BSP.output.println(sb.capacity());		//string ki capacity find karna
	}
}

class CharAtString
{
	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("Hello Dollop");

		BSP.output.println(sb.charAt(6));	//kisi index ka character found karna
	}
}

class DeleteString
{
	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("Hello Dollop");

		sb.delete(0,5);				//kisi length ki string delete karna
		BSP.output.println(sb);
	}
}

class DeleteCharString
{
	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("Hello Dollop");

		sb.deleteCharAt(6);			//koi ek character delete karna
		BSP.output.println(sb);
	}
}

class InsertString
{
	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("Hello  Dollop");

		sb.insert(6,"My company");		//kisi position par string insert karna
		BSP.output.println(sb);
	}
}

class ReverseString
{
	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("Hello Dollop");

		sb.reverse();					//string ko reverse karna
		BSP.output.println(sb);
	}
}

class ReplaceString
{
	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("Hello Dollop");

		sb.replace(6,12,"World...");		//kisi string ko replace karna
		BSP.output.println(sb);
	}	
}