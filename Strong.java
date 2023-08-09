public class Strong{
	static int n=145;
	int i,r,sum=0,fact=1;
	int f=n;
		public void isstrong(int n){
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
			System.out.println(f + " Number is Strong");
		}
		else 
			System.out.println(f+ " Number is not Strong");
	}
		public static void main(String[] args) {
			Strong obj = new Strong();
			obj.isstrong(n);
	    }

}