package popsugar.selenium.util;

import org.openqa.selenium.By;

import java.io.IOException;

public class getByLocator {

    public static By getLocator(String filename,String key) throws IOException {
        PropUtil proUtil = new PropUtil(filename);
//		selectPro = new SelectProperties();
//		ProUtil proUtil = selectPro.selectPro(filename);
        String locator = proUtil.getPro(key);
        String locatorType = locator.split(">")[0];
        String locatorValue = locator.split(">")[1];
        if(locatorType.equals("id")) {
            return By.id(locatorValue);
        }else if(locatorType.equals("name")) {
            return By.name(locatorValue);
        }else if(locatorType.equals("className")) {
            return By.className(locatorValue);
        }else if(locatorType.equals("tagName")) {
            return By.tagName(locatorValue);
        }else if(locatorType.equals("linkText")) {
            return By.linkText(locatorValue);
        }else if(locatorType.equals("xpath")){
            return By.xpath(locatorValue);
        }else if(locatorType.equals("css")) {
            return By.cssSelector(locatorValue);
        }else {
            return By.partialLinkText(locatorValue);
        }
    }
}
