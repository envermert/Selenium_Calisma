package GrupCalismasi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");


//
//        2.Amazon soyfasina gidelim. https://www.amazon.com/
          driver.get("https://amazon.com");
//
//        3.Sayfanin konumunu ve boyutlarini yazdirin
          System.out.println(driver.manage().window().getPosition());
          System.out.println(driver.manage().window().getSize());

//        4.Sayfayi simge durumuna getirin
          driver.manage().window().minimize();

//        5.simge durumunda 3 saniye bekleyip sayfayi maximize yapin
          Thread.sleep(3000);
          driver.manage().window().maximize();

//        6.Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
            System.out.println(driver.manage().window().getPosition());
            System.out.println(driver.manage().window().getSize());

//        7.Sayfayi fullscreen yapin
            driver.manage().window().fullscreen();
//
//        8.Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
            System.out.println(driver.manage().window().getPosition());
            System.out.println(driver.manage().window().getSize());
//
//        9.Sayfayi kapatin
            driver.close();
    }
}
