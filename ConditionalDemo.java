import java.util.Scanner;
public class ConditionalDemo
{
	public static void main(String[] args)
	{
		System.out.println("Enter two number");
		Scanner sc =new Scanner(System.in);
		int num1,num2,large;
		num1=sc.nextInt();
		num2=sc.nextInt();
		large=(num1>num2) ? num1 : num2;
		System.out.print("large number="+large);
	}
}