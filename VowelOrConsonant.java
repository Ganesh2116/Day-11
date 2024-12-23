// 8  Write a program to input any alphabet and check whether it is vowel or consonant


import java.util.Scanner;


class VowelOrConsonant
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter number or alphabet:");
	char chara = sc.next().toLowerCase().charAt(0);
	
	if (chara >= 'a' && chara <= 'z') 
	{
	if (chara == 'a'|| chara == 'o'|| chara == 'i'|| chara == 'o'|| chara == 'u')
	{
	System.out.println("This is vowel"+chara);
	}else 
	{
	System.out.println("This is Consonant"+chara);
	}
	}
	else 
	{
	System.out.println("this is not alphabet");
	}
	
	}

}