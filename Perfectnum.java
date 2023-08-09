public class Perfectnum{
	static int n=6,i,sum=0;
	public boolean isperfect(int n){
		for(i=1;i<n;i++){
		 	if(n%i==0){
		 		sum=sum+i;
		 	}
		}
		if(n==sum)
		 	return true;
		else
		 	return false;
	}
	public static void main(String [] args){
		Perfectnum obj=new Perfectnum();
		if(obj.isperfect(n))
			System.out.println(n+" Number is Perfect");
		else 
			System.out.println(n+" Number is not Perfect");
	}
}