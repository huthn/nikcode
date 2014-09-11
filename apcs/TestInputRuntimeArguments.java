public class TestInputRuntimeArguments {
	public static void main(String[] args) {
		if(args.length == 2) {
			System.out.println(args[0] + " dollars in pounds if one pound is equal to " + args[1] + "dollars is " + Double.parseDouble(args[0]) * Double.parseDouble(args[0]));
		} else {
			System.out.println("Please first put the amount of dollars you want converted and then a space and then the conversion rate");
	}
	}
}
