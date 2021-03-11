package DriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class driverFactory {
    static WebDriver driver;


    public static void luanchBrowser(String browser) {
        switch (browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
                if (driver == null) {
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("start-maximized");
                   // options.addArguments("--disable-plugins");
                    Map<String, Object> prefs = new HashMap<String, Object>();
                    prefs.put("download.default_directory", "src/test/resources/downloadFiles");
                    options.setExperimentalOption("prefs", prefs);
                    driver = new ChromeDriver(options);

                }
        break;
            case "opera":
                System.setProperty("webdriver.opera.driver","src/test/resources/drivers/operadriver.exe");
                if (driver == null) {
                    driver = new OperaDriver();
                }
                break;
            case "edge":
                System.setProperty("webdriver.edge.driver","src/test/resources/drivers/msedgedriver.exe");
                if (driver == null) {
                    driver = new EdgeDriver();
                }
                break;
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
