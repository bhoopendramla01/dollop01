import java.io.*;
class FileHandlingB {
	public static void main(String[] args) throws Exception{
		FileWriter fw=new FileWriter("BK.txt");
		fw.write("My mother is my Duniya");
		fw.write("\n");
		fw.write("Bhoopendra Singh");
		fw.write("\n");
		fw.write("Chitrakoot");
		fw.flush();
		System.out.println("Success");
	}
}

class Read{
	public static void main(String[] args) throws Exception{
		FileReader fr=new FileReader("BK.txt");
		int a=fr.read();
		while(a!=-1)
		{
			System.out.print((char)a);
			a=fr.read();
		}
	}
}

class Read1{
	public static void main(String[] args) throws Exception{
		FileReader fr=new FileReader("BK.java");
		int c=0;
		int a=fr.read();
		while(a!=-1)
		{
			c++;
			System.out.print((char)a);
			a=fr.read();
		}
		System.out.println("\nloop count= "+c);
	}
}

class Read2{
	public static void main(String[] args) throws Exception{
		FileReader fr=new FileReader("BK.java");
		char a[]=new char[100];
		int c=0;
		int b=fr.read(a);
		while(b!=-1)
		{
			c++;
			System.out.print(a);
			b=fr.read(a);
		}
		System.out.println("\nloop count= "+c);
	}
}

class Write1{
	public static void main(String[] args) throws Exception{
		FileWriter fw=new FileWriter("bk.txt1",true);
		BufferedWriter bw=new BufferedWriter(fw);

		bw.write(" Bhoopendra Singh Dollop");
		bw.close();
		System.out.println("Success");
	}
}

class ReadWrite{
	public static void main(String[] args) throws Exception {
		FileWriter fw=new FileWriter("con");
		FileReader fr=new FileReader("BK.java");
		int a=fr.read();
		while(a!=-1)
		{
			fw.write(a);
			a=fr.read();
		}
		fw.close();
	}
}

class BSP{
	static PrintStream output;
	static{
		try{
			output=new PrintStream("con");
		}
		catch(Exception e){			
		}
	}
}

class PrintS{
	public static void main(String[] args) throws Exception{
		PrintStream ps=new PrintStream("con");
		ps.println("My name is Sultan");
		ps.println(1000);
		ps.println('B');
		ps.print("Hy I'm Bhoopendra Singh Dollop");
		ps.println("Check A Process");
	}
}

class BReadWrite{
	public static void main(String[] args) throws Exception{
		FileWriter fw=new FileWriter("con");
		BufferedWriter bw=new BufferedWriter(fw);
		FileReader fr=new FileReader("BK.java");
		BufferedReader br=new BufferedReader(fr);
		String s=br.readLine();
		while(s!=null)
		{
			fw.write(s);
			s=br.readLine();
			System.out.println();
		}
		br.close();
	}
}

class Student implements Serializable{
	String name="Bhoopendra Singh Dollop";
	transient int id=12231;
}

class Check{
	public static void main(String[] args) throws Exception {
		FileOutputStream fos=new FileOutputStream("std.obj");
		ObjectOutputStream oos=new ObjectOutputStream(fos);

		Student std=new Student();
		oos.writeObject(std);
		oos.close();
	}
}

class Check1{
	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("std.obj");
		ObjectInputStream ois=new ObjectInputStream(fis);

		Student std=(Student)ois.readObject();
		BSP.output.println(std);   
		BSP.output.println(std.name);
		BSP.output.println(std.id);
	}
}

class Pic{
	public static void main(String[] args) throws Exception {
		File f=new File("bbbbb.jpg");
		FileInputStream fis=new FileInputStream(f);
		FileOutputStream fos=new FileOutputStream("ccc.jpg");
		byte b[]=new byte[(int)f.length()];
		fis.read(b);
		fos.write(b);

		fos.close();
	}	
}

class StudentT implements Serializable
{
	int rollNo;
	String name;
	String address;
	// StudentT(int r,String n,String a)
	// {
	// 	this.rollNo=r;
	// 	this.name=n;
	// 	this.address=a;
	// }
}

class STD extends StudentT{
	int fee;
	STD(int r,String n,String a,int f)
	{
		super.rollNo=r;
		super.name=n;
		super.address=a;
		this.fee=f;
	}
	public static void main(String[] args) throws Exception{
		STD std1=new STD(100,"Bhoopendra Singh","Chitrakoot",12345);
		
		// BSP.output.println(std.rollNo);
		// BSP.output.println(std.name);
		// BSP.output.println(std.address);
		//STD std3=new STD();
		FileOutputStream fos=new FileOutputStream("std1.obj");
		ObjectOutputStream oos=new ObjectOutputStream(fos);

		oos.writeObject(std1);
		oos.close();

	}
}

class CheckT{
	public static void main(String[] args) throws Exception{
		FileInputStream fis=new FileInputStream("std1.obj");
		ObjectInputStream ois=new ObjectInputStream(fis);

		STD std2=(STD)ois.readObject();
		BSP.output.println(std2.rollNo);
		BSP.output.println(std2.name);
		BSP.output.println(std2.address);
		BSP.output.println(std2.fee);

	}
}