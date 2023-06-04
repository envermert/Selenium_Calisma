import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Lms_ZoomGiris {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://lms.techproeducation.com/login/index.php");

        //Techproeducation sayfasina git
        driver.get("https://lms.techproeducation.com/course/view.php?id=356");
        //Username ve sifre gir
        driver.findElement(By.xpath("(//input[@name='username'])[2]")).
                sendKeys("mert.enver@gmail.com", Keys.TAB,"Me2023+v");

        //Automotion Engineera tikla
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        //Zoom Sayfasini ac
        driver.findElement(By.xpath("//a[.='GO TO ZOOM']")).click();



    }


}
