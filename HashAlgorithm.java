import java.util.Scanner;

public class HashAlgorithm {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Calculate the sum of ASCII values of the characters in the string
        int sumOfAsciiValues = calculateSumOfAsciiValues(input);

        // Generate the hash code of the input string
        int hashCode = input.hashCode();

        // Display the results
        System.out.println("Given string is: " + input);
        System.out.println("Sum of ASCII values: " + sumOfAsciiValues);
        System.out.println("Hash code: " + hashCode);
    }

    // Method to calculate the sum of ASCII values
    private static int calculateSumOfAsciiValues(String str) {
        int sum = 0;
        for (char c : str.toCharArray()) {
            sum += (int) c;
        }
        return sum;
    }
}
