import java.util.Scanner; 

/**
*This thing is for scanner
*
* @author Nikolas Huth
* @version 28 August 2014
*/

public class UserInputScanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Type something in: ");
		String x = scan.nextLine();
		System.out.println("You typed: " + x);
	}

}
