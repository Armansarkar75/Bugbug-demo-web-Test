package Automatontest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bugbugautomationtest {

	public static void main(String[] args) {
		System.setProperty(("Webdriver.Chrome.driver"), ("C:\\Users\\User\\Downloads\\Driver\\chromedriver_win32\\chromedriver.exe"));
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://bugbug.io/");
		driver.findElement(By.xpath("/html/body/div[2]/header/div/div[3]/a[2]/span")).click();
		driver.findElement(By.name("email")).sendKeys("armansarkar75@gmail.com");
		driver.findElement(By.name("password1")).sendKeys("arman715");
		driver.findElement(By.name("password2")).sendKeys("arman715");
		driver.findElement(By.name("isAllowedEmailMarketing")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[1]/div/div[1]/form/button/div/div[3]")).click();
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div[1]/div/div[1]/p[2]/a")).click();
		driver.findElement(By.name("email")).sendKeys("armansarkar75@gmail.com");
		driver.findElement(By.name("password")).sendKeys("arman715");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div/div[1]/form/button/div/div[3]")).click();
		//driver.findElement(By.xpath("/html/body/div[2]/header/div/div[2]/ul/li[1]/button/span[1]")).click();
		

	}

}
