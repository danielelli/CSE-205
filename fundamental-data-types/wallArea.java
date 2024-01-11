// Import the Scanner class
import java.util.Scanner;

public class WallArea 
{
  public static void main(String[] args)
  {
    // Declare a scanner
    Scanner in = new Scanner("System.in");
    
    // Prompt for and read the width and height
    // and the number of windows
    System.out.print("Wall width: ");
    double wallWidth = in.nextDouble();

    System.out.print("Wall height: ");
    double wallHeight = in.nextDouble();
    
    System.out.print("Number of windows: ");
    int numberOfWindows = in.nextInt();

    // Compute the area of the wall without the windows
    final int WINDOW_AREA = 6;
    int windowSpace = numberOfWindows * WINDOW_AREA; //the area of space that windows take up on a wall
    double area = (wallWidth * wallHeight) - windowSpace;
    
    System.out.println("Area: " + area);
  }
}
