public class Prime{
	public static void main(String [] agrs){
		int i,n=7,f=0;
	
    for(i=2;i<n;i++){
    	if(n%i==0){
    		System.out.println("Number is Not Prime");
    		f=1;
    		break;
    	}
  	}
  	if(f==0){
  		System.out.println("Number is Prime");
  	}
  }	
}
