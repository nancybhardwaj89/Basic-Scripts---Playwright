package Pages;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class XpathLoc {

	public static void main(String[] args) {
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		page.navigate("https://www.amazon.in/");
		page.locator("xpath=//input[@id='twotabsearchtextbox']").fill("Mobiles");
		// page.locator("//input[@id='twotabsearchtextbox']"); // We can use without writing "xpath" text too
	}
}
