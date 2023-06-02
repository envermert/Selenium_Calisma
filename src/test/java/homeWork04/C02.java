package homeWork04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // 2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");

        // 3- Browseri tam sayfa yapin- Sayfayi “refresh” yapin
        driver.manage().window().fullscreen();
        driver.navigate().refresh();
        driver.manage().window().maximize();

        // Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String sayfaBaslik = driver.getTitle();
        if (sayfaBaslik.contains("Spend less")){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }
        // Gift Cards sekmesine basin
        driver.findElement(By.xpath("(//a[@class='nav-a  '])[4]")).click();

        // Birthday butonuna basin
        driver.findElement(By.xpath("(//div[@class='bxc-grid__content   bxc-grid__content--light  celwidget'])[5]")).click();

        // Best Seller bolumunden ilk urunu tiklayin

        driver.findElement(By.xpath("(//img[@alt='Amazon.com eGift Card'])[1]")).click();


        // 9- Gift card details’den 25 $’i secin
        driver.findElement(By.xpath("(//button[@id='gc-mini-picker-amount-1'])[1]")).click();


        // 10-Urun ucretinin 25$ oldugunu test edin
        WebElement fiyat = driver.findElement(By.xpath("//div[@id='gc-live-preview-amount-container']"));

        if (fiyat.getText().contains("$25.00")){
            System.out.println("Test PASSED");
        }else{
            System.out.println("Test FAILED");
        }

        // 10-Sayfayi kapatin
        driver.close();

    }
}
