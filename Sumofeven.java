import java.util.Scanner;
public class Sumofeven{
	static int i,sum=0,n;
	public int sumofeven(int n){
		for(i=1;i<=n;i++){
			if(i%2==0)
			   sum=sum+i;
		}
		return sum;
	}

	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	  Sumofeven obj=new Sumofeven();
	  System.out.println(obj.sumofeven(n));
	}
}