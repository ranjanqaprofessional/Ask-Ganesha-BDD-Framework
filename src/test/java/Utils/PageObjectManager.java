package Utils;

import Pages.CartPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.LovePage;

public class PageObjectManager {
	
	private  HomePage homePage;
	private  LoginPage loginPage;
	private  LovePage lovePage;
	private  CartPage cartPage;
	
	public  HomePage getHomePage() {
		if (homePage == null) {
			homePage = new HomePage();
		}
		return homePage;
	}
	
	public  LoginPage getLoginPage() {
		if (loginPage == null) {
			loginPage = new LoginPage();
		}
		return loginPage;
		
	}
	
	public  LovePage getLovePage() {
		if (lovePage == null) {
			lovePage = new LovePage();
		}
		return lovePage;
		
	}
	
	public  CartPage getCartPage() {
		if (cartPage == null) {
			cartPage = new CartPage();
		}
		return cartPage;
		
	}

	

	



}
