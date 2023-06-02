package homeWork02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01 {
    public static void main(String[] args) throws InterruptedException {
        //-ÖDEV-

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Amazon sayfasına gidiniz
        driver.get("https://www.amazon.com");
        //iphone aratınız
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("iphone");
        aramaKutusu.submit();
        //çıkan sonuç yazısını konsola yazdırınız
        List<WebElement> linkList = driver.findElements(By.tagName("a"));
       /*
        for (WebElement w :linkList
            ) {
           if (!w.getText().isEmpty()) {
               System.out.println(w.getText());
           }
       */

        //çıkan ürünlerden ilk 5 tanesine tıklayıp sayfa başlıklarını yazdırınız

        List<WebElement> urunler=driver.findElements(By.xpath("//h2"));

        urunler.stream().limit(5).forEach(t-> System.out.println(t.getText()));

        driver.close();

        /*
         2.arama yapmak istersem
         driver.findElement(By.name("field-keywords"));
         driver.findElement(By.name("field-keywords")).sendKeys("iphone");
         Thread.sleep(3000);
         driver.findElement(By.name("field-keywords")).submit();
         driver.navigate().back();
         driver.findElement(By.name("field-keywords")).sendKeys("samsung");
         driver.findElement(By.name("field-keywords")).submit();
        */





        //driver.close();



    }

}

