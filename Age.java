import java.util.Scanner;
class Age
{
	public static void main (String[] args)

	{
		Scanner sc= new Scanner (System.in);
		int age;

		System.out.println("Enter the Age");
		age=sc.nextInt();

		if (age<18)
		{
			System.out.println("u r child");

		}
		else if (age>=18 && age<=60)
		{
			System.out.println("u r adult");

		}
		
		else
		{
			System.out.println("u r senior citizen");
		}

	}
}