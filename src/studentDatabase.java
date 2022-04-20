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
		String whatElseInfo;
		boolean whichQuest = false;
		
		System.out.print("Welcome to our Java class. Which student would you like to learn more about? (enter a number 1-10): ");
		//get student number from user
		userEntryName = scnr.nextInt();
		//flush the new line leftover from hitting enter from the nextInt >:[
		scnr.nextLine();
		
		//print initial student info
		getToKnowStudent(studentNames, userEntryName);
		
		System.out.print(" (enter either \"hometown\" or \"favorite food\"): " );
		whatElseInfo = scnr.nextLine().toLowerCase();
		
		//System.out.println(whatElse);
		
		if(whatElseInfo.equals("hometown")) {
			whichQuest = false;
			System.out.print("\n"+ firstName(studentNames, userEntryName) +" is from " + getFromArray(hometown, userEntryName) );
			
		}else if (whatElseInfo.equals("favorite food")) {
			whichQuest = true;
			System.out.print("\n"+ firstName(studentNames, userEntryName) + "'s favorite food is " + getFromArray(favoriteFood, userEntryName));
		}
		
		System.out.print(". Would you like to know more? (enter yes or no): ");
		String yesNo = scnr.next().toLowerCase();
		
		if(yesNo.equals("yes")) {
			if (whichQuest == false) {
				System.out.print("\n"+ firstName(studentNames, userEntryName) + "'s favorite food is " + getFromArray(favoriteFood, userEntryName)+ ". ");
			}else if (whichQuest == true) {
				System.out.print("\n"+ firstName(studentNames, userEntryName) +" is from " + getFromArray(hometown, userEntryName)+". " );				
			}
		}else if (yesNo.equals("no")) {
			
		}
		System.out.println("\n" + "Thank you for using the Student Database!");
		
		
	}
	
	public static String firstName(String[]arr, int x) {
		int correctedEntry = x - 1;
		String name = arr[correctedEntry];
		String firstName = name.substring(0, name.indexOf(" "));
		return firstName;
	}
	//I corrected the user entry and return the desire info from array
	public static String getFromArray (String[] arr, int x) {
		int correctedEntry = x-1;
		String info = arr[correctedEntry];
		return info;
	}
	//Student 10 is Kim Driscoll.  What would you like to know about Kim? (enter either “hometown” or “favorite food”)
	public static void getToKnowStudent(String[]arr, int x) {
		int correctedEntry = x -1;
		String getName = arr[correctedEntry];
		
		if (getName.contains(" ")){
			String firstName = getName.substring(0, getName.indexOf(" ") );
			
		System.out.print("\n" + "Student " + x + " is " + getName + ". What would you like to know about " + firstName + "?");
		}
	}
}

	
