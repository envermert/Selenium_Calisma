package homeWork01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://youtube.com");

//        Youtube ana sayfasina gidelim . https://www.youtube.com/
          driver.get("https://youtube.com");
//
//        Amazon soyfasina gidelim. https://www.amazon.com/
          driver.get("https://amazon.com");
//
//        Tekrar YouTube’sayfasina donelim
          driver.navigate().back();
//
//        Yeniden Amazon sayfasina gidelim
          driver.navigate().forward();
//
//        Sayfayi Refresh(yenile) yapalim
          driver.navigate().refresh();
//
//        Sayfayi kapatalim / Tum sayfalari kapatalim
          driver.close();
//
    }
}
