import java.util.Scanner;
public class Printnum{
	static int i,n;
	public void printnum(int n){
		for(i=1;i<=n;i++){
			System.out.println(i);
		}
	}

	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	  Printnum obj=new Printnum();
	  obj.printnum(n);
	}
}