package com.testinium.sample.cs.test;

import com.testinium.sample.cs.test.base.BasePage;
import com.testinium.sample.cs.test.base.MainFilters;
import com.testinium.sample.cs.test.base.SubFilters;
import com.testinium.sample.cs.test.page.HomePage;
import org.junit.Test;

public class Main extends BasePage {
    // Sepette tek ürün olduğunda direk ödeme sayfasına geçiyor bu senaryoda da sepette öncesinde ürün olmaması bekleniyor.
    @Test
    public void doScenario1() throws InterruptedException {
        new HomePage(driver)
                .chooseAddress("Gemlik, Bursa, Türkiye")
                .callLoginPage()
                .login("taskmailim2020@gmail.com", "tasksifre2020")
                .search("çiçek")
                .selectProductByIndex(2)
                .selectFirstDate()
                .addBasket()
                .nameSurname("Fatma Uludağ")
                .phoneNumber("05309876543")
                .address("Umurbey,Gemlik/ Bursa,Türkiye")
                .groupDeliveryAddress("Testinium")
                .buy()
                .phoneNumber2("2234354454")
                .buy()
                .creditCard("1234567789908764")
                .cardMonth()
                .cardYear()
                .cardCvv("123");

        Thread.sleep(5000);
    }


    @Test
    public void doScenario2() throws InterruptedException {
        new HomePage(driver)
                .chooseAddress("Umurbey,Gemlik/ Bursa,Türkiye")
                .callLoginPage()
                .login("taskmailim2020@gmail.com", "tasksifre2020")
                .search("gül")
                .chooseFilter(MainFilters.Fiyat, SubFilters.FiyatAralığı)
                .selectProductByIndex(2);
        Thread.sleep(5000);
    }

    @Test
    public void doScenario3() throws InterruptedException {
        new HomePage(driver)
                .chooseAddress("İstanbul,Pendik/İstanbul,Türkiye")
                .callLoginPage()
                .login("taskmailim2020@gmail.com", "tasksifre2020")
                .search("çikolata")
                .chooseFilter(MainFilters.Kime, SubFilters.İşArkadaşına)
                .selectProductByIndex(3)
                .selectFirstDate()
                .Favorite();

        Thread.sleep(5000);
    }

    @Test
    public void doScenario4() throws InterruptedException {
        new HomePage(driver)
                .chooseAddress("Salacak,Üsküdar/İstanbul,Türkiye ")
                .callLoginPage()
                .login("taskmailim2020@gmail.com", "tasksifre2020")
                .search("biblo")
                .chooseFilter(MainFilters.ÜrünÇeşitleri, SubFilters.Dekoratif)
                .selectProductByIndex(4)
                .Favorite()
                .Favorites();
        Thread.sleep(5000);
    }

    @Test
    public void doScenario5() throws InterruptedException {
        new HomePage(driver)
                .chooseAddress("Kadıköy, Sahrayı Cedit, Kadıköy/İstanbul, Türkiye")
                .callLoginPage()
                .login("taskmailim2020@gmail.com", "tasksifre2020")
                .search("şapka")
                .chooseFilter(MainFilters.Neİçin, SubFilters.PartiKutlama)
                .selectProductByIndex(14);
        Thread.sleep(5000);
    }

    @Test
    public void doScenario6() throws InterruptedException {
        new HomePage(driver)
                .chooseAddress("Çeşme,Alaçatı, Çeşme/İzmir, Türkiye")
                .callLoginPage()
                .login("taskmailim2020@gmail.com", "tasksifre2020")
                .search("Mayo")
                .chooseFilter(MainFilters.Cinsiyet, SubFilters.Kadın)
                .selectProductByIndex(2)
                .Favorite()
                .Favorites();
        Thread.sleep(5000);
    }

    @Test
    public void doScenario7() throws InterruptedException {
        new HomePage(driver)
                .chooseAddress("Kurtköy, Pendik/İstanbul, Türkiye")
                .callLoginPage()
                .login("taskmailim2020@gmail.com", "tasksifre2020")
                .search("Fotoğraf")
                .chooseFilter(MainFilters.Marka, SubFilters.Canon)
                .selectProductByIndex(2)
                .selectFirstDate();
        Thread.sleep(5000);
    }

    @Test
    public void doScenario8() throws InterruptedException {
        new HomePage(driver)
                .chooseAddress("Manavgat, Antalya, Türkiye")
                .callLoginPage()
                .login("taskmailim2020@gmail.com", "tasksifre2020")
                .search("Bebek")
                .chooseFilter(MainFilters.ÜrünGrubu, SubFilters.AnneBebek)
                .selectProductByIndex(4)
                .selectFirstDate();
        Thread.sleep(5000);
    }

    @Test
    public void doScenario9() throws InterruptedException {
        new HomePage(driver)
                .chooseAddress("Nazilli, Aydın, Türkiye")
                .callLoginPage()
                .login("taskmailim2020@gmail.com", "tasksifre2020")
                .search("Saksı Çiçeği")
                .chooseFilter(MainFilters.Neİçin, SubFilters.Yeni_İşTerfi)
                .selectProductByIndex(1)
                .Favorites();

        Thread.sleep(5000);
    }

    @Test
    public void doScenario10() throws InterruptedException {
        new HomePage(driver)
                .chooseAddress(" Manisa, Yunusemre/Manisa, Türkiye")
                .callLoginPage()
                .login("taskmailim2020@gmail.com", "tasksifre2020")
                .search("Düğün Çelenkleri")
                .chooseFilter(MainFilters.Renk, SubFilters.Beyaz)
                .selectProductByIndex(1)
                .selectFirstDate();
        Thread.sleep(5000);
    }
}



