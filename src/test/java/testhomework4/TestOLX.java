package testhomework4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestOLX {

	public WebDriver driver;

	public static final String HOST = "http://olx.ua";
	public static final String SEARCH = "iphone 6 plus";
	public static final String ID1 = "headerSearch";
	public static final String ID2 = "submit-searchmain";
	public static final String XPATH1 = "//*[@id=\"offers_table\"]/tbody/tr[";
	public static final String XPATH2 = "]/td/table/tbody/tr/td[3]/h3/a/span";
	
	@BeforeSuite
	public void initEnv() {
		driver = new FirefoxDriver();
	}

	@Test
	public void TestGit() {

		driver.get(HOST);

		driver.findElement(By.id(ID1)).sendKeys(SEARCH);
		
		driver.findElement(By.id(ID2)).click();
		
		boolean result = false;
		
		for (int i = 2; i < 7; i++) {
			String currentString = driver.findElement(
					By.xpath(XPATH1 + i + XPATH2)).getText();
			boolean contains = currentString.toLowerCase().contains(SEARCH);

			if (contains) {
//				System.out.println("Matched in row" + (i - 1));
				result = true;
				break;
			}
		}

		Assert.assertEquals(result, true);
	}

	@AfterSuite
	public void closeIt() {
		driver.quit();
	}
}