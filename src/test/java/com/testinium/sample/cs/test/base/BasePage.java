package com.testinium.sample.cs.test.base;

import com.testinium.sample.cs.test.page.CartPage;
import com.testinium.sample.cs.test.page.HomePage;
import com.testinium.sample.cs.test.page.LoginPage;
import com.testinium.sample.cs.test.page.ProductListPage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage() {
        prepare();
    }

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    @Before
    public void prepare() {
        if (driver != null)
            return;
        System.setProperty("webdriver.chrome.driver", "C:/Users/testinium/IdeaProjects/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
    }

    @After
    public void finish() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    public ProductListPage search(String keyword) {
        sendKeys(By.cssSelector("#product-search-2 > input"), keyword);
        click(By.cssSelector("#product-search-2 > button"));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return new ProductListPage(driver);
    }


    public LoginPage callLoginPage() {
        driver.get("https://www.ciceksepeti.com/uye-girisi");
        return new LoginPage(driver);
    }

    public CartPage callCartPage() {
        driver.get("https://www.ciceksepeti.com/sepetim");
        return new CartPage(driver);
    }

    public HomePage callHomePage() {
        driver.get("https://www.ciceksepeti.com/");
        return new HomePage(driver);
    }

    public void sendKeys(By by, String value) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        element.clear();
        element.sendKeys(value);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void click(By by) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
        element.click();
    }

    public BasePage chooseAddress(String address) {
        click(By.className("district-search-button"));
        sendKeys(By.className("district-search__input"), address);
        click(By.cssSelector("#district-search-0 > div.district-search__results-wrapper > ul > li:nth-child(1) > a"));

        return new BasePage(driver);
    }

}
