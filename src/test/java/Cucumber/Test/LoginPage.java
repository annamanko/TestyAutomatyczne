package Cucumber.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private static WebDriver driver;
    @FindBy(name="email")
    WebElement loginInput;

    @FindBy(name = "password")
    WebElement passwordInput;

    @FindBy(id = "submit-login")
    WebElement submit;

    @FindBy(name = "s")
    WebElement search;

    public LoginPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void loginAs (String email, String password){
        loginInput.clear();
        loginInput.click();
        loginInput.sendKeys(email);
        passwordInput.clear();
        passwordInput.click();
        passwordInput.sendKeys(password);
        submit.submit();
    }
//    public String getSuccesInformation (){
//        return succesInfo.getText();
//    }
    public void search (){
        search.clear();
        search.click();
        search.sendKeys("Hummingbird Printed Sweater");
        search.submit();
    }
}
