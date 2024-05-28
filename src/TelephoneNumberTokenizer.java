import java.util.Scanner;

public class TelephoneNumberTokenizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a telephone number (in the form (555) 555-5555): ");
        String phoneNumber = scanner.nextLine();

        // Remove non-digit characters from the phone number
        String sanitizedPhoneNumber = phoneNumber.replaceAll("[^0-9]", "");

        // Split the sanitized phone number into tokens
        String areaCode = sanitizedPhoneNumber.substring(0, 3);
        String firstThreeDigits = sanitizedPhoneNumber.substring(3, 6);
        String lastFourDigits = sanitizedPhoneNumber.substring(6);

        // Concatenate the seven digits into one string
        String fullPhoneNumber = firstThreeDigits + lastFourDigits;

        // Print the area code and the full phone number
        System.out.println("Area code: " + areaCode);
        System.out.println("Phone number: " + fullPhoneNumber);
    }
}
