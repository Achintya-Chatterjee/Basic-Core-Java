import java.util.Scanner;
class Weight
{
	public static void main(String []args)
	{
		Scanner sc= new Scanner(System.in);
		int Weight;
		double amt=0.0;
		
			System.out.println("Enter the Weight");
			Weight=sc.nextInt();
			
			if (Weight<10)
			
				{
				amt=0.00*(Weight-10);
				}
			else if (Weight>=11 && Weight<=20)
				{
				amt=5.00*(Weight-10);
			
				}
			else if (Weight>=21 && Weight<=50)
				{
				amt=8.00*(Weight-10);
				
				}
			else if (Weight>51)
				{
				amt=10.00*(Weight-10);
				}
			
			System.out.println("you have to pay" + amt);
	}



}