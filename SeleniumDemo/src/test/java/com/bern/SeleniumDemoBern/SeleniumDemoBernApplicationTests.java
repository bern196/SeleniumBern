package com.bern.SeleniumDemoBern;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SeleniumDemoBernApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void test() {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJ\\Desktop\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/home");
		driver.manage().window().maximize();

		driver.findElement(By.id("rating")).clear();
		driver.findElement(By.id("rating")).sendKeys("2");

		//driver.findElement(By.xpath("//input[@value='Submit request']")).click();
		driver.findElement(By.id("submitButton")).click();

		String at = driver.getTitle();
		assertEquals(at, "Matching Movies");

		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
		assertEquals(rows.size(), 1);
	}
}
