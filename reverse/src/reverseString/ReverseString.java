package reverseString;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// Create a Scanner object to read user input
		Scanner scanner = new Scanner(System.in);
		try {

			// Get the original string input from the user
			String originalString = getString(scanner);

			// Reverse the original string
			String reversedString = reversedString(originalString);

			// Print the original and reversed strings
			System.out.println("Original string: " + originalString);
			System.out.println("Reversed string: " + reversedString);
		} finally {

			// Close the scanner to free up resources
			scanner.close();
		}

	}

	// Method to get a string input from the user
	private static String getString(Scanner scanner) {
		System.out.println("Please enter your string: ");
		String userString = scanner.nextLine();
		return userString;
	}

	// Method to reverse the input string
	private static String reversedString(String originalString) {
		StringBuilder reversedString = new StringBuilder(originalString);
		return reversedString.reverse().toString();

	}
}
