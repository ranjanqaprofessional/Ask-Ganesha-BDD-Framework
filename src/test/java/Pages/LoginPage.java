package Pages;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.openqa.selenium.By;
import Utils.Commonmethods;
import Utils.ConfigFileReader;
import Utils.DriverManager;
import Utils.ExcelManager;

public class LoginPage {
	
	

	
	public LoginPage() {
    
    }


	//Locators
	private By linklogin = By.xpath("//*[@id=\"nav-categories\"]//ul//li[10]//a");
	private By headerLoginpage = By.xpath("//h3[text()='Welcome to Askganesha']");
	private By linkDontHaveAccount = By.xpath("//*[@id=\"frm_ts_id_frmLogin37\"]//div[4]//a");
	private By txtEmail = By.name("email");
	private By txtPassword = By.name("password");
	private By btnSubmit = By.xpath("//input[@class='btn btn-primary']");
	private By msgforInvalidcredentials = By.xpath("//div[@id=\"facebox\"]//div//div//div[2]//p");
	private By btnClose = By.xpath("//div[@id=\"facebox\"]//div//a//img");
	private By linkMyAccount = By.xpath("//div[@id=\"nav-categories\"]//ul//li[10]");
	private By linksignupforfree = By.id("lnk-reg-page");
	private By txtnewuserFullName = By.name("user_name");
	private By txtnewuserEmail = By.name("user_email");
	private By txtnewuserpassword = By.name("user_password");
	private By txtnewuserconfirmpassword = By.name("confirm_password");
	private By txtnewuserphone = By.name("user_phone");
	private By btnsubmitnewuser = By.name("btn_submit");
	private By msgforregistration = By.xpath("//h3[text()='Email Registered']");
	
	
	 // ✅ Constructor now fetches driver directly from DriverManager
   

	public void i_click_on_login_page_and_verify_the_login_page_appears() {
		   Commonmethods.clickLinkInsideJSForm(linklogin);
		 if (Commonmethods.isElementDisplayed(headerLoginpage)) {
			 System.out.println("Login page is displayed successfully");
		 } else {
			 System.out.println("Login page is not displayed");
			
		 }
	
	}
	
	public void i_click_on_dont_have_an_account_link() {
	    Commonmethods.clickLinkInsideJSForm(linkDontHaveAccount);

	}
	
	public void i_enter_valid_email_and_invalid_password() throws IOException, InterruptedException {
	ExcelManager.loadExcel(ConfigFileReader.get("excelfilepath"));
	System.out.println(ConfigFileReader.get("Invalidpasswordexcelsheetname"));
	 List<Map<String, String>> data = ExcelManager.getData(ConfigFileReader.get("Invalidpasswordexcelsheetname"));
        for (Map<String, String> row : data) {
           

            String email = row.get("Email");
            String password = row.get("Password");
            
            DriverManager.getDriver().findElement(txtEmail).sendKeys(email);
            DriverManager.getDriver().findElement(txtPassword).sendKeys(password);
            Commonmethods.clickLinkInsideJSForm(btnSubmit);
            //Thread.sleep(5000);

        }
   
	}
	
	public void i_verify_the_error_message_appears() {
		Commonmethods.isElementDisplayed(msgforInvalidcredentials);
		
		Assert.assertTrue(DriverManager.getDriver().findElement(By.xpath("//div[@id=\"facebox\"]//div//div//div[2]//p[text()='"+ConfigFileReader.get("Invalidcredentialsmessage")+"']")).isDisplayed());
		   
	}
	
	public void i_click_on_the_close_button_of_error_message() {
		Commonmethods.clickLinkInsideJSForm(btnClose);
		Commonmethods.isElementDisplayed(linklogin);
	}

public void i_enter_valid_email_and_valid_password() throws IOException, InterruptedException {
	
	ExcelManager.loadExcel(ConfigFileReader.get("excelfilepath"));
	System.out.println(ConfigFileReader.get("Validpasswordexcelsheetname"));
	 List<Map<String, String>> data = ExcelManager.getData(ConfigFileReader.get("Validpasswordexcelsheetname"));
        for (Map<String, String> row : data) {
           

            String email = row.get("Email");
            String password = row.get("Password");
            
            DriverManager.getDriver().findElement(txtEmail).sendKeys(email);
            DriverManager.getDriver().findElement(txtPassword).sendKeys(password);
            Commonmethods.clickLinkInsideJSForm(btnSubmit);
            Thread.sleep(2000);

        }
	    
	}

public void i_verify_the_user_is_able_to_login_successfully() {

	Commonmethods.isElementDisplayed(linkMyAccount);

	
	

}


public void i_click_on_sign_up_for_free_link() {
	Commonmethods.clickLinkInsideJSForm(linksignupforfree);
}


public void i_enter_details(String fullName, String email, String password, String confirmPassword, String phoneNumber) {
	 fullName = ConfigFileReader.get("fullName");
	 email = Commonmethods.generateGmailId();
	 password = ConfigFileReader.get("password");
	 confirmPassword = ConfigFileReader.get("password");
	 phoneNumber = ConfigFileReader.get("phoneNumber");
	DriverManager.getDriver().findElement(txtnewuserFullName).sendKeys(fullName);
	DriverManager.getDriver().findElement(txtnewuserEmail).sendKeys(email);
	DriverManager.getDriver().findElement(txtnewuserpassword).sendKeys(password);
	DriverManager.getDriver().findElement(txtnewuserconfirmpassword).sendKeys(password);
	DriverManager.getDriver().findElement(txtnewuserphone).sendKeys(phoneNumber);
	
}

public void i_click_on_sign_up_button() {
	Commonmethods.clickLinkInsideJSForm(btnsubmitnewuser);
}


public void i_get_a_message_of_email_being_registered_successfully() {
	Commonmethods.isElementDisplayed(msgforregistration);
}

}
