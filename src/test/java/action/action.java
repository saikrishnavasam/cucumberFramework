package action;

import objectMapping.Property;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import DriverFactory.driverFactory;
import java.nio.file.Paths;

public class action {


        public static Property obj_rep = new Property("src\\test\\java\\objectMapping\\app.properties");

    public void navigate() throws InterruptedException {
        driverFactory.getDriver().navigate().to("http://automationpractice.com/");
        Thread.sleep(5000);
    }

    public void search() throws Exception {
        driverFactory.getDriver().findElement(obj_rep.getLocator("SearchBox")).sendKeys("eminem");
        Thread.sleep(2000);
        driverFactory.getDriver().findElement(obj_rep.getLocator("SearchButton")).click();
    }
}
