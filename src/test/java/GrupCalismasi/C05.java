package GrupCalismasi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

//        ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
//        oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.

        driver.get("https://facebook.com");
//
//        Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
//        yazdirin.

        if (driver.getCurrentUrl().contains("facebook")) {
            System.out.println("TEST PASSED");
        } else System.out.println("TEST FAILED : " + driver.getCurrentUrl());

//        https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com/");

//        Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        if (driver.getTitle().contains("Walmart.com")) {
            System.out.println("TEST PASSED");
        } else System.out.println("TEST FAILED");
//
//        Tekrar “facebook” sayfasina donun
        driver.navigate().back();
//
//        Sayfayi yenileyin
        driver.navigate().refresh();

//        Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();

//        Browser’i kapatin
        driver.close();

    }
}
