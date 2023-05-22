package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import bdd_bindings.Hooks;

public class Login extends Hooks {
	public static void start() {
		driver.manage().window().maximize();
		driver.get("https://jpetstore.aspectran.com/catalog/");
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
	}

	public static void clickLogin() {
		driver.findElement(By.xpath("//div[@id='MenuContent']/a[2]")).click();
	}

	public static void enterUsernameAndPassword(String username, String password) {
		WebElement a = driver.findElement(By.name("username"));
		a.clear();
		a.sendKeys(username);
		WebElement b = driver.findElement(By.name("password"));
		b.clear();
		b.sendKeys(password);
		driver.findElement(By.xpath("//div[@class='button-bar']/button")).click();
	}

	public static void verifyLogin() {
		if (driver.findElement(By.id("WelcomeContent")).getText().startsWith("Welcome")) {
			System.out.print("Logged in successfully");
		} else {
			System.out.print("Login failue");
		}
	}

	public static void clickCategory(String s) {
		driver.findElement(By.xpath("//div[@id='SidebarContent']/a[text()='" + s + "']")).click();
	}

	public static void clickRow(String s) {
		driver.findElement(By.xpath("//table/tbody/tr/td/a[text()='" + s + "']")).click();
	}

	public static void clickAdd(String s) {
		driver.findElement(By.xpath("//table/tbody/tr/td/a[text()='" + s + "']/following::td/a")).click();
	}

	public static void clickProceed() {
		driver.findElement(By.xpath("//div[@id='Cart']/a")).click();
	}

	public static void clickContinueAndSubmit() {
		act.sendKeys(Keys.PAGE_DOWN);
		driver.findElement(By.xpath("//div[@class='button-bar']/button[1]")).click();
	}
	
	public static void verifyOrder() {
		if(driver.findElement(By.xpath("//div[@id='MessageBar']/p")).getText().startsWith("Thank"))
			System.out.print("Order placed successfully");
		else
			System.out.print("Order failed");
	}
}
