import java.util.Scanner;

public class compareNumbers {

    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n == 0) 
        {
            System.out.println("The input is zero.");
        }
        if (n % 2 == 0) 
        {
            System.out.println("The input is even.");
        }
        if (n <= 9) 
        {
            System.out.println("The input has a single digit");
        }
    }
}