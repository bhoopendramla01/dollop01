 public class Float{
 	static float a=5.2f,b=2.2f;
 	public float ismul(float a,float b){
 		float result;
 		result=a*b;
 		return result;
 	}
 	public static void main(String[] args) {
 		Float obj=new Float();
 		System.out.println(obj.ismul(a,b));
 	}
 }