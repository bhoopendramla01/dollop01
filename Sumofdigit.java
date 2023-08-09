public class Sumofdigit{
	static int n=1234,sum=0,r;
	public int issumofdigit(int n){
		while(n!=0){
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		return sum;
	}
	public static void main(String[]args){
		Sumofdigit obj = new Sumofdigit();
		System.out.println(obj.issumofdigit(n));
	}
}