package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import DriverFactory.driverFactory;
import java.nio.file.Paths;

public class action {


    public void navigate() throws InterruptedException {
        driverFactory.getDriver().navigate().to("http://automationpractice.com/");
        Thread.sleep(5000);
    }

    public void search() throws InterruptedException {
        driverFactory.getDriver().findElement(By.xpath("//*[@id='search_query_top']")).sendKeys("eminem");
        Thread.sleep(2000);
        driverFactory.getDriver().findElement(By.xpath("//form[@id='searchbox']/button")).click();
    }
}
