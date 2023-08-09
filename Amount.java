public class Amount{
	static int amt=10,qut=5;
	public int isamt(int amt,int qut){
		int result;
		result=amt*qut;
		return result;
	}
    public static void main(String[]args){
    	Amount obj=new Amount();
    	System.out.println(obj.isamt(amt,qut));
    }
}