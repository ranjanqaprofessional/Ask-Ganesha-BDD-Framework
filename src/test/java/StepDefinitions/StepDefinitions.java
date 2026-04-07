package StepDefinitions;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;

import Pages.CartPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.LovePage;
import Utils.Commonmethods;
import Utils.DriverManager;
import Utils.PageObjectManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	
	HomePage homePage = new PageObjectManager().getHomePage();
	LoginPage loginPage = new PageObjectManager().getLoginPage();
	LovePage lovePage = new PageObjectManager().getLovePage();
	CartPage cartPage = new PageObjectManager().getCartPage();

	@Given("I am on the home page")
	public void i_am_on_the_home_page() {
	   
	    homePage.i_am_on_the_home_page();
	   
	}
	@When("I click on ask ganesha icon")
	public void i_click_on_ask_ganesha_icon() {
		homePage.i_click_on_ask_ganesha_icon();
	   
	}
	
	@When("I click on Login page and verify the login page appears")
	public void i_click_on_login_page_and_verify_the_login_page_appears() {
	   		loginPage.i_click_on_login_page_and_verify_the_login_page_appears();
	
	}
	@Then("I click on Dont have an account link")
	public void i_click_on_dont_have_an_account_link() {
	   loginPage.i_click_on_dont_have_an_account_link();

	}
	
	@When("i enter valid email and invalid password")
	public void i_enter_valid_email_and_invalid_password() throws IOException, InterruptedException {
		loginPage.i_enter_valid_email_and_invalid_password();
	   
	}


	@Then("I verify the error message appears")
	public void i_verify_the_error_message_appears() {
		loginPage.i_verify_the_error_message_appears();
	   
	}
	
	@Then("I click on the close button of error message")
	public void i_click_on_the_close_button_of_error_message() {
		loginPage.i_click_on_the_close_button_of_error_message();
	}
	
	
	@When("i enter valid email and valid password")
	public void i_enter_valid_email_and_valid_password() throws IOException, InterruptedException {
		loginPage.i_enter_valid_email_and_valid_password();
	}
	@Then("I verify the user is able to login successfully")
	public void i_verify_the_user_is_able_to_login_successfully() {
		loginPage.i_verify_the_user_is_able_to_login_successfully();
	}
	
	@When("I click on Sign up for free link")
	public void i_click_on_sign_up_for_free_link() {
		loginPage.i_click_on_sign_up_for_free_link();
	}
	
	@Then("I enter {string}, {string}, {string}, {string} and {string}")
    public void i_enter_details(String fullName, String email, String password, String confirmPassword, String phoneNumber) {
		loginPage.i_enter_details(fullName, email, password, confirmPassword, phoneNumber);
    }


	@Then("i click on Sign up button")
	public void i_click_on_sign_up_button() {
		loginPage.i_click_on_sign_up_button();
	}
	
	@Then("i get a message of Email being registered successfully")
	public void i_get_a_message_of_email_being_registered_successfully() {
		loginPage.i_get_a_message_of_email_being_registered_successfully();
	}
	
	
	@Given("I click on Love icon")
	public void i_click_on_love_icon() {
		lovePage.i_click_on_love_icon();
	}
	@Then("I verify the Love page appears")
	public void i_verify_the_love_page_appears() {
		lovePage.i_verify_the_love_page_appears();
	}
	
	@Given("I click on Askaquestiononlove image")
	public void i_click_on_askaquestiononlove_image() throws InterruptedException {
		lovePage.i_click_on_askaquestiononlove_image();
	}
	@Then("I verify the Ask a question on love page appears")
	public void i_verify_the_ask_a_question_on_love_page_appears() throws InterruptedException {
		
		lovePage.i_verify_the_ask_a_question_on_love_page_appears();
	}
	
	@Then("I navigate back to love page")
	public void i_navigate_back_to_love_page() {
		lovePage.i_navigate_back_to_love_page();
	}

	
	@Given("I click on Ask a question service link on love page")
	public void i_click_on_ask_a_question_service_link_on_love_page() {
		lovePage.i_click_on_ask_a_question_service_link_on_love_page();
	}
	
	@Given("I click on Read More button in Ask a question on Love section on love page")
	public void i_click_on_read_more_button_in_ask_a_question_on_love_section_on_love_page() throws InterruptedException {
		lovePage.i_click_on_read_more_button_in_ask_a_question_on_love_section_on_love_page();
	}
	
	
	@Given("the select option section is displayed")
	public void the_select_option_section_is_displayed() {
		lovePage.the_select_option_section_is_displayed();
	}
	@When("i click on the 1st option choose the question from list below")
	public void i_click_on_the_1st_option_choose_the_question_from_list_below() {
		lovePage.i_click_on_the_1st_option_choose_the_question_from_list_below();
	}
	@Then("I verify the list of questions is displayed")
	public void i_verify_the_list_of_questions_is_displayed() {
		lovePage.i_verify_the_list_of_questions_is_displayed();
	}
	
	@Then("i click on first question in the list")
	public void i_click_on_first_question_in_the_list() {
		lovePage.i_click_on_first_question_in_the_list();
	}
	
	@Given("i enter {string} in the Full Name field")
	public void i_enter_in_the_full_name_field(String fullName) {
		lovePage.i_enter_in_the_full_name_field(fullName);
	}
	
	
	@When("I enter any number between {int} and {int} in the Enteranynumberbw1to249 field")
	public void i_enter_any_number_between_and_in_the_enteranynumberbw1to249_field(Integer int1, Integer int2) {
		lovePage.i_enter_any_number_between_and_in_the_enteranynumberbw1to249_field(int1, int2);
	}
	
	@Given("I select the {string} option from the dropdown")
	public void i_select_the_option_from_the_dropdown(String RelationwithNative) {
		lovePage.i_select_the_option_from_the_dropdown(RelationwithNative);
	}
	
	@When("I select {string} and {string} of the native")
	public void i_select_and_of_the_native(String Sex, String MaritialStatus) throws InterruptedException {
		lovePage.i_select_and_of_the_native(Sex, MaritialStatus);
	}



	@When("I select {string},{string},{string}")
	public void i_select(String DayofBirth, String MonthofBirth, String YearofBirth) {
		lovePage.i_select(DayofBirth, MonthofBirth, YearofBirth);
	}
	@When("I select if {string}> is known")
	public void i_select_if_is_known(String TimeofBirth) {
		lovePage.i_select_if_is_known(TimeofBirth);
	}
	@When("I select TIme of Birth {string},{string},{string}")
	public void i_select_t_ime_of_birth(String Hour, String Minute, String AMPM) {
		lovePage.i_select_t_ime_of_birth(Hour, Minute, AMPM);
	}
	@When("I enter Birth Location {string},{string},{string}")
	public void i_enter_birth_location(String BirthCountry, String BirthCity, String BirthState) {
		lovePage.i_enter_birth_location(BirthCountry, BirthCity, BirthState);
	}
	
	@When("I enter Email and PhoneNumber")
	public void i_enter_email_and_phone_number() {
		lovePage.i_enter_email_and_phone_number();
	}
	@When("I enter Comments")
	public void i_enter_comments() throws InterruptedException {
		lovePage.i_enter_comments();
	}
	

@When("I verify if Price field is present")
public void i_verify_if_price_field_is_present() {
	lovePage.i_verify_if_price_field_is_present();
}
	

	@When("I click Submit")
	public void i_click_submit() {
		lovePage.i_click_submit();
	}


	
	@Given("i verify the name of question selected")
	public void i_verify_the_name_of_question_selected() {
	   lovePage.i_verify_the_name_of_question_selected();
	}
	
	@Then("the message of Item Added to Cart is displayed in the cart")
	public void the_message_of_item_added_to_cart_is_displayed_in_the_cart() {
	   lovePage.the_message_of_item_added_to_cart_is_displayed_in_the_cart();
	}
	
	@Given("I click on Ask a question on Love link")
	public void i_click_on_ask_a_question_on_love_link() {
	  lovePage.i_click_on_ask_a_question_on_love_link();
	}
	
	

	@Then("Order report button is displayed")
	public void order_report_button_is_displayed() {
	   lovePage.order_report_button_is_displayed();
	}

	@Given("I enter the direct url for landing to the love prediction page")
	public void i_enter_the_direct_url_for_landing_to_the_love_prediction_page() {
	   lovePage.i_enter_the_direct_url_for_landing_to_the_love_prediction_page();
	}



}
