import java.util.Scanner;
public class  BkArray{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];

		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}

class SumOfElement{
	public static void main(String[] args) {
		int a[]={10,20,30,40,50};
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
}

class OddEven{
	public void oddNumber(int a[]){
		System.out.println("Odd Number: ");
		for(int i=0;i<a.length;i++){
			if(a[i]%2!=0){
				System.out.print(a[i]+" ");
			}
		}
	}
	public void evenNumber(int a[]){
		System.out.println("\nEven Number: ");
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0){
				System.out.print(a[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		OddEven od=new OddEven();
		int a[]={1,2,3,4,5,6,7,8};
		od.oddNumber(a);
		od.evenNumber(a);
	}
}

class SumOrProduct{
	public int sumOfEven(int a[]){
		int sum=0;
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0){
				sum=sum+a[i];
			}
		}
		return sum;
	}
	public int productOfOdd(int a[]){
		int pro=1;
		for (int j=0;j<a.length;j++){
			if(a[j]%2!=0){
				pro=pro*a[j];
			}
		}
		return pro;
	}
	public static void main(String[] args) {
		int a[]={10,11,12,13,14,15,16};
		SumOrProduct sp=new SumOrProduct();
		System.out.println("Sum of Even number= "+sp.sumOfEven(a)); 
		System.out.println("Product of Odd number= "+sp.productOfOdd(a));
	}
}

class Alternate{
	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6,7,8,9};
		for(int i=0;i<a.length;i=i+2){
			System.out.print(a[i]+" ");
		}
	}
}

