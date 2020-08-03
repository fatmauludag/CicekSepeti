package com.testinium.sample.cs.test.page;

import com.testinium.sample.cs.test.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public HomePage login(String mail, String password) {
        sendKeys(By.id("EmailLogin"), mail);
        sendKeys(By.id("Password"), password);
        click(By.className("login__btn"));
        return new HomePage(driver);
    }
}
