package day04deneme;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_HepsiBurada {
    public static void main(String[] args) throws InterruptedException {



        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.hepsiburada.com/");
         WebElement aramaKutusu= driver.findElement(By.xpath("//input[@class='theme-IYtZzqYPto8PhOx3ku3c']"));
        aramaKutusu.sendKeys("tencere", Keys.ENTER);




    }
}
