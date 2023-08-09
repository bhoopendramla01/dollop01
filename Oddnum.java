public class Oddnum{
	static int n=7;
	public boolean isodd(int n){
		if(n%2!=0)
			return true;
		else
			return false;
	}
	public static void main(String [] args){
		Oddnum obj=new Oddnum();
	  if(obj.isodd(n))
	  {
	  	System.out.println(n+ " Number is Odd");
	  }
	  else 
	  	System.out.println(n+ " Number is not Odd");
    }
}