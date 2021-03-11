package objectMapping;

import org.openqa.selenium.By;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Property {
    Properties properties;


    public Property(String mapFile) {
        properties = new Properties();

        try {
            FileInputStream in = new FileInputStream(mapFile);
            properties.load(in);
            in.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public By getLocator(String logicalElementName) throws Exception {

        String locator = properties.getProperty(logicalElementName);

        String locatorType = locator.split(">")[0];
        String locatorValue = locator.split(">")[1];

        if (locatorType.equalsIgnoreCase("id"))
            return By.id(locatorValue);
        else if (locatorType.equalsIgnoreCase("name"))
            return By.name(locatorValue);
        else if (locatorType.equalsIgnoreCase("tsgname"))
            return By.tagName(locatorValue);
        else if (locatorType.equalsIgnoreCase("classname"))
            return By.className(locatorValue);
        else if (locatorType.equalsIgnoreCase("linktext"))
            return By.linkText(locatorValue);
        else if (locatorType.equalsIgnoreCase("partiallinktext"))
            return By.partialLinkText(locatorValue);
        else if (locatorType.equalsIgnoreCase("cssselector"))
            return By.cssSelector(locatorValue);
        else if (locatorType.equalsIgnoreCase("xpath"))
            return By.xpath(locatorValue);


        return By.cssSelector(locatorValue);


    }
}

