import java.util.Scanner;

public class scanner {


	public static void main(String[] args) {
	System.out.println("Welcome to tip calculator");
	
	System.out.println("How much did your meal cost? (in dollars)");
		
	Scanner scan = new Scanner(System.in);

		double Total  = scan.nextDouble(); 
	
	System.out.println("What percent tip do you want to pay?");
		
		double Tip = scan.nextDouble();
		
		double Taxes = Tip / 100;
		double GrandTotal = 1 + Taxes;
		double SubTotal = GrandTotal * Total;
	
	System.out.println("Calculating.....");
	
	if (Tip < 10) {
		System.out.println("Are you sure you want to pay that much? yes/no ");	
	
	String Response = scan.next();
	if (Response.equals("yes")) {
		System.out.println("You have to pay $" + SubTotal);
	}
	
	if (Response.equals("no")) {
		System.out.println("What percent tip  do you want to pay?");
	}	
		
	double ResponseNo = scan.nextDouble();
	
	
	if (ResponseNo > 10) {
		System.out.println("Congrats on not being a cheapskate!");
		System.out.println("You have to pay $" + SubTotal);
	}
	}
	else {
		System.out.println("You have to pay $" + SubTotal);
	}
	
}
}	


