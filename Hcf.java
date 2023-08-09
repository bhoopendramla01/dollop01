import java.util.*;
public class Hcf{
	static int a,b;
	public int ishcf(int a,int b){
		int result=1,i;
		for(i=1;i<=a||i<=b;i++){
			if(a%i==0&&b%i==0){
				result=i;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Hcf hcf=new Hcf();
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(hcf.ishcf(a,b));
	}
}