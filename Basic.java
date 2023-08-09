import java.util.Scanner;
import java.io.Console;
class Basic{
	public static void main(String[] args) {
		System.out.println("Hello");
	}
}

class SumOfNumber{
	public int sumOfNumber(int a,int b){
		return a+b;
	}
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		SumOfNumber sn=new SumOfNumber();
		System.out.println(sn.sumOfNumber(a,b));

	}
}

class Divide{
public int divideOfNumber(int a,int b){
		return a/b;
	}
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		Divide sn=new Divide();
		System.out.println(sn.divideOfNumber(a,b));

	}
}

class Operator{
	public static void main(String[] args) {
		System.out.println(-5+8*6);
		System.out.println((55+9)%9);
		System.out.println(20+-3*5/8);
		System.out.println(5+15/3*2-8%3);
	}
}

class ProductOfNumber{
	public int productOfNumber(int a,int b){
		return a*b;
	}
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		ProductOfNumber sn=new ProductOfNumber();
		System.out.println(sn.productOfNumber(a,b));

	}
}

class PerformTask{
	public int divideOfNumber(int a,int b){
		return a/b;
	}
	public int modOfNumber(int a,int b){
		return a%b;
	}
	public int productOfNumber(int a,int b){
		return a*b;
	}
	public int sumOfNumber(int a,int b){
		return a+b;
	}
	public int subOfNumber(int a,int b){
		return a-b;
	}
	public static void main(String[] args) {
		int a,b;
		PerformTask pt=new PerformTask();
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		Divide sn=new Divide();
		System.out.println("Divide of Two Number: "+pt.divideOfNumber(a,b));
		System.out.println("Mod of Two Number: "+pt.modOfNumber(a,b));
		System.out.println("Product Of Two Number: "+pt.productOfNumber(a,b));
		System.out.println("Sum of Two Number: "+pt.sumOfNumber(a,b));
		System.out.println("Subtract of Two Number: "+pt.subOfNumber(a,b));

	}
}

class Table{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=10;i++){
			System.out.println(n+"*"+i+"="+n*i);
		}
	}
}

class Circle{
	public void areaOfCircle(double radius){
		System.out.println(3.14*radius*radius);
	}
	public void perimeterOfCircle(double radius){
		System.out.println(2*3.14*radius);
	}
	public static void main(String[] args) {
			double radius=7.5;
			Circle c=new Circle();
			c.areaOfCircle(radius);
			c.perimeterOfCircle(radius);
		}	
}

class Average{
	public int average(int a,int b,int c){
		return (a+b+c)/3;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Average av=new Average();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println(av.average(a,b,c));

	}
}

class Rectangle{
	public double areaOfRectangle(double w,double h){
		return w*h;
	}
	public double perimeterOfRectangle(double w,double h){
		return 2*(w+h);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Rectangle r=new Rectangle();
		double width=sc.nextDouble();
		double height=sc.nextDouble();
		System.out.println(r.areaOfRectangle(width,height));
		System.out.println(r.perimeterOfRectangle(width,height));
	}
}

class SwapNumber{
	public void swapNumber(int a,int b){
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swaping a: "+a);
		System.out.println("after swaping b: "+b);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		SwapNumber sn=new SwapNumber();
		sn.swapNumber(a,b);
	}
}

class AddBinary
{
	public static void main(String[] args) 
	{
		long b1,b2;
		int i=0,r=0;
		int sum[]=new int [20];
		Scanner sc=new Scanner(System.in);
		System.out.println("Input first binary number: ");
		b1=sc.nextLong();
		System.out.println("Input second binary number: ");
		b2=sc.nextLong();
		while(b1 != 0  ||  b2 != 0)
		{
			sum[i++]=(int)((b1%10+b2%10+r)%2);
			r=(int)((b1%10+b2%10+r)/2);
			b1=b1/10;
			b2=b2/10;
		}
		if(r!=0)
		{
			sum[i++]=r;
		}
		--i;
		System.out.println("Sum of two binary number: ");
		while(i>=0)
		{
			System.out.println(sum[i--]);
		}
		System.out.println("\n");
	}
}

class Compare{
	public static void main(String[] args) {
		int a=25;
		int b=39;
		System.out.println("these number are equal: "+(a==b));
	}
}

class SumOfDigit{
	public static int sumOfDigit(int n){
		int sum=0,r;
		while(n!=0){
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println(sumOfDigit(n));
	}
}

class ReverseString{
	public void reverseString(String str){
		String str1="";
		for(int i=str.length()-1;i>=0;i--){
			str1=str1+str.charAt(i);
		}
		System.out.println(str1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ReverseString rs=new ReverseString();
		String str=sc.nextLine();
		rs.reverseString(str);
	}
}

class CountCharacter{
	public static void main(String[] args) {
		String s="Bhoopendra Singh Patel, mobile number: 6387275238";
		int letter=0,space=0,number=0,other=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				letter++;
			}
			else if(s.charAt(i)==' ')
			{
				space++;
			}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				number++;
			}
			else
			{
				other++;
			}
		}
		System.out.println("Letter: "+letter+"\nSpace: "+space+"\nNumber: "+number+"\nOther: "+other);
	}
}


class Password{
	public static void main(String[] args) {
		Console cons;
		if((cons=System.console())!=null){
			char[] password=null;
			try{
				password=cons.readPassword("Input your Password: ");
				System.out.println("Your Password was: "+new String(password));
			}
			finally{
				if(password!=null){
					java.util.Arrays.fill(password,' ');
				}
			}
		}
		else
		{
			throw new RuntimeException("Can't get password...No console");
		}
	}
}

class SystemTime{
	public static void main(String[] args) {
		System.out.format("\nCurrent Date Time: %tc%n\n",System.currentTimeMillis());
	}
}

class CommandLine
{
	public static void main(String[] args) 
	{
		BSP.output.println("Your First Argument is: "+args[0]);
	}
}

class MultiCommandLine 
{
	public static void main(String[] args)  
	{
		try{
			for(int i=0;i<=5;i++)	
			{
				BSP.output.println(args[i]);
			}
		}catch(Exception e)
		{
			
		}
	}
}