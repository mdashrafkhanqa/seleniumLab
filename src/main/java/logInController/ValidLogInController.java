package logInController;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidLogInController {

    @FindBy(css = "span.rs-nav-icon--account")
    WebElement accountTab;


    public ValidLogInController(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void accountTabVerification(){
        accountTab.isDisplayed();
    }
}
