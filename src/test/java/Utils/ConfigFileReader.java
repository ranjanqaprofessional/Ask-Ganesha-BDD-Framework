package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	public static Properties config = new Properties();

    static {
        try {
            // Load config file once when the class is loaded
            FileInputStream fis = new FileInputStream("src/test/resources/config/config.properties");
            config.load(fis);
            fis.close();
        } catch (IOException e) {
            throw new RuntimeException("Configuration file not found at src/test/resources/config/config.properties", e);
        }
    }
    
 // Direct access to properties
    public static String get(String key) {
        return config.getProperty(key);
    }
    
  




}
