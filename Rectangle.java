import java.util.Scanner;
class Rectangle
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		
		int l, b, z;
		System.out.println(" enter length");
		l=sc.nextInt();
		
		System.out.println("enter breathe");
		b=sc.nextInt();
		
		z= 2*(l+b);
		
		System.out.println("perimeter of Rectangle "+z);
		
	}
	
}
