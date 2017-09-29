import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		String vacation = "";
		String transportation = "";
		int retirement =0; 
		double bankBalance =0.00;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first name: ");
		String firstName = input.nextLine();
		
		System.out.println("Enter last name: ");
		String lastName = input.nextLine();
		
		System.out.println("Enter your age: ");
		int age = input.nextInt();
		
		System.out.println("Enter birth month as an integer: ");
		int birthMonth = input.nextInt();
		input.nextLine();
		
		System.out.println("Enter favorite ROYGBIV color. Enter help if unsure what ROYGBIV is : ");
		String favColor = input.nextLine().toLowerCase();
		
		if (favColor.contains("help")) {
			System.out.println(" ROYGBIV is an acronym that makes up the rainbow."
					+ " R: Red, O: Orange, G: Green, B: Blue, I: Indigo, V: Violet \n ");
			System.out.println("Enter favorite ROYGBIV color. Enter help if you are unsure what ROYGBIV is : ");
			 favColor = input.nextLine();
		}
		
		System.out.println("Enter the number siblings you have: ");
		int numSiblings = input.nextInt();
		
		//retirement
		if(age%2 == 0) {
		retirement = age+13;
		}if (age%2 ==1){
		retirement = age+13;
		}
		
	  // Vacation Home Location
		if (numSiblings == 0) {
		vacation = "San Fransico, California";
		}
		if (numSiblings == 1) {
		vacation = "Big Sur, California";
		}
		if (numSiblings == 2) {
			System.out.println("Your vacation home will be in Sedona, Arizona.");
		}
		if (numSiblings == 3) {
		vacation ="Sonoma, California";
		}
		if (numSiblings >3) {
		vacation ="Miami, Florida";
		}
		if (numSiblings <0) {
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
		transportation = "Toyota Camry.";
		}
		if (favColor.contains("violet")|| favColor.contains("v")) {
		transportation = "spaceship";
		}
		// Bank Balance
		if(birthMonth >= 1 && birthMonth <=4) {
			bankBalance = 455555.65;
		}
		if (birthMonth >4 && birthMonth <=8) {
			bankBalance = 245.67;
		}
		if (birthMonth >8 && birthMonth <=12) {
			bankBalance = 12544434.89;
		}else {
			bankBalance = 0.00;
		}
		// Final Fortune
		System.out.println(firstName+" "+lastName+" will retire in "+retirement+" years with $"+bankBalance
				+" in the bank, a vacation home in "+vacation+", and travel by "+transportation+".");
	}

}
