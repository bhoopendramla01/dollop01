public class Table{
	static int n1=2,n2=10,i,j;
	public void istable(int n1,int n2){
		for(i=1;i<=10;i++){
			for(j=n1;j<=n2;j++){
				System.out.print(i*j+ " \t ");
			}
			System.out.println("");
		}
	}
	public static void main(String[]args){
		Table obj=new Table();
		obj.istable(n1,n2);
	}
}