import java.util.Scanner;
public class Test{
	int a;
	void fun(){
		System.out.println(a);
	}
	public static void main(String[] args) {
		Test obj=new Test();
		Test obj1=new Test();
		obj.a=10;
		obj1.a=20;
		obj.fun();
		obj1.fun();

	}
}
class Java{
	public static void main(String[] args) {
		String str=new String("Bhoopendra");
		String str1=" Singh";
		
		System.out.println(str.concat(str1));
	}
}

class My{

	public void rev(String s){
		int i;
		String s1="";
		for(i=s.length()-1;i>=0;i--){
			s1=s1+s.charAt(i);
		}
		System.out.println(s);
		System.out.println(s1);
	}
	public static void main(String[] args) {
		String str="Hello";
		My my=new My();
		my.rev(str);
	}
}

class CompareTwoString{

	public boolean comp(String s,String s1){
		if(s.equals(s1))
		  return true;
		else 
		   return false;
 
	}
	public static void main(String[] args) {
		String str="Hello";
		String str1="Hello";
		CompareTwoString cmp=new CompareTwoString();
		System.out.println(cmp.comp(str,str1));
	}
}

class CharCase{
	
	public static void main(String[] args) {
		String str="bhoopendra singh";
		String str1="MY MOTHER IS MY DUNIYA";
		str=str.toUpperCase();
		str1=str1.toLowerCase();
		System.out.println(str);
		System.out.println(str1);		
	}
}

class Palindrome{
	public boolean issame(String str){
		int s=0,f=0, last=str.length()-1;
		while(s<last){
			if(str.charAt(s)!=str.charAt(last))
			{
				f=1;
			}
			s++;
			last--;
		}
		if(f==0)
			return true;
		else 
			return false;
	}
	public static void main(String[] args) {
		String str="RAMAR";
		Palindrome bk=new Palindrome();
	    System.out.println(bk.issame(str));
	}
}

class Lenght{
	public static void main(String[] args) {
		String str="Bhoopendra Singh";
		int length=	str.length();
		System.out.println(length);
	}
}

class Copy{
	public void iscopy(String str){
		String str1="";
		for(int i=0;i<str.length();i++){
			str1=str1+str.charAt(i);
		}
		System.out.println(str1);
	}
	public static void main(String[] args) {
		String str="Bhoopendra Singh";
		Copy copy=new Copy();
		copy.iscopy(str);

	}
}

class Compare{
	public void iscom(String s,String s1){
		int c=0;
		for(int i=0;i<s.length();i++){
			for(int j=0;j<s1.length();j++){
				if(s.charAt(i)==s1.charAt(j))
				{
					c++;
					break;
				}
			}
		}
		if(c==s1.length())
			System.out.println("String is Same");
		else 
			System.out.println("String are not same");
	}
	public static void main(String[] args) {
		String str="Singh Bhoopendra";
		String str1="Bhoopendra Singh";
		Compare bk=new Compare();
		bk.iscom(str,str1);
	}	
}

class Toggle{
	public static void main(String[] args) {
		String str="HELLO my mother";
		String str1="";
		for(int i=0;i<str.length();i++){
			if(Character.isUpperCase(str.charAt(i)))
				str1=str1+Character.toLowerCase(str.charAt(i));
			else 
				str1=str1+Character.toUpperCase(str.charAt(i));
		}
		System.out.println(str1);
	}
}

class Totalchar{
	public static void main(String[] args) {
		String s="my mother is my duniya @ 1234";
		int alp=0,dgt=0,schar=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				alp++;
			}
			else if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				dgt++;
			}
			else
				schar++;
			
		}
		System.out.println("Total Alphabets= "+alp);
		System.out.println("Total Digits= "+dgt);
		System.out.println("Total Special Character= "+schar);
	}
}

class Totalvc{
	public static void main(String[] args) {
		String s="Bhoopendra Singh";
		int vwl=0,cons=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U' || s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
 				vwl++;
 			else if(s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z')				
 				cons++;
		}
		System.out.println("Total Vowels= "+vwl+"\nTotal Consonants= "+cons);
	}
}

class TotalWord{
	public static void main(String[] args) {
		String s="Bhoopendra Singh Patel";
		int word=0;
		for(int i=0;i<s.length();i++){
			if(i==0 && s.charAt(i)!=' ' || s.charAt(i-1)==' ')
				word++;		
		}
		System.out.println("Total Word in String= "+word);
	}
}

