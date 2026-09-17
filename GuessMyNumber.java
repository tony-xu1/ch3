import java.util.Scanner;
import java.util.Random;

public class GuessMyNumber {
	public static void main (String[] args){
	
	Random random = new Random();
	int number = random.nextInt(100) + 1;
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("I'm thinking of a number from 1 to 100. Can you guess what it is?");
	System.out.print("Type your number: ");
	
	int guess = in.nextInt();
				in.nextLine();
				
	int offset;
	if (guess >= number) {
		offset = guess - number;
	} else {
	offset  = number - guess;
}
				
	System.out.println("Your guess was: " + guess);
	System.out.println("The number I was thinking of was: " + number);
	
	if (offset >= 50){
	System.out.println("You were off by " + offset);
} else if(offset >= 1 && offset < 50){
	System.out.println("You were close! Off by " + offset);
} else if (offset == 0){
	System.out.println("You win!");
}
	
	}
}
