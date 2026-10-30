import java.util.Calendar;
import java.util.Scanner;

public class PensionProgram {

	public static void main(String[] args) {
		String usersPensionInput = (new Scanner(System.in)).nextLine();
		Double initialPension = Double.parseDouble(usersPensionInput);
		
		double pensionIncreaseValue = 1.1*1.05;
		double currentPension = initialPension;
		int yearToPrint = Calendar.getInstance().getWeekYear() + 1;
		
		for (int i = 0; i < 3; i++) {
			currentPension = currentPension*pensionIncreaseValue;
			System.out.println("In the end of " + yearToPrint + ": " + currentPension + " BYN");			
			yearToPrint++;
		}		
		
	}

}
