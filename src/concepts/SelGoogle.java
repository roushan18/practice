package concepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelGoogle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("JAVA",Keys.ENTER);
		List <WebElement> links = driver.findElements(By.xpath("//h3[@class='r']/a"));
		int size=links.size();
		for(int i=0;i<size ;i++)
		{
			System.out.println(links.get(i).getText());
			links.get(i).click();
			Thread.sleep(8000);
			driver.getTitle();
			driver.navigate().back();
			
		}
		
				Thread.sleep(5000);
		System.out.println(links.get(0).getText());
		links.get(0).click();
		System.out.println(driver.getTitle());
		

	}

}
