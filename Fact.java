import java.util.Scanner;
class Fact
{
	public static void main(String[] args)
	
	{
		Scanner sc= new Scanner(System.in);
		int no,i, fact=1;
		
		System.out.println("Enter a number");
		no=sc.nextInt();
		
		for(i=1;i<=no;i++)
		{
			fact=fact*i;
		
		}
		System.out.println("factorial of "+no+" = "+fact);
	}
	
	
}