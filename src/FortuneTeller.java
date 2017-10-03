import java.text.DecimalFormat;
import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		// User Input
		Scanner input = new Scanner(System.in);

		System.out.println("Enter first name: ");
		String firstName = input.nextLine();
		checkForQuit(firstName);

		System.out.println("Enter last name: ");
		String lastName = input.nextLine();
		checkForQuit(lastName);

		System.out.println("Enter your age: ");
		String age = input.nextLine().toLowerCase();
		checkForQuit(age);
		int ageNum=0;
		if (!age.contains("quit")) {
			ageNum = Integer.parseInt(age);
		}
		System.out.println("Enter birth month as an integer: ");
		String birthMonth = input.nextLine().toLowerCase();
		checkForQuit(birthMonth);

		int birthMonthNum = 0;
		if (!birthMonth.contains("quit")) {
			birthMonthNum = Integer.parseInt(birthMonth);
		}

		System.out.println("Enter favorite ROYGBIV color. Enter help if unsure what ROYGBIV is : ");
		String favColor = input.nextLine().toLowerCase();
		checkForQuit(favColor);

		while (favColor.contains("help")) {
			System.out.println("ROYGBIV is an acronym that makes up the rainbow."
					+ " R: Red, O: Orange, G: Green, B: Blue, I: Indigo, V: Violet \n ");
			System.out.println("Enter favorite ROYGBIV color. Enter help if you are unsure what ROYGBIV is : ");
			favColor = input.nextLine();
			checkForQuit(favColor);
		}

		System.out.println("Enter the number siblings you have: ");
		String numSiblings = input.nextLine().toLowerCase();
		checkForQuit(numSiblings);
		int numSiblingsNum = 0;
		if (!numSiblings.contains("quit")) {
			numSiblingsNum = Integer.parseInt(numSiblings);
		}

		// Retirement
		int retirement;
		if (ageNum % 2 == 0) {
			retirement = ageNum + 13;
		}
		else {
			retirement = ageNum + 23;
		}

		// Vacation Home Location
		String vacation =null;
		if (numSiblingsNum == 0) {
			vacation = "San Fransico, California";
		}
		if (numSiblingsNum == 1) {
			vacation = "Big Sur, California";
		}
		if (numSiblingsNum == 2) {
			vacation = "Sedona, Arizona";
		}
		if (numSiblingsNum == 3) {
			vacation = "Sonoma, California";
		}
		if (numSiblingsNum > 3) {
			vacation = "Miami, Florida";
		}
		if (numSiblingsNum < 0) {
			vacation = "Pyongyan, North Korea";
		}
		// Mode of Transportation
		String transportation = null;
		if (favColor.equals("red") || favColor.equals("r")) {
			transportation = "Jaguar XF";
		}
		if (favColor.equals("orange") || favColor.equals("o")) {
			transportation = "bicycle";
		}
		if (favColor.equals("yellow") || favColor.equals("y")) {
			transportation = "private jet";
		}
		if (favColor.equals("green") || favColor.equals("g")) {
			transportation = "your feet";
		}
		if (favColor.equals("blue") || favColor.equals("b")) {
			transportation = "bajaj";
		}
		if (favColor.equals("indigo") || favColor.equals("i")) {
			transportation = "Toyota Camry";
		}
		if (favColor.contains("violet") || favColor.equals("v")) {
			transportation = "spaceship";
		}
		// Bank Balance
		double bankBalance;
		if (birthMonthNum >= 1 && birthMonthNum <= 4) {
			bankBalance = 455555.65;
		}
		else if (birthMonthNum > 4 && birthMonthNum <= 8) {
			bankBalance = 245.67;
		}
		else if (birthMonthNum > 8 && birthMonthNum <= 12) {
			bankBalance = 12544434.89;
		} else {
			bankBalance = 0.00;
		}
		DecimalFormat df = new DecimalFormat("#.##");

		// Final Fortune
		System.out.println(
				firstName + " " + lastName + " will retire in " + retirement + " years with $" + df.format(bankBalance)
						+ " in the bank, a vacation home in " + vacation + ", and travel by " + transportation + ".");
	}

	// Terminate Program by quit input from user
	public static void checkForQuit(String userInput) {
		if (userInput.equalsIgnoreCase("quit")) {
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		}

	}

}
