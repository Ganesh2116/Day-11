//9 Write a program to input any character and check whether it is alphabet, digit or special character


import java.util.Scanner;

class AlphDigitSpecial
{
	 public static void main(String arge[])
	{	
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the your input:");
	char ch = sc.next().charAt(0);
	
	if ((ch >= 'a' && ch<='z') ||(ch >= 'A' && ch<='Z'))
	{
	System.out.println("this is Aplhabet :"+ch);	
	}
	else if(ch>='0' && ch<= '9')
	{
	System.out.println("This is number"+ch);
	}
	else 
	{
	System.out.println("this is special char"+ch);
	}	
	}	
}