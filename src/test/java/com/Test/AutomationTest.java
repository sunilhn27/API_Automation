package com.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.automation.startup.BaseTest;
import com.automation.testdata.FakerData;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationTest extends BaseTest {

	public static void selectByIndex(int index, WebElement element) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}

	@Test
	public void createRoomUI() throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://automationintesting.online/#/admin");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id=\"doLogin\"]")).click();

		WebElement room = driver.findElement(By.xpath("//*[@id=\"roomNumber\"]"));
		WebElement type = driver.findElement(By.xpath("//*[@id=\"type\"]"));

		WebElement accessible = driver.findElement(By.xpath("//*[@id=\"accessible\"]"));

		WebElement price = driver.findElement(By.xpath("//*[@id=\"roomPrice\"]"));

		WebElement tv = driver.findElement(By.xpath("//*[@id=\"tvCheckbox\"]"));

		WebElement create = driver.findElement(By.xpath("//*[@id=\"createRoom\"]"));

		System.out.println("**********************************************");
		System.out.println("count sent from user " + Integer.parseInt(count));
		System.out.println("**********************************************");

		for (int i = 0; i < Integer.parseInt(count); i++) {

			room.sendKeys(FakerData.getRoomID());
			selectByIndex(1, type);
			selectByIndex(1, accessible);
			price.sendKeys(FakerData.getPrice());
			tv.click();
			create.click();
			Thread.sleep(3000);
		}
	}
}