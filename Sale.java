import java.util.Scanner;
class Sale
{
	public static void main(String[] args)
	
	{
		Scanner sc= new Scanner(System.in);
		int sale;
		double dis=0.0,tpay=0.0;
		
		System.out.println("enter the billing amount");
		sale=sc.nextInt();
		
		if(sale<1000)
		{
			System.out.println("no discount");
		
		}
		else if (sale>=1001 && sale<=5000)
		{
			
			dis=sale*10/100;
			tpay=sale-dis;
			System.out.println("10% discount"+dis);
			System.out.println("u have to pay"+tpay);
		}
		else if (sale>=5001 && sale<=10000)
		{
			dis=sale*20/100;
			tpay=sale-dis;
			System.out.println("20% discount"+dis);
			System.out.println("u have to pay"+tpay);
		}
		else 
		{
			dis=sale*30/100;
			tpay=sale-dis;
			System.out.println("30% discount"+dis);
			System.out.println("u have to pay"+tpay);
		
		}
		
		
	}
}