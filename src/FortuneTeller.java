import java.text.DecimalFormat;
import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		//Declaring variables
		String vacation = "";
		String transportation = "";
		int retirement =0; 
		int ageNum =0;
		int birthMonthNum = 0;
		int numSiblingsNum = 0;
		double bankBalance =0.00;
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
		if(!age.contains("quit")) {
			ageNum = Integer.parseInt(age) ;
		}
		System.out.println("Enter birth month as an integer: ");
		String birthMonth = input.nextLine().toLowerCase();
		checkForQuit(birthMonth);
		if(!birthMonth.contains("quit")) {
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
		if(!numSiblings.contains("quit")) {
			numSiblingsNum = Integer.parseInt(numSiblings);
			}
		
		//Retirement
		if(ageNum%2 == 0) {
		retirement = ageNum+13;
		}if (ageNum%2 == 1){
		retirement = ageNum+23;
		}
		
	  // Vacation Home Location
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
		vacation ="Sonoma, California";
		}
		if (numSiblingsNum >3) {
		vacation ="Miami, Florida";
		}
		if (numSiblingsNum <0) {
		vacation = "Pyongyan, North Korea";
		}
// Mode of Transportation
		if (favColor.contains("red")|| favColor.contains("r")) {
		transportation = "Jaguar XF";
		}
		if (favColor.contains("orange")|| favColor.contains("o")) {
		transportation = "bicycle";
		}
		if (favColor.contains("yellow")|| favColor.contains("y")) {
		transportation="private jet";
		}
		if (favColor.contains("green")|| favColor.contains("g")) {
		transportation = "your feet";
		}
		if (favColor.contains("blue")|| favColor.contains("b")) {
		transportation = "bajaj";
		}
		if (favColor.contains("indigo")|| favColor.contains("i")) {
		transportation = "Toyota Camry";
		}
		if (favColor.contains("violet")|| favColor.contains("v")) {
		transportation = "spaceship";
		}
		// Bank Balance
		if(birthMonthNum >= 1 && birthMonthNum <=4) {
			bankBalance = 455555.65;
		}
		if (birthMonthNum >4 && birthMonthNum <=8) {
			bankBalance = 245.67;
		}
		if (birthMonthNum >8 && birthMonthNum <=12) {
			bankBalance = 12544434.89;
		}else {
			bankBalance = 0.00;
		}
		DecimalFormat df = new DecimalFormat("#.##");
		// Final Fortune
		
		System.out.println(firstName+" "+lastName+" will retire in "+retirement+" years with $"+df.format(bankBalance)
				+" in the bank, a vacation home in "+vacation+", and travel by "+transportation+".");
	}
	//Terminate Program by quit input from user
	 public static void checkForQuit(String userInput) {
		 if (userInput.equalsIgnoreCase("quit")) {
			 System.out.println("Nobody likes a quitter!");
			 System.exit(0);
		 }
	 }
}
