import java.util.Scanner;
class Reverser
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int rev=0,mod,no;
		
		System.out.println("Enter no");
		no=sc.nextInt();
		while(no>0)
		{
			mod=no%10;
			rev=rev*10+mod;
			no=no/10;
			
		}
		System.out.println(rev);
	}
	
}
