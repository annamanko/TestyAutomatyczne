package Cucumber.Test;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Shopping {
    LoginPage loginUser;
    private WebDriver driver;

    @Given("^I log in to the application using my \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iLogInToTheApplicationUsingMyAnd(String arg0, String arg1) throws Throwable {
        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://prod-kurs.coderslab.pl/index.php");
        driver.findElement(By.xpath("//div[@id='_desktop_user_info']/div/a/i")).click();
        LoginPage login = new LoginPage(driver);
        login.loginAs(arg0, arg1);
        loginUser = new LoginPage(driver);
        Thread.sleep(1000);


    }

    @When("^I seek out Hummingbird Printed Sweater$")
    public void iSeekOutHummingbirdPrintedSweater() throws Throwable {
        loginUser.search();
    }

    @And("^I choose size M$")
    public void iChooseSizeM() {
        WebElement choose = driver.findElement(By.cssSelector("article.product-miniature:nth-child(1) > div:nth-child(1) > a:nth-child(1) > img:nth-child(1)"));
        choose.click();
        new Select(driver.findElement(By.id("group_1"))).selectByVisibleText("M");
        driver.findElement(By.id("group_1")).click();
    }

    @And("^I add five pieces$")
    public void iAddFivePieces() throws InterruptedException {
        WebElement added = driver.findElement(By.name("qty"));
        added.click();
        added.sendKeys(Keys.BACK_SPACE);
        Thread.sleep(700);
        added.sendKeys("5");
        driver.findElement(By.xpath("//button[contains(@class,'btn btn-primary add-to-cart')]")).click();
        Thread.sleep(700);
    }

    @And("^I go to checkout$")
    public void iGoToCheckout() throws InterruptedException {
        WebElement Checkout = driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a/i"));
        Checkout.click();
        Thread.sleep(700);
        WebElement ProceedCheckout = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div[1]/div[2]/div/a"));
        ProceedCheckout.click();
        Thread.sleep(700);
    }

    @And("^I confirm my adress$")
    public void iConfirmMyAdress() {
        WebElement confirm = driver.findElement(By.name("confirm-addresses"));
        confirm.click();
    }

    @And("^Choose shipment type$")
    public void chooseShipmentType() {
        WebElement shipment = driver.findElement(By.name("confirmDeliveryOption"));
        shipment.click();
    }

    @And("^and I choose payment method$")
    public void andIChoosePaymentMethod() {
        WebElement payment = driver.findElement(By.name("payment-option"));
        payment.click();
    }

    @And("^I check I agree therms of service$")
    public void iCheckIAgreeThermsOfService() {
        WebElement check = driver.findElement(By.xpath("//input[@id='conditions_to_approve[terms-and-conditions]']"));
        check.click();
    }

    @And("^Click order with obligation to pay$")
    public void clickOrderWithObligationToPay() {
        WebElement order = driver.findElement((By.xpath("(//button[@type='submit'])[9]")));
        order.click();

    }

    @Then("^Information is displayed: You order is confirmed$")
    public void informationIsDisplayedYouOrderIsConfirmed() throws InterruptedException {
        System.out.println("You order is confirmed");
    }

    @And("^I'm doing a screenshot\\]$")
    public void iMDoingAScreenshot() throws IOException, InterruptedException {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File scr = new File("/home/ania/screen/" + date() + ".png");
        FileUtils.copyFile(scrFile, scr);
        Thread.sleep(700);
    }

    private String date() {
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }

    @And("^the browser closes$")
    public void theBrowserCloses() {
        driver.quit();
    }
}


