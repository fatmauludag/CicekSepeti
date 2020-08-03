package com.testinium.sample.cs.test.page;

import com.testinium.sample.cs.test.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public CartPage clearCart() throws InterruptedException {
        try {
            click(By.cssSelector(".cart__left-inner a.cart__item-delete"));

            Thread.sleep(1500);
            //click "Devam Et" on modal
            click(By.className("agree-button"));
        } catch (Exception ignored) {

        }

        return new CartPage(driver);
    }


}