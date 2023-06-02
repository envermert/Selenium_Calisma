package day04deneme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class C03_Trendyol {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Trendyol sayfasina git
        driver.get("https://www.trendyol.com/");

        //Cikan reklamda cinsiyet secimi yap
        WebElement buton = driver.findElement(By.xpath("//img[@src='https://cdn.dsmcdn.com/web/production/new-gender-popup-male.png']"));
        buton.click();

        //Ana sayfadan bir kategori sec
        WebElement anneCocuk = driver.findElement(By.xpath("//a[@href='/butik/liste/3/anne--cocuk']"));
        anneCocuk.click();

        //Secilen kategorinin icinde bir kategori basligi sec ve secilen kategoriden bir urun isaretle
        WebElement ayakkabi = driver.findElement(By.xpath("(//img[@loading='lazy'])[7]"));
        ayakkabi.click();

        //Secilen urunu sepete ekle
        WebElement urun = driver.findElement(By.xpath("(//span[@class='prdct-desc-cntnr-name hasRatings'])[2]"));
        urun.click();
        Thread.sleep(3000);
        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));
        WebElement sepeteEkle = driver.findElement(By.xpath("//*[.='Sepete Ekle']"));
        sepeteEkle.click();
        Thread.sleep(3000);

        //Sepete git
        WebElement sepet = driver.findElement(By.xpath("//div[@class='account-nav-item basket-preview']"));
        sepet.click();
        Thread.sleep(3000);

        //Sepeti onayla
        WebElement sepetiOnayla = driver.findElement(By.xpath("//a[@class='ty-link-btn-primary']"));
        sepetiOnayla.click();
        Thread.sleep(3000);

        //Tekrar sepete don
        driver.navigate().back();
        Thread.sleep(3000);

        //Sepete ekledigin urunu sil
        WebElement sil = driver.findElement(By.xpath("//i[@class='i-trash']"));
        sil.click();
        Thread.sleep(3000);

        //Tekrar sectigin urune git
        driver.navigate().back();
        Thread.sleep(2000);

        //Sayfayi kapat
        driver.close();

        Thread.sleep(4000);

        //Bir onceki kategoriye don
        List<String> windows1 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(0));
        Thread.sleep(2000);

        //Ilk sectigin kategoriye don
        driver.navigate().back();

        //Ana sayfaya don
        driver.navigate().back();

        //Sayfayi kapat
        driver.close();

    }
}