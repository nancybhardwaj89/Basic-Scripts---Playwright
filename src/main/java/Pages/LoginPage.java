package Pages;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class LoginPage {

	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
		LaunchOptions lp = new LaunchOptions();
		//lp.setChannel("chrome");// For Chrome
		lp.setChannel("msedge"); //For Edge
		lp.setHeadless(false);
		Browser browser = playwright.chromium().launch(lp);
		Page page = browser.newPage();
		page.navigate("https://www.saucedemo.com/");
		String title = page.title();
		System.out.println("Page Title is: " + title);
		String pageurl = page.url();
		System.out.println("Page URL is: " + pageurl);
		browser.close();
		playwright.close();
	}
}
