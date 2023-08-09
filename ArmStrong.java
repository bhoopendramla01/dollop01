public class ArmStrong
{
	private static int num=153;
	private int t;

	public void isArmStrong(int num)
	{
		int sum=0;
		int r;
         t=num;
         while(t!=0)
	     {
             r=t%10;
             sum=sum+(r*r*r);
             t=t/10;
	     }   
	     if(sum==num)
	     {
	     	System.out.println(num + " is ArmStrong");
	     }
	}
	public static void main(String[] args) {
		ArmStrong obj =new ArmStrong();
		obj.isArmStrong(num);		
	}
}