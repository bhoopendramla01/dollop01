import java.util.Scanner;
import java.io.*;
class FibonacciSeries
{
	static int a=0,b=1,c=0;
	public static void fibonacciSeries()
	{
		System.out.print(a+" "+b+" ");
		for(int i=3;i<=10;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");		
		}
	}
	public static void main(String[] args) 
	{
		FibonacciSeries fs=new FibonacciSeries();
		fs.fibonacciSeries();
	}
}

class PrimeNumber
{
	static int n=13;
	public static void primeNumber(int n)
	{
		int f=0;
		for(int i=1;i<=n;i++)
		{
			if(i!=1&&i!=n)
			{
				if(n%i==0)
				{
					f=1;
					System.out.println("Given Number is not PrimeNumber");
					break;
				}
			}
		}
		if(f==0)
		{
			System.out.println("Given Number is PrimeNumber");
		}
	}
	public static void main(String[] args) 
	{
		primeNumber(n);
	}
}

class Palindrome
{
	public static void palindrome(String str)
	{
		int start=0,last=str.length()-1,f=0;
		while(start<last)
		{
			if(str.charAt(start)!=str.charAt(last))
			{
				f=1;
				System.out.println("Given String is not Palindrome");
				break;
			}
			start++;
			last--;			
		}
		if(f==0)
		{
			System.out.println("Given String is PrimeNumber");
		}
	}
	public static void main(String[] args) 
	{
		String str="NAMAN";
		palindrome(str);
	}
}

class FactorialNum
{
	public static void factorialNum(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Given Number Factorial= "+fact);
	}
	public static void main(String[] args)
	{
		int n=5;
		factorialNum(n);
	}
}

class ArmstrongNum
{
	public static int countDigit(int n)
	{
		int count=0;
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		return count;
	}
	public static int power(int n,int pow)
	{
		int m=1;
		for(int i=1;i<=pow;i++)
		{
			m=m*n;
		}
		return m;
	}
	public static void main(String[] args) 
	{
		int n=153,r,sum=0;
		int t=n;
		int c=countDigit(n);
		while(n!=0)
		{
			r=n%10;
			sum=sum+power(r,c);
			n=n/10;
		}
		if(sum==t)
			System.out.println("Given Number is ArmstrongNum");
		else 
			System.out.println("Given Number is not ArmstrongNum");
	}
}

class ReverseNum
{
	public static void reverseNum(int n)
	{
		int rev=0,r;
		while (n!=0) 
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;	
		}
		System.out.println(rev);
	}
	public static void main(String[] args) 
	{
		int n=1234;
		reverseNum(n);
	}
}

class AutomorphicNum
{
	public static void automorphicNum(int n)
	{
		int squ=n*n;
		int f=0;
		while (n>0) 
		{
			if(n%10!=squ%10)
			{	
				f=1;
				System.out.println("Number is not automorphicNum");
				break;
			}
			n=n/10;
			squ=squ/10;
		}
		if(f==0)
		{
			System.out.println("Number is automorphicNum");
		}
	}
	public static void main(String[] args) 
	{
		int n=76;
		automorphicNum(n);
	}
}

// class Change{
// 	public static void main(String[] args) {
// 		//Integer a=10;
// 		//int b=a.intValue();   		   //Integer wrapper class to int primitive data type
// 		//String s=a.toString();		   //Integer wrapper class to String
// 		//String str="50";
// 		//int n=Integer.parseInt(str);	   //String to primitive int
// 		//Integer si=Integer.valueOf(str);   //
// 		//int n=40;
// 		//String s1=Integer.toString(n);		//primitive int to String
// 		//Integer bk=n;							//primitive
// 			//System.out.println(bk);
// 	}
// }


class Hello{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}

class SumSubMulDiv{
	public static void sumSubMulDiv(int a,int b){
		System.out.println("Given Number sum="+(a+b));
		System.out.println("Given Number sub="+(a-b));
		System.out.println("Given Number mul="+(a*b));
		System.out.println("Given Number div="+(a/b));
	}
	public static void main(String[] args) {
		SumSubMulDiv obj=new SumSubMulDiv();
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		obj.sumSubMulDiv(a,b);
	}
}

class MaxMin{
	public static void maxMin(int a,int b){
		if(a>b)
			System.out.println("a is max Number: "+a);
		else 
			System.out.println("b is max Number: "+b);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		maxMin(a,b);
	}
}

