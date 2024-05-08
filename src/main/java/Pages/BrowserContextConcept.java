package Pages;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BrowserContextConcept {

	public static void main(String[] args) {

		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext bc1 = browser.newContext();
		Page p1 = bc1.newPage();
		p1.navigate("https://www.orangehrm.com/en/30-day-free-trial");
		p1.fill("#Form_getForm_subdomain", "Test");
		System.out.println("Page Title is:" + p1.title());
		BrowserContext bc2 = browser.newContext();
		Page p2 = bc2.newPage();
		p2.navigate("http://www.automationpractice.pl/index.php");
		p2.fill("#search_query_top", "Testing");
		System.out.println("Page Title is:" + p2.title());
		bc1.close();
		p1.close();
		bc2.close();
		p2.close();
	}
}
