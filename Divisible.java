// 4 Write a program to check whether a number is divisible by 5 and 11 or not

import java.util.Scanner;

class Divisible
{
	public static void main(String [] arge)
	{	
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the values");
	int num = sc.nextInt();
	
	if (num%5 == 0 && num%11 == 0)
	{
	System.out.println("The num is divisible by 5 and 11");
	}

	if (num%5 == 0)
	{
	System.out.println("the num is divisible by 5");
	
	}
	else if (num%11 == 0)
	{
	System.out.println("The num is divisible by 11");
	}
	else if (num%5 == 0)
	{
	System.out.println("the num is divisible by 5");
	
	}

	
	}
}