package mavenv2pckg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavenJenkins3Test {
	@Test
	public void testcase1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Seleniumstuff\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dell.com");
		driver.findElement(By.id("search-input")).sendKeys("dell");
	}

}
