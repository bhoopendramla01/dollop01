public class ReverseFL{
	static int n=1234,n1,r,rev=0,revs=0;
	static int t=n;
	public int isreverse(int n){
		while(n!=0){
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		return rev;
	}
	public static void main(String[] args) {
		ReverseFL obj=new ReverseFL();
		int revs = 0;
		int n=1234;
		int n1 = 0,r=0;
		n1=obj.isreverse(t);

		while(n1!=0){
		    if(!(revs==0 || n1<10)){
			    r=n1%10;				
			}
		    else 
		    {
			   r=n%10;			   
			}
			revs=revs*10+r;
		    n=n/10;
		    n1=n1/10;
		}
		System.out.println(revs);

	}
}