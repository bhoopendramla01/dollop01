import java.util.Scanner;
public class Swap{
	static int a,b;
	public void isswap(int a,int b){
		System.out.println("After Swaping Operation a= "+a +" b= "+ b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Before Swaping Operation a= "+a +" b= "+ b);
	}
	public static void main(String[] args) {
		Swap obj=new Swap();
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		obj.isswap(a,b);

	}
}