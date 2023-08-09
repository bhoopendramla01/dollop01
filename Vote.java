import java.util.Scanner;
public class Vote{
	static int age;
	public boolean iseven(int n){
		if(n>=18)
			return true;
		else 
			return false;
	}

	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
	    int age=sc.nextInt();
	  Evennum obj=new Evennum();
	  if(obj.iseven(age))
	  {
	  	System.out.println(age+ " Given age person eligible for voting");
	  }
	  else
	  	System.out.println(age+ " Given age person not eligible for voting");
    }
}