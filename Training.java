public class Training{
	int n=10;
	public String toString(){
		String s="Bhoopendra Singh";
		s=new String(n+"");
		return s;
	}
	public static void main(String[] args) {
		Training obj=new Training();
		System.out.println(obj);
	}
}

class Check extends My{
	public void m1(String s)
	{
		System.out.println(s);
		rev(s);

	} 
	public static void main(String[] args) {
		My obj=new Check();
		String s="Bhoopendra Singh Patel";
		obj.rev(s);
		Check c = (Check)obj;
		c.m1(s);

	}
}

class WordReverse{
	public String revString(String s){
		String s1="";
		for(int i=s.length()-1;i>=0;i--){
			s1=s1+s.charAt(i);
		}
		return s1;
	}
	public static int getLastIndex(String s,int size,int f){
		while(f<size){
			if(s.charAt(f)==' ')
				return f-1;
			f++;
		}
		return f-1;
	}
	public static String reverse(String s,int f,int l){
		char ch[]=s.toCharArray();
		while(f<l){
			char temp=ch[f];
			ch[f]=ch[l];
			ch[l]=temp;
			f++;
			l--;
		}
		return s=new String(ch);
	}
	public static void main(String[] args) {
		String s="Bhoopendra Singh Patel";
		WordReverse wr=new WordReverse();
		s=wr.revString(s);
		int size=s.length();
		int l=0;
		for(int i=0;i<s.length();i=l+2){
			l=getLastIndex(s,size,i);
			s=reverse(s,i,l);
		}
		System.out.println(s);
	}
}