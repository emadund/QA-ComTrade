package page;

import base.BaseComTrade;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class KombinovaniFrizideri extends BaseComTrade {
@FindBy (xpath = "//div[@data-name=\"Beko RCSA300K30WN kombinovani frižider\"]//b[contains(text(),\"1.652\")]")
    WebElement rata;
JavascriptExecutor js = (JavascriptExecutor)driver;



public KombinovaniFrizideri () {
    PageFactory.initElements(driver, this);
}

public void scroll() {
    js.executeScript("window.scrollBy(0,1000)");

}

public boolean isRataAvailable () {
    wdWait.until(ExpectedConditions.visibilityOf(rata));
    return rata.isDisplayed();

}
public String amount() {
    wdWait.until(ExpectedConditions.visibilityOf(rata));
    return rata.getText();
}
}
