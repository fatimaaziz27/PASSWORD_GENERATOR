// Password Generator
import java.security.SecureRandom;

public class PasswordGenerator {

    public static String generatePassword(int length) {

        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                          + "abcdefghijklmnopqrstuvwxyz"
                          + "0123456789"
                          + "!@#$%^&*()_-+=<>?/{}[]";

        SecureRandom random = new SecureRandom();

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }

        return password.toString();
    }

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter password length: ");
        int length = sc.nextInt();

        System.out.println("Generated Password: " + generatePassword(length));

        sc.close();
    }
}
