public class Reversenum{
	static int n=1234,rev=0,r;
	public int isrev(int n){
		while(n!=0){
	    	r=n%10;
	    	rev=rev*10+r;
	    	n=n/10;
	    }
	    return rev;
    }
	public static void main(String[]args){
		Reversenum obj=new Reversenum();
	  System.out.println(obj.isrev(n));
	}
}