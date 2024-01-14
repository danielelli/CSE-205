import java.lang.Math;

public class Balloon 
{
	public static double balloonRadius(double width, double height) 
	{
		return (width * height) / (8 * height) + height / 2;
	}
	public static double balloonVolume(double width, double height)
	{
		return (4.0 / 3) * Math.PI * Math.pow(balloonRadius(width, height), 3);
	}
	public static void main(String[] args)
	{
		double width = 3;
		double height = 4.5;
    
		double volume1 = balloonVolume(width, height);
    
		System.out.println("Original volume: " + volume1);
    
		double volume2 = balloonVolume(width + 1, height + 1);
		double change = volume2 - volume1;
    
		System.out.println("Change: " + change);
    
		change = balloonVolume(width + 2, height + 2) - volume2;
    
		System.out.println("Change: " + change);
	}
}
