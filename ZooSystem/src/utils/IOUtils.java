package utils;

import java.util.Scanner;

/**
 * A utility class for input validation methods.
 * Includes methods for:
 * - Validating integers (with and without range restrictions)
 * - Validating double/decimal values
 * - Validating text inputs
 *
 * @author Ken Healy and modified by Douglas Vinicius Dierings
 */
public class IOUtils {

    /**
     * Get a valid integer from the user.
     * @param scanner Scanner for input
     * @return Valid integer
     */
    public static int getValidInteger(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }

    /**
     * Get a valid integer within a specific range from the user.
     * @param scanner Scanner for input
     * @param min Minimum allowed value
     * @param max Maximum allowed value
     * @return Valid integer within the range
     */
    public static int getValidIntegerInRange(Scanner scanner, int min, int max) {
        while (true) {
            int number = getValidInteger(scanner);
            if (number >= min && number <= max) {
                return number;
            }
            System.out.println("Invalid input. Please enter a number between " + min + " and " + max + ".");
        }
    }

    /**
     * Get a valid double from the user.
     * @param scanner Scanner for input
     * @return Valid double
     */
    public static double getValidDouble(Scanner scanner) {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid decimal number.");
            }
        }
    }

    /**
     * Get a valid string (non-empty) from the user.
     * @param scanner Scanner for input
     * @return Valid string
     */
    public static String getValidString(Scanner scanner) {
        while (true) {
            String input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.println("Invalid input. Please enter a non-empty string.");
        }
    }
}
