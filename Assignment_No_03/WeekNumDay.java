// 11. Write a program to input week number and print week day

import java.util.Scanner;

class WeekNumDay

{

	public static void main(String[] arge)
	{ 
	Scanner sc =new Scanner(System.in);

	System.out.println("Enter the week Num (1-7)"); 
	int num = sc.nextInt();

	if (num==1) 
	{ 
	System.out.println("This Day is Monday");
	}
	else if (num==2)
	{ 
	System.out.println("This Day is Tuesday"); 
	}
	else if (num==3) 
	{
	System.out.println("This Day is Wednesday");
	} 
	else if (num==4) 
	{ 
	System.out.println("This Day is Thursday");
	} 
	else if (num==5) 
	{
	System.out.println("This Day is Firday");
	} 
	else if (num==6)
	{ 
	System.out.println("This Day is Saturday");
	} 
	else if (num==7) 
	{
	System.out.println("This Day is Sunday");
	}
	else 
	{ 
	System.out.println("Enter correct week day...");
	}
	}

}