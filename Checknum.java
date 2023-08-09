import java.util.Scanner;
public class Checknum{
	static int n;
	public void ischeck(int n){
		if(n<0)
			System.out.println(n+ " Given Number is Negative");
		else if(n>0)
			System.out.println(n+ " Given Number is Positive");
		else
			System.out.println(n+ " Given Number is Zero");
	}

	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	  Checknum obj=new Checknum();
	  obj.ischeck(n);
	}
}