class Nonrepeat{
	int ln;
	public String searchShift(String s, char ch){
		char c[]=s.toCharArray();
		ln=s.length();
		for(int i=0;i<c.length;i++){
			if(c[i]==ch){
				for(int j=i;j<c.length-1;j++){
					c[j]=c[j+1];
				}
			ln--;
			i--;
			}
		}
		return new String(c,0,ln);
	}
	public static void main(String[] args) {
		String s="Bhoopendra Singh Patel";
		Nonrepeat nr=new Nonrepeat();
		for(int i=0;i<s.length();i++){
		 	for(int j=i+1;j<s.length();j++){
		 		if(s.charAt(i)==s.charAt(j))
		 		{
		 			s=nr.searchShift(s,s.charAt(i));
		 			i--;
		 		}
			}
			
		}
		System.out.println(s);
	}
}

class SortString{
	public static void main(String[] args) {
		String s="hello mam";
		char ch[]=s.toCharArray();
		char temp;
		int i=0;
		while(i<ch.length){
			int j=i+1;
			while(j<ch.length){
				if(ch[j]<ch[i]){
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
				j++;
			}
			i++;
		}
		s=new String(ch);
		System.out.println(s);		
	}
}

class PangramString{
	public void allLetter(String str){
		str=str.toLowerCase();
		boolean allLetterPresent = true;
		for(char ch='a';ch<='z';ch++){
			int f=0;
			for(int i=0;i<str.length();i++){
				if(ch==str.charAt(i)){
					f=1;
					break;
				}
			}
			if(f==0)
				allLetterPresent=false;						
		}
		if(allLetterPresent)
			System.out.println("PangramString");
		else 
			System.out.println("Not PangramString");
	}
	public static void main(String[] args) {
		String str="abcdefghijklmnopqrstuvwxyz";
		PangramString ps=new PangramString();
		ps.allLetter(str);
	}
}

class FirstLetter{
	public static void main(String[] args) {
		String str="Bhoopendra Singh Patel Chitrakoot";
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(i==0 && ch[i]!=' ' || ch[i-1]==' ')
				System.out.println(ch[i]);
		}
	}
}


class Lexicographically{
	public int toCampare(String str,String str1){
		for(int i=0;i<str.length()&&i<str1.length();i++){
			if(str.charAt(i)==str1.charAt(i))
				return (int)str.charAt(i)-(int)str1.charAt(i);
			else 
				return (int)str.charAt(i)-(int)str1.charAt(i);
		}
		return 0;
	}
	public static void main(String[] args) {
		Lexicographically ls= new Lexicographically();
		String s="Hello";
		String s1="Good";
		String s2="Sir";
		System.out.println(ls.toCampare(s,s1));
		System.out.println(ls.toCampare(s,s2));
	}
}

class RemoveLeadingZero{
	public void removeZero(String num){
		char ch='0';
		int count=0;
		for(int i=0;i<num.length();i++){
			if(ch==num.charAt(i))
				count++;
			else 
				break;
		}
		num=num.substring(count);
		System.out.println(num);
	}
	public static void main(String[] args) {
		String num="000123";
		RemoveLeadingZero obj=new RemoveLeadingZero();
		obj.removeZero(num);
	}
}

class FindUnicode{
	public void findUnicode(String s,int n){
		for(int i=0;i<s.length();i++){
			if(s.charAt(n)==s.charAt(i)){
				System.out.println(s.charAt(i)+0);
			}
		}
	}
	public static void main(String[] args) {
		String str="My Mother is my Duniya";
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter index number ");
		int n=sc.nextInt();
		FindUnicode obj=new FindUnicode();
		if(n<str.length())
			obj.findUnicode(str,n);
		else 
			System.out.println("Your given Index not exist to String ");
	}
}

class SplitString{
	public void splitString(String str){
		char ch=',';
		int start=0,last=0;
		for(int i=0;i<str.length();i++){
			if(ch==str.charAt(i)){ 
				
				last=i;
				System.out.println(str.substring(start,last));
				start= i+1;
			}
		}
		System.out.println(str.substring(last+1));
	}
	public static void main(String[] args) {
		String str="My name is Bhoopendra,My father name,is Raj Narayan Singh";
		SplitString ss= new SplitString();
		ss.splitString(str);
	}
}

class Student{
	int id;
	String name;
	Student(int i,String n){
		id=i;
		name=n;
	}
	void display(){
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		Student s1=new Student(100,"Bhoopendra Singh");
		Student s2=new Student(101,"Ram Narayan");
		s1.display();
		s2.display();
	}
}

class GroupReverse{
	public String groupReverse(String s,int f,int l){
		char temp;
		char a[]=s.toCharArray();
		for(int i=0;i<a.length;i++){
			if(i==f){
				while(f<l){
					temp=a[f];
					a[f]=a[l];
					a[l]=temp;
					f++;
					l--;
				}
			}
		}
		return s=new String(a);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int g=0,last=g-1;
		g=sc.nextInt();
		String str="123456789";
		GroupReverse gr=new GroupReverse();
		for(int i=0;i<str.length();){
			if(last<str.length()){
				str=gr.groupReverse(str,i,last);
			}
			i=last+1;
			last=last+g;
		}
		System.out.println(str);
	}
}







