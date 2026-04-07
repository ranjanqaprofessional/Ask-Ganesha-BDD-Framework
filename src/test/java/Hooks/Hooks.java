package Hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utils.ConfigFileReader;
import Utils.DriverManager;
import Utils.ExcelManager;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class Hooks {


    @BeforeAll
    public static void beforeAll() {
        System.out.println(">>> Runs once before all scenarios");
        
         DriverManager.initDriver(ConfigFileReader.get("browser")); // You can parameterize this
       // ExcelManager.getInstance(ConfigFileReader.get("excelfilepath")); // Initialize ExcelManager with file path
         

        
    }
	
	 
    
    @Before
    public void beforeScenario() {
        System.out.println(">>> Runs before each scenario");
        // Optional: clear cookies or reset state before each scenario
        DriverManager.getDriver().manage().window().maximize();
        DriverManager.getDriver().manage().deleteAllCookies();
        
    }
    
    
    @After
    public void afterScenario(Scenario scenario) {
        System.out.println(">>> Runs after each scenario");

        // Capture screenshot for every scenario
        if (DriverManager.getDriver() instanceof TakesScreenshot) {
            byte[] screenshot = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Scenario Screenshot");
           
        }
    }



    @AfterAll
    public static void afterAll() {
        System.out.println(">>> Runs once after all scenarios");
       
        // Close browser once after all scenarios
        if (DriverManager.getDriver() != null) {
        	DriverManager.getDriver().quit();
        	// ExcelManager.getInstance(ConfigFileReader.get("excelfilepath")).closeWorkbook();
        	 
        }
        
        
    }
    
    


    


   
   

}
