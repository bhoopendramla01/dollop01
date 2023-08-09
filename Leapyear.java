import java.util.Scanner;
public class Leapyear{
	static int year;
	public boolean isleap(int n){
		if(n%100==0)
			return true;
		else if(n%4==0)
			return true;
		else 
			return false;
	}

	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
	    int year=sc.nextInt();
	  Leapyear obj=new Leapyear();
	  if(obj.isleap(year))
	  {
	  	System.out.println(year+ " Given year is Leapyear");
	  }
	  else
	  	System.out.println(year+ " Given year is not Leapyear");
    }
}