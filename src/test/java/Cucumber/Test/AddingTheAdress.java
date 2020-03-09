package Cucumber.Test;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class AddingTheAdress {
    LoginPage loginUser;
    private WebDriver driver;

    @Given("^I log in to the application using the correct \"([^\"]*)\" address and \"([^\"]*)\"$")
     public void ILogInUsingEmailAndPassword (String arg0, String arg1) throws Throwable {
        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://prod-kurs.coderslab.pl/index.php");
        driver.findElement(By.xpath("//div[@id='_desktop_user_info']/div/a/i")).click();
        LoginPage login = new LoginPage(driver);
        login.loginAs(arg0, arg1);
        loginUser = new LoginPage(driver);

    }
    @When("^As a logged in user, I click the Adrses link$")
    public void asALoggedInUserIClickTheAdrsesLink() {
        WebElement addAdress = driver.findElement(By.id("address-link"));
        addAdress.click();
    }
    @And("^Entered \"([^\"]*)\"$")
    public void enteredAdress(String arg0) throws Throwable {
        WebElement adress = driver.findElement(By.name("address1"));
        adress.click();
        adress.clear();
        adress.sendKeys(arg0);
    }
    @And("^And entered \"([^\"]*)\"$")
    public void andEnteredZipCode(String arg0) throws Throwable {
        WebElement code = driver.findElement(By.name("postcode"));
        code.click();
        code.clear();
        code.sendKeys(arg0);
    }

    @And("^I entered \"([^\"]*)\"$")
    public void iEnteredCity(String arg0) throws Throwable {
        WebElement city = driver.findElement(By.name("city"));
        city.click();
        city.clear();
        city.sendKeys(arg0);
    }

    @And("^Choose \"([^\"]*)\"$")
    public void chooseCountry (String arg0) throws Throwable {
        new Select(driver.findElement(By.name("id_country"))).selectByVisibleText(arg0);
    }

    @And("^Save Adress$")
    public void saveAdress()throws Throwable  {
        driver.findElement(By.cssSelector("button.btn")).click();
    }

    @And("^I checking whether it displays information Address successfully added!$")
    public void iCheckingWhetherItDisplaysInformationAddressSuccessfullyAdded() throws Throwable{
        WebElement checking = driver.findElement(By.id("notifications"));
        System.out.println("Sprawdzam potwierdzenie: " + checking.getText());
        Assert.assertEquals(checking.getText(), "Address successfully added!");
        Thread.sleep(1000);
    }
    @Then("^The address has been added, the browser closes\\.$")
    public void theAddressHasBeenAddedTheBrowserCloses()throws Throwable  {
        driver.quit();
    }


}

