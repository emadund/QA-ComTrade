package page;

import base.BaseComTrade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ComTradeShopPage extends BaseComTrade {
    @FindBy (css = "[style=\"overflow-x: hidden;\"]")
    WebElement outside;
    @FindBy (linkText = "Otvori nalog")
    WebElement openAccount;


    public ComTradeShopPage () {
        PageFactory.initElements(driver, this);
    }

    public ComTradeShopPage clickBanner() {
        wdWait.until(ExpectedConditions.visibilityOf(outside));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        outside.click();
        return this;
    }
    public void clickRegister () {
        wdWait.until(ExpectedConditions.elementToBeClickable(openAccount));
        openAccount.click();
    }
}
