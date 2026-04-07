package Utils;

import java.util.Random;
import java.util.UUID;

public class RandomDataGenerator {
	private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final String NUMBERS = "0123456789";
    private static final Random random = new Random();

    // ✅ Random string of given length
    public static String getRandomString(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(ALPHABET.charAt(random.nextInt(ALPHABET.length())));
        }
        return sb.toString();
    }

    // ✅ Random number within a range
    public static int getRandomNumber(int min, int max) {
        return random.nextInt((max - min) + 1) + min;
    }

    // ✅ Random email address
    public static String getRandomEmail() {
        return "user" + getRandomNumber(1000, 9999) + "@testmail.com";
    }

    // ✅ Random alphanumeric string
    public static String getRandomAlphaNumeric(int length) {
        String characters = ALPHABET + NUMBERS;
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }
        return sb.toString();
    }

    // ✅ Random UUID
    public static String getRandomUUID() {
        return UUID.randomUUID().toString();
    }


}
