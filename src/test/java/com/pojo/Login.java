package com.pojo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.Baseclass;
import com.data.Employee;

public class Login extends Baseclass {

	@Test 
	public void loginPage() {

		getDriver("Chrome");
		maximizeWindow();
		loadUrl("https://adactinhotelapp.com/");

		Employee emp = getDatabaseValue();

		WebElement txtUser = driver.findElement(By.id("username"));
		txtUser.sendKeys(emp.getUser());
		WebElement txtPass = driver.findElement(By.id("password"));
		txtPass.sendKeys(emp.getPass());
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();

	}

}
