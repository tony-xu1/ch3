import java.util.Scanner;

public class Temperature {
	
	public static void main (String[] args){
	// scanner
	Scanner in = new Scanner(System.in);
	
	//final constants
	final double C_PER_F = 9.0/5.0;
	final int OFFSET = 32;
	
	System.out.print("Enter a temperature in Celsius: ");
	double celsius = in.nextDouble();
			in.nextLine();
		
		double farenheit = (celsius * C_PER_F) + OFFSET;
	System.out.printf("Temperature in Farenheit: %.2f F", farenheit);
	
	}
}
