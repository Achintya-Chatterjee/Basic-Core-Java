import java.util.Scanner;
class Welcome
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome in cpc");
		int x,y,z;
		
		System.out.println("enter the 1st no");
		x=sc.nextInt();
		
		System.out.println("enter the 2nd no");
		y=sc.nextInt();
		
		z=x+y;
		System.out.println(x +" + "+y+ " = "+z);
	}
}	
		