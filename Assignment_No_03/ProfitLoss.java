// 18. Write a program to calculate profit or loss


import java.util.Scanner;

class ProfitLoss
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the price of product");
	int p = sc.nextInt();
	
	System.out.println("Enter the selling price of product");
	int s = sc.nextInt();
	
	int l = s-p;
	int pr = s+p;

	if (s>p)
	{
	System.out.println("This product profit is "+pr);
	}
	else 
	{
	System.out.println("This product loss is "+l);
	}	
	
	}
}
