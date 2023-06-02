package homeWork04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        // http://the-internet.herokuapp.com/add_remove_elements/ adresine gidiniz
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");

        // Add Element butonuna 100 defa basınız
        for (int i = 0; i < 100; i++) {
            driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        }

        // 100 defa basıldığını test ediniz
        List<WebElement> yuzdefa = driver.findElements(By.xpath("//button[@class='added-manually']"));

         int deletSayisi = yuzdefa.size();

         if (deletSayisi==100){
             System.out.println("PASSED");
         }else{
             System.out.println("FAILED");
         }


        // 90 defa delete butonuna basınız
        for (int i = 0; i <90 ; i++) {
            driver.findElement(By.xpath("//button[@class='added-manually']")).click();
        }

        // 90 defa basıldığını doğrulayınız
        List<WebElement> doksan = driver.findElements(By.xpath("//button[@class='added-manually']"));

        int deletSay = doksan.size();
        if (deletSay==10){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }
        // Sayfayı kapatınız
        driver.close();
    }

}
