package epam.house_cost;
import java.util.Scanner;

public class Client
{
	public static void main()
	{
		Scanner sc=new Scanner(System.in);
		int standard,area;
		System.out.println("Enter Material Standard\n1.standard\n2.above standard\n3.high standard\n4.high standard and fully automated home");
		standard=sc.nextInt();
		System.out.println("Enter total area of the house in sq.ft");
		area=sc.nextInt();
		Construction ob1=new Construction(standard,area);
		ob1.calculateCost();
		sc.close();
	}
}