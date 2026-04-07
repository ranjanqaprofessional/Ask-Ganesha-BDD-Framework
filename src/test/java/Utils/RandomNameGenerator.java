package Utils;

import java.util.Random;

public class RandomNameGenerator {
	private static final String[] NAMES = {
	        "Alice", "Bob", "Charlie", "Diana", "Ethan",
	        "Fiona", "George", "Hannah", "Ian", "Julia"
	    };
	 public static String getRandomName() {
	        Random random = new Random();
	        int index = random.nextInt(NAMES.length);
	        return NAMES[index];
	    }


}
