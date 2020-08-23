import java.util.Scanner;
public class PositiveDemo
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num;
	
		System.out.print("Enter No:");
		num=sc.nextInt();
		
		if (num>0)
		{
			System.out.println("positive");
		}
		else if (num<0)
		{
			System.out.println("negetive");
		}
		else
		{
			System.out.println("Equal to Zero");
		}
		
	}
}