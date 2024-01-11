import java.util.Scanner;

public class table
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Unit price" );
    double price = in.nextDouble();

    System.out.println("Quantity     Price");
    int quantity = 1;
    System.out.printf("%8d %9.2f%n", quantity, quantity * price);
    quantity = 12;
    System.out.printf("%8d %9.2f%n", quantity, quantity * price);
    quantity = 100;
    System.out.printf("%8d %9.2f%n", quantity, quantity * price);
  }
}
