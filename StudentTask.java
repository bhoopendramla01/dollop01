import java.io.*;
class StudentB implements Serializable
{
	int rollNo;
	String name;
	String address;
}

class STDB extends StudentB
{
	int fee;
	STDB(int r,String n,String a,int f)
	{
		super.rollNo=r;
		super.name=n;
		super.address=a;
		this.fee=f;
	}
	public static void main(String[] args) throws Exception
	{
		STDB std[]=new STDB[5];
		std[0]=new STDB(100,"Bhoopendra","Chitrakoot",12345);
		std[1]=new STDB(101,"Vikas     ","Newari    ",12346);
		std[2]=new STDB(102,"Nikhil    ","Maheshwar ",12347);
		std[3]=new STDB(103,"Goatam    ","Indore    ",12348);
		std[4]=new STDB(104,"Akash     ","Indore    ",12349);
		FileOutputStream fos=new FileOutputStream("std1.obj");
		ObjectOutputStream oos=new ObjectOutputStream(fos);

		oos.writeObject(std);
		oos.close();
	}
}

class CheckB
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fis=new FileInputStream("std1.obj");
		ObjectInputStream ois=new ObjectInputStream(fis);

		STDB std2[]=(STDB[])ois.readObject();

		for(int i=0;i<std2.length;i++)
		{
			BSP.output.print(std2[i].rollNo+"\t");
			BSP.output.print(std2[i].name+"\t");
			BSP.output.print(std2[i].address+"\t");
			BSP.output.print(std2[i].fee+"\t");
			BSP.output.println();
		}
	}
}