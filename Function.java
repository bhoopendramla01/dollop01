import java.util.*;
class PrimeSeries{
	public static boolean primeSeries(int n)
	{
		int temp=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0){
				temp=1;
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int n1,n2;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		BSP.output.print("Enter First Number: ");
		n1=sc.nextInt();
		BSP.output.print("Enter Second Number: ");
		n2=sc.nextInt();
		if(n1>n2)
		{
			n1=n1+n2;
			n2=n1-n2;
			n1=n1-n2;
		}
		for(int i=n1;i<=n2;i++)
		{
			if(primeSeries(i))
				BSP.output.print(i+" ");
		}
	}
}

class ExpressedSumOfTwoPrimeNum{
	public static int checkPrime(int n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0){
				return 0;
			}
		}
		return 1;
	}
	public static void main(String[] args) {
		int n,f=0;
		Scanner sc=new Scanner(System.in);
		BSP.output.print("Enter a Number: ");
		n=sc.nextInt();
		for(int i=2;i<=n/2;i++)
		{
			if(checkPrime(i)==1)
			{
				if(checkPrime(n-i)==1)
				{
					f=1;
					BSP.output.println(n+"="+i+"+"+(n-i));
				}
			}
		}
		if(f==0)
				BSP.output.println("Can't Expressed Sum Of Two PrimeNum");
	}
}

class SumOfNaturalNum{
	public static int sumOfNaturalNum(int n)
	{
		while(n!=0)
		{
			return n+=sumOfNaturalNum(n-1);
		}
		return n;
	}
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		BSP.output.print("Enter a Number: ");
		n=sc.nextInt();
		BSP.output.println(sumOfNaturalNum(n));
	}
}

class Factorial{
	public static int factorial(int n)
	{
		int fact=1;
		while(n!=0)
		{
			return fact=n*factorial(n-1);
		}
		return fact;
	}
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		BSP.output.print("Enter a Number: ");
		n=sc.nextInt();
		BSP.output.println(factorial(n));
	}
}

class GDC{
	public static int gdc(int n1,int n2)
	{
		while(n2!=0)
		{
			return gdc(n2,n1%n2);
		}
		return n1;
	}
	public static void main(String[] args) {
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		BSP.output.print("Enter First Number: ");
		n1=sc.nextInt();
		BSP.output.print("Enter Second Number: ");
		n2=sc.nextInt();
		BSP.output.println("GDC= "+gdc(n1,n2));
	}
}

class ReverseSentence{
 	public static void main(String[] args) {
    	String sentence = "Go work";
    	String reversed = reverse(sentence);
    	System.out.println("The reversed sentence is: " + reversed);
  }
	public static String reverse(String sentence) {
    	if (sentence.isEmpty())
     		 return sentence;
    	return reverse(sentence.substring(1)) + sentence.charAt(0);
  }
}

class Power{
	public static int power(int n,int pow)
	{
		int pcount=1;
		while(pow!=0)
		{
			return pcount*=n*power(n,pow-1);
		}
		return pcount;
	}
	public static void main(String[] args) {
		int n,pow;
		Scanner sc=new Scanner(System.in);
		BSP.output.print("Enter a Number: ");
		n=sc.nextInt();
		BSP.output.print("Enter power count: ");
		pow=sc.nextInt();
		BSP.output.println(power(n,pow));
	}
}

