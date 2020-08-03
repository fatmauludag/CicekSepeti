package com.testinium.sample.cs.test.page;

import com.testinium.sample.cs.test.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ProductDetailPage extends BasePage {

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public ProductDetailPage selectFirstDate() {
        try {
            WebElement element = driver.findElement(By.xpath("(.//*[contains(concat(\" \",normalize-space(@class),\" \"),\" product__dates-item \")][not(self::node()[contains(concat(\" \",normalize-space(@class),\" \"),\" is-disabled \")])])[1]"));
            new Actions(driver).click(element).perform();

            Thread.sleep(1000);
        } catch (Exception ignored) {
        }

        try {
            Select drpHour = new Select(driver.findElement(By.cssSelector(".product__dates-col .product__date-item-hours.is-active select[name='AddToCartModel.DeliveryHour']")));
            drpHour.selectByIndex(1);
        } catch (Exception ignored) {
        }

        return new ProductDetailPage(driver);
    }

    public OrderPage addBasket() throws InterruptedException {
        click(By.className("js-add-to-cart"));
        Thread.sleep(1500);

        try {

            //click "Devam Et" on modal
            click(By.className("agree-button"));
            Thread.sleep(1500);
        } catch (Exception ignored) {

        }
        return new OrderPage(driver);
    }
    public ProductDetailPage Favorite() throws InterruptedException {
        click(By.className("js-favorite-add"));
        Thread.sleep(1500);
        return new ProductDetailPage(driver);
    }

    public ProductDetailPage Favorites() throws InterruptedException {
        click(By.className("icon-favorite-border"));
        Thread.sleep(1500);
        return new ProductDetailPage(driver);
    }


}