class ReverseArray{
	public static void main(String[] args) {
		int a[]={10,20,30,40,50,60};
		int start=0,last=a.length-1,temp;
		while(start<last){
			temp=a[start];
			a[start]=a[last];
			a[last]=temp;
			start++;
			last--;
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}

class SearchNumber{
	public void searchNumber(int a[],int num){
		int f=0;
		for(int i=0;i<a.length;i++){
			if(a[i]==num){
				f=1;
				System.out.println("Given Number= "+num+" is found and position= "+(i+1));
			}
		}
		if(f==0){
			System.out.println("Given Number= "+num+" is not found");
		}
	}
	public static void main(String[] args) {
		int a[]={10,11,12,13,14,15,16};
		int num=14;
		SearchNumber sn=new SearchNumber();
		sn.searchNumber(a,num);
	}
}

class CountFrequency{
	public void countFrequency(int a[],int num){
		int count=0;
		for(int i=0;i<a.length;i++){
			if(a[i]==num){
				count++;
			}
		}
		System.out.println("Given Number Frequency= "+count);
	}
	public static void main(String[] args) {
		int a[]={1,2,3,2,3,5,6,2,5,6,3,1,4,3,5,4};
		int num=3;
		CountFrequency cf=new CountFrequency();
		cf.countFrequency(a,num);
	}
}


class MaxNumber{
	public int maxNumber(int a[]){
		int max=0;
		for(int i=0;i<a.length;i++){
			if(max<a[i]){
				max=a[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int a[]={12,45,76,34,89,23,45};
		MaxNumber mn=new MaxNumber();
		System.out.println("Maximum number= "+mn.maxNumber(a));
	}
}

class MinNumber{
	public int minNumber(int a[]){
		int min=a[0];
		for(int i=0;i<a.length;i++){
			if(min>a[i]){
				min=a[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		int a[]={12,45,76,34,89,23,45};
		MinNumber mn=new MinNumber();
		System.out.println("Minimum number= "+mn.minNumber(a));
	}	
}

class Ascending{
	public void ascending(int a[]){
		int temp;
		 for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		int a[]={12,34,54,12,45,78,54,23,67};
		Ascending ao=new Ascending();
		ao.ascending(a);
	}
}

class Descending{
	public void descending(int a[]){
		int temp;
		 for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]<a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		int a[]={12,43,76,34,67,23,78,55};
		Descending obj=new Descending();
		obj.descending(a);
	}
}

class ArrayShifting{
	public void shiftByNumber(int a[], int num){
		int ln=a.length;
		for(int i=0;i<a.length;i++){
			if(a[i]==num){
				//count++;
				for(int j=i;j<a.length-1;j++){
					a[j]=a[j+1];
				}
			ln--;
			i--;
			}
		}
		for(int i=0;i<ln;i++){
			System.out.print(a[i]+" ");
		}
	}
	public void shiftByIndex(int a[], int index){
		int ln=a.length;
		for(int i=0;i<a.length;i++){
			if(i==index){
				for(int j=i;j<a.length-1;j++){
					a[j]=a[j+1];
				}
			}
		}
		for(int i=0;i<ln-1;i++){
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		ArrayShifting as=new ArrayShifting();
		int a[]={12,32,45,67,89,78,56,45,23,12};
		int num,index,ch;
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("1-> Shift by Number\n2-> Shift by Index\n3-> Exit ");
			System.out.println("Please enter your choice...");
			ch=sc.nextInt();
			switch(ch){
				case 1:
					num=sc.nextInt();
					as.shiftByNumber(a,num);
					break;
				case 2:
					index=sc.nextInt();
					as.shiftByIndex(a,index);
					break;
				case 3:
					System.exit(1);
				default:
					System.out.println("wrong choice ");
					break;
			}

		}
	}
}


class DimensionalArray{
	public static void main(String[] args) {
		int [][] a=new int [2][2];
		Scanner sc=new Scanner(System.in);
		int row,column;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				a[i][j]=sc.nextInt();
			}
		}
		for(int j=0;j<a.length;j++){
			for(int i=0;i<a.length;i++){
				System.out.print(a[j][i]+" ");
			}
		}
	}
}

class MergeArray{
	public void mergeArray(int a[],int b[]){
		int al=a.length;
		int i;
		int bl=b.length;
		int [] ar=new int [al+bl] ;
		for(i=0;i<a.length;i++){
			ar[i]=a[i];
		}
		for(int j=0;j<b.length;j++){
			ar[i++]=b[j];
		}
		for(int k=0;k<ar.length;k++){
			System.out.print(ar[k]+" ");
		}
	}
	public static void main(String[] args) {
		MergeArray ma=new MergeArray();
		int a[]={10,11,12,13,14,15,16};
		int b[]={17,18,19,20,21};
		ma.mergeArray(a,b);
	}
}

class RemoveOccurrence{
	public void removeOccurrence(int a[],int num){
		int ln=a.length;
		for(int i=0;i<a.length;i++){
			if(a[i]==num){
				for(int j=i;j<a.length-1;j++){
					a[j]=a[j+1];
				}
			ln--;
			i--;
			}
		}
		for(int i=0;i<ln;i++){
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		int a[]={12,23,34,45,67,87,12,43,23,45};
		RemoveOccurrence ro=new RemoveOccurrence();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number ");
		int num=sc.nextInt();
		ro.removeOccurrence(a,num);
	}	
}

class CommonElement{
	public boolean notReapet(int a[],int num,int index){
		int f=0;
		for(int i=index-1;i>=0;i--){
			if(num==a[i]){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		CommonElement ce=new CommonElement();
		int a[]={12,23,34,54,67,87,12,34,76};
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j] && ce.notReapet(a,a[i],i)){					
						System.out.print(a[i]+" ");
				}
			}
		}
	}
}

class TwoDimensionalArray{
	public static void main(String[] args) {
			int a[][][]=new int [2][2][2];
			Scanner sc=new Scanner(System.in);
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a[i].length;j++){
					for(int k=0;k<a[i][j].length;k++){
						a[i][j][k]=sc.nextInt();
					}
				}
			}
			/*for(int i[]:a){
				For(int j:i){
					System.out.print(j+" ");
				}
			}*/
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a[i].length;j++){
					for(int k=0;k<a[i][j].length;k++){
						System.out.print(a[i][j][k]+" ");
					}
				}
			}
	}	
}

