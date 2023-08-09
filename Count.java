import java.util.Scanner;
public class Count{
	static int n,count=0;
	public int iscount(int n){
		count=0;
		if(n==0)
			count++;
		while(n!=0){
			count++;
			n=n/10;
		}
		return count;
		
	}
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    Count obj=new Count();
	    System.out.println(obj.iscount(n));
	}
}