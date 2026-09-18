 import java.util.Scanner;

public class test{

public static void main (String[] args) {

Scanner input = new Scanner(System.in);
int numCookies = input.nextInt();
				input.nextLine();
	int numCartons = numCookies/200;
	int numBoxes = (numCookies%200)/10;
	int numSamples = numCookies%10;
	
	int value = numCartons * 100 + numBoxes * 4 + numSamples * 0;
	System.out.println("Total Value: $" + value);

	}
}
