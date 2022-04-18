import java.util.Scanner;

public class studentDatabase {

	public static void main(String[] args) {
		String[] studentNames = { "Kim Jordan", "Luther Vandross", "Ginger Root", "Hambone Jawbone", "Penny Pizazz",
				"Bob Pancakes", "Bella Goth", "Nancy Landgraab", "Don Lothario", "Count Straud" };
		String[] hometown = { "Detroit, MI", "Scottsdale, AZ", "Washington D.C.", "Boston, MA", "Honolulu,HI",
				"Chicago, IL", "Anchorage, AK", "San Franciso, CA", "Mobile, Alabama", "Miami, FL" };
		String[] favoriteFood = { "Pizza", "Jollof Rice", "Chocolate Cake", "Marmite", "Matzo Ball Soup", "Efo Riro",
				"Sujuk", "Sushi", "Tacos", "Bulgogi" };
		Scanner scnr = new Scanner(System.in);
		System.out.println(
				"Welcome to our Java class. Which student would you like to learn more about? (enter a number 1-10): ");
				int userEntryName = scnr.nextInt();
				
	}

}
