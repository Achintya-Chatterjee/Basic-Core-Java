import java.util.Scanner;
class Unit
{
	public static void main (String [] args)
	
	{
		Scanner sc =new Scanner(System.in);
		int unit;
		double amt=0.0;
		
		System.out.println("Enter the unit");
		unit=sc.nextInt();
		
		if(unit<100)
		
		{
			amt=0.50*unit;
			
		}
		else if (unit>=101 && unit<=200)
		{
			amt=100+0.60*unit;
		
		}
		else if (unit>=201 && unit<=300)
		{
			amt= 200+0.70*unit;
		
		}
		else if (unit>300)
		{ 
			amt=500+1.00*unit;
			
		}
		
		
		
		System.out.println("u have to pay= "+ amt);
		
	}

	
}