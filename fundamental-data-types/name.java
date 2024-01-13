import java.util.Scanner;

public class Name 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter your first and last name: ");
		
		// Read in the first and last name
		String fname = in.next();
		String lname = in.next();
		
		// Print the last name, a comma, a space, and the first name
		String name = lname + ", " + fname;
		
		System.out.println(name);
	}
}
