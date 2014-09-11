/*
*This is a program to calculate what day of the week it is
*
*Nikolas Huth
*/
import java.util.Scanner;

public class moduloTest {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("This year started on a monday.");
		System.out.println("What day of the year do you want to find? Including the day today");
		int dayOfYear = scan.nextInt();	
		int dayOfWeek = (dayOfYear + 1) % 7;	
		String dayString;
		switch (dayOfWeek) {
			case 0: dayString = "Monday";
				break;
			case 1: dayString = "Tuesday";
				break;
			case 2: dayString = "Wednesday";
				break;
			case 3: dayString = "Thursday";
				break;
			case 4: dayString = "Friday";
				break;
			case 5: dayString = "Saturday";
				break;
			case 6: dayString = "Sunday";
				break;
			default: dayString = "(There was an error in calculation)";
				break;
		}
		System.out.println("That day would be a "+ dayString);
	}	
}
