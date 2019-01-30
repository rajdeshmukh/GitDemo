package guru99.gittest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void googledemo() throws Exception {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\All Jars\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http:\\www.google.com");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.xpath("//input[contains(@name,'q')]"));
		element.sendKeys("Selenium");
		Thread.sleep(500);
		element.click();
	}

}
