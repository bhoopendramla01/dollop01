import java.util.*;
public class Lcm{
	static int a,b;
	public int islcm(int a,int b){
		int result=1,i;
		for(i=1;i<=a&&i<=b;i++){
			if(a%i==0&&b%i==0){
				result=i;
			}
		}
		result=(a*b)/result;
		return result;
	}
	public static void main(String[] args) {
		Lcm lcm=new Lcm();
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(lcm.islcm(a,b));
	}
}