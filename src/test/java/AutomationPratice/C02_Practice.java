package AutomationPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Practice {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));



//        2. 'http://automationexercise.com' URL'sine gidin
            driver.get("http://automationexercise.com");

//        3. Ana sayfanın başarıyla göründüğünü doğrulayın
        WebElement AnaSayfa = driver.findElement(By.xpath("(//div[@class='col-sm-4'])[1]"));
        System.out.println("Ana Sayfa Gorunurlugu : " +AnaSayfa.isDisplayed());

//        4. 'Kaydol / Giriş Yap' düğmesine tıklayın
            driver.findElement(By.xpath("//a[@href='/login']")).click();

//        5. "Hesabınıza giriş yapın"ın göründüğünü doğrulayın
        System.out.println("Hesabiniza Giris :"+driver.findElement(By.xpath("(//h2)[1]")).isDisplayed());

//        6. Doğru e-posta adresini ve şifreyi girin
        WebElement giris =  driver.findElement(By.xpath("(//input[@type='email'])[1]"));
        giris.sendKeys("envermert5@gmail.com",Keys.TAB,"123456");
//
//        7. 'Giriş' düğmesine tıklayın
        driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();

//        8. "Kullanıcı adı olarak oturum açıldı" ifadesinin görünür olduğunu doğrulayın
        System.out.println("Kullanici adi olarak oturum acildi : "+driver.findElement(By.cssSelector("[class='fa fa-user']")).isDisplayed());
//
//        9. 'Hesabı Sil' düğmesini tıklayın
        driver.findElement(By.cssSelector("[href='/delete_account']")).click();
        driver.navigate().back();
        driver.navigate().forward();

//        10. 'HESAP SİLİNDİ!' görünür
        System.out.println("Hesap Silindi : "+driver.findElement(By.cssSelector("[class='title text-center']")).isDisplayed());


    }
}
