package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScriptBase {
    public WebDriver driver;

    public void init(){
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--start-fullscreen");
        System.out.println("This is Chrome Version"+chromeOptions.getVersion());
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver");
        driver=new ChromeDriver(chromeOptions);
        driver.get("https://www.abercrombie.com/shop/us");
    }

}
