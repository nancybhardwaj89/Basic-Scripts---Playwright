package Pages;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class LocatorsConcept {

	public static void main(String[] args) {

		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		BrowserContext bc1 = browser.newContext();
		Page page = bc1.newPage();
		page.navigate("https://orangehrm.com/30-day-free-trial");
//		Locator contactsalsloc = page.locator("text = Contact Sales");
//		int counts = contactsalsloc.count();
//		System.out.println(counts);
//		contactsalsloc.hover();
//		contactsalsloc.last().click();
		// Handling Multiple Elements
		Locator countryOptions = page.locator("select#Form_getForm_Country option");
		System.out.println(countryOptions.count());
//		for(int i=0; i<countryOptions.count(); i++)
//		{
//			String text = countryOptions.nth(i).textContent();
//			System.out.println("Country Options are:" +text);
//		}		
		List<String> textList = countryOptions.allTextContents();
		for (String e : textList) {
			System.out.println(e);
		}
	}
}
