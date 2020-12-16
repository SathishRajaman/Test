package Continue.Git;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class google {

	@Test
	public void googlepage() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}

}
