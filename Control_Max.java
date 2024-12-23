// 1. Write a program to find maximum between two numbers

import java.util.Scanner;


class Control_Max
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the 1st number :");
	int a = sc.nextInt();

	System.out.println("Enter the 2st number :");
	int b = sc.nextInt();

	if (a>b)
	{
	System.out.println("first number is max");
	}else 
	{
	System.out.println("2nd number is max");
	}

	}
}