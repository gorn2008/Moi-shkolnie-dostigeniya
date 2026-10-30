import java.util.Calendar;
import java.util.Scanner;

public class PensionProgram {
	
	public static final double yearPensionIncreaseValue = 1.1*1.05;

	public static void main(String[] args) {
		String usersPensionInput = (new Scanner(System.in)).nextLine();
		
		double currentPension = Double.parseDouble(usersPensionInput);
		int yearToPrint = Calendar.getInstance().getWeekYear() + 1;
		
		for (int i = 0; i < 3; i++) {
			currentPension = currentPension*yearPensionIncreaseValue;
			System.out.println("In the end of " + yearToPrint + ": " + currentPension + " BYN");			
			yearToPrint++;
		}		
		
	}

}
