package com.testinium.sample.cs.test.page;

import com.testinium.sample.cs.test.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class OrderPage extends BasePage {

    public OrderPage(WebDriver driver) {
        super(driver);
    }

    public OrderPage nameSurname(String AlıcınınAdıSoyadı) throws InterruptedException {
        sendKeys(By.id("GroupDeliveryAddressList_0__Address_AddressName"), AlıcınınAdıSoyadı);
        Thread.sleep(1500);
        return new OrderPage(driver);
    }

    public OrderPage phoneNumber(String AlıcınınTelefonNumarası) throws InterruptedException {
        sendKeys(By.id("GroupDeliveryAddressList_0__Address_Phone_Phone"), AlıcınınTelefonNumarası);
        Thread.sleep(1500);
        return new OrderPage(driver);
    }

    public OrderPage address(String AlıcınınAdresi) throws InterruptedException {
        sendKeys(By.id("GroupDeliveryAddressList_0__Address_AddressLine"), AlıcınınAdresi);
        Thread.sleep(1500);
        return new OrderPage(driver);
    }

    public OrderPage groupDeliveryAddress(String ŞirketVeyaOkulİsmi) throws InterruptedException {
        sendKeys(By.id("GroupDeliveryAddressList_0__Address_SendingPlaceValue"), ŞirketVeyaOkulİsmi);
        Thread.sleep(1500);
        return new OrderPage(driver);
    }

    public OrderPage next() throws InterruptedException {
        click(By.className("order-next-button__text"));
        Thread.sleep(1500);
        return new OrderPage(driver);
    }

    public OrderPage buy() throws InterruptedException {
        click(By.className("js-submit-form"));
        Thread.sleep(1500);
        return new OrderPage(driver);
    }

    public OrderPage phoneNumber2(String FaturaBilgiNumber) throws InterruptedException {
        sendKeys(By.id("PhoneNumber"), FaturaBilgiNumber);
        Thread.sleep(1500);
        return new OrderPage(driver);
    }
    public OrderPage creditCard(String CreditCart) throws InterruptedException {
        sendKeys(By.id("CreditCardNumber"), CreditCart);
        Thread.sleep(1500);
        return new OrderPage(driver);
    }

    public OrderPage cardMonth() throws InterruptedException {
        Select month = new Select(driver.findElement(By.id("ExpMonth")));
        month.selectByValue("04");
        Thread.sleep(1500);
        return new OrderPage(driver);
    }

    public OrderPage cardYear() throws InterruptedException {

        Select year = new Select(driver.findElement(By.id("ExpYear")));
        year.selectByValue("23");
        Thread.sleep(1500);
        return new OrderPage(driver);
    }

    public OrderPage cardCvv(String CVV) throws InterruptedException {
        sendKeys(By.id("Cvv"), CVV);
        Thread.sleep(1500);
        return new OrderPage(driver);
    }
}
