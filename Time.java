public class Time{
	static int second=4230;
	public void istime(int second){
		int hours,minuts;
		hours=second/3600;
		second=second%3600;
		minuts=second/60;
		second=second%60;
		System.out.println(hours+" hours");
		System.out.println(minuts+" minuts");
		System.out.println(second+" second");
	}
	public static void main(String[]args){
		Time obj=new Time();
		obj.istime(second);
	}
}