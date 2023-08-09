import java.io.*;
class ShowFile{
	public static void showFile(String s1) throws Exception
	{
		File f=new File(s1);
		if(f.exists())
		{
			if(f.isDirectory())
			{
				String files[]=f.list();
				for(String s:files)
				{
					File f1=new File(f,s);
					if(f1.isDirectory())
					{
						// String files1[]=f1.list();
						// for(String s3:files1)
						// {
						showFile(s+"\\");
						// 	// System.out.println(s3+"->file");
						// }
					}
					else
					{
						System.out.println(s+"->file");
					}
				}
			}
			else 
				System.out.println(s1+"->file");
		}
	}
	public static void main(String[] args) throws Exception
	{
		showFile("C:\\BKSINGH");
	}
}