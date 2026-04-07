package Pages;

import org.openqa.selenium.By;
import Utils.ConfigFileReader;
import Utils.DriverManager;

public class HomePage {
	
	
	
	


	//Locators
	private By askGaneshaIcon = By.xpath("//img[@src='https://www.askganesha.com/home/logo/1' and @alt='askganesha logo']");
	
	

   




	

	public void i_am_on_the_home_page() {
	    System.out.println("Jai horogouri");
	    DriverManager.getDriver().get(ConfigFileReader.get("url"));
	    
		
		if(DriverManager.getDriver().getTitle().equalsIgnoreCase("Online Astrology, Free Horoscopes, Puja, Mantras, Yantras | Askganesha"))
		{
			System.out.println("site has opened successfully") ;
			  DriverManager.getDriver().get(ConfigFileReader.get("url"));
		}
	}
	
	public void i_click_on_ask_ganesha_icon() {
		System.out.println("Jai laxminarayan");
		 DriverManager.getDriver().get(ConfigFileReader.get("url"));
		DriverManager.getDriver().findElement(askGaneshaIcon).click();
		   
		}
	
	

}
