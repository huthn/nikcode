/*
*  Convert user input in the format xxxF or yyyC from Celsius to Farenheit
*
*  @author Nikolas Huth
*  @version 25 September, 2014
**/

import java.util.Scanner;

	public class TemperatureChanger {

		public static void main (String[] args) {
  	 	Double finalTemp;
		//Creates a scanner to scan code
		Scanner scan = new Scanner(System.in);
		String temp = scan.nextLine();
		//stores the last letter in the string as whatTemp
		String whatTemp = temp.substring(temp.length() - 1);
		//Gets rid of last letter of string from temp
		temp = temp.substring(0, temp.length() - 1);	
		//converts string to double
		double actualTemp = Double.parseDouble(temp);

		if(whatTemp.equals("c") || whatTemp.equals("C")) {
			finalTemp = (actualTemp * 1.8) + 32;
			System.out.println(finalTemp + "F");
		}

		else if(whatTemp.equals("f") || whatTemp.equals("F")) {
			finalTemp = (actualTemp - 32) *(9/5);
			System.out.println(finalTemp + "C");
		} 

		else{
			System.out.println("Error, incorrect temperature type");
		}
		return;	
	} 
}


