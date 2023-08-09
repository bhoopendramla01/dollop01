import java.util.*;
class Game
{
	static char pos[]=new char[9];
	static char userState[]={2,2,2,2,2,2,2,2,2};
	static char user='X';
	static boolean isActive=true;
	static int winningPos[][]=
	{
		{0,1,2},
		{3,4,5},
		{6,7,8},
		{0,3,6},
		{1,4,7},
		{2,5,8},
		{0,4,8},
		{2,4,6}
	};
	public static void draw()
	{
		for(int i=0;i<9;i+=3)
		{
			System.out.println(pos[i]+"|"+pos[i+1]+"|"+pos[i+2]);
			if(i<5)
			System.out.println("_____");
		}
	}
	public static void checkWinner()
	{
		for(int i[]:winningPos)
		{
			if(userState[i[0]]==userState[i[1]]&&userState[i[0]]==userState[i[2]]&&userState[i[0]]!=2)
			{
				draw();
				System.out.println(user+" is winner");
				isActive=false;
			}
		}
	}
	public static void play()
	{
		System.out.println(user+" your turn!");
		Scanner sc=new Scanner(System.in);
			int userInput=sc.nextInt();
			if(userState[userInput-1]==2)
			{
				userState[userInput-1]=user=='O'?'O':'X';
				pos[userInput-1]=user;
			   checkWinner();
			   user=user=='O'?'X':'O';
			}
		
	}
	public static void main(String[] args) 
	{
		while(isActive)
		{
			draw();
			play();
		}
	}
}