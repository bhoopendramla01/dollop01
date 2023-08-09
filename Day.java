public class Day{
	static int day=577;
	public void isday(int day){
		int year,month,week;
		year=day/365;
		day=day%365;
		month=day/30;
		day=day%30;
		week=day/7;
		day=day%7;
		System.out.println(year+" Year");
		System.out.println(month+" Month");
		System.out.println(week+" Week");
		System.out.println(day+" Day");
	}
	public static void main(String [] args){
		Day obj=new Day();
		obj.isday(day);
	}
}