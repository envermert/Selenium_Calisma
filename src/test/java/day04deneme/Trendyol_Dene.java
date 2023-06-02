package day04deneme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Trendyol_Dene {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //trendyol sayfasina gidiniz
        driver.get("https://trendyol.com");

        //Cikan reklamda cinsiyet secimi yap
        WebElement buton = driver.findElement(By.xpath("//img[@src='https://cdn.dsmcdn.com/web/production/new-gender-popup-male.png']"));
        buton.click();

        WebElement giris = driver.findElement(By.xpath("(//*[.='Giriş Yap'])[1]"));
        giris.click();

        WebElement epostaGiris = driver.findElement(By.xpath("(//*[@class='q-input'])[1]"));
        epostaGiris.sendKeys("mert.enver@gmail.com");

        WebElement password = driver.findElement(By.xpath("(//*[@class='q-input'])[2]"));
        password.sendKeys("Mert.1986");

        driver.findElement(By.xpath("(//button[@type='submit'])")).click();

        List<WebElement> basliklar = driver.findElements(By.xpath("//summary[@class='campaign-summary']"));

        for (WebElement w:basliklar) {
            System.out.println(w.getText());
        }

        WebElement enCokEklenen = driver.findElement(By.xpath("(//img[@class='p-card-img '])[4]"));
        enCokEklenen.click();

        List<WebElement> kategoriler = driver.findElements(By.cssSelector("div[class='fltr-item-text ctgry']"));

        for (WebElement w:kategoriler) {
            System.out.println(w.getText());

        }

        List<WebElement> sepeteEkle=driver.findElements(By.xpath("//div[.='Sepete Ekle']"));
        sepeteEkle.get(0).click();
        // for (WebElement w:sepeteEkle
        //      ) {
        //     w.click();
        // }
//
        driver.findElement(By.xpath("//p[.='Sepetim']")).click();

        List<WebElement> sil=driver.findElements(By.xpath("//i[@class='i-trash']"));
        sil.get(0).click();
        //for (WebElement t:sil
        //     ) {
        //    t.click();
        //}
        driver.navigate().back();


        WebElement elbise=driver.findElement(By.xpath("(//div[.='Elbise'])[1]"));
        WebElement tshirt=driver.findElement(with(By.tagName("div")).below(elbise));
        WebElement pantolon = driver.findElement(with(By.tagName("div")).below(tshirt));
        pantolon.click();

        
    }
}

