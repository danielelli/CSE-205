import java.util.Scanner;

public class Balloon 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Diameter: ");
		double diameter = in.nextDouble();
		
		/* code goes here */
		double volume1 = 3.14 * (diameter * diameter * diameter) / 6;
		diameter++;
		double volume2 = 3.14 * (diameter * diameter * diameter) / 6;
		double growth1 = volume2 - volume1;
		
		System.out.printf("Increase: %.0f", growth1);
		System.out.println();
		
		diameter++;
		double volume3 = 3.14 * (diameter * diameter * diameter) / 6;
		double growth2 = volume3 - volume2;
		
		System.out.printf("Increase: %.0f", growth2);
		
		System.out.println();
	}
}
