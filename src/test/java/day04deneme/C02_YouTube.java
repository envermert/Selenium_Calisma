package day04deneme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_YouTube {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://youtube.com");

        WebElement anaSayfa = driver.findElement(By.xpath("(//a[@class='yt-simple-endpoint style-scope ytd-mini-guide-entry-renderer'])[1]"));
        System.out.println(anaSayfa.getText());

        WebElement sarki = driver.findElement(By.xpath(("(//h3[@class='style-scope ytd-rich-grid-media'])")));
        sarki.click();

      //  WebElement zeynepBastik = driver.findElement(By.xpath(By.xpath("(//a[@id='video-title-link'])[1])");
        //zeynepBastik.click();
    }
}