class Table{
	public static void table(int n1,int n2){
		for(int i=1;i<=10;i++){
			for(int j=n1;j<=n2;j++){
				System.out.print("\t"+(i*j));
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		table(n1,n2);
	}
}

class BKSingh{
	public static void main(String[] args) {
		int []n={5,4,5,6,7,8};
		try{
			for(int i=0;i<=8;i++){
				System.out.println(n[i]);
			}
		} catch(Exception e)
		{

		}
	}
}


class CheckException{
	public static void main(String[] args)throws Exception {
		int a=10;
		int b=0;
		try{
			System.out.println(a/b);

		}catch(Exception e){
			System.out.println("Succ");
			// e.printStackTrace();
			// System.out.println(e.toString());
			// System.out.println(e.getMessage());
		}
	}
}

class Singleton{
	private static Singleton obj;
	private Singleton()
	{

	}
	public static Singleton getobj()
	{
		if(obj==null)
			obj=new Singleton();
		return obj;
	}
}

class BSingh{
	public static void main(String[] args) {
		System.out.println(Singleton.getobj());
		System.out.println(Singleton.getobj());
		System.out.println(Singleton.getobj());
	}
}


class ArmstrongBetweenTwoNumbers {
   public static void main(String args[]){
      int num1=1;
      int num2=1000;
      // Scanner sc = new Scanner(System.in);
      // System.out.println("Enter the first number ::");
      // num1 = sc.nextInt();
      // System.out.println("Enter the second number ::");
      // num2 = sc.nextInt();

      for (int i = num1; i<num2; i++){
         int check, rem, sum = 0;
         check = i;
         while(check != 0) {
            rem = check % 10;
            sum = sum + (rem * rem * rem);
            check = check / 10;
         }
         if(sum == i){
            System.out.println(""+i+" is an Armstrong number.");
         }
      }
   }
}


 

enum Color {
	RED,
	GREEN,
	BLUE;
}

class TestB {
	public static void main(String[] args)
	{
		Color c1 = Color.RED;
		c1 = Color.GREEN;

		System.out.println(c1);
	}
}


class ForNameMethod{
	public static void main(String[] args) throws Exception {
		Class c=Class.forName(args[0]);
		Object obj=c.newInstance();
	}
}

class A{
	static{
		System.out.println("static A");
	}
}

class B{
	static{
		System.out.println("static B");
	}
}

class FileHandling{
	public static void main(String[] args) throws Exception {
		File f=new File("abc.txt");
		if(f.exists())
		{
			if(f.isFile())
				System.out.println("File is exists");
			else 
				System.out.println("Folder is exists");
		}
		else {
			f.mkdir();
			f.createNewFile();
			System.out.println("new File is create");
		}
	}
}

class GetName{
	public static void main(String[] args) {
		File f=new File("abc.txt");
		System.out.println(f.getName());
	}
}

class CanExecute{
	public static void main(String[] args) {
		File f=new File("abc.txt");
		System.out.println(f.canExecute());
	}
}

class CanWrite{
	public static void main(String[] args) {
		File f=new File("abc.txt");
		System.out.println(f.canWrite());
	}
}

class CanRead{
	public static void main(String[] args) {
		File f=new File("abc.txt");
		System.out.println(f.canRead());
	}
}

class Length{
	public static void main(String[] args) {
		File f=new File("abc.txt");
		System.out.println(f.length());
	}
}

class GetFreeSpace{
	public static void main(String[] args) {
		File f=new File("abc.txt");
		System.out.println(f.getFreeSpace());
	}
}


class GetParent{
	public static void main(String[] args) {
		File f=new File("c:\\BKSINGH\\abc.txt");
		System.out.println(f.getParent());
	}
}

class List{
	public static void main(String[] args) {
		File f=new File("c:\\BKSINGH");
		String a[]=f.list();
		for(String n:a)
			System.out.println(n);
	}
}

class CreateTempFile{
	public static void main(String[] args) throws Exception{
		File f=File.createTempFile("abcd",null);
		System.out.println(f.getName());	
	}
}

class Delete{
	public static void main(String[] args) {
		File f=new File("abc.txt");
		System.out.println(f.delete());
	}
}

class Equals{
	public static void main(String[] args) {
		File f1=new File("abc.txt");
		File f2=f1;
		File f3=new File("abc2.txt");
		boolean bk;
		bk=f1.equals(f2);
		System.out.println(bk);
		bk=f1.equals(f3);
		System.out.println(bk);
	}
}

class Folder{
	public static void main(String[] args) {
		File f=new File("abc.txt");
		if(f.exists())
		{
			if(f.isDirectory())
				System.out.println("Folder");
			else 
				System.out.println("File");
		}
		else {
			f.mkdir();
			System.out.println("new Folder create");
		}
	}
}

class Pattern{
	public static void main(String[] args) {
		int a[][]=new int [4][4];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				BSP.output.print("*");
			}
			BSP.output.println();
		}
	}
}

class Check{
	public static void main(String[] args) {
		BSP.output.println("Hello");
	}
}

class Exercise{
    public static void main(String[] args)
    {
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");
    }
}
	
class Exercise1{
	static int s=5;
	public static void xyz()
	{
		int a;
		a=s++;
		BSP.output.print(a+" "+s+" ");
		if(a<=7)
		{
			xyz();
			BSP.output.print(a+" "+s+" ");
		}
	}
	public static void main(String[] args) {
		xyz();
		xyz();
	}
}

class Help{
	public static void main(String[] args) {
		String s="Hello";
		String s1="Hi";
		System.out.println(s);
		System.out.println(s1);
	}
}