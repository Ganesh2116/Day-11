// 20 . Write a program to input basic salary of an employee and calculate its Gross salary //according to following:

// Basic Salary <= 10000 : HRA = 20%, DA = 80%
// Basic Salary <= 20000 : HRA = 25%, DA = 90%
// Basic Salary > 20000 : HRA = 30%, DA = 95%


import java.util.Scanner;

class EmploSalary
{
	public static void main(String[] arge)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Employee salary");
	int empsal = sc.nextInt();
	
	if (empsal <= 10000)
	{
	int hra = empsal*20/100;
	int da = empsal*80/100;

	System.out.println("Basic salary is "+empsal+",HRA"+hra+"and DA"+da);
	}
	else if (empsal <= 20000)
	{
	int hra = empsal*25/100;
	int da = empsal*90/100;

	System.out.println("Basic salary is "+empsal+",HRA"+hra+"and DA"+da);
	}
	else if (empsal > 20000)
	{
	int hra = empsal*30/100;
	int da = empsal*95/100;

	System.out.println("Basic salary is "+empsal+",HRA"+hra+"and DA"+da);
	}
	

	}
}