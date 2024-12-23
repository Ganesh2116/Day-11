// 10 Write a program to check whether a character is uppercase or lowercase alphabet

import java.util.Scanner;


class UpperLowerCase
{
	public static void main(String [] arge) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter here character :");
	char ch = sc.next().charAt(0);

	if (ch >= 'a' && ch<='z')
	{
	System.out.println("This lowercase character : " +ch);
	}
	else if (ch >= 'A' && ch<='Z')
	{
	System.out.println("This Uppercase character : " +ch);
	}
	else 
	{
	System.out.println("Enter correct character : " +ch);
	}
	}
}