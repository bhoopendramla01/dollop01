public class Greaternum{
	static int n1=10,n2=20,n3=30,max=0;
	static int isgreater(int a,int b,int c){
		if(a>b && a>c)
			max=a;
		else if(b>c)
			max=b;
		else 
			max=c;
	  return max;
	}
	public static void main(String[] args) {
		Greaternum obj=new Greaternum();
		System.out.println(isgreater(n1,n2,n3));
	}
}