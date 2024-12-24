// 19 Write a program to input marks of five subjects Physics, Chemistry, Biology, //Mathematics and Computer. Calculate percentage and grade according to following:

// Percentage >= 90% : Grade A
// Percentage >= 80% : Grade B
// Percentage >= 70% : Grade C
// Percentage >= 60% : Grade D
// Percentage >= 40% : Grade E
// Percentage < 40% : Grade F

import java.util.Scanner;

class GradePercentage 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

      
        System.out.println("Enter the Physics marks:");
        int phy = sc.nextInt();

        System.out.println("Enter the Chemistry marks:");
        int chem = sc.nextInt();

        System.out.println("Enter the Biology marks:");
        int bio = sc.nextInt();

        System.out.println("Enter the Mathematics marks:");
        int math = sc.nextInt();

        System.out.println("Enter the Computer marks:");
        int comp = sc.nextInt();

     
        double total = phy + chem + bio + math + comp;
        double percentage = (total / 500) * 100;

       
        if (percentage >= 90) 
	{
        System.out.println("Grade is: A");
        } 
	else if (percentage >= 80) 
	{
        System.out.println("Grade is: B");
        } 
	else if (percentage >= 70) 
	{
        System.out.println("Grade is: C");
        } else if (percentage >= 60) 
	{
        System.out.println("Grade is: D");
        } else if (percentage >= 40) 
	{
        System.out.println("Grade is: E");
        } else 
	{
        System.out.println("Grade is: F");
        }

    }
}
