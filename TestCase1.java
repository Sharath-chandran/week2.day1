package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get(" http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.partialLinkText("CRM/SFA")).click();

		driver.findElement(By.partialLinkText("Contacts")).click();

		driver.findElement(By.partialLinkText("Create Contact")).click();

		driver.findElement(By.id("firstNameField")).sendKeys("Sharath");

		driver.findElement(By.id("lastNameField")).sendKeys("chandran");

		driver.findElement(By.name("submitButton")).click();

		System.out.println("Sharath " + driver.getTitle());

		driver.close();
	}
}
