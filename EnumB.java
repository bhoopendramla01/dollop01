enum Days
{
	mon,tue,wed,thu,fri,sat,sun
}

class Test
{
	public static void main(String[] args) 
	{
		BSP.output.println(Days.mon.ordinal());
	}
}

class Test1
{
	enum Color
	{
		RED,BLUE,WHITE,GREEN,BLACK,SILVER,ORANGE
	}
	public static void main(String[] args) 
	{
		BSP.output.println("Basic Color: "+Color.RED);

		for(Color c:Color.values())
		{
			BSP.output.println(c);
		}
	}
}

class Test2
{
	enum Plan{
		;public static String plan()
		{
			return "SILVER";
		}
	}
	public static void main(String[] args) 
	{
		BSP.output.println(Plan.plan());
	}
}

enum Size
{
	SMALL,MEDIUM,LARGE,EXTRALARGE
}

class Test3
{
	Size pizzaSize;
	public Test3(Size pizzaSize)
	{
		this.pizzaSize=pizzaSize;
	}
	public void orderPizza()
	{
		switch(pizzaSize) 
		{
     		case SMALL:
      			BSP.output.println("I ordered a small size pizza.");
       			break;
     		case MEDIUM:
      			BSP.output.println("I ordered a medium size pizza.");
       			break;
       		case LARGE:
       			BSP.output.println("I ordered a large size pizza");
       			break;
     		case EXTRALARGE:
     			BSP.output.println("I ordered a extra large size pizza");
     			break;
     		default:
       			BSP.output.println("I don't know which one to order.");
       			break;
   		}
	}
	public static void main(String[] args) 
	{
   		Test3 t = new Test3(Size.MEDIUM);
   		t.orderPizza();
   		Test3 t1 = new Test3(Size.SMALL);
   		t1.orderPizza();
 	}
}

class Test4  //ordinal();
{
	public static void main(String[] args) 
	{
		BSP.output.println(Size.SMALL.ordinal());			
		BSP.output.println(Size.MEDIUM.ordinal());
		BSP.output.println(Size.LARGE.ordinal());
		BSP.output.println(Size.EXTRALARGE.ordinal());
	}
}

class Test5  //compareTo();
{
	public static void main(String[] args) 
	{
		BSP.output.println(Size.SMALL.compareTo(Size.LARGE));
	}
}

class Test6   //toString();
{
	public static void main(String[] args) 
	{
		BSP.output.println(Size.SMALL.toString());	
	}
}

class Test7   //name();
{
	public static void main(String[] args) 
	{
		BSP.output.println(Size.SMALL.name());	
	}
}

class Test8    //valueOf();
{
	public static void main(String[] args) 
	{
		BSP.output.println(Size.valueOf("SMALL"));	
	}
}

