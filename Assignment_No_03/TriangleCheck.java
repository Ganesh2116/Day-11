//14.Write a program to input angles of a triangle and check whether triangle is valid or not

import java.util.Scanner;
	
class TriangleCheck
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);	
	
	System.out.println("Enter the 1st angles degree (0 to 180)");
	int ang1 = sc.nextInt();

	System.out.println("Enter the 1st angles degree (0 to 180)");
	int ang2 = sc.nextInt();

	System.out.println("Enter the 1st angles degree (0 to 180)");
	int ang3 = sc.nextInt();

	int tri = ang1 + ang2 + ang3 ;	
	
	if (tri == 180 && (ang1>0 && ang2>0 && ang3>0))
	{
	System.out.println("This is triangle...");
	}
	else 
	{
	System.out.println("This is not triangle...");
	}
	
	}
}