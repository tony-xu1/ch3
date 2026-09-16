import java.util.Scanner;
import java.util.Random;

pulic class GuessMyNumber {
	public static void main (String[] args){
	
	Random random = new Random();
	int number = random.nextInt(100) + 1;
	
	Scanner in = new Scanner(System.in);
	int guess = in.nextInt();
				nextLine();
	
	System.out.println("I'm thinking of a number from 1 to 100. Can you guess what it is?");


	}
}
