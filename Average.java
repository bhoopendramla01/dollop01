public class Average{
	static int n1=10,n2=5,n3=15,sum=0,ave;
	public int issum(int n1, int n2,int n3){
		sum=n1+n2+n3;
		return sum;
	}
	public int isaverage(int a,int b){
		ave=a/b;
		return ave;
	}
	public static void main(String[]args){
		Average obj=new Average();
		sum=obj.issum(n1,n2,n3);
		System.out.println(obj.isaverage(sum,3));
	}
}