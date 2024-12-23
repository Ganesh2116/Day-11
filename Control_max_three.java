//2.Write a program to find maximum between three numbers


import java.util.Scanner;

class Control_max_three
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the 1 st number");
	int a = sc.nextInt();	

	System.out.println("Enter the 1 st number");
	int b = sc.nextInt();
	
	System.out.println("Enter the 1 st number");
	int c = sc.nextInt();
	

	if (a>b && a>c)	
	{
	System.out.println("1st number max ");
	}
	else if(b>a && b>c)
	{
	System.out.println("2nd number max ");
	}
	 else 
	{
	System.out.println("3rd number max ");
	}
	}
}