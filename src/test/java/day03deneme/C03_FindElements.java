package day03deneme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_FindElements {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // https://www.amazon.com sayfasına gidiniz
        driver.get("https://www.amazon.com");

        //Amazon sayfasında kac tane link olduğunu konsolda yazdırın
        List<WebElement> linkListesi = driver.findElements(By.tagName("a"));
        System.out.println("linkListesi = " + linkListesi);


        //Linkleri konsolda yazdırın

        for (WebElement each:linkListesi) {
            System.out.println(each.getText());

        }

        //sayfayı kapatın
        Thread.sleep(3000);
        driver.close();
    }
}

