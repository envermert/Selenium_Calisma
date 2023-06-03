package AutomationPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Practice {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//
//        1. Tarayıcıyı başlat
//        2. URL'ye gidin 'http://automationexercise.com'
             driver.get("http://automationexercise.com");

//        3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
        System.out.println("Ana Sayfa : " +driver.findElement(By.cssSelector("[id='header']")).isDisplayed());

//        4. 'Kaydol / Giriş' düğmesini tıklayın
        driver.findElement(By.cssSelector("[href='/login']")).click();
//
//        5. 'Yeni Kullanıcı Kaydı!' görünür
        System.out.println("Yeni Kullanici kaydi : " +driver.findElement(By.xpath("(//h2)[3]")).isDisplayed());
//
//        6. Ad ve e-posta adresini girin
//        7. 'Kaydol' düğmesini tıklayın
        driver.findElement(By.cssSelector("[type='text']")).sendKeys("Enver",Keys.TAB,"envermert2@gmail.com",Keys.TAB,Keys.ENTER);
//
//        8. 'MUHASEBE BİLGİLERİ' görünür olduğunu doğrulayın
        System.out.println("Muhasebe Bilgileri : " +driver.findElement(By.xpath("(//h2)[1]")).isDisplayed());

//        9. Detayları doldur: Başlık, İsim, E-posta, Şifre, Doğum tarihi
        driver.findElement(By.cssSelector("[id='id_gender1']")).click();
        driver.findElement(By.cssSelector("[type='password']")).sendKeys("123456");
        WebElement date = driver.findElement(By.cssSelector("[data-qa='days']"));
        date.sendKeys("19",Keys.TAB,"September",Keys.TAB,"1986");
//
//        10. 'Bültenimize kaydolun!' Onay kutusunu seçin!'
        driver.findElement(By.cssSelector("#newsletter")).click();

//        11. 'Ortaklarımızdan özel teklifler alın!' Onay kutusunu seçin!'
        driver.findElement(By.xpath("(//div[@class='checkbox'])[2]")).click();

//        12. Detayları doldur: Adı, Soyadı, Şirket, Adres, Adres2, Ülke, Eyalet, Şehir, Posta Kodu, Mobil Numarası
        driver.findElement(By.cssSelector("*#first_name")).sendKeys("Enver",Keys.TAB,"Mert",Keys.TAB,"TechproEducation",Keys.TAB,"Rhode Island RH");
        driver.findElement(By.cssSelector("[data-qa='country']")).sendKeys("United States",Keys.TAB,"Texas",Keys.TAB,"Houston",Keys.TAB,"77047",Keys.TAB,"0553 807 3008");
//
//        13. 'Hesap Oluştur düğmesi'ni tıklayın'
            driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
//
//        14. 'TEMEL OLUŞTURULDU!' görünür
        System.out.println("Create Test : " +driver.findElement(By.xpath("(//h2)[1]")).isDisplayed());

//        15. 'Devam' düğmesini tıklayın
        driver.findElement(By.cssSelector("a[class='btn btn-primary']")).click();

        driver.navigate().back();
        driver.navigate().forward();


//        16. 'Kullanıcı adı olarak oturum aç' ifadesinin görünür olduğunu doğrulayın
        System.out.println("Kullanici adi Test : " +driver.findElement(By.cssSelector("[class='fa fa-user']")).isDisplayed());

//        17. 'Hesabı Sil' düğmesini tıklayın
        driver.findElement(By.cssSelector("[href='/delete_account']")).click();

//        18. 'ACCOUNT DELETED!' görünür ve 'Devam' düğmesine tıklayın
        System.out.println("Account Test : " +driver.findElement(By.cssSelector("[data-qa='account-deleted']")).isDisplayed());
    }
}
