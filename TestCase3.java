package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC Company");

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sharath");

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Chandran");

		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("11/28/1994");

		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("044");

		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8939266126");

		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("45");

		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Sharath");

		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abccompany@gmail.com");

		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.abccompany.com");

		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Diana");

		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Penty");

		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Wall street");

		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Time Square");

		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Washington");

		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("New York");

		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("000123");

		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("321");

		driver.findElement(By.className("smallSubmit")).click();

	}
}
