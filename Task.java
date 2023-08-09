import java.io.*;
class Task
{
	public static void main(String[] args)throws Exception 
	{
		PrintStream ps=new PrintStream("a.txt");
		PrintStream ps1=new PrintStream("b.txt");
		ps.println("111");
		ps.println("222");
		ps.println("333");
		ps.println("555");
		ps.println("888");
		ps1.println("111");
		ps1.println("333");
		ps1.println("444");
		ps1.println("555");
		ps1.println("666");
		ps1.println("777");
		ps1.println("888");
		ps1.println("999");
	}
}

class Concat
{
	public static void writeFile(String file) throws Exception
	{
		FileWriter fw=new FileWriter("output.txt",true);
		FileReader fr=new FileReader(file);
		int a=fr.read();
		while(a!=-1)
		{
			fw.write(a);
			a=fr.read();
		}
		fw.close();
	}
	public static void main(String[] args) throws Exception 
	{
		writeFile("a.txt");
		writeFile("b.txt");
	}
}

class Same
{
	public static void main(String[] args) throws Exception 
	{
		FileReader fr=new FileReader("output.txt");
		BufferedReader br=new BufferedReader(fr);
		FileReader fr1=new FileReader("output.txt");
		BufferedReader br1=new BufferedReader(fr1);
		PrintStream ps=new PrintStream("commonOutput.txt");
		String s=br.readLine();
		int a=0,count=0;
		while(s!=null)
		{
			count++;
			s=br.readLine();
		}
		int output[]=new int[count];
		String s1=br1.readLine();
		while(s1!=null)
		{
			output[a++]=Integer.parseInt(s1);
			s1=br1.readLine();
		}
		for(int i=0;i<output.length;i++)
		{
			for(int j=i+1;j<output.length;j++)
			{
				if(output[i]==output[j])
					ps.println(output[i]);
			}
		}
		ps.close();
		BSP.output.println("Success");
	}
}

class NotCommon
{
	public static void main(String[] args) throws Exception 
	{
		FileReader fr=new FileReader("output.txt");
		BufferedReader br=new BufferedReader(fr);
		FileReader fr1=new FileReader("output.txt");
		BufferedReader br1=new BufferedReader(fr1);
		PrintStream ps=new PrintStream("NotCommonOutput.txt");
		String s=br.readLine();
		int a=0,count=0;
		while(s!=null)
		{
			count++;
			s=br.readLine();
		}
		int output[]=new int[count];
		String s1=br1.readLine();
		while(s1!=null)
		{
			output[a++]=Integer.parseInt(s1);
			s1=br1.readLine();
		}
		int temp=0;
		for(int i=0;i<output.length;i++)
		{
			for(int j=0;j<output.length;j++)
			{
				if(j!=i)
				{
					if(output[i]==output[j])
					{
						temp=1;
						break;
					}
				}
			}
			if(temp==0)
			{
				ps.println(output[i]);
			}
			else 
				temp=0;

		}
		ps.close();
		BSP.output.println("Success");
	}
}