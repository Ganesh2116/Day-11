// 3 Write a program to check whether a number is negative, positive or zero

import java.util.Scanner;

class Check_Num
{
	public static  void main(String [] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the ");
	int a = sc.nextInt();
	
	if (a>0)
	{
	System.out.println("The number is +ve");	
	}
	else if(a<0)
	{
	System.out.println("the number is -ve");
	}
	else if(a == 0)
	{
	System.out.println("The number zero");
	}
	else
	{
	System.out.println("Enter correct number...");
	
	} 
	
	
		}
}