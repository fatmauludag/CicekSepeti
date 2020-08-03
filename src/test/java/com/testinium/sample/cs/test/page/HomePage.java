package com.testinium.sample.cs.test.page;
import com.testinium.sample.cs.test.base.BasePage;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver){
        super(driver);
        driver.get("https://www.ciceksepeti.com/");
    }
}
