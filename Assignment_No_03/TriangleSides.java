// 15 .Write a program to input all sides of a triangle and check whether triangle is valid or not


import java.util.Scanner;

class TriangleSides
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the 1st side ");
	int side1 = sc.nextInt();
	
	System.out.println("Enter the 2nd side ");
	int side2 = sc.nextInt();

	System.out.println("Enter the 3rd side ");
	int side3 = sc.nextInt();

	if ((side1>0 && side2>0 && side3>0 ) && (side1+side2 >side3 && side1+side3 >side2 && 	side2 +side3 > side1))
	{
	System.out.println("this is valid Triangle...");
	}
	else
	{
	System.out.println("This is not valid Tringale...");
	}	

	}
}