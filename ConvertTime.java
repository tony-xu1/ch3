import java.util.Scanner;

public class ConvertTime {
	
	public static void main (String[] args){
	//conversions
	final int MIN_PER_SEC = 60;
	final int HOUR_PER_MIN = 60;
	final int HOUR_PER_SEC = 3600;

	Scanner in = new Scanner(System.in);
	System.out.print("How many seconds?");
	
	int seconds = in.nextInt();
				in.nextLine();
				
	int secs = seconds % MIN_PER_SEC;
	int minutes = (seconds % HOUR_PER_SEC) / HOUR_PER_MIN;
	int hours = seconds /HOUR_PER_SEC;
	
	System.out.printf("In hours, minutes, and seconds: %d hours, %d minutes, %d seconds", hours, minutes, secs);
	
	}
}
