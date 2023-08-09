public class Pattern{
	public static void main(String[] args) {
		//solid Rectangle
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
class Hollow{
	public static void main(String[] args) {
		//hollow rectangle
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(i==1 || i==n || j==1 || j==n){
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}

class Half{
	public static void main(String[] args) {
		//half pyramid
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

class InvertHalf{
	public static void main(String[] args) {
		//Inverted Half Pyramid
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=i;j<=n;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

class Halfpy{
	public static void main(String[] args) {
		//Inverted Half Pyramid(Roteted by 180 deg)
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

class Halfnum{
	public static void main(String[] args) {
		//Half Pyramid with numbers
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

class InvHalfnum{
	public static void main(String[] args) {
		//Inverted Half Pyramid with numbers
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n+1-i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

class Floyd{
	public static void main(String[] args) {
		//Floyd's Tringle
		int n=5,b=0;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(++b+ " ");
			}
			System.out.println();
		}
	}
}

class Triangle{
	public static void main(String[] args) {
		//0-1 Triangle
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				if((i+j)%2==0){
					System.out.print("1 ");
				}
				else
					System.out.print("0 ");
			}
			System.out.println();
		}
	}
}