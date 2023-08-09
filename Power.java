import java.util.Scanner;
public class Power{
	static int n,p,i,result=1;
	public int ispower(int n,int p){
		for(i=1;i<=p;i++){
			result*=n;
		}
		return result;
	}
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int p=sc.nextInt();
	    Power obj=new Power();
	    System.out.println(obj.ispower(n,p));
	}
}