class FourDimensionalArray{
	public static void main(String[] args) {
			int a[][][][]=new int [2][2][2][2];
			Scanner sc=new Scanner(System.in);
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a[i].length;j++){
					for(int k=0;k<a[i][j].length;k++){
						for(int l=0;l<a[i][j][k].length;l++){
							a[i][j][k][l]=sc.nextInt();
						}
					}
				}
			}
			for(int i1[][][]:a)
				for(int i2[][]:i1)
					for(int i3[]:i2)
						for(int i4:i3)
							System.out.print(i4+" ");
				
			/*for(int i=0;i<a.length;i++){
				for(int j=0;j<a[i].length;j++){
					for(int k=0;k<a[i][j].length;k++){
						for(int l=0;l<a[i][j][k].length;l++){
							System.out.print(a[0][1][1][l]+" ");
						}
					}
				}
			}*/
			//System.out.print(a[0][1][1][0]);
	}	
}

class StringArray{
	public static void main(String[] args) {
		String a[]=new String [5];
		a[0]="Mr.";
		a[1]="Bhoopendra Singh Patel";
		a[2]="Singh";
		/*for(String i:a){
			System.out.print(i+" ");
		}*/
		System.out.println(a[1]);
	}
}


class StringTwoDArray{
	public static void main(String[] args) {
		String a[][]=new String [2][2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j]=sc.nextLine();
			}
		}
		/*for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
		}*/
		System.out.println(a[0][0]+" ");
	}
}

class StringTwoDsArray{
	public static void main(String[] args) {
		String dollop[][][]=new String [2][2][3];
		Scanner sc=new Scanner(System.in);
		for(int place=0;place<dollop.length;place++){
			for(int std=0;std<dollop[place].length;std++){
				for(int boy=0;boy<dollop[place][std].length;boy++){
					dollop[place][std][boy]=sc.nextLine();
				}
			}
		}
		/*for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
		}*/
		System.out.println(dollop[0][0][0]+" ");
	}
}


class Employee
{
	int id;
	String name;
	String company_name;
	String designation;

	Employee(int i,String n,String c,String d){
		id = i;
		name = n;
		company_name = c;
		designation = d;
	}
	public String toString(){
		return "Id: "+id+", Name: "+name+", Company Name: "+company_name+", Designation: "+designation;
	}
}

class BkSingh{	
	public static void main(String[] args)
	{
		Employee emp[]=new Employee[2];
		Scanner sc=new Scanner(System.in);
		//for(int i=1;i<=emp.length;i++){
			//Employee emp1=new Employee(sc.nextInt(),sc.nextLine(),sc.nextLine(),sc.nextLine());
			//Employee emp2=new Employee(sc.nextInt(),sc.nextLine(),sc.nextLine(),sc.nextLine());
			Employee emp1=new Employee(100,"Bhoopendra Singh","Dollop","CEO");
			Employee emp2=new Employee(101,"Vikas Kashyap","Dollop","Manager");
		

		//}
		// for(int i=0;i<emp.length;i++){
		// 	System.out.println(emp[i]);
		// }
	System.out.println(emp1);
	System.out.println(emp2);

	}

}



class Operator{

	public static void main(String[] args) {
		int a=10;
		int b=20;
		Integer i=200;
		Integer j=200;

		System.out.println(a==b);
		System.out.println(i==j);
		System.out.println(i.equals(j));

	}
}

class ReverseTwoDArray{
	public void reverseArray(int a[][]){
		for(int i=0;i<a.length;i++){
			int start =0;
			int end = a[i].length-1;
			while(start<end){
				int temp=a[i][start];
				a[i][start]=a[i][end];
				a[i][end]=temp;
				start++;
				end--;
			}
		}
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
		}
		// return a[][];
	}
	public static void main(String[] args) {
		int a[][]=new int [1][5];
		ReverseTwoDArray ra=new ReverseTwoDArray();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j]=sc.nextInt();
			}
		}
		ra.reverseArray(a);
		// for(int i=0;i<a.length;i++){
		// 	for(int j=0;j<a[i].length;j++){
		// 		System.out.println(a[i][j]+" ");
		// 	}
		// }
	}
}

























































































































































































































































































































































































































































































