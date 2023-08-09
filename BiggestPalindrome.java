// class BiggestPalindrome{
// 	static public boolean issame(String str){
// 		System.out.println("T:"+str);
// 		int f=0,s=0,last=str.length()-1;
// 		while(s<last){
// 			if(str.charAt(s)!=str.charAt(last))
// 			{
// 				return false;
// 			}
// 			s++;
// 			last--;
// 		}
// 		return true;
// 	}
// 	static String biggestPalindrome(String s){
// 		//char ch[]=s.toCharArray();
// 		//int l=ch.length-1;
// 		int maxx=0;
// 		String ans="";
// 		for(int i=0;i<s.length();i++){
// 			for(int j=s.length()-1;j>=0;j--){
// 				if(s.charAt(i)==s.charAt(j))
// 				{
// 					//System.out.println(s.substring(i,j+1));
// 					if(issame(s.substring(i,j+1))){
// 						if((s.substring(i,j+1)).length()-1>maxx)
// 						{
// 							maxx=(s.substring(i,j+1)).length()-1;
// 							ans=s.substring(i,j+1);
// 						}
// 					}
// 				}
// 			}
// 		}
// 		return ans;
// 	}
// 	public static void main(String[] args) {
// 		String str="abcdcbarstu abcdefgfedcba";
// 		BiggestPalindrome bp=new BiggestPalindrome();
// 		System.out.println(bp.biggestPalindrome(str));
// 	}
// }


class BiggestPalindrome{
	static public boolean issame(String str){
		//System.out.println("T:"+str);
		int f=0,s=0,last=str.length()-1;
		while(s<last){
			if(str.charAt(s)!=str.charAt(last))
			{
				return false;
			}
			s++;
			last--;
		}
		return true;
	}
	static String biggestPalindrome(String s){
		//char ch[]=s.toCharArray();
		//int l=ch.length-1;
		int maxx=0;
		String ans="";
		for(int i=0;i<s.length();i++){
			for(int j=s.length()-1;j>i;j--){
				if(s.charAt(i)==s.charAt(j))
				{
					//System.out.println(s.substring(i,j+1));
					if(issame(s.substring(i,j+1))){
						if((s.substring(i,j+1)).length()-1>maxx)
						{
							maxx=(s.substring(i,j+1)).length()-1;
							ans=s.substring(i,j+1);
						}
					}
				}
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		String str="abcdcbarstu abcdefghfedcba";
		BiggestPalindrome bp=new BiggestPalindrome();
		System.out.println(bp.biggestPalindrome(str));
	}
}
