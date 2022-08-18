package page;

import base.BaseComTrade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ComTradeShopInput extends BaseComTrade {

    @FindBy (xpath = "//*[contains(text(),\"Prihvatam\")]")
    WebElement accept;

    @FindBy (id="pravnolice")
    WebElement company;
    @FindBy (id = "pib")
    WebElement pib;
    @FindBy (id="firstname")
    WebElement firstname;
    @FindBy (id="lastname")
    WebElement lastname;
    @FindBy (id="email_address")
    WebElement email;
    @FindBy (css = "[name=\"is_subscribed\"]")
    WebElement news;
    @FindBy (name = "password")
    WebElement password;
    @FindBy (name = "password_confirmation")
    WebElement password_confirmation;
    @FindBy (name = "rememberme")
    WebElement remember;
    @FindBy (css = ".button.btn.btn-primary.btn-continue.pull-right.btn-lg")
    WebElement submit;

    public ComTradeShopInput ()
    {
        PageFactory.initElements(driver, this);
    }
    public ComTradeShopInput clickcookie() {
        wdWait.until(ExpectedConditions.elementToBeClickable(accept));
        accept.click();
        return this;
    }

    public ComTradeShopInput clickPravnoLice() {
        wdWait.until(ExpectedConditions.elementToBeClickable(company));
        company.click();
        company.sendKeys("D");
        company.sendKeys(Keys.ENTER);
        wdWait.until(ExpectedConditions.elementToBeClickable(pib));
        pib.clear();
        pib.sendKeys(String.valueOf(104830593));
        return this;

    }
    public ComTradeShopInput inputFirstName(String x) {
        wdWait.until(ExpectedConditions.elementToBeClickable(firstname));
        firstname.clear();
        firstname.sendKeys(x);
        return this;
        
    }
    public ComTradeShopInput inputLastName(String x) {
        wdWait.until(ExpectedConditions.elementToBeClickable(lastname));
        lastname.clear();
        lastname.sendKeys(x);
        return this;

    }
    public ComTradeShopInput inputEmail(String x) {
        wdWait.until(ExpectedConditions.elementToBeClickable(email));
        email.clear();
        email.sendKeys(x);
        return this;
    }
    public ComTradeShopInput inputPasswordAndConfirmation () {
        wdWait.until(ExpectedConditions.elementToBeClickable(password));
        password.clear();
        password.sendKeys("P@ssw0rd");
        wdWait.until(ExpectedConditions.elementToBeClickable(password_confirmation));
        password_confirmation.clear();
        password_confirmation.sendKeys("P@ssw0rd");
        return this;
    }
    public ComTradeShopInput uncheck() {
        wdWait.until(ExpectedConditions.elementToBeClickable(news));
        if (news.isSelected()) {news.click();}
        if (remember.isSelected()) {remember.click();}
        return this;
    }

    public void send_submit () {
        wdWait.until(ExpectedConditions.elementToBeClickable(submit));
        submit.click();
    }



}
