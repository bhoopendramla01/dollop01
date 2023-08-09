class Question
{
	int quesNo;
	String question;
	String opt1,opt2,opt3,opt4;
	int optNo1,optNo2,optNo3,optNo4;
	int ans,userAns;
}
class Quiz
{
	Question que[];
	int quesCount;
	Quiz()
	{
		que=new Question[5];
		quesCount=-1;
		getQuestions();
	}
	public void result()
	{
		int r=0,w=0,na=0;
		for(int i=0;i<=quesCount;i++)
		{
			if(que[i].userAns==0)
				na++;
			else if(que[i].ans==que[i].userAns)
				r++;
			else
				w++;
		}
		System.out.println("Right Ans: "+r+" ,Wrong Ans: "+w+" ,Not Atempt: "+na);
	}
	public void getQuestions()
	{
		/*---------------- QueNo -: 01 --------------------*/

		q=new Question();
		q.quesNo=1;
		q.question="Full form of OOPs ?";
		q.opt1="Object Operational Program";
		q.opt2="Object Oracale Program";
		q.opt3="Object Orianted Program";
		q.opt4="Orianted Object Program";
		q.ans=3;
		que[++quesCount]=q;

		/*---------------- QueNo -: 02 --------------------*/

		q=new Question();
		q.quesNo=2;
		q.question="How many primitive data types in java ?";
		q.opt1="8";
		q.opt2="4";
		q.opt3="12";
		q.opt4="2";
		q.ans=1;
		que[++quesCount]=q;

		/*---------------- QueNo -: 03 --------------------*/

		q=new Question();
		q.quesNo=3;
		q.question="Which inheritence type is not suported by java ?";
		q.opt1="Multilevel";
		q.opt2="Single";
		q.opt3="Multiple";
		q.opt4="Both 1 & 3";
		q.ans=3;
		que[++quesCount]=q;

		/*---------------- QueNo -: 04 --------------------*/

		q=new Question();
		q.quesNo=4;
		q.question="Which member is not visible in child class in java ?";
		q.opt1="public";
		q.opt2="private";
		q.opt3="protected";
		q.opt4="Both 2 & 3";
		q.ans=2;
		que[++quesCount]=q;

		/*---------------- QueNo -: 05 --------------------*/

		q=new Question();
		q.quesNo=5;
		q.question="How many keyword types in java ?";
		q.opt1="8";
		q.opt2="52";
		q.opt3="28";
		q.opt4="32";
		q.ans=2;
		que[++quesCount]=q;
	}
	public void showQuestion()
	{
		
	}
}