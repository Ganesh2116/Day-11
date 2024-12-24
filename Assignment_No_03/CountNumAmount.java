// 13.Write a program to count total number of notes in given amount


import java.util.Scanner;

class CountNumAmount
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the amount:");
	int amu = sc.nextInt();
	
	if (amu<=0)
	{
	System.out.println("Enter correct amount here....");
	}
	
	int note2000 = 0,note500 =0,note200=0,note100=0,note50=0,note20=0,note10=0,note5=	0,note2=0,note1=0;
	
	if (amu>=2000)
	{
	note2000 = amu/2000;
	amu %=2000;
	}
	if (amu>=500)
	{
	note500 = amu/500;
	amu %=500;
	}
	if (amu>=200)
	{
	note200 = amu/200;
	amu %=200;
	}
	if (amu>=100)
	{
	note100 = amu/100;
	amu %=100;
	}
	if (amu>=50)
	{
	note50 = amu/50;
	amu %=50;
	}
	if (amu>=10)
	{
	note10 = amu/10;
	amu %=10;
	}
	if (amu>=5)
	{
	note5 = amu/5;
	amu %=5;
	}
	if (amu>=2)
	{
	note2 = amu/2;
	amu %=2;
	}
	if (amu>=1)
	{
	note1 = amu/1;
	}

	if (note2000>0){System.out.println("2000 notes is :"+note2000);}
	if (note500>0){System.out.println("500 notes is :"+note500);}
	if (note200>0){System.out.println("200 notes is :"+note200);}
	if (note100>0){System.out.println("100 notes is :"+note100);}
	if (note50>0){System.out.println("50 notes is :"+note50);}
	if (note20>0){System.out.println("20 notes is :"+note20);}
	if (note10>0){System.out.println("10 notes is :"+note10);}
	if (note5>0){System.out.println("5 notes is :"+note5);}
	if (note2>0){System.out.println("2 notes is :"+note2);}
	if (note1>0){System.out.println("1 notes is :"+note1);}

	
	}
}