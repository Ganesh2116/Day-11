//.16 Write a program to check whether the triangle is equilateral, isosceles or scalene triangle

import java.util.Scanner;


class TypeOfTriangle
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the 1st side :");
	int side1 = sc.nextInt();
	
	System.out.println("Enter the 2nd side ");
	int side2 = sc.nextInt();

	System.out.println("Enter the 3rd side");
	int side3 = sc.nextInt();

	if (side1 == side2 && side2 == side3)
	{
	System.out.println("This is the Equilateral Triangle..");
	}
	else if (side1 == side2 || side2 == side3 || side1 == side3)
	{	
	System.out.println("This is the Isosceles Triangle..");
	}
	else
	{
	System.out.println("This is the Scalene Triangle..");
	}
	}
}