import java.util.Scanner;
public class Generic{
	static int n,r,sum;
	public int isgeneric(int n){
		while(n>10){
			r=n%10;
			n=n/10;
			n=n+r;
		}
		return n;
	}
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    Generic obj=new Generic();
	    System.out.println(obj.isgeneric(n));
	}
}