//12. Write a program to input month number and print month Name


import java.util.Scanner;


class MonthNumName
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Month Num (1-12) :");
	int num = sc.nextInt();
	
	if (num == 1)
	{
	System.out.println("This Month is Jan");
	}
	else if (num == 2)
	{
	System.out.println("This Month is Feb");
	}
	else if (num == 3)
	{
	System.out.println("This Month is March");
	}
	else if (num == 4)
	{
	System.out.println("This Month is Apr");
	}
	else if (num == 5)
	{
	System.out.println("This Month is May");
	}
	else if (num == 6)
	{
	System.out.println("This Month is June");
	}
	else if (num == 7)
	{
	System.out.println("This Month is July");
	}
	else if (num == 8)
	{
	System.out.println("This Month is Aug");
	}
	else if (num == 9)
	{
	System.out.println("This Month is Sep");
	}
	else if (num == 10)
	{
	System.out.println("This Month is oct");
	}
	else if (num == 11)
	{
	System.out.println("This Month is Nov ");
	}
	else if (num == 12)
	{
	System.out.println("This Month is Dec");
	}
	else 
	{
	System.out.println("Enter correct week day...");
	}
	}
}