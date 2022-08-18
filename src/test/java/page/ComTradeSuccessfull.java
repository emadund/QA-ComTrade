package page;

import base.BaseComTrade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ComTradeSuccessfull extends BaseComTrade {
    @FindBy (css = ".alert.alert-success p")
    WebElement message;

    @FindBy (css = ".fa.fa-caret-down.caretdown")
    WebElement mouse;

    @FindBy (css = "[href=\"/bela-tehnika\"]")
    WebElement belaTehnika;

    @FindBy (xpath = "//*[contains(text(),\"Kombinovani frižideri\")]")
    WebElement kombinovaniFrizideri;

    public ComTradeSuccessfull () {
        PageFactory.initElements(driver, this);

    }
    public boolean checkDisplay() {
        wdWait.until(ExpectedConditions.visibilityOf(message));
        return message.isDisplayed();
    }

    public String getMessage () {
        wdWait.until(ExpectedConditions.visibilityOf(message));
        return message.getText();
    }
    public void moving () {
        wdWait.until(ExpectedConditions.elementToBeClickable(mouse));
        Actions hover = new Actions(driver);
        hover.moveToElement(mouse).perform();
        hover.moveToElement(belaTehnika).perform();
        hover.moveToElement(kombinovaniFrizideri).perform();
        kombinovaniFrizideri.click();

    }
}
