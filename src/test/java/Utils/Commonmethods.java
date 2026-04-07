package Utils;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Commonmethods {
	
	public static boolean isElementDisplayed(By locator) {
        try {
          //  WebElement element = DriverManager.getDriver().findElement(locator);
            
         // Explicit wait for element to be present and visible
            WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));


            // First, use Selenium's native check
            if (element.isDisplayed()) {
                return true;
            }

            // If not, fall back to JavaScript style checks
            JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
            String display = (String) js.executeScript(
                    "return window.getComputedStyle(arguments[0]).display;", element);
            String visibility = (String) js.executeScript(
                    "return window.getComputedStyle(arguments[0]).visibility;", element);
            double opacity = Double.parseDouble(js.executeScript(
                    "return window.getComputedStyle(arguments[0]).opacity;", element).toString());

            return !"none".equals(display) && !"hidden".equals(visibility) && opacity > 0;
        } catch (Exception e) {
            // Element not found or not interactable
            return false;
        }
        
         
    }
	
	
	public static boolean isElementclickable(By locator) {
        try {
          //  WebElement element = DriverManager.getDriver().findElement(locator);
            
         // Explicit wait for element to be present and visible
            WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));


            // First, use Selenium's native check
            if (element.isDisplayed()) {
                return true;
            }

            // If not, fall back to JavaScript style checks
            JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
            String display = (String) js.executeScript(
                    "return window.getComputedStyle(arguments[0]).display;", element);
            String visibility = (String) js.executeScript(
                    "return window.getComputedStyle(arguments[0]).visibility;", element);
            double opacity = Double.parseDouble(js.executeScript(
                    "return window.getComputedStyle(arguments[0]).opacity;", element).toString());

            return !"none".equals(display) && !"hidden".equals(visibility) && opacity > 0;
        } catch (Exception e) {
            // Element not found or not interactable
            return false;
        }
        
         
    }

	public static void clickLinkInsideJSForm(By locator) {
        try {
            WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
            WebElement link = wait.until(ExpectedConditions.elementToBeClickable(locator));

            // Try normal Selenium click
            link.click();
        } catch (Exception e) {
            // Fallback: use JavaScript click if Selenium click fails
            try {
                WebElement link = DriverManager.getDriver().findElement(locator);
                JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
                js.executeScript("arguments[0].click();", link);
            } catch (Exception inner) {
                System.out.println("Failed to click link inside JS form: " + inner.getMessage());
            }
        }
    }
	
	public static void enter_data_into_field(By locator, String data) {
		try {
			WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
			WebElement field = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			field.clear();
			field.sendKeys(data);
		} catch (Exception e) {
			System.out.println("Failed to enter data into field: " + e.getMessage());
		}
	}
	
	
	public static int getRandomNumber(int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("Min cannot be greater than Max");
        }
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
	
	public static void selectDropdownByOptionName(By locator, String optionName) {
        WebElement dropdownElement = DriverManager.getDriver().findElement(locator);
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText(optionName);
    }

	public static String generateIndianMobileNumber() {
        // First digit must be 6, 7, 8, or 9
        int firstDigit = ThreadLocalRandom.current().nextInt(6, 10);

        // Generate remaining 9 digits
        StringBuilder mobileNumber = new StringBuilder();
        mobileNumber.append(firstDigit);

        for (int i = 0; i < 9; i++) {
            int digit = ThreadLocalRandom.current().nextInt(0, 10);
            mobileNumber.append(digit);
        }

        return mobileNumber.toString();
    }
	
	public static String generateGmailId() {
        // Generate a random number for uniqueness
        int randomNum = ThreadLocalRandom.current().nextInt(1000, 9999);

        // Generate a random string prefix
        String prefix = "user" + randomNum;

        return prefix + "@gmail.com";
    }

	public static String generateRandomText(int length) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = ThreadLocalRandom.current().nextInt(alphabet.length());
            sb.append(alphabet.charAt(index));
        }

        return sb.toString();
    }

	public static String getSelectedOptionIfPrePopulated(By locator) {
        WebElement dropdownElement = DriverManager.getDriver().findElement(locator);
        Select dropdown = new Select(dropdownElement);
        List<WebElement> options = dropdown.getOptions();

        if (options != null && !options.isEmpty()) {
            // Dropdown is pre-populated, return selected option text
            return dropdown.getFirstSelectedOption().getText();
        } else {
            // Dropdown is empty
            return null;
        }
        
        


    }

	public  static boolean isElementVisible(By locator) {
        String cssSelector = locator.toString().replace("By.cssSelector: ", "");
        String script =
            "var el = document.querySelector(arguments[0]);" +
            "if (!el) return false;" +
            "var style = window.getComputedStyle(el);" +
            "return (style && style.display !== 'none' && style.visibility !== 'hidden' && el.offsetWidth > 0 && el.offsetHeight > 0);";

        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        return (Boolean) js.executeScript(script, cssSelector);
    }








	
	

	





}
