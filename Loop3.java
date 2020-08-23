import java.util.Scanner;
class Loop3
{
	public static void main(String [] args)
	
	{
	Scanner sc = new Scanner(System.in);
	int no,i,no2;
	
	System.out.println("Enter a number");
	no=sc.nextInt();
	
	for (i=1;i<=10;i++)
		{
			no2=no*i;
			System.out.println(no+ "*"+i+ "="+no2);
		}
	
	}
	

}