// 5. Write a program to check whether a number is even or odd


import java.util.Scanner;


class Even_or_odd 
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number here :");
	int num = sc.nextInt();

	if (num%2 ==0)
	{
	System.out.println("The number is even");
	}
	else
	{
	System.out.println("The number is odd");
	}

	}
}