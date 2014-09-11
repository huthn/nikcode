public class commandline {

	public static void main(String[] args) {
		if(args.length >= 2) { 
			Double cost = Double.parseDouble(args[0]);
			Double inputoftip = Double.parseDouble(args[1]);
			Double tip = (inputoftip/100) + 1;
			Double grandTotal = cost * tip;
			if(inputoftip <= 9) {
				System.out.println("Are you sure you want to tip that much? Try again");
			} else {
				System.out.println("If your meal cost $" + args[0]+" and you put " + args[1] +  "% tip then you need to pay $" + grandTotal + " with tip");
			}
	} else {
		System.out.println("Please first put the cost of your meal and then how much tip you want to pay");
		}
	}
}
