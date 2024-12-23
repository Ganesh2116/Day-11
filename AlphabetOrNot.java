// 7 Write a program to check whether a character is alphabet or not

import java.util.Scanner;

class AlphabetOrNot
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter number or alphabet:");
	char chara = sc.next().charAt(0);
	
	if ((chara >= 'a' && chara <= 'z') || (chara >= 'A' && chara <= 'Z'))
	{
	System.out.println("this is alphabet");
	}
	else 
	{
	System.out.println("this is not alphabet");
	}
	}

}