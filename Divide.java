import java.util.Scanner;
class Divide
{
	public static void main(String []args)
	{
		Scanner sc= new Scanner(System.in);
		int no,i,s=1;
		
		System.out.println("Enter the number");
		no=sc.nextInt();
		
		for(i=1;i<=no;i++)
		{
			s=s*i;
		}
		System.out.println(s);
	}

}