public class Primes{
	public static void main(String [] agrs){
		int j,i,n=50,f=0;
	for(j=1;j<=n;j++){
		f=0;
     	for(i=2;i<j;i++){
    		if(j%i==0){
    			System.out.println(j+"Number is Not Prime");
    			f=1;
    			break;
    		}
  		}
  		if(f==0){
  			System.out.println(j+"Number is Prime");
  		}
  	}	
    }
}
