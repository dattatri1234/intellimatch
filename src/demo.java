

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class demo {

	
	public static void main(String[] args) {
		AutomationreadProperties read = new AutomationreadProperties();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://justrechargeit.com/");
		driver.findElement(By.xpath(read.getProperties("home.signin"))).click();
		driver.findElement(By.xpath(read.getProperties("login.uname"))).sendKeys("anil.shirole.jy@gmail.com");
		driver.findElement(By.xpath(read.getProperties("login.password"))).sendKeys("123456");
		driver.findElement(By.xpath(read.getProperties("login.login"))).click();

	}

}
