import java.util.*;
class EvenOdd{
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n%2==0)
			System.out.println("Given Number= "+n+" is Even");
		else 
			System.out.println("Given Number= "+n+" is Odd");
	}
}

class VowelConsonant{
	public static void main(String[] args) {
		char ch='K';
		if(ch>='A'&&ch<='Z'||ch>='a'&&ch>='z'){
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				System.out.println("Given Character= "+ch+" is Vowel");
			else
				System.out.println("Given Character= "+ch+" is Consonants");
		}
	}
}

class LargestNo{
	public static void main(String[] args) {
		int a, b,c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b&&a>c)
			System.out.println("Given No= "+a+" is a LargestNo");
		else if(b>c)
			System.out.println("Given No= "+b+" is a LargestNo");
		else 
			System.out.println("Given No= "+c+" is a LargestNo");
	}
}

class LeapYear{
	public static void main(String[] args) {
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter year: ");
		year=sc.nextInt();
		if(year%4==0)
			System.out.println("Given Year= "+year+" is LeapYear");
		else if(year%100==0)
			System.out.println("Given Year= "+year+" is LeapYear");
		else 
			System.out.println("Given Year= "+year+" is not LeapYear");
	}
}

class CheckNo{
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number: ");

		n=sc.nextInt();
		if(n>0)
			System.out.println("Given Number= "+n+" is Positive");
		else if(n<0)
			System.out.println("Given Number= "+n+" is Negative");
		else 
			System.out.println("Given Number= "+n+" is Zero");
	}
}

class CheckCharacter{
	public static void main(String[] args) {
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Character: ");
		ch=sc.next().charAt(0);
		if(ch>='A'&&ch<='Z'||ch>='a'&&ch>='z')
		{
			System.out.println("Given Character= "+ch+" is Alphabet");
		}
		else 
			System.out.println("Given Character= "+ch+" is not Alphabet");
	}
}

class SumOfNaturalNo{
	public static void main(String[] args) {
		int n1,n2;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Number: ");
		n1=sc.nextInt();
		System.out.print("Enter Second Number: ");
		n2=sc.nextInt();
		if(n1>0&&n2>0)
		{
			if(n1>n2)
			{
				n1=n1+n2;
				n2=n1-n2;
				n1=n1-n2;
			}
			for(int i=n1;i<=n2;i++)
			{
				sum=sum+i;
			}
			System.out.println("Sum of Given Natural No="+sum);
		}
	}
}

class FactorialNo{
	public static void main(String[] args) {
		int n,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Given Number= "+n+" and Factorial= "+fact);
	}
}

class Table{
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		n=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+"*"+n+"="+(i*n));
		}
	}
}

class FibonacciSeries{
	public static void main(String[] args) {
		int n1=0,n2=1,n3;
		System.out.print(n1+" "+n2+" ");
		for(int i=3;i<=10;i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(n3+" ");
		}
	}
}

class HCF{
	public static void main(String[] args) {
		int a,b;
		int hcf=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Number: ");
		a=sc.nextInt();
		System.out.print("Enter Second Number: ");
		b=sc.nextInt();
		for(int i=1;i<=a||i<=b;i++)
		{
			if(a%i==0&&b%i==0)
				hcf=i;
		}
		System.out.println("HCF= "+hcf);
	}	
}
class LCM{
	public static void main(String[] args) {
		int a,b;
		int lcm=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Number: ");
		a=sc.nextInt();
		System.out.print("Enter Second Number: ");
		b=sc.nextInt();
		for(int i=1;i<=a||i<=b;i++)
		{
			if(a%i==0&&b%i==0)
				lcm=i;
		}
		lcm=(a*b)/lcm;
		System.out.println("LCM= "+lcm);
	}	
}

class CountDigit{
	public static void main(String[] args) {
		int n,count=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		System.out.println("Count of digit= "+count);
	}
}

class Reverse{
	public static void main(String[] args) {
		int n,rev=0,rem;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		n=sc.nextInt();
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println("Reverse Number= "+rev);
	}
}

class Power{
	public static void main(String[] args) {
		int n,pow,power=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		n=sc.nextInt();
		System.out.print("Enter power count: ");
		pow=sc.nextInt();
		for(int i=1;i<=pow;i++)
		{
			power=power*n;
		}
		System.out.println("Given Number= "+n+" and Power= "+power);
	}
}

class Palindrome{
	public static void main(String[] args) {
		int n,rev=0,rem;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		n=sc.nextInt();
		int temp=n;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(temp==rev)
			System.out.println("Number is Palindrome");
		else 
			System.out.println("Number is not Palindrome");
	}
}

class PrimeNo{
	public static void main(String[] args) {
		int n,temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		n=sc.nextInt();
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0){
				temp=1;
				System.out.println("Given Number is not Prime No");
			}
		}
		if(temp==0)
			System.out.println("Given Number is Prime No");
	}
}

class Armstrong{
	public static void main(String[] args) {
		int n,sum=0;
		int rem;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		n=sc.nextInt();
		int temp=n;
		while(n!=0)
		{
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		if(temp==sum)
			System.out.println("Armstrong");
		else 
			System.out.println("Not Armstrong");
	}
}

class Factors{
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		n=sc.nextInt();
		System.out.print("Given Number= "+n+" and Factors: ");
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
				System.out.print(i+" ");
		}
	}
}

class Calculator{
	public static void main(String[] args) {
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		BSP.output.print("Enter First Number: ");
		n1=sc.nextInt();
		BSP.output.print("Enter Second Number: ");
		n2=sc.nextInt();
		while(true)
		{
			BSP.output.println("1-> Addition\n2-> Subtraction\n3-> Multiplication\n4-> Division\n5-> Exit");
			BSP.output.print("Enter your Choice: ");
			int ch;
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					BSP.output.println("Given Number Addition= "+(n1+n2));
					break;
				case 2:
					BSP.output.println("Given Number Addition= "+(n1-n2));
					break;
				case 3:
					BSP.output.println("Given Number Addition= "+(n1*n2));
					break;
				case 4:
					BSP.output.println("Given Number Addition= "+(n1/n2));
					break;
				case 5:
					System.exit(10);
			}
		}
	}
}