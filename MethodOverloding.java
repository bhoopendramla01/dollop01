class MethodOverloding{
	static void m1(int a,double d){
		System.out.println("int,double");
	}
	static void m1(long a,Long b){
		System.out.println("long,long");
	}
	static void m1(Integer a,Integer b){
		System.out.println("Integer,Integer");
	}
	public static void main(String[] args) {
		m1(20,20);
	}
}