// 6. Write a program to check whether a year is leap year or not


import java.util.Scanner;

class LeapYear
{
	public static void main(String [] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the year :");
	int year = sc.nextInt();
	
	if (year%4 == 0 )
	{
	System.out.println("This leap year");
	}
	else
	{
	System.out.println("This is not leap year");
	}
	}
}
