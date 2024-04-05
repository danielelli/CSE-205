import java.util.Scanner;

public class deal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("List price: ");
        double listPrice = in.nextDouble();
        System.out.print("Actual price: ");
        double actualPrice = in.nextDouble();

        if (actualPrice < listPrice * 0.5)
      {
         System.out.println("Great deal");   
      }
      else if (actualPrice < listPrice * 0.8)
      {
         System.out.println("Good deal");   
      }
      else if (actualPrice <= listPrice) 
      {
         System.out.println("Ok deal");   
      }
      else 
      {
         System.out.println("Bad deal");   
      }

    }
}