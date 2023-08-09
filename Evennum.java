import java.util.Scanner;
public class Evennum{
	static int n;
	public boolean iseven(int n){
		if(n%2==0)
			return true;
		else 
			return false;
	}

	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	  Evennum obj=new Evennum();
	  if(obj.iseven(n))
	  {
	  	System.out.println(n+ " Number is Even");
	  }
	  else
	  	System.out.println(n+ " Number is not Even");
    }
}