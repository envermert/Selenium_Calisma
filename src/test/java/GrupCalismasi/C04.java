package GrupCalismasi;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        //Amazon soyfasina gidelim. https://www.amazon.com/
          driver.get("https://www.amazon.com/");

//        Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfa Konumu : "+driver.manage().window().getPosition());

        System.out.println("Sayfa Boyutu : "+driver.manage().window().getSize());

//        Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
        driver.manage().window().setPosition(new Point(70,70));
        driver.manage().window().setSize(new Dimension(600,600));


//        Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
        if (driver.manage().window().getPosition().x==70 && driver.manage().window().getPosition().y==70){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED");

        if (driver.manage().window().getSize().width==600 && driver.manage().window().getSize().height==600){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAILED");

//        Sayfayi kapatin
          driver.close();

    }
}
