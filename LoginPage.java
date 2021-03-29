package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private WebDriver driver;
	private static WebElement element;
	private static String email = "//input[@id='email']";
	private static String password = "//input[@id='pass']";
	private static String loginbtn = "//button[@name='login']";
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public static WebElement emailField(WebDriver driver) {
		element = driver.findElement(By.xpath(email));
		return element;
	}
	
	public static WebElement passField(WebDriver driver) {
		element = driver.findElement(By.xpath(password));
		return element;
	}
	
	public static WebElement loginbutton(WebDriver driver) {
		element = driver.findElement(By.xpath(loginbtn));
		return element;
	}
	
	public static void enterEmail1(WebDriver driver) {
		element = emailField(driver);
		element.sendKeys("8898451337");
	}
	
	public static void enterEmail(WebDriver driver) {
		element = emailField(driver);
		element.sendKeys("8898451337");
	}
	public static void enterPass(WebDriver driver) {
		element = passField(driver);
		element.sendKeys("Honor@1337");
	}
	
	public static void clickLogin(WebDriver driver) {
		element = loginbutton(driver);
		element.click();
	}
	
}
