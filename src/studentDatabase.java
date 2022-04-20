import java.util.Scanner;

public class studentDatabase {
	
	//TODO: Fix the darn try catch

	public static void main(String[] args) {
		String[] studentNames = { "Grace Adu", "Luther Vandross", "Ginger Root", "Hambone Jawbone", "Penny Pizazz",
				"Bob Pancakes", "Bella Goth", "Nancy Landgraab", "Don Lothario", "Count Straud" };
		String[] hometown = { "Ann Arbor, MI", "Scottsdale, AZ", "Washington D.C.", "Boston, MA", "Honolulu,HI",
				"Chicago, IL", "Anchorage, AK", "San Franciso, CA", "Mobile, Alabama", "Miami, FL" };
		String[] favoriteFood = { "Lamb", "Jollof Rice", "Chocolate Cake", "Marmite", "Matzo Ball Soup", "Efo Riro",
				"Sujuk", "Sushi", "Tacos", "Bulgogi" };
		Scanner scnr = new Scanner(System.in);
		int userEntryName;
		String whatElse;
		
		System.out.print("Welcome to our Java class. Which student would you like to learn more about? (enter a number 1-10): ");
		
		userEntryName = scnr.nextInt();
		
			System.out.println("That student does not exist. Please try again. (enter a number between 1- 10)");
		
		
		System.out.println();
		getFromArray(studentNames, userEntryName);
		
		getToKnowStudent(studentNames, userEntryName);
		System.out.print(" (enter either \"hometown\" or \"favorite food\"): " );
		whatElse = scnr.nextLine();
		
		System.out.println(whatElse);
		
		
		
		
		//getFromArray(hometown, userEntryName);
		
		//getFromArray(favoriteFood, userEntryName);
		
		
	}
	//I corrected the user entry
	public static void getFromArray (String[] arr, int x) {
		int correctedEntry = x-1;
		String info = arr[correctedEntry];
		System.out.println(info);
	}
	//Student 10 is Kim Driscoll.  What would you like to know about Kim? (enter either “hometown” or “favorite food”)
	public static void getToKnowStudent(String[]arr, int x) {
		int correctedEntry = x -1;
		String getName = arr[correctedEntry];
		
		if (getName.contains(" ")){
			String firstName = getName.substring(0, getName.indexOf(" ") );
			
		System.out.print("Student " + x + " is " + getName + ". What would you like to know about " + firstName + "?");
		}
	}
}

	
