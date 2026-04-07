package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utils.Commonmethods;
import Utils.ConfigFileReader;
import Utils.DriverManager;
import junit.framework.Assert;

public class LovePage {
	
	//Locators
	private By loveIcon = By.xpath("//ul[@class='menu-bar-1']//a[@href='/love-predictions']");
	private By headerLovePage = By.xpath("//h3[text()='Love Astrology Services']");
	private By iconAskaquestiononLove = By.xpath("//img[@alt='Ask Love']");
	private By headeraskaquestiononLove = By.xpath("//h1[text()='Ask A Question (Love and Romance)']");
	private By linkaskaquestiononlove = By.xpath("//a[@href='/ask-a-question/love-predictions' and text()='Ask A Question on Love']");
	private By linkaskaquestionserviceonlove =  By.xpath("//a[text()='Ask A Question service']");
	private By readmorebuttoninaskaquestiononLove = By.xpath("//a[text()='Ask A Question service']//following::div[1]");
	private By headerselectoption = By.xpath("//h2[text()='Select Option']");
	private By link1stoptionselectoption = By.xpath("//h2[text()='Select Option']//following::a[text()='Choose the question from the list below']");
	private By link2ndoptionselectoption = By.xpath("//h2[text()='Select Option']//following::a[text()='Write your own question']");
	private By link3rdoptionselectoption = By.xpath("//h2[text()='Select Option']//following::a[text()='Have more than 3 questions in your mind?']");
	private By headerselectaquestiononLove = By.xpath("//h2[text()='Select your Question (Love and Romance)']");
	private By listofquestionsonLove = By.xpath("/ul[@class='ul-questions']//following::h2[text()='Select your Question (Love and Romance)']");
	private By firstquestioninlist = By.xpath("//div[@id=\"a-questions\"]//ul//li[1]//a");
	private By txtFullName = By.name("native_name");
	private By Enteranynumberbw1to249 = By.name("random_no");
	private By dropdownRelationwithNative = By.name("native_relation");
	private By dropdownsex = By.name("native_sex");
	private By dropdownmaritialstatus = By.name("native_marital_status");
	private By dropdowndayofBirth =By.name("native_dob");
	private By dropdownmonthofBirth =By.name("native_dob_mt");
	private By dropdownyearofBirth =By.name("native_dob_yr");
	private By dropdownTimeofBirthknown =By.name("dob_known");
	private By dropdownTimeofBirthhour =By.name("native_tob");
	private By dropdownTimeofBirthminute =By.name("native_tob_mn");
	private By dropdownTimeofBirthampm =By.name("native_tob_ampm");
	private By txtBirthCountry = By.name("native_country_name");
	private By txtBirthCity = By.name("native_city");
	private By txtBirthState = By.name("native_state");
	private By txtEmail=By.name("email");
	private By txtPhoneNumber=By.name("phone");
	private By txtcomments=By.name("comments");
	private By btnSubmit=By.name("btn_submit");
	private By txtPrice = By.xpath("//form[@id='frm_ts_id_frmQuestionData72']//div[11]//div//div//div[2]//div//span");
	private By buttonBuymoreservices = By.xpath("//a[@href='/special-astrology-services' and text()='Buy More Services']");
	
	
	
	
	
public void i_click_on_love_icon() {
	DriverManager.getDriver().findElement(loveIcon).click();
	    
	}


public void i_verify_the_love_page_appears() {
	Commonmethods.isElementDisplayed(headerLovePage);
	  
}



public void i_click_on_askaquestiononlove_image() throws InterruptedException {
	Commonmethods.isElementclickable(iconAskaquestiononLove);
	Commonmethods.clickLinkInsideJSForm(iconAskaquestiononLove);
	
}

public void i_verify_the_ask_a_question_on_love_page_appears() throws InterruptedException {
	Commonmethods.isElementDisplayed(headeraskaquestiononLove); 
	DriverManager.getDriver().navigate().refresh();
	
	
}

public void i_navigate_back_to_love_page() {
	DriverManager.getDriver().navigate().back();
}

public void i_click_on_ask_a_question_service_link_on_love_page() {
	Commonmethods.isElementclickable(linkaskaquestionserviceonlove);
	Commonmethods.clickLinkInsideJSForm(linkaskaquestionserviceonlove);
	DriverManager.getDriver().navigate().refresh();
	
}

public void i_click_on_read_more_button_in_ask_a_question_on_love_section_on_love_page() throws InterruptedException {
	
	Commonmethods.isElementDisplayed(readmorebuttoninaskaquestiononLove);
	//Commonmethods.clickLinkInsideJSForm(readmorebuttoninaskaquestiononLove);
	WebElement element = DriverManager.getDriver().findElement(readmorebuttoninaskaquestiononLove);

	Actions actions = new Actions(DriverManager.getDriver());

	// Move to element (scrolls automatically) and click
	actions.moveToElement(element).click().perform();


	
	System.out.println("Clicked on Read More button in Ask a question on love section");
}


public void the_select_option_section_is_displayed() {
    Commonmethods.isElementDisplayed(headerselectoption);
    Commonmethods.isElementDisplayed(link1stoptionselectoption);
    Commonmethods.isElementDisplayed(link2ndoptionselectoption);
    Commonmethods.isElementDisplayed(link3rdoptionselectoption);
}

public void i_click_on_the_1st_option_choose_the_question_from_list_below() {
	Commonmethods.isElementclickable(link1stoptionselectoption);
	Commonmethods.clickLinkInsideJSForm(link1stoptionselectoption); 
	
}

public void i_verify_the_list_of_questions_is_displayed() {
	Commonmethods.isElementDisplayed(headerselectaquestiononLove);
	Commonmethods.isElementDisplayed(listofquestionsonLove);
	List<WebElement> questions = DriverManager.getDriver().findElements(
	        By.xpath("//h2[text()='Select your Question (Love and Romance)']//following::ul[@class='ul-questions']//li")
	    );
	Assert.assertEquals(questions.size(), Integer.parseInt(ConfigFileReader.get("expectedNumberOfQuestionsunderselectoptioninLovepage")));


}


public void i_click_on_first_question_in_the_list() {
	Commonmethods.isElementDisplayed(firstquestioninlist);
	Commonmethods.clickLinkInsideJSForm(firstquestioninlist); 
}

public void i_enter_in_the_full_name_field(String fullName) {
	DriverManager.getDriver().findElement(txtFullName).sendKeys(ConfigFileReader.get(fullName));
	
	
    
}


public void i_enter_any_number_between_and_in_the_enteranynumberbw1to249_field(Integer int1, Integer int2) {
	  int1 = Integer.parseInt(ConfigFileReader.get("minRandomNumber"));
	  int2 = Integer.parseInt(ConfigFileReader.get("maxRandomNumber"));
	  DriverManager.getDriver().findElement(Enteranynumberbw1to249).sendKeys(String.valueOf(Commonmethods.getRandomNumber(int1, int2)));
}


public void i_select_the_option_from_the_dropdown(String RelationwithNative) {
	Commonmethods.selectDropdownByOptionName(dropdownRelationwithNative, ConfigFileReader.get(RelationwithNative));
}



public void i_select_and_of_the_native(String Sex, String MaritialStatus) throws InterruptedException {
	Commonmethods.selectDropdownByOptionName(dropdownsex, ConfigFileReader.get(Sex));
	
	Commonmethods.selectDropdownByOptionName(dropdownmaritialstatus, ConfigFileReader.get(MaritialStatus));
	
	
}

public void i_select(String DayofBirth, String MonthofBirth, String YearofBirth) {
	Commonmethods.selectDropdownByOptionName(dropdowndayofBirth, ConfigFileReader.get(DayofBirth));
	Commonmethods.selectDropdownByOptionName(dropdownmonthofBirth, ConfigFileReader.get(MonthofBirth));
	Commonmethods.selectDropdownByOptionName(dropdownyearofBirth, ConfigFileReader.get(YearofBirth));
}

public void i_select_if_is_known(String TimeofBirth) {
	
  String selectedoption =Commonmethods.getSelectedOptionIfPrePopulated(dropdownTimeofBirthknown);
  
  if (selectedoption != null) {
      System.out.println("Dropdown is pre-populated. Selected option: " + selectedoption);
  } else {
	  Commonmethods.selectDropdownByOptionName(dropdownTimeofBirthknown, ConfigFileReader.get(TimeofBirth));
  }


	
}

public void i_select_t_ime_of_birth(String Hour, String Minute, String AMPM) {
	Commonmethods.selectDropdownByOptionName(dropdownTimeofBirthhour, ConfigFileReader.get(Hour));
	Commonmethods.selectDropdownByOptionName(dropdownTimeofBirthminute, ConfigFileReader.get(Minute));
	Commonmethods.selectDropdownByOptionName(dropdownTimeofBirthampm, ConfigFileReader.get(AMPM));
    
}

public void i_enter_birth_location(String BirthCountry, String BirthCity, String BirthState) {
	DriverManager.getDriver().findElement(txtBirthCountry).sendKeys(ConfigFileReader.get(BirthCountry));
	DriverManager.getDriver().findElement(txtBirthCity).sendKeys(ConfigFileReader.get(BirthCity));
	DriverManager.getDriver().findElement(txtBirthState).sendKeys(ConfigFileReader.get(BirthState));
}

public void i_enter_email_and_phone_number() {
	DriverManager.getDriver().findElement(txtEmail).sendKeys(Commonmethods.generateGmailId());
	DriverManager.getDriver().findElement(txtPhoneNumber).sendKeys(Commonmethods.generateIndianMobileNumber());
}

public void i_enter_comments() throws InterruptedException {
	DriverManager.getDriver().findElement(txtcomments).sendKeys(Commonmethods.generateRandomText(11));
	//Thread.sleep(5000);
}

public void i_verify_if_price_field_is_present() {
	Commonmethods.isElementDisplayed(txtPrice);
}

public void i_click_submit() {
	Commonmethods.isElementclickable(btnSubmit);
	Commonmethods.clickLinkInsideJSForm(btnSubmit);
}


public void i_verify_the_name_of_question_selected() {
	Commonmethods.isElementDisplayed(By.xpath("//label[text()='"+ConfigFileReader.get("Questionlabel")+"']//following::div[text()='"+ConfigFileReader.get("Questiontext")+"']"));
	   
}

public void the_message_of_item_added_to_cart_is_displayed_in_the_cart() {
	   Commonmethods.isElementDisplayed(By.xpath("//h1//preceding::li[text()='"+ConfigFileReader.get("msgofItemaddedtoCart")+"']"));
	   Commonmethods.isElementDisplayed(By.xpath("//table[@class='table cart-table']//p[text()='"+ConfigFileReader.get("Questiontext")+"']"));
	   DriverManager.getDriver().navigate().refresh();
}

public void i_click_on_ask_a_question_on_love_link() {
	Commonmethods.isElementclickable(linkaskaquestiononlove);
	Commonmethods.clickLinkInsideJSForm(linkaskaquestiononlove);
	DriverManager.getDriver().navigate().refresh();
}


public  void order_report_button_is_displayed() {
	List<WebElement> questions = DriverManager.getDriver().findElements(
	        By.xpath("//a[@class='btn-box' and @href='#a-questions' and text()='Order Report']")
	    );
	Assert.assertEquals(questions.size(), Integer.parseInt(ConfigFileReader.get("numberofbuttonsonLovepage")));  
}

public void i_enter_the_direct_url_for_landing_to_the_love_prediction_page() {
	   DriverManager.getDriver().get(ConfigFileReader.get("Directlovepredictionsurl"));
}

}
