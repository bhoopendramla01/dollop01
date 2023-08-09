public class Strongnum{
	public static void main(String[] args) {
		int n=145,i,r,sum=0,fact=1,f;
		f=n;
		while(n!=0){
			r=n%10;
			fact=1;
			for(i=1;i<=r;i++){
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		if(sum==f){
			System.out.println(f + "Number is Strong");
		}
	}
}