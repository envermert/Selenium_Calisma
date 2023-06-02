package homeWork03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com");

        //Çıkan reklamı locate edip kapatalım
        WebElement reklamKapatma = driver.findElement(By.xpath("(//i[@class='eicon-close'])"));
        Thread.sleep(2000);
        reklamKapatma.click();

        //Arama bölümünde qa aratalım
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id='elementor-search-form-9f26725']"));
        aramaKutusu.sendKeys("qa");
        aramaKutusu.submit();

        //Sayfa başlığının qa içerdiğini doğrulayalım
        String sayfaBasligi = driver.getTitle();
        if (sayfaBasligi.contains("qa")) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED");
        }

        //Carrer Opportunities In QA linkinin görünür ve erişilebilir olduğunu doğrulayalım
        WebElement link = driver.findElement(By.xpath("(//h3[@class='elementor-post__title'])[1]"));
        System.out.println(link.isDisplayed());
        System.out.println(link.isEnabled());

        //Carrer Opportunities In QA linkine tıklayalım
        link.click();

        //Başlığın Opportunities içerdiğini test edelim
        String baslik = driver.getTitle();

        if (baslik.contains("Opportunities")) {
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED");

            //Tekrar anasayfaya dönelim ve url'in https://techproeducation.com/ olduğunu doğrulayalım
            driver.navigate().back();
            driver.navigate().back();

            String url = driver.getCurrentUrl();
            if (url.equals("https://techproeducation.com/")) {
                System.out.println("Test PASSED");
            } else {
                System.out.println("Test FAILED");

            }

        }
        driver.close();
    }
}