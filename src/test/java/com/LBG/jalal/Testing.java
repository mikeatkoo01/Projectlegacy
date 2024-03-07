package com.LBG.jalal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Testing {

	private RemoteWebDriver driver;

	@BeforeEach // runs before EACH test
	void newwindow() {

		ChromeOptions opts = new ChromeOptions();
		this.driver = new ChromeDriver(opts);
		this.driver.manage().window().maximize();
	}

	@Test
	void seleniumTest() {
		this.driver.get("http://localhost:3000/");

		WebElement userName = this.driver.findElement(By.id("fn"));
		userName.sendKeys("atkoo");

		WebElement passWord = this.driver.findElement(By.id("pass"));
		passWord.sendKeys("atkoo");

		WebElement login = this.driver.findElement(By.cssSelector("#root > header > div > form > button"));
		login.click();

		WebElement register = this.driver.findElement(By.cssSelector("#root > header > div > a"));
		register.click();

		WebElement firstName = this.driver.findElement(By.cssSelector("#fn"));
		firstName.sendKeys("mike");

		WebElement lastName = this.driver.findElement(By.cssSelector("#ln"));
		lastName.sendKeys("Atkinson");

		WebElement userNameReg = this.driver.findElement(By.cssSelector("#un"));
		userNameReg.sendKeys("atkoo");

		WebElement passWordReg = this.driver.findElement(By.cssSelector("#un"));
		passWordReg.sendKeys("atkoo");

		WebElement clickSubmit = this.driver.findElement(By.cssSelector("#root > header > div > form > button"));
		passWordReg.click();

	}

}
