package com.testinium.sample.cs.test.page;

import com.testinium.sample.cs.test.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ProductListPage extends BasePage {

    public ProductListPage(WebDriver driver) {
        super(driver);
    }

    public ProductDetailPage selectProductByIndex(Integer index) throws InterruptedException {
        click(By.cssSelector(".products.products--category > div:nth-child(" + index + ") a.products__item-link"));

        Thread.sleep(2000);

        return new ProductDetailPage(driver);
    }

    public ProductListPage chooseFilter(String filterName, String filterId) throws InterruptedException {
        click(By.xpath("//a[contains(text(), '"+ filterName + "')]"));
        Thread.sleep(500);

        // Custom click to input
        WebElement element = driver.findElement(By.id(filterId));
        new Actions(driver).click(element).perform();

        Thread.sleep(2000);

        return new ProductListPage(driver);
    }